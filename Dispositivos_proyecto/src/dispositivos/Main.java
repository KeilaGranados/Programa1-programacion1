package dispositivos;
//Se importan las acciones
import java.util.logging.Logger;

import java.util.logging.Level;

import java.util.Scanner;

import java.io.*;
/**
 * @author keila Granados
 */


public class Main{
//Se crea la clase principal
    public static void main(String[] args) throws IOException, InterruptedException {
        //se invocan las entradas
        Scanner entrada = new Scanner(System.in);
        
        int op1 = 0, i = 0;
        int op2=0;

        //se crea el menu con sus respectivas acciones
        do{
            System.out.print("-----Ecosistema de Dispositivos-----");
            System.out.print("\n1. Crear dispositivos y administarlos");
            System.out.print("\n2. Acciones con dispositivos");
            System.out.print("\n3. Acciones externas de dispositivos");
            System.out.print("\n4. Cargas masivas");
            System.out.print("\n5. Long");
            System.out.print("\n6. Salir");
            System.out.print("\nSeleccione la opción a ejecutar:");
            op1 = entrada.nextInt(); 
            switch(op1){
                case 1:
                       do{
                    FileWriter fichero = new FileWriter ("App.txt");    

                    System.out.print("-----Crear dispositivo-----");
                        System.out.print("\n1. Computadora portátil");
                        System.out.print("\n2. Tablet");
                        System.out.print("\n3. SmartWatch");
                        System.out.print("\n4. Smartphone");
                        System.out.print("\n5. Auticulares inalámbricos");
                        System.out.print("\n6. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                        
                        i = entrada.nextInt();
                        
                        if (i > 0&& i<5){
                            if (i==1){
                                System.out.println("-----Creación y administración de Computadora portátil-----");
                                crearCompu();
                            }
                            else if (i==2){
                                System.out.println("-----Creación y administración de Dispositivo Tablet-----");
                                crearTablet();
                             }
                            else if (i==3){
                                System.out.println("-----Creación y administraciónde Dispositivo SmartWatch-----");
                                crearSmartwach();
                        }
                            else if (i==4) {
                                System.out.println("-----Creación y administración de Dispositivo SmartPhone-----");
                                crearSmarphone();         
                        }
                    }
                        else {
                                System.out.println("-----Creación y administración de nuevos Auriculares-----");
                                crearAuriculares();
                                }                            
                    break;
                    }while(op1!=6);
            do{
            FileWriter fichero = new FileWriter ("App.txt");  
                    
                        System.out.print("-----Acciones con dispositivos-----");
                        System.out.print("\n1. Computadora portátil");
                        System.out.print("\n2. Tablet");
                        System.out.print("\n3. SmartWatch");
                        System.out.print("\n4. Smartphone");
                        System.out.print("\n5. Auticulares inalámbricos");
                        System.out.print("\n6. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                         op2 = entrada.nextInt();
                         
                        if (op2 > 0&& op2<5){
                            if (op2==1){
                                System.out.println("-----Acción de Computadora portátil-----");
                                accionCompu();
                            }
                            else if (op2==2){
                                System.out.println("-----Acción de Dispositivo Tablet-----");
                                accionTablet();
                             }
                            else if (op2==3){
                                System.out.println("-----Acción de Dispositivo SmartWatch-----");
                                accionSmartwatch();
                        }
                            else if (op2==4) {
                                System.out.println("-----Acción de de Dispositivo SmartPhone-----");
                                accionSmartphone();         
                        }
                    }
                        else {
                                System.out.println("-----Creación y administración de nuevos Auriculares-----");
                                accionesauriculares();
                                }                            
                    break;
                    }while(op2!=6);
  
            }
            }while(op1!=6);
            }

//se crean las clases secundarias donde se alojan todas las funciones del programa
    
    //clase crear
    private static void crearCompu() {
       int opcion1;
    Scanner entrada = new Scanner(System.in);
        String a = null,b = null,c ="";
        String d = "Activo";
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        
            do{
            archivo = new File("App.txt");
            if (!archivo.exists()){
                try{
                    archivo.createNewFile();
                    System.out.println("Correo electrénico:");
                    a = entrada.next();
                    System.out.println("Nombre del dispositivo: ");
                    b = entrada.next();
                    System.out.println("Visible par conexión: ");
                    c = entrada.next();
                    
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    System.out.println("Correo electrénico: "+a);
                    linea.println(a);
                    System.out.println("Nombre del dispositivo: "+b);
                    linea.println(b);
                    System.out.println("Visible par conexión: "+c);
                    linea.println(c);
                    System.out.println("Estado por defecto: "+d);
                    linea.println(d);
                    linea.close();
                    escribir.close();
                    
                }catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null, ex);
                    
                }                
            }
            else {
                try{
                    archivo.createNewFile();
                    System.out.println("Correo electrénico: ");
                    a = entrada.next();
                    System.out.println("Nombre del dispositivo: ");
                    b = entrada.next();
                    System.out.println("Visible par conexión: ");
                    c = entrada.next();
                    
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    System.out.println("Correo electrénico: "+a);
                    linea.println(a);
                    System.out.println("Nombre del dispositivo: "+b);
                    linea.println(b);
                    System.out.println("Visible par conexión: "+c);
                    linea.println(c);
                    System.out.println("Estado por defecto: "+d);
                    linea.println(d);
                    linea.close();
                    escribir.close();
                }catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null, ex);
                    
                }   
            }

                System.out.println("¿Desea ELiminar algun dato ingresado?");
                System.out.println("1. correo");
                System.out.println("2. Nombre de dispositivo");
                System.out.println("3. Visible");
                System.out.println("4. Salir");
                System.out.println("Ingrese su opción:");
                                int t = entrada.nextInt();
                                if (t==1){
                                    System.out.println("**CORREO ELECTRONICO**");
                                    eliminarCorreo(a);    
                                }
                                else if(t==2){
                                    System.out.println("**NOMBRE**");
                                    eliminarNombre(b);
                                }
                                else if(t==3){
                                    System.out.println("**VISIBLE**");
                                    eliminarVisibilidad(c); 
                                }
                                System.out.println("MODIFICADO");
                                System.out.println("1. Salir");
                                System.out.println("2. Ingresar nuevo dato");
                                opcion1 = entrada.nextInt();
        }while(opcion1!=1);  
    }

    private static void crearTablet() {
      int opcion1;
    Scanner entrada = new Scanner(System.in);
        String a = null,b = null,c ="";
        String d = "Activo";
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
            do{
            archivo = new File("App.txt");
            if (!archivo.exists()){
                try{
                    archivo.createNewFile();
                    System.out.println("Correo electrénico:");
                    a = entrada.next();
                    System.out.println("Nombre del dispositivo: ");
                    b = entrada.next();
                    System.out.println("Visible par conexión: ");
                    c = entrada.next();
                    
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    System.out.println("Correo electrénico: "+a);
                    linea.println(a);
                    System.out.println("Nombre del dispositivo: "+b);
                    linea.println(b);
                    System.out.println("Visible par conexión: "+c);
                    linea.println(c);
                    System.out.println("Estado por defecto: "+d);
                    linea.println(d);
                    linea.close();
                    escribir.close();
                    
                }catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null, ex);
                    
                }                
            }
            else {
                try{
                    archivo.createNewFile();
                    System.out.println("Correo electrénico: ");
                    a = entrada.next();
                    System.out.println("Nombre del dispositivo: ");
                    b = entrada.next();
                    System.out.println("Visible par conexión: ");
                    c = entrada.next();
                    
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    System.out.println("Correo electrénico: "+a);
                    linea.println(a);
                    System.out.println("Nombre del dispositivo: "+b);
                    linea.println(b);
                    System.out.println("Visible par conexión: "+c);
                    linea.println(c);
                    System.out.println("Estado por defecto: "+d);
                    linea.println(d);
                    linea.close();
                    escribir.close();
                }catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null, ex);
                    
                }   
            }

                System.out.println("¿Desea ELiminar algun dato ingresado?");
                System.out.println("1. correo");
                System.out.println("2. Nombre de dispositivo");
                System.out.println("3. Visible");
                System.out.println("4. Salir");
                System.out.println("Ingrese su opción:");
                                int t = entrada.nextInt();
                                if (t==1){
                                    System.out.println("**CORREO ELECTRONICO**");
                                    eliminarCorreo(a);    
                                }
                                else if(t==2){
                                    System.out.println("**NOMBRE**");
                                    eliminarNombre(b);
                                }
                                else if(t==3){
                                    System.out.println("**VISIBLE**");
                                    eliminarVisibilidad(c); 
                                }
                                System.out.println("MODIFICADO");
                                System.out.println("1. Salir");
                                System.out.println("2. Ingresar nuevo dato");
                                opcion1 = entrada.nextInt();
        }while(opcion1!=1);     
    }

    private static void crearSmartwach() {
     int opcion1;
    Scanner entrada = new Scanner(System.in);
        String a = null,b = null,c ="";
        String d = "Activo";
        File archivo;
        FileWriter escribir;
        PrintWriter linea;

                    do{
            archivo = new File("App.txt");
            if (!archivo.exists()){
                try{
                    archivo.createNewFile();
                    System.out.println("Correo electrénico:");
                    a = entrada.next();
                    System.out.println("Nombre del dispositivo: ");
                    b = entrada.next();
                    System.out.println("Visible par conexión: ");
                    c = entrada.next();
                    
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    System.out.println("Correo electrénico: "+a);
                    linea.println(a);
                    System.out.println("Nombre del dispositivo: "+b);
                    linea.println(b);
                    System.out.println("Visible par conexión: "+c);
                    linea.println(c);
                    System.out.println("Estado por defecto: "+d);
                    linea.println(d);
                    linea.close();
                    escribir.close();
                    
                }catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null, ex);
                    
                }                
            }
            else {
                try{
                    archivo.createNewFile();
                    System.out.println("Correo electrénico: ");
                    a = entrada.next();
                    System.out.println("Nombre del dispositivo: ");
                    b = entrada.next();
                    System.out.println("Visible par conexión: ");
                    c = entrada.next();
                    
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    System.out.println("Correo electrénico: "+a);
                    linea.println(a);
                    System.out.println("Nombre del dispositivo: "+b);
                    linea.println(b);
                    System.out.println("Visible par conexión: "+c);
                    linea.println(c);
                    System.out.println("Estado por defecto: "+d);
                    linea.println(d);
                    linea.close();
                    escribir.close();
                }catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null, ex);
                    
                }   
            }

                System.out.println("¿Desea ELiminar algun dato ingresado?");
                System.out.println("1. correo");
                System.out.println("2. Nombre de dispositivo");
                System.out.println("3. Visible");
                System.out.println("4. Salir");
                System.out.println("Ingrese su opción:");
                                int t = entrada.nextInt();
                                if (t==1){
                                    System.out.println("**CORREO ELECTRONICO**");
                                    eliminarCorreo(a);    
                                }
                                else if(t==2){
                                    System.out.println("**NOMBRE**");
                                    eliminarNombre(b);
                                }
                                else if(t==3){
                                    System.out.println("**VISIBLE**");
                                    eliminarVisibilidad(c); 
                                }
                                System.out.println("MODIFICADO");
                                System.out.println("1. Salir");
                                System.out.println("2. Ingresar nuevo dato");
                                opcion1 = entrada.nextInt();
        }while(opcion1!=1);     
    }

    private static void crearSmarphone() {
     int opcion2;
    Scanner entrada = new Scanner (System.in);
    String a,b,c ="";
    String d = "activo";
    int l =0;
    long f=0;
    
    do{
    System.out.println("Correo electrénico: ");
    a = entrada.next(); 
    System.out.println("Nombre del dispositivo: ");
    b = entrada.next();
    System.out.println("Visible para conexión:");
    c = entrada.next();
    System.out.println("Número de telefono"
            + "\nNota: ingresar 8 digitos");
    f = entrada.nextInt();   
    
    System.out.println("Correo electrénico: "+ a);
    System.out.println("Nombre del dispositivo:"+ b);
    System.out.println("Visible para conexión:"+ c);
    System.out.println("Nota: el dispositivo estara"+ d +"por defecto");
    System.out.println("Número de telefono:"+ f);
    
    System.out.println("¿Desea agregar un dispositivo?");
    System.out.println("1 para agregar");
    System.out.println("2 para salir");
    l = entrada.nextInt();
    }while(l!=2);
    do{
                System.out.println("¿Desea ELiminar algun dato ingresado?");
                System.out.println("1. correo");
                System.out.println("2. Nombre de dispositivo");
                System.out.println("3. Visible");
                System.out.println("4. Número de telefóno");
                System.out.println("5. Salir");
                System.out.println("Ingrese su opción:");
                                int t = entrada.nextInt();
                                if (t==1){
                                    System.out.println("**CORREO ELECTRONICO**");
                                    eliminarCorreo(a);    
                                }
                                else if(t==2){
                                    System.out.println("**NOMBRE**");
                                    eliminarNombre(b);
                                }
                                else if(t==3){
                                    System.out.println("**VISIBLE**");
                                    eliminarVisibilidad(c);
                                }
                                else if (t==4){
                                  System.out.println("**Telefono**");
                                    eliminarTelefono(f);
                                        }    
                                System.out.println("MODIFICADO");
                                System.out.println("1. Salir");
                                System.out.println("2. Ingresar nuevo dato");
                                opcion2 = entrada.nextInt();
        }while(opcion2!=1);    
    }
    
    private static void crearAuriculares() { 
    String archivo = "App.txt";
        BufferedReader br = null;
        try {
           br = new BufferedReader(new FileReader(archivo));
           String texto = br.readLine();
           while(texto != null)
           {
               System.out.println(texto);
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());

}
        }   
    }
    
    //clase eliminar
    public static void eliminarCorreo(String a){
    try(Scanner entrada = new Scanner(new File("App.txt")))
    {
        PrintWriter pw = new PrintWriter(new FileWriter("App.txt",true));
        String s [];
        boolean CorreoEncontrado= false;
        while(entrada.hasNextLine())
        {
            s = entrada.nextLine().split(":");
            if(s[0].equals(a))
            {
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(a);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el correo electronico: " + a +".");
                CorreoEncontrado = true; 
            }
        }
        if(!CorreoEncontrado)
        {
            System.out.println("No hay correo en existencia: " + a);
        }
    }
    catch(IOException ex)
    {
        System.out.println(ex.getMessage());
    }
}

    public static void eliminarNombre(String b){

    try(Scanner entrada = new Scanner(new File("App.txt"))){
        PrintWriter pw = new PrintWriter(new FileWriter("App.txt",true));
        String s [];
        boolean NombreEncontrado= false;
        while(entrada.hasNextLine()){
            s = entrada.nextLine().split(":");
            if(s[0].equals(b)){
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(b);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el nombre del dispositivo: "+b);
                NombreEncontrado = true;
            }
        }
        if(!NombreEncontrado){
            System.out.println("No hay Ningun Nombre Existente: "+b);
        }
    }catch(IOException ex){
        System.out.println(ex.getMessage());
    }
}
    
    public static void eliminarVisibilidad(String c){

    try(Scanner entrada = new Scanner(new File("App.txt")))
    {
        PrintWriter pw = new PrintWriter(new FileWriter("App.txt",true));
        String s [];
        boolean Visible= false;
        while(entrada.hasNextLine())
        {
            s = entrada.nextLine().split(":");
            if(s[0].equals(c))
            {
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(c);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el Dispositivo Visible: "+c);
                Visible = true;
            }
        }
        if(!Visible)
        {
            System.out.println("No hay Dispositivo Visible: "+c);
        }
    }
    catch(IOException ex)
    {
        System.out.println(ex.getMessage());
    }
}
    
    public static void eliminarEstado(String d){

    try(Scanner entrada = new Scanner(new File("App.txt")))
    {
        PrintWriter pw = new PrintWriter(new FileWriter("App.txt",true));
        String s [];
        boolean Estado= false;
        while(entrada.hasNextLine())
        {
            s = entrada.nextLine().split(":");
            if(s[0].equals(d))
            {
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(d);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el Estado: "+d+".");
                Estado= true;
            }
        }
        if(!Estado)
        {
            System.out.println("No existe estado: "+d);
        }
    }
    catch(IOException ex)
    {
        System.out.println(ex.getMessage());
    }
}

    public static void eliminarTelefono(long f){
        
    try(Scanner entrada = new Scanner(new File("App.txt"))){
        PrintWriter pw = new PrintWriter(new FileWriter("App.txt",true));
        String s [];
        boolean TelefonoEncontrado= false;
        while(entrada.hasNextLine()){
            s = entrada.next().split(":");
            if(s[0].equals(f)){
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(f);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el telefóno : "+f);
                TelefonoEncontrado = true;
            }
        }
        if(!TelefonoEncontrado){
            System.out.println("No existe este telefóno: "+f);
        }
    }catch(IOException ex){
        System.out.println(ex.getMessage());
    }
    }

    //acciones a utilizar
    private static void accionCompu() {
    Scanner entrada = new Scanner (System.in);
    String l = new String(" ");
    int opC=0;
                     System.out.print("-----Dispositivo computadora-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Pegar texto");
                        System.out.print("\n4. Compartir documento");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    opC = entrada.nextInt();
                    do{
                    switch(opC){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int copiar=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            l = entrada.next();
                            if(l!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                copiar = entrada.nextInt();
                                if(copiar==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                        case 3: 
                            int pegar=0;
                             System.out.println("Pegar texto*\n\n\n");
                             System.out.println("¿Desea Pegar el Dexto Aquí?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            pegar = entrada.nextInt();
                            if(pegar==1){
                                System.out.print("Texto pegado");
                                System.out.print("Su texto es el siguiente.....................**\n\n\n\n");
                                System.out.print(l+"\n\n");
                            }
                            else{
                                System.out.print("No se deseo pegar el texto***\n");
                            }
                            
                            break;
                            
                        case 4:
                            int doc=0;
                            String a;
                            System.out.println("Compartir documentos");
                            System.out.println("¿Desea compartir documentos?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            doc= entrada.nextInt();
                            if( doc==1){
                                System.out.print("Ingrese el nombre del documento: ");
                                a = entrada.next();
                                if(a==a){
                                    System.out.print("Documento encontrado.......\n");
                                }
                                else{
                                    System.out.println("No se encontro el documento..\n");
                               }
                            }
                            break;
                    }
                    break;
                    }while(opC!=5);                    
}
    
    private static void accionTablet() {
      Scanner entrada = new Scanner (System.in);
    String l = new String(" ");
    int opT=0;
                     System.out.print("-----Dispositivo Tablet-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Pegar texto");
                        System.out.print("\n4. Compartir documento");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    opT = entrada.nextInt();
                    do{
                    switch(opT){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int copiar=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            l = entrada.next();
                            if(l!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                copiar = entrada.nextInt();
                                if(copiar==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                        case 3: 
                            int pegar=0;
                             System.out.println("Pegar texto*\n\n\n");
                             System.out.println("¿Desea Pegar el Dexto Aquí?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            pegar = entrada.nextInt();
                            if(pegar==1){
                                System.out.print("Texto pegado");
                                System.out.print("Su texto es el siguiente.....................**\n\n\n\n");
                                System.out.print(l+"\n\n");
                            }
                            else{
                                System.out.print("No se deseo pegar el texto***\n");
                            }
                            
                            break;
                            
                        case 4:
                            int doc=0;
                            String a;
                            System.out.println("Compartir documentos");
                            System.out.println("¿Desea compartir documentos?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            doc= entrada.nextInt();
                            if( doc==1){
                                System.out.print("Ingrese el nombre del documento: ");
                                a = entrada.next();
                                if(a==a){
                                    System.out.print("Documento encontrado.......\n");
                                }
                                else{
                                    System.out.println("No se encontro el documento..\n");
                               }
                            }
                            break;
                    }
                    break;
                    }while(opT!=5);                        
    }

    private static void accionSmartwatch() {
    Scanner entrada = new Scanner (System.in);
    String l = new String(" ");
    int opS=0;
                     System.out.print("-----Dispositivo SmartWatch-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    opS = entrada.nextInt();
                    do{
                    switch(opS){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int copiar=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            l = entrada.next();
                            if(l!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                copiar = entrada.nextInt();
                                if(copiar==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                    }
                    break;
                    }while(opS!=3);                    
    }

    private static void accionSmartphone() {
        Scanner entrada = new Scanner (System.in);
    String l = new String(" ");
    int opp=0;
                     System.out.print("-----Dispositivo SmartPhone-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Pegar texto");
                        System.out.print("\n4. Compartir documento");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    opp = entrada.nextInt();
                    do{
                    switch(opp){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int copiar=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            l = entrada.next();
                            if(l!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                copiar = entrada.nextInt();
                                if(copiar==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                        case 3: 
                            int pegar=0;
                             System.out.println("Pegar texto*\n\n\n");
                             System.out.println("¿Desea Pegar el Dexto Aquí?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            pegar = entrada.nextInt();
                            if(pegar==1){
                                System.out.print("Texto pegado");
                                System.out.print("Su texto es el siguiente.....................**\n\n\n\n");
                                System.out.print(l+"\n\n");
                            }
                            else{
                                System.out.print("No se deseo pegar el texto***\n");
                            }
                            
                            break;
                            
                        case 4:
                            int doc=0;
                            String a;
                            System.out.println("Compartir documentos");
                            System.out.println("¿Desea compartir documentos?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            doc= entrada.nextInt();
                            if( doc==1){
                                System.out.print("Ingrese el nombre del documento: ");
                                a = entrada.next();
                                if(a==a){
                                    System.out.print("Documento encontrado.......\n");
                                }
                                else{
                                    System.out.println("No se encontro el documento..\n");
                               }
                            }
                            break;
                    }
                    break;
                    }while(opp!=5);  
    }

    private static void accionesauriculares() {
        Scanner entrada = new Scanner (System.in);
    String l = new String(" ");
    int opa=0;
                     System.out.print("-----Dispositivo auriculares-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Pegar texto");
                        System.out.print("\n4. Compartir documento");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    opa = entrada.nextInt();
                    do{
                    switch(opa){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int copiar=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            l = entrada.next();
                            if(l!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                copiar = entrada.nextInt();
                                if(copiar==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                        case 3: 
                            int pegar=0;
                             System.out.println("Pegar texto*\n\n\n");
                             System.out.println("¿Desea Pegar el Dexto Aquí?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            pegar = entrada.nextInt();
                            if(pegar==1){
                                System.out.print("Texto pegado");
                                System.out.print("Su texto es el siguiente.....................**\n\n\n\n");
                                System.out.print(l+"\n\n");
                            }
                            else{
                                System.out.print("No se deseo pegar el texto***\n");
                            }
                            
                            break;
                            
                        case 4:
                            int doc=0;
                            String a;
                            System.out.println("Compartir documentos");
                            System.out.println("¿Desea compartir documentos?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            doc= entrada.nextInt();
                            if( doc==1){
                                System.out.print("Ingrese el nombre del documento: ");
                                a = entrada.next();
                                if(a==a){
                                    System.out.print("Documento encontrado.......\n");
                                }
                                else{
                                    System.out.println("No se encontro el documento..\n");
                               }
                            }
                            break;
                    }
                    break;
                    }while(opa!=5);  
    }
    
}