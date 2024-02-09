package Consultas;

import java.util.List;

import DAO.SubjectDAO;
import DAO.SubjectDaoImpl;
import model.subject;

public class registrar {

	public static void main(String[] args) {
		
		SubjectDAO dao = new SubjectDaoImpl();
		
		subject subject = new subject();
		subject.setIdsubject(6);
		subject.setSubject("Administración y negocios");
		subject.setCredits(4);
		
		dao.create(subject);
		
		List<subject> subjectList = dao.findAll(); 
		
		for(subject r: subjectList) {
            System.out.println(r.getIdsubject());
            System.out.println(r.getSubject());
            System.out.println(r.getCredits());
        }
	}

}
