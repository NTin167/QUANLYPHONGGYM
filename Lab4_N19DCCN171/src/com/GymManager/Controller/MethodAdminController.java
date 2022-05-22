package com.GymManager.Controller;

import java.text.DecimalFormat;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Transactional
public class MethodAdminController {
	@Autowired
	SessionFactory factory;

	public String toPK(String refix, String table, String columnPK) {
		Session session = factory.getCurrentSession();
		String hql = "FROM " + table;
		Query query = session.createQuery(hql);
		int number = query.list().size() + 1;
		boolean isInValid = true;
		String pk = refix;
		DecimalFormat df = new DecimalFormat("000000");
		while (isInValid) {
			String pkTemp = pk + df.format(number);
			System.out.println(pkTemp);
			String hqlwhere = hql + " WHERE " + columnPK + " = '" + pkTemp + "'";
			query = session.createQuery(hqlwhere);
			if (query.list().size() > 0)
				number++;
			else {
				pk = pkTemp;
				isInValid = false;
			}
		}

		return pk;
	}
}
