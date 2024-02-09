package Consultas;

import java.util.List;

import DAO.SubjectDAO;
import DAO.SubjectDaoImpl;
import model.subject;

public class listar {
    public static void main(String[] args) {
    	
    	SubjectDAO dao = new SubjectDaoImpl();
		List<subject> subjectList = dao.findAll(); 
		
		for(subject r: subjectList) {
            System.out.println(r.getIdsubject());
            System.out.println(r.getSubject());
            System.out.println(r.getCredits());
        }
    }
}
