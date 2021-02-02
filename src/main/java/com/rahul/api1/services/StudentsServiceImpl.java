package com.rahul.api1.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rahul.api1.entities.Students;

@Service
public class StudentsServiceImpl implements StudentsService {

	List<Students> list;
	
	@SuppressWarnings("deprecation")
	public StudentsServiceImpl() {
		// TODO Auto-generated constructor stub
		list=new ArrayList<Students>();
		list.add(new Students(101, "Rahul Singh", "12+", 10009, new Date("12/03/1997")));
		list.add(new Students(102, "Rakshit Jain", "10th", 10029, new Date("09/10/2004")));
		list.add(new Students(103, "Rod Johnson", "12+", 10030, new Date("10/05/2000")));
		list.add(new Students(104, "Elon Musk", "7th", 10058, new Date("23/10/2008")));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List getStudents() {
		List listMap=new ArrayList();
		for (Students stud : list) {
			Map<String, Object> map=new LinkedHashMap<String, Object >();
			map.put("studId", stud.getStudId());
			map.put("studName", stud.getStudName());
			listMap.add(map);
		}
		return listMap;
	}
	@Override
	public Students getStudent(int studId) {
		Students stud=null;
		for(Students s:list) {
			if (s.getStudId()==studId) {
				stud=s;
				break;
			}
		}
		return stud;
	}

}
