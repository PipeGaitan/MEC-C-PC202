import java.util.ArrayList;
 class Farmacia {
    static ArrayList<String> listNomb;
    static ArrayList<Farmacia> listFmc;
    String nombre;
    String direccion;
    String telefono;
    ArrayList<Cita> citas;
    
    public static void gestionFarmacias(){  
        if(listNomb==null){
            listNomb=new ArrayList<String>();}
        String nombreFmc=Lectura.nextString("\n\nNombre farmacias: ");
        if(listNomb.contains(nombreFmc.toLowerCase().replaceAll(" ",""))){
        System.out.println("Farmacia ya existe!!");
        crud(nombreFmc);
    }   else{
            System.out.println("Farmacia nueva!!");
            listNomb.add(nombreFmc.toLowerCase().replaceAll(" ",""));
            Farmacia nuevaFarmacia = new Farmacia();
            nuevaFarmacia.nombre= nombreFmc;
            nuevaFarmacia.direccion=Lectura.nextString("Direccion: ");
            nuevaFarmacia.telefono=Lectura.nextString("Telefono: ");
            nuevaFarmacia.citas=new ArrayList<Cita>();
             if (listFmc == null) {
            listFmc = new ArrayList<Farmacia>();
        }
        listFmc.add(nuevaFarmacia);
        }
    }

    public static void crud(String drogueria){
    int sel= Lectura.nextInt("\n1. Consultar 2. Modificar 3. Borrar\n"
            +"==>");
    switch(sel){
    case 1 -> { 
        int index = listNomb.indexOf(drogueria.toLowerCase().replaceAll(" ",""));
        if(index != -1) {
            Farmacia fmc = listFmc.get(index);
            System.out.println("\nInformación de la farmacia " + drogueria + ":");
            System.out.println("Nombre: " + fmc.nombre);
            System.out.println("Dirección: " + fmc.direccion);
            System.out.println("Teléfono: " + fmc.telefono);
        } else {
            System.out.println("\nLa farmacia " + drogueria + " no existe.");
        }   }
    case 2 -> { 
        int index = listNomb.indexOf(drogueria.toLowerCase().replaceAll(" ",""));
        if (index >= 0) {
            System.out.println("Modificar farmacia " + drogueria);
            Farmacia fmc = listFmc.get(index);
            fmc.direccion = Lectura.nextString("Nueva direccion: ");
            fmc.telefono = Lectura.nextString("Nuevo telefono: ");
            System.out.println("Farmacia modificada: " + fmc.nombre);
        } else {
            System.out.println("Farmacia no encontrada");
        }
            }
    
    case 3 -> {
         if (listNomb.contains(drogueria.toLowerCase().replaceAll(" ",""))) {
        listNomb.remove(drogueria.toLowerCase().replaceAll(" ",""));
        System.out.println("Farmacia eliminada correctamente.");
    } else {
        System.out.println("La farmacia no existe.");
    }
        }       }
    } 
     
    }

