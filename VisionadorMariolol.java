import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class VisionadorMariolol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VisionadorMariolol
{
    // instance variables - replace the example below with your own
    private String[] campeones;
    private ArrayList<String> lineas;
    private String[] daño;
    Random aleatorio = new Random();

    /**
     * Constructor for objects of class VisionadorMariolol
     */
    public VisionadorMariolol()
    {
        campeones = new String[134];
        lineas = new ArrayList<String>(5);
        daño = new String[2];
        daño[0] = "ad";
        daño[1] = "ap";
        lineas.add("top");
        lineas.add("mid");
        lineas.add("adc");
        lineas.add("jungla");
        lineas.add("support");
        campeones[0] = "Aatrox";
        campeones[1] = "Ahri";
        campeones[2] = "Akali";
        campeones[3] = "Alistar";
        campeones[4] = "Amumu";
        campeones[5] = "Anivia";
        campeones[6] = "Annie";
        campeones[7] = "Ashe";
        campeones[8] = "Aurelion Sol";
        campeones[9] = "Azir";
        campeones[10] = "Bard";
        campeones[11] = "Blitzcrank";
        campeones[12] = "Brand";
        campeones[13] = "Braum";
        campeones[14] = "Caitlyn";
        campeones[15] = "Camille";
        campeones[16] = "Cassiopeia";
        campeones[17] = "Cho`gath";
        campeones[18] = "Corki";
        campeones[19] = "Darius";
        campeones[20] = "Diana";
        campeones[21] = "Dr.Mundo";
        campeones[22] = "Draven";
        campeones[23] = "Ekko";
        campeones[24] = "Elise";
        campeones[25] = "Evelynn";
        campeones[26] = "Ezreal";
        campeones[27] = "Fiddlesticks";
        campeones[28] = "Fiora";
        campeones[29] = "Fizz";
        campeones[30] = "Galio";
        campeones[31] = "Gangplank";
        campeones[32] = "Garen";
        campeones[33] = "Gnar";
        campeones[34] = "Gragas";
        campeones[35] = "Graves";
        campeones[36] = "Hecarim";
        campeones[37] = "Heimerdinger";
        campeones[38] = "Illaoi";
        campeones[39] = "Irelia";
        campeones[40] = "Ivern";
        campeones[41] = "Janna";
        campeones[42] = "Jarvan IV";
        campeones[43] = "Jax";
        campeones[44] = "Jayce";
        campeones[45] = "Jhin";
        campeones[46] = "Jinx";
        campeones[47] = "Kalista";
        campeones[48] = "Karma";
        campeones[49] = "Karthus";
        campeones[50] = "Kassadin";
        campeones[51] = "Katarina";
        campeones[52] = "Kayle";
        campeones[53] = "Kennen";
        campeones[54] = "Kha`zix";
        campeones[55] = "Kindred";
        campeones[56] = "Kled";
        campeones[57] = "Kog`Maw";
        campeones[58] = "Leblanc";
        campeones[59] = "Lee Sin";
        campeones[60] = "Leona";
        campeones[61] = "Lissandra";
        campeones[62] = "Lucian";
        campeones[63] = "Lulu";
        campeones[64] = "Lux";
        campeones[65] = "Malphite";
        campeones[66] = "Malzahar";
        campeones[67] = "Maokai";
        campeones[68] = "Master yi";
        campeones[69] = "Miss Fortune";
        campeones[70] = "Mordekaiser";
        campeones[71] = "Morgana";
        campeones[72] = "Nami";
        campeones[73] = "Nasus";
        campeones[74] = "Nautilus";
        campeones[75] = "Nidalee";
        campeones[76] = "Nocturne";
        campeones[77] = "Nunu";
        campeones[78] = "Olaf";
        campeones[79] = "Orianna";
        campeones[80] = "Pantheon";
        campeones[81] = "Poppy";
        campeones[82] = "Quinn";
        campeones[83] = "Rammus";
        campeones[84] = "Rek`Sai";
        campeones[85] = "Renekton";
        campeones[86] = "Rengar";
        campeones[87] = "Riven";
        campeones[88] = "Rumble";
        campeones[89] = "Ryze";
        campeones[90] = "Sejuani";
        campeones[91] = "Shaco";
        campeones[92] = "Shen";
        campeones[93] = "Shyvana";
        campeones[94] = "Singed";
        campeones[95] = "Sion";
        campeones[96] = "Sivir";
        campeones[97] = "Skarner";
        campeones[98] = "Sona";
        campeones[99] = "Soraka";
        campeones[100] = "Swain";
        campeones[101] = "Syndra";
        campeones[102] = "Tahm Kench";
        campeones[103] = "Taliyah";
        campeones[104] = "Talon";
        campeones[105] = "Taric";
        campeones[106] = "Teemo";
        campeones[107] = "Thresh";
        campeones[108] = "Tristana";
        campeones[109] = "Trundle";
        campeones[110] = "Tryndamere";
        campeones[111] = "Twisted Fate";
        campeones[112] = "Twitch";
        campeones[113] = "Udyr";
        campeones[114] = "Urgot";
        campeones[115] = "Varus";
        campeones[116] = "Vayne";
        campeones[117] = "Veigar";
        campeones[118] = "Vel`Koz";
        campeones[119] = "Vi";
        campeones[120] = "Viktor";
        campeones[121] = "Vladimir";
        campeones[122] = "Volibear";
        campeones[123] = "Warwick";
        campeones[124] = "Wukong";
        campeones[125] = "Xerath";
        campeones[126] = "Xin Zhao";
        campeones[127] = "Yasuo";
        campeones[128] = "Yorick";
        campeones[129] = "Zac";
        campeones[130] = "Zed";
        campeones[131] = "Ziggs";
        campeones[132] = "Zilean";
        campeones[133] = "Zyra";
    }

    public void escogerDaño(){
        int dañoAleatorio = aleatorio.nextInt(2);
        System.out.println(daño[dañoAleatorio]);
    }

    public void escogerLinea(){
        int minicontador = lineas.size();
        int lineaAleatoria = aleatorio.nextInt(minicontador);
        minicontador--;
        System.out.println(lineas.get(lineaAleatoria));
        lineas.remove(lineaAleatoria);

    }

    public void escogerCampeon(){
        int campeonAleatorio = aleatorio.nextInt(134);
        System.out.println(campeones[campeonAleatorio]);
        campeones[campeonAleatorio] = null;
    }

    public void escogerTodo(){
        escogerCampeon();
        escogerLinea();
        escogerDaño();
    }
}
