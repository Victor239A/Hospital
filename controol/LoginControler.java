
package controol;

public class LoginControler {
    
    String[][] usuariosYContraseñas = {
        {"victoor", "hola1234"},       // Dato original
        {"maria22", "claveMaria"},    // +10 nuevos pares
        {"juanP", "juanito456"},
        {"ana_light", "anaSystem"},
        {"superUser", "admin2024"},
        {"coderPro", "javaIsFun"},
        {"dragonZ", "firePassword"},
        {"luna99", "moonLight"},
        {"traveler", "viajes2023"},
        {"bookLover", "readMore12"},
        {"gamerX", "playStation5"}
    };

    public boolean validacionDatos(String EntradaUsuario, String EntradaContraseña) {

        for (int i = 0; i < usuariosYContraseñas.length; i++) {
            String usuarioCorrecto = usuariosYContraseñas[i][0];
            String contraseñaCorrecta = usuariosYContraseñas[i][1];
            
         
            if (usuarioCorrecto.equals(EntradaUsuario) && 
                contraseñaCorrecta.equals(EntradaContraseña)) {
                return true; 
            }
        }
        return false;
    }
}
