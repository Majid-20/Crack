import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Insertar {

	   
	   public static void main(String[] args)  {
	       int a=0;
	       
	        Scanner lector = new Scanner(System.in);
	        System.out.println("Select direccio segons codi fabricant: (1)");
	        System.out.println("Per select tots els article per codi fabricant(2): ");
	        System.out.println("Select articles d'un fabricant (3): ");



	        System.out.println("¿Quina consulta vols fer?: ");
	        a=lector.nextInt();
	        lector.nextLine();
	        
	        
	        Insertar programa = new Insertar();
	        
	        if (a==1){
		        programa.SelectTDireccio();         

	        }
	        
	        if (a==2){

	        
		        programa.SelectTotsArtFab();

	        }
	        
	        if (a==3){
		        programa.SelectArticleCodi();

	            
	        }
	         
	        
	   }
	   
	
	   
	    public void SelectArticleCodi(){
	    	   int id=0;
		        Scanner lector = new Scanner(System.in);
		        System.out.println("Codi Article: ");
		        id=lector.nextInt();
		        
	    	EntityManagerFactory emfactory = Persistence
	    			.createEntityManagerFactory( "Eclipselink_JPA" );
	    			EntityManager entitymanager = emfactory.
	    			createEntityManager();
	    			   Articles articles=entitymanager.
					   find(Articles.class, id);
	    			   System.out.println();
	    			   System.out.println();
	    			   System.out.println();
	    			   System.out.println();

	    			System.out.println(articles.toString());
	    		
	}
	    
	    public void SelectTDireccio(){
	    	 int id=0;
		        Scanner lector = new Scanner(System.in);
		        System.out.println("ID Fabricant: ");
		        id=lector.nextInt();
		        
	    	EntityManagerFactory emfactory = Persistence
	    			.createEntityManagerFactory( "Eclipselink_JPA" );
	    			EntityManager em = emfactory.
	    			createEntityManager();
	    			
	    			Query query1 = em.
	    					createQuery("Select c from Direccio c where fabricants.CODI_FAB = :id");
	    					query1.setParameter("id", id);
	    					
	    				 

	    					List<Direccio> list = query1.getResultList( );
	    					for( Direccio e:list )	    {
	    						
	    						
	    		    			System.out.println(e.toString());

	    					}}
	    	
	    
	    public void SelectTotsArtFab(){
	    	 int id=0;
		        Scanner lector = new Scanner(System.in);
		        System.out.println("ID Fabricant: ");
		        id=lector.nextInt();
		        
	    	EntityManagerFactory emfactory = Persistence
	    			.createEntityManagerFactory( "Eclipselink_JPA" );
	    			EntityManager em = emfactory.
	    			createEntityManager();
	    			
	    			Query query1 = em.
	    					createQuery("Select c from Articles c  where c.fabricants.CODI_FAB = :id");
	    					query1.setParameter("id", id);
	    					
	    				 

	    					List<Articles> list = query1.getResultList( );
	    					for( Articles e:list )	    {
	    						
	    						
	    		    			System.out.println(e.toString());

	    					}
	    					
	    					
	    	
	    			   
	    		
	
	     
	 	
	     
}}
