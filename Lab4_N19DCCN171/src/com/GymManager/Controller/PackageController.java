package com.GymManager.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GymManager.Entity.TrainingPackEntity;
import com.GymManager.Entity.TrainingPackTypeEntity;
import com.GymManager.Service.TrainingPackService;
import com.GymManager.Service.TrainingPackTypeService;

@Controller
@RequestMapping("admin/package")
@Transactional
public class PackageController {
	@Autowired
	TrainingPackTypeService trainingPackTypeService;
	@Autowired
	TrainingPackService trainingPackService;	
	@Autowired
	SessionFactory factory;
	@Autowired
	HttpSession session;
	// HIỂN THỊ DANH SÁCH GÓI TẬP
	@RequestMapping(value = "")
	public String pack(ModelMap model, Integer offset, Integer maxResult) {
		List<TrainingPackEntity> list = trainingPackService.getAllPack(offset, maxResult);
		model.addAttribute("pack", list);
		model.addAttribute("insertPackage", new TrainingPackEntity());
		
		
		List<TrainingPackTypeEntity> listT = trainingPackTypeService.getAllPackType(offset, maxResult);
		model.addAttribute("trainingPackTypeEntity", listT);
		return "admin/package";
	}
	
	//HIỂN THỊ LOẠI GÓI TẬP
	@RequestMapping(value = "type")
	public String packageType(ModelMap model, Integer offset, Integer maxResult) {
		List<TrainingPackTypeEntity> list = trainingPackTypeService.getAllPackType(offset, maxResult);
		model.addAttribute("packageType", list);
		model.addAttribute("insertPKT", new TrainingPackTypeEntity());
		return "admin/package-type";
	}
	// THÊM MỚI LOẠI GÓI TẬP
//	@RequestMapping(value = "insert", method = RequestMethod.GET)
//	public String addPackageType(ModelMap model)
//	{
//		model.addAttribute("insertPKT", new TrainingPackTypeEntity());
//		return "admin/package-type";
//	}
	
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String addPackageType(ModelMap model, @ModelAttribute("insertPKT") TrainingPackTypeEntity trainingPackTypeEntity)
	{
		boolean check = trainingPackTypeService.insertPackType(trainingPackTypeEntity);
		if (check) {
			model.addAttribute("insertPKT", new TrainingPackTypeEntity());
            model.addAttribute("success_message", "Thêm mới thành công!");
        } else {
        	model.addAttribute("insertPKT", new TrainingPackTypeEntity());
            model.addAttribute("fail_message", "Thêm mới thất bại!");
        }
		return "admin/package-type";
	}
	
	// SỬA LOẠI GÓI TẬP
	@RequestMapping(value="update/{packTypeID}", method=RequestMethod.GET)
	public String updatePackageType(ModelMap model , @PathVariable("packTypeID") String packIDX)
	{
		Session session = factory.openSession();
        TrainingPackTypeEntity trainingPackTypeEntity = (TrainingPackTypeEntity) session.get(TrainingPackTypeEntity.class, packIDX) ;
        model.addAttribute("trainingPackTypeEntity" , trainingPackTypeEntity) ;
        
        model.addAttribute("insertPKT", new TrainingPackTypeEntity());
        
        
        return "admin/updatePackage-type" ;
	}
	@RequestMapping(value="update/{packTypeID}", method=RequestMethod.POST)
	public String updatePackageType(ModelMap model ,  @ModelAttribute("updatePKT") TrainingPackTypeEntity trainingPackTypeEntity,Integer offset, Integer maxResult)
	{
		boolean check = trainingPackTypeService.updatePackType(trainingPackTypeEntity);
		if (check) {
			model.addAttribute("message", "Cập nhật thành công!");
            List<TrainingPackTypeEntity> listTKL = trainingPackTypeService.getAllPackType(offset, maxResult) ;
            model.addAttribute("packageType", listTKL) ;
            
            model.addAttribute("insertPKT", new TrainingPackTypeEntity());
        } else {
        	model.addAttribute("message", "Cập nhật thất bại!");
            List<TrainingPackTypeEntity> listTKL = trainingPackTypeService.getAllPackType(offset, maxResult) ;
            model.addAttribute("packageType", listTKL) ;
            
            model.addAttribute("insertPKT", new TrainingPackTypeEntity());
        }
        return "admin/package-type" ;
	}
	
	// THÊM MỚI GÓI TẬP
//	@RequestMapping(value="insertP", method=RequestMethod.GET)
//	public String addPackage(ModelMap model, Integer offset, Integer maxResults) {
//		List<TrainingPackTypeEntity> LIST = trainingPackTypeService.getAllPackType(offset, maxResults);
//		model.addAttribute("trainingPackTypeEntity", LIST);
//		model.addAttribute("insertP", new TrainingPackEntity());
//		return "admin/addPackage";
//	}
	@RequestMapping(value="insertP", method=RequestMethod.POST)
	public String addPackage(ModelMap model, @ModelAttribute("insertPackage") TrainingPackEntity trainingPackEntity, Integer offset, Integer maxResults)
	{
		List<TrainingPackTypeEntity> LIST = trainingPackTypeService.getAllPackType(offset, maxResults);
		TrainingPackTypeEntity trainingPackTypeEntity = trainingPackTypeService.getPackByID(trainingPackEntity.getPackTypeID());
		
		
		trainingPackEntity.setTrainingPackTypeEntity(trainingPackTypeEntity);
		trainingPackService.updatePack(trainingPackEntity);
		boolean check = trainingPackService.insertPack(trainingPackEntity);
		if(check)
		{
			model.addAttribute("trainingPackTypeEntity", LIST);
			model.addAttribute("insertP", new TrainingPackEntity());
			model.addAttribute("message", "Thêm mới thành công");
		}
		else {
			model.addAttribute("trainingPackTypeEntity", LIST);
			model.addAttribute("insertP", new TrainingPackEntity());
			model.addAttribute("fmessage", "Thêm mới thất bại");
		}
		return "admin/package";
	}
	
	// SỬA GÓI TẬP
	@RequestMapping(value="updateTrainingPack/{packID}", method=RequestMethod.GET)
	public String updatePackage(ModelMap model , @PathVariable("packID") String packIDX)
	{
		Session session = factory.openSession();
        TrainingPackEntity trainingPackEntity = (TrainingPackEntity) session.get(TrainingPackEntity.class, packIDX) ;
        model.addAttribute("trainingPackEntity" , trainingPackEntity) ;
        System.out.println(trainingPackEntity.getPackTypeID());
        System.out.println(trainingPackEntity.getStatus());
        model.addAttribute("packTypeID", trainingPackEntity.getPackTypeID());
        return "admin/updatePackage" ;
	}
	@RequestMapping(value="updateTrainingPack/{packID}", method=RequestMethod.POST)
	public String updatePackageType(ModelMap model ,  @ModelAttribute("updateP") TrainingPackEntity trainingPackEntity,Integer offset, Integer maxResult)
	{
		Session session = factory.openSession();
		TrainingPackTypeEntity trainingPackTypeEntity = trainingPackTypeService.getPackByID(trainingPackEntity.getPackTypeID());
		trainingPackEntity.setTrainingPackTypeEntity(trainingPackTypeEntity);
		boolean check = trainingPackService.updatePack(trainingPackEntity);
		if (check) {
			model.addAttribute("message", "Cập nhật thành công!");
            List<TrainingPackEntity> listP = trainingPackService.getAllPack(offset, maxResult) ;
            model.addAttribute("pack", listP) ;
        } else {
        	model.addAttribute("message", "Cập nhật thất bại!");
            List<TrainingPackEntity> listP = trainingPackService.getAllPack(offset, maxResult) ;
            model.addAttribute("pack", listP) ;
        }
        return "admin/updatePackage" ;
	}
}
