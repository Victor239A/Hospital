package controol;

public class LoginControler {

    String[][] usuariosContraseñas = {
        {"victoor", "aaaaa123"},
        {"maria22", "m123pass"},
        {"carlosM", "carLOS#1"},
        {"ana_1990", "ana90XYZ"},
        {"luis_g", "LuisG*22"},
        {"sofia_t", "Sofi@2023"},
        {"javier99", "jav99PASS"},
        {"marta_k", "Mk2024!"},
        {"pablo_z", "Pz#2023"},
        {"laura5", "L5aura*"}
    };


      public boolean validacionDatos (String Eusuario , String Econtraseña){

        for (int i = 0; i < usuariosContraseñas.length; i++) {
             System.out.println(usuariosContraseñas[i][0]);
            if (usuariosContraseñas[i][0].equals(Eusuario) && usuariosContraseñas[1][1].equals(Econtraseña) ) {
                
            }
        }
     
       }
}       

 
