/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revista;

/**
 *
 * @author Nelson
 */
public class Revista {
    /**
     * @param args the command line arguments
     */
    
    int edad;
    String nombre;
    String genero;
    String EstadoCivil;
    double ingresos;

    public Revista(String nombre, int edad, String genero, String EstadoCivil, double ingresos) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.EstadoCivil = EstadoCivil;
        this.ingresos = ingresos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public double getIngresos() {
        return ingresos;
    }
    
    
    
    public static void main(String[] args) {
        int a=0;
        String Genero[]=new String[100];
        String EstadoC[]=new String[100];
        String Nombre[]=new String[100];
        Revista [] encuesta = new Revista[100];
        int Edad[]=new int[100];
        double Ingresos[]=new double[100];
        int i=0;
        
        // TODO code application logic her
        while ( i<100){
            System.out.println("Ingrese el nombre del cliente");
            java.util.Scanner lectura = new java.util.Scanner(System.in);
            Nombre[i]=lectura.next();            
            System.out.println("Ingrese la edad del cliente");
            Edad[i]=lectura.nextInt();
            System.out.println("Ingrese el genero (masculino/femenino)");
            Genero[i]=lectura.next();
            System.out.println("Ingrese estado civil(soltero/casado)");
            EstadoC[i]=lectura.next();
            System.out.println("Ingrese el valor anual de ingrasos del cliente");
            Ingresos[i]=lectura.nextDouble();
            encuesta[i] = new Revista(Nombre[i],Edad[i],Genero[i],EstadoC[i],Ingresos[i]);
            System.out.println("Para ingresar un nuevo cliente escriba 1, de lo contrario escriba 0");
            int opcion=lectura.nextInt();
            boolean m;
            m = opcion==1;
            if (m==false){
                break;
                } else i++;
        }
        
        int j=0;
        int k=i+1;
        int vein=0;
        int trein=0;
        int cuaren=0;
        int cincuen=0;
        int sesen=0;
        int s=0;
        int Mvein=0;
        int Fvein=0;
        int Mtrein=0;
        int Mcuaren=0;
        int Mcincuen=0;
        int Msesen=0;
        int Ftrein=0;
        int Fcuaren=0;
        int Fcincuen=0;
        int Fsesen=0;
        
        System.out.println("Como desea Recibir los datos?\n"
                + "(1) intervalos de edad\n"
                + "(2) intervalos de edad y genero\n"
                + "(3) intervalos de ingresos");
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int menu=lectura.nextInt();
        
        if (menu==1){            
        
            while ( j<k){
                int r=encuesta[j].getEdad();
                if(r<20){
                    vein++;
                }else if (r<30&r>=20){
                    trein++;                
                }else if (r<40&r>=30){
                    cuaren++;                
                }else if (r<50&r>=40){
                    cincuen++;                
                }else if (r>=50){
                    sesen++;                
                }
                j=j+1;
            }
            System.out.println("Hay "+vein+" lectores menores a 20 años");
            System.out.println("Hay "+trein+" lectores entre los 20 y los 29 años");
            System.out.println("Hay "+cuaren+" lectores entre los 30 y los 39 años");
            System.out.println("Hay "+cincuen+" lectores entre los 40 y los 49 años");
            System.out.println("Hay "+sesen+" lectores mayores a 50 años");
        
        }else
            if (menu==2){
        
        while ( s<k){
            int r=encuesta[s].getEdad();
            String muj=encuesta[s].getGenero();
            if(r<20){
                if("femenino".equals(muj)){
                    Fvein++;
                }else
                Mvein++;
            }else if (r<30&r>=20){
                if("femenino".equals(muj)){
                    Ftrein++;
                }else
                Mtrein++;                
            }else if (r<40&r>=30){
                if("femenino".equals(muj)){
                    Fcuaren++;
                }else
                Mcuaren++;                
            }else if (r<50&r>=40){
                if("femenino".equals(muj)){
                    Fcincuen++;
                }else
                Mcincuen++;                
            }else if (r>=50){
                if("femenino".equals(muj)){
                    Fsesen++;
                }else
                Msesen++;                
            }
            s=s+1;
        }
        System.out.println("Hay "+Mvein+" lectores masculinos menores a 20 años");
        System.out.println("Hay "+Fvein+" lectoras femeninas menores a 20 años");
        System.out.println("Hay "+Mtrein+" lectores masculinos entre los 20 y los 29 años");
        System.out.println("Hay "+Ftrein+" lectoras femeninas entre los 20 y los 29 años");
        System.out.println("Hay "+Mcuaren+" lectores masculinos entre los 30 y los 39 años");
        System.out.println("Hay "+Fcuaren+" lectoras femeninas entre los 30 y los 39 años");
        System.out.println("Hay "+Mcincuen+" lectores masculinos entre los 40 y los 49 años");
        System.out.println("Hay "+Fcincuen+" lectoras femeninas entre los 40 y los 49 años");
        System.out.println("Hay "+Msesen+" lectores masculinos mayores a 50 años");
        System.out.println("Hay "+Fsesen+" lectoras femeninas mayores a 50 años");
        
            } else 
                if(menu==3){
                
                while ( j<k){
                double r=encuesta[j].getIngresos();
                if(r<30000){
                    vein++;
                }else if (r<40000&r>=30000){
                    trein++;                
                }else if (r<50000&r>=40000){
                    cuaren++;                
                }else if (r<60000&r>=50000){
                    cincuen++;                
                }else if (r>=60000){
                    sesen++;                
                }
                j=j+1;
            }
            System.out.println("Hay "+vein+" lectores con ingresos inferiores a 30000");
            System.out.println("Hay "+trein+" lectores con ingresos entre los 30000 y los 39999 años");
            System.out.println("Hay "+cuaren+" lectores con ingresos entre los 40000 y los 49999 años");
            System.out.println("Hay "+cincuen+" lectores con ingresos entre los 50000 y los 59999 años");
            System.out.println("Hay "+sesen+" lectores con ungresos mayores a 60000 años");
        
             
                
                
        }
    }
    
}