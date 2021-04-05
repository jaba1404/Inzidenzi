package us.jannis.inzidenzi.enums;

import com.google.gson.annotations.SerializedName;

public enum District {

    @SerializedName(value = "0", alternate = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"})
    STATE(-1, "Bundesland"),
    @SerializedName(value = "SK Flensburg", alternate = "1001")
    SK_FLENSBURG(1001, "SK Flensburg"),
    @SerializedName(value = "SK Kiel", alternate = "1002")
    SK_KIEL(1002, "SK Kiel"),
    @SerializedName(value = "SK Luebeck", alternate = "1003")
    SK_LUEBECK(1003, "SK Lübeck"),
    @SerializedName(value = "SK Neumuenster", alternate = "1004")
    SK_NEUMUENSTER(1004, "SK Neumünster"),
    @SerializedName(value = "LK Dithmarschen", alternate = "1051")
    LK_DITHMARSCHEN(1051, "LK Dithmarschen"),
    @SerializedName(value = "LK Herzogtum Lauenburg", alternate = "1053")
    LK_HERZOGTUM_LAUENBURG(1053, "LK Herzogtum Lauenburg"),
    @SerializedName(value = "LK Nordfriesland", alternate = "1054")
    LK_NORDFRIESLAND(1054, "LK Nordfriesland"),
    @SerializedName(value = "LK Ostholstein", alternate = "1055")
    LK_OSTHOLSTEIN(1055, "LK Ostholstein"),
    @SerializedName(value = "LK Pinneberg", alternate = "1056")
    LK_PINNEBERG(1056, "LK Pinneberg"),
    @SerializedName(value = "LK Ploen", alternate = "1057")
    LK_PLOEN(1057, "LK Plön"),
    @SerializedName(value = "LK Rendsburg-Eckernfoerde", alternate = "1058")
    LK_RENDSBURG_ECKERNFOERDE(1058, "LK Rendsburg-Eckernförde"),
    @SerializedName(value = "LK Schleswig-Flensburg", alternate = "1059")
    LK_SCHLESWIG_FLENSBURG(1059, "LK Schleswig-Flensburg"),
    @SerializedName(value = "LK Segeberg", alternate = "1060")
    LK_SEGEBERG(1060, "LK Segeberg"),
    @SerializedName(value = "LK Steinburg", alternate = "1061")
    LK_STEINBURG(1061, "LK Steinburg"),
    @SerializedName(value = "LK Stormarn", alternate = "1062")
    LK_STORMARN(1062, "LK Stormarn"),
    @SerializedName(value = "SK Hamburg", alternate = "2000")
    SK_HAMBURG(2000, "SK Hamburg"),
    @SerializedName(value = "SK Braunschweig", alternate = "3101")
    SK_BRAUNSCHWEIG(3101, "SK Braunschweig"),
    @SerializedName(value = "SK Salzgitter", alternate = "3102")
    SK_SALZGITTER(3102, "SK Salzgitter"),
    @SerializedName(value = "SK Wolfsburg", alternate = "3103")
    SK_WOLFSBURG(3103, "SK Wolfsburg"),
    @SerializedName(value = "LK Gifhorn", alternate = "3151")
    LK_GIFHORN(3151, "LK Gifhorn"),
    @SerializedName(value = "LK Goslar", alternate = "3153")
    LK_GOSLAR(3153, "LK Goslar"),
    @SerializedName(value = "LK Helmstedt", alternate = "3154")
    LK_HELMSTEDT(3154, "LK Helmstedt"),
    @SerializedName(value = "LK Northeim", alternate = "3155")
    LK_NORTHEIM(3155, "LK Northeim"),
    @SerializedName(value = "LK Peine", alternate = "3157")
    LK_PEINE(3157, "LK Peine"),
    @SerializedName(value = "LK Wolfenbuettel", alternate = "3158")
    LK_WOLFENBUETTEL(3158, "LK Wolfenbüttel"),
    @SerializedName(value = "LK Goettingen", alternate = "3159")
    LK_GOETTINGEN(3159, "LK Göttingen"),
    @SerializedName(value = "Region Hannover", alternate = "3241")
    REGION_HANNOVER(3241, "Region Hannover"),
    @SerializedName(value = "LK Diepholz", alternate = "3251")
    LK_DIEPHOLZ(3251, "LK Diepholz"),
    @SerializedName(value = "LK Hameln-Pyrmont", alternate = "3252")
    LK_HAMELN_PYRMONT(3252, "LK Hameln-Pyrmont"),
    @SerializedName(value = "LK Hildesheim", alternate = "3254")
    LK_HILDESHEIM(3254, "LK Hildesheim"),
    @SerializedName(value = "LK Holzminden", alternate = "3255")
    LK_HOLZMINDEN(3255, "LK Holzminden"),
    @SerializedName(value = "LK Nienburg (Weser)", alternate = "3256")
    LK_NIENBURG_WESER(3256, "LK Nienburg (Weser)"),
    @SerializedName(value = "LK Schaumburg", alternate = "3257")
    LK_SCHAUMBURG(3257, "LK Schaumburg"),
    @SerializedName(value = "LK Celle", alternate = "3351")
    LK_CELLE(3351, "LK Celle"),
    @SerializedName(value = "LK Cuxhaven", alternate = "3352")
    LK_CUXHAVEN(3352, "LK Cuxhaven"),
    @SerializedName(value = "LK Harburg", alternate = "3353")
    LK_HARBURG(3353, "LK Harburg"),
    @SerializedName(value = "LK Luechow-Dannenberg", alternate = "3354")
    LK_LUECHOW_DANNENBERG(3354, "LK Lüchow-Dannenberg"),
    @SerializedName(value = "LK Lueneburg", alternate = "3355")
    LK_LUENEBURG(3355, "LK Lüneburg"),
    @SerializedName(value = "LK Osterholz", alternate = "3356")
    LK_OSTERHOLZ(3356, "LK Osterholz"),
    @SerializedName(value = "LK Rotenburg (Wuemme)", alternate = "3357")
    LK_ROTENBURG_WUEMME(3357, "LK Rotenburg (Wümme)"),
    @SerializedName(value = "LK Heidekreis", alternate = "3358")
    LK_HEIDEKREIS(3358, "LK Heidekreis"),
    @SerializedName(value = "LK Stade", alternate = "3359")
    LK_STADE(3359, "LK Stade"),
    @SerializedName(value = "LK Uelzen", alternate = "3360")
    LK_UELZEN(3360, "LK Uelzen"),
    @SerializedName(value = "LK Verden", alternate = "3361")
    LK_VERDEN(3361, "LK Verden"),
    @SerializedName(value = "SK Delmenhorst", alternate = "3401")
    SK_DELMENHORST(3401, "SK Delmenhorst"),
    @SerializedName(value = "SK Emden", alternate = "3402")
    SK_EMDEN(3402, "SK Emden"),
    @SerializedName(value = "SK Oldenburg", alternate = "3403")
    SK_OLDENBURG(3403, "SK Oldenburg"),
    @SerializedName(value = "SK Osnabrueck", alternate = "3404")
    SK_OSNABRUECK(3404, "SK Osnabrück"),
    @SerializedName(value = "SK Wilhelmshaven", alternate = "3405")
    SK_WILHELMSHAVEN(3405, "SK Wilhelmshaven"),
    @SerializedName(value = "LK Ammerland", alternate = "3451")
    LK_AMMERLAND(3451, "LK Ammerland"),
    @SerializedName(value = "LK Aurich", alternate = "3452")
    LK_AURICH(3452, "LK Aurich"),
    @SerializedName(value = "LK Cloppenburg", alternate = "3453")
    LK_CLOPPENBURG(3453, "LK Cloppenburg"),
    @SerializedName(value = "LK Emsland", alternate = "3454")
    LK_EMSLAND(3454, "LK Emsland"),
    @SerializedName(value = "LK Friesland", alternate = "3455")
    LK_FRIESLAND(3455, "LK Friesland"),
    @SerializedName(value = "LK Grafschaft Bentheim", alternate = "3456")
    LK_GRAFSCHAFT_BENTHEIM(3456, "LK Grafschaft Bentheim"),
    @SerializedName(value = "LK Leer", alternate = "3457")
    LK_LEER(3457, "LK Leer"),
    @SerializedName(value = "LK Oldenburg", alternate = "3458")
    LK_OLDENBURG(3458, "LK Oldenburg"),
    @SerializedName(value = "LK Osnabrueck", alternate = "3459")
    LK_OSNABRUECK(3459, "LK Osnabrück"),
    @SerializedName(value = "LK Vechta", alternate = "3460")
    LK_VECHTA(3460, "LK Vechta"),
    @SerializedName(value = "LK Wesermarsch", alternate = "3461")
    LK_WESERMARSCH(3461, "LK Wesermarsch"),
    @SerializedName(value = "LK Wittmund", alternate = "3462")
    LK_WITTMUND(3462, "LK Wittmund"),
    @SerializedName(value = "SK Bremen", alternate = "4011")
    SK_BREMEN(4011, "SK Bremen"),
    @SerializedName(value = "SK Bremerhaven", alternate = "4012")
    SK_BREMERHAVEN(4012, "SK Bremerhaven"),
    @SerializedName(value = "SK Duesseldorf", alternate = "5111")
    SK_DUESSELDORF(5111, "SK Düsseldorf"),
    @SerializedName(value = "SK Duisburg", alternate = "5112")
    SK_DUISBURG(5112, "SK Duisburg"),
    @SerializedName(value = "SK Essen", alternate = "5113")
    SK_ESSEN(5113, "SK Essen"),
    @SerializedName(value = "SK Krefeld", alternate = "5114")
    SK_KREFELD(5114, "SK Krefeld"),
    @SerializedName(value = "SK Moenchengladbach", alternate = "5116")
    SK_MOENCHENGLADBACH(5116, "SK Mönchengladbach"),
    @SerializedName(value = "SK Muelheim a.d.Ruhr", alternate = "5117")
    SK_MUELHEIM_A_D_RUHR(5117, "SK Mülheim a.d.Ruhr"),
    @SerializedName(value = "SK Oberhausen", alternate = "5119")
    SK_OBERHAUSEN(5119, "SK Oberhausen"),
    @SerializedName(value = "SK Remscheid", alternate = "5120")
    SK_REMSCHEID(5120, "SK Remscheid"),
    @SerializedName(value = "SK Solingen", alternate = "5122")
    SK_SOLINGEN(5122, "SK Solingen"),
    @SerializedName(value = "SK Wuppertal", alternate = "5124")
    SK_WUPPERTAL(5124, "SK Wuppertal"),
    @SerializedName(value = "LK Kleve", alternate = "5154")
    LK_KLEVE(5154, "LK Kleve"),
    @SerializedName(value = "LK Mettmann", alternate = "5158")
    LK_METTMANN(5158, "LK Mettmann"),
    @SerializedName(value = "LK Rhein-Kreis Neuss", alternate = "5162")
    LK_RHEIN_KREIS_NEUSS(5162, "LK Rhein-Kreis Neuss"),
    @SerializedName(value = "LK Viersen", alternate = "5166")
    LK_VIERSEN(5166, "LK Viersen"),
    @SerializedName(value = "LK Wesel", alternate = "5170")
    LK_WESEL(5170, "LK Wesel"),
    @SerializedName(value = "SK Bonn", alternate = "5314")
    SK_BONN(5314, "SK Bonn"),
    @SerializedName(value = "SK Koeln", alternate = "5315")
    SK_KOELN(5315, "SK Köln"),
    @SerializedName(value = "SK Leverkusen", alternate = "5316")
    SK_LEVERKUSEN(5316, "SK Leverkusen"),
    @SerializedName(value = "StadtRegion Aachen", alternate = "5334")
    STADTREGION_AACHEN(5334, "StadtRegion Aachen"),
    @SerializedName(value = "LK Dueren", alternate = "5358")
    LK_DUEREN(5358, "LK Düren"),
    @SerializedName(value = "LK Rhein-Erft-Kreis", alternate = "5362")
    LK_RHEIN_ERFT_KREIS(5362, "LK Rhein-Erft-Kreis"),
    @SerializedName(value = "LK Euskirchen", alternate = "5366")
    LK_EUSKIRCHEN(5366, "LK Euskirchen"),
    @SerializedName(value = "LK Heinsberg", alternate = "5370")
    LK_HEINSBERG(5370, "LK Heinsberg"),
    @SerializedName(value = "LK Oberbergischer Kreis", alternate = "5374")
    LK_OBERBERGISCHER_KREIS(5374, "LK Oberbergischer Kreis"),
    @SerializedName(value = "LK Rheinisch-Bergischer Kreis", alternate = "5378")
    LK_RHEINISCH_BERGISCHER_KREIS(5378, "LK Rheinisch-Bergischer Kreis"),
    @SerializedName(value = "LK Rhein-Sieg-Kreis", alternate = "5382")
    LK_RHEIN_SIEG_KREIS(5382, "LK Rhein-Sieg-Kreis"),
    @SerializedName(value = "SK Bottrop", alternate = "5512")
    SK_BOTTROP(5512, "SK Bottrop"),
    @SerializedName(value = "SK Gelsenkirchen", alternate = "5513")
    SK_GELSENKIRCHEN(5513, "SK Gelsenkirchen"),
    @SerializedName(value = "SK Muenster", alternate = "5515")
    SK_MUENSTER(5515, "SK Münster"),
    @SerializedName(value = "LK Borken", alternate = "5554")
    LK_BORKEN(5554, "LK Borken"),
    @SerializedName(value = "LK Coesfeld", alternate = "5558")
    LK_COESFELD(5558, "LK Coesfeld"),
    @SerializedName(value = "LK Recklinghausen", alternate = "5562")
    LK_RECKLINGHAUSEN(5562, "LK Recklinghausen"),
    @SerializedName(value = "LK Steinfurt", alternate = "5566")
    LK_STEINFURT(5566, "LK Steinfurt"),
    @SerializedName(value = "LK Warendorf", alternate = "5570")
    LK_WARENDORF(5570, "LK Warendorf"),
    @SerializedName(value = "SK Bielefeld", alternate = "5711")
    SK_BIELEFELD(5711, "SK Bielefeld"),
    @SerializedName(value = "LK Guetersloh", alternate = "5754")
    LK_GUETERSLOH(5754, "LK Gütersloh"),
    @SerializedName(value = "LK Herford", alternate = "5758")
    LK_HERFORD(5758, "LK Herford"),
    @SerializedName(value = "LK Hoexter", alternate = "5762")
    LK_HOEXTER(5762, "LK Höxter"),
    @SerializedName(value = "LK Lippe", alternate = "5766")
    LK_LIPPE(5766, "LK Lippe"),
    @SerializedName(value = "LK Minden-Luebbecke", alternate = "5770")
    LK_MINDEN_LUEBBECKE(5770, "LK Minden-Lübbecke"),
    @SerializedName(value = "LK Paderborn", alternate = "5774")
    LK_PADERBORN(5774, "LK Paderborn"),
    @SerializedName(value = "SK Bochum", alternate = "5911")
    SK_BOCHUM(5911, "SK Bochum"),
    @SerializedName(value = "SK Dortmund", alternate = "5913")
    SK_DORTMUND(5913, "SK Dortmund"),
    @SerializedName(value = "SK Hagen", alternate = "5914")
    SK_HAGEN(5914, "SK Hagen"),
    @SerializedName(value = "SK Hamm", alternate = "5915")
    SK_HAMM(5915, "SK Hamm"),
    @SerializedName(value = "SK Herne", alternate = "5916")
    SK_HERNE(5916, "SK Herne"),
    @SerializedName(value = "LK Ennepe-Ruhr-Kreis", alternate = "5954")
    LK_ENNEPE_RUHR_KREIS(5954, "LK Ennepe-Ruhr-Kreis"),
    @SerializedName(value = "LK Hochsauerlandkreis", alternate = "5958")
    LK_HOCHSAUERLANDKREIS(5958, "LK Hochsauerlandkreis"),
    @SerializedName(value = "LK Maerkischer Kreis", alternate = "5962")
    LK_MAERKISCHER_KREIS(5962, "LK Märkischer Kreis"),
    @SerializedName(value = "LK Olpe", alternate = "5966")
    LK_OLPE(5966, "LK Olpe"),
    @SerializedName(value = "LK Siegen-Wittgenstein", alternate = "5970")
    LK_SIEGEN_WITTGENSTEIN(5970, "LK Siegen-Wittgenstein"),
    @SerializedName(value = "LK Soest", alternate = "5974")
    LK_SOEST(5974, "LK Soest"),
    @SerializedName(value = "LK Unna", alternate = "5978")
    LK_UNNA(5978, "LK Unna"),
    @SerializedName(value = "SK Darmstadt", alternate = "6411")
    SK_DARMSTADT(6411, "SK Darmstadt"),
    @SerializedName(value = "SK Frankfurt am Main", alternate = "6412")
    SK_FRANKFURT_AM_MAIN(6412, "SK Frankfurt am Main"),
    @SerializedName(value = "SK Offenbach", alternate = "6413")
    SK_OFFENBACH(6413, "SK Offenbach"),
    @SerializedName(value = "SK Wiesbaden", alternate = "6414")
    SK_WIESBADEN(6414, "SK Wiesbaden"),
    @SerializedName(value = "LK Bergstrasse", alternate = "6431")
    LK_BERGSTRASSE(6431, "LK Bergstraße"),
    @SerializedName(value = "LK Darmstadt-Dieburg", alternate = "6432")
    LK_DARMSTADT_DIEBURG(6432, "LK Darmstadt-Dieburg"),
    @SerializedName(value = "LK Gross-Gerau", alternate = "6433")
    LK_GROSS_GERAU(6433, "LK Groß-Gerau"),
    @SerializedName(value = "LK Hochtaunuskreis", alternate = "6434")
    LK_HOCHTAUNUSKREIS(6434, "LK Hochtaunuskreis"),
    @SerializedName(value = "LK Main-Kinzig-Kreis", alternate = "6435")
    LK_MAIN_KINZIG_KREIS(6435, "LK Main-Kinzig-Kreis"),
    @SerializedName(value = "LK Main-Taunus-Kreis", alternate = "6436")
    LK_MAIN_TAUNUS_KREIS(6436, "LK Main-Taunus-Kreis"),
    @SerializedName(value = "LK Odenwaldkreis", alternate = "6437")
    LK_ODENWALDKREIS(6437, "LK Odenwaldkreis"),
    @SerializedName(value = "LK Offenbach", alternate = "6438")
    LK_OFFENBACH(6438, "LK Offenbach"),
    @SerializedName(value = "LK Rheingau-Taunus-Kreis", alternate = "6439")
    LK_RHEINGAU_TAUNUS_KREIS(6439, "LK Rheingau-Taunus-Kreis"),
    @SerializedName(value = "LK Wetteraukreis", alternate = "6440")
    LK_WETTERAUKREIS(6440, "LK Wetteraukreis"),
    @SerializedName(value = "LK Giessen", alternate = "6531")
    LK_GIESSEN(6531, "LK Gießen"),
    @SerializedName(value = "LK Lahn-Dill-Kreis", alternate = "6532")
    LK_LAHN_DILL_KREIS(6532, "LK Lahn-Dill-Kreis"),
    @SerializedName(value = "LK Limburg-Weilburg", alternate = "6533")
    LK_LIMBURG_WEILBURG(6533, "LK Limburg-Weilburg"),
    @SerializedName(value = "LK Marburg-Biedenkopf", alternate = "6534")
    LK_MARBURG_BIEDENKOPF(6534, "LK Marburg-Biedenkopf"),
    @SerializedName(value = "LK Vogelsbergkreis", alternate = "6535")
    LK_VOGELSBERGKREIS(6535, "LK Vogelsbergkreis"),
    @SerializedName(value = "SK Kassel", alternate = "6611")
    SK_KASSEL(6611, "SK Kassel"),
    @SerializedName(value = "LK Fulda", alternate = "6631")
    LK_FULDA(6631, "LK Fulda"),
    @SerializedName(value = "LK Hersfeld-Rotenburg", alternate = "6632")
    LK_HERSFELD_ROTENBURG(6632, "LK Hersfeld-Rotenburg"),
    @SerializedName(value = "LK Kassel", alternate = "6633")
    LK_KASSEL(6633, "LK Kassel"),
    @SerializedName(value = "LK Schwalm-Eder-Kreis", alternate = "6634")
    LK_SCHWALM_EDER_KREIS(6634, "LK Schwalm-Eder-Kreis"),
    @SerializedName(value = "LK Waldeck-Frankenberg", alternate = "6635")
    LK_WALDECK_FRANKENBERG(6635, "LK Waldeck-Frankenberg"),
    @SerializedName(value = "LK Werra-Meissner-Kreis", alternate = "6636")
    LK_WERRA_MEISSNER_KREIS(6636, "LK Werra-Meißner-Kreis"),
    @SerializedName(value = "SK Koblenz", alternate = "7111")
    SK_KOBLENZ(7111, "SK Koblenz"),
    @SerializedName(value = "LK Ahrweiler", alternate = "7131")
    LK_AHRWEILER(7131, "LK Ahrweiler"),
    @SerializedName(value = "LK Altenkirchen", alternate = "7132")
    LK_ALTENKIRCHEN(7132, "LK Altenkirchen"),
    @SerializedName(value = "LK Bad Kreuznach", alternate = "7133")
    LK_BAD_KREUZNACH(7133, "LK Bad Kreuznach"),
    @SerializedName(value = "LK Birkenfeld", alternate = "7134")
    LK_BIRKENFELD(7134, "LK Birkenfeld"),
    @SerializedName(value = "LK Cochem-Zell", alternate = "7135")
    LK_COCHEM_ZELL(7135, "LK Cochem-Zell"),
    @SerializedName(value = "LK Mayen-Koblenz", alternate = "7137")
    LK_MAYEN_KOBLENZ(7137, "LK Mayen-Koblenz"),
    @SerializedName(value = "LK Neuwied", alternate = "7138")
    LK_NEUWIED(7138, "LK Neuwied"),
    @SerializedName(value = "LK Rhein-Hunsrueck-Kreis", alternate = "7140")
    LK_RHEIN_HUNSRUECK_KREIS(7140, "LK Rhein-Hunsrück-Kreis"),
    @SerializedName(value = "LK Rhein-Lahn-Kreis", alternate = "7141")
    LK_RHEIN_LAHN_KREIS(7141, "LK Rhein-Lahn-Kreis"),
    @SerializedName(value = "LK Westerwaldkreis", alternate = "7143")
    LK_WESTERWALDKREIS(7143, "LK Westerwaldkreis"),
    @SerializedName(value = "SK Trier", alternate = "7211")
    SK_TRIER(7211, "SK Trier"),
    @SerializedName(value = "LK Bernkastel-Wittlich", alternate = "7231")
    LK_BERNKASTEL_WITTLICH(7231, "LK Bernkastel-Wittlich"),
    @SerializedName(value = "LK Bitburg-Pruem", alternate = "7232")
    LK_BITBURG_PRUEM(7232, "LK Bitburg-Prüm"),
    @SerializedName(value = "LK Vulkaneifel", alternate = "7233")
    LK_VULKANEIFEL(7233, "LK Vulkaneifel"),
    @SerializedName(value = "LK Trier-Saarburg", alternate = "7235")
    LK_TRIER_SAARBURG(7235, "LK Trier-Saarburg"),
    @SerializedName(value = "SK Frankenthal", alternate = "7311")
    SK_FRANKENTHAL(7311, "SK Frankenthal"),
    @SerializedName(value = "SK Kaiserslautern", alternate = "7312")
    SK_KAISERSLAUTERN(7312, "SK Kaiserslautern"),
    @SerializedName(value = "SK Landau i.d.Pfalz", alternate = "7313")
    SK_LANDAU_I_D_PFALZ(7313, "SK Landau i.d.Pfalz"),
    @SerializedName(value = "SK Ludwigshafen", alternate = "7314")
    SK_LUDWIGSHAFEN(7314, "SK Ludwigshafen"),
    @SerializedName(value = "SK Mainz", alternate = "7315")
    SK_MAINZ(7315, "SK Mainz"),
    @SerializedName(value = "SK Neustadt a.d.Weinstrasse", alternate = "7316")
    SK_NEUSTADT_A_D_WEINSTRASSE(7316, "SK Neustadt a.d.Weinstraße"),
    @SerializedName(value = "SK Pirmasens", alternate = "7317")
    SK_PIRMASENS(7317, "SK Pirmasens"),
    @SerializedName(value = "SK Speyer", alternate = "7318")
    SK_SPEYER(7318, "SK Speyer"),
    @SerializedName(value = "SK Worms", alternate = "7319")
    SK_WORMS(7319, "SK Worms"),
    @SerializedName(value = "SK Zweibruecken", alternate = "7320")
    SK_ZWEIBRUECKEN(7320, "SK Zweibrücken"),
    @SerializedName(value = "LK Alzey-Worms", alternate = "7331")
    LK_ALZEY_WORMS(7331, "LK Alzey-Worms"),
    @SerializedName(value = "LK Bad Duerkheim", alternate = "7332")
    LK_BAD_DUERKHEIM(7332, "LK Bad Dürkheim"),
    @SerializedName(value = "LK Donnersbergkreis", alternate = "7333")
    LK_DONNERSBERGKREIS(7333, "LK Donnersbergkreis"),
    @SerializedName(value = "LK Germersheim", alternate = "7334")
    LK_GERMERSHEIM(7334, "LK Germersheim"),
    @SerializedName(value = "LK Kaiserslautern", alternate = "7335")
    LK_KAISERSLAUTERN(7335, "LK Kaiserslautern"),
    @SerializedName(value = "LK Kusel", alternate = "7336")
    LK_KUSEL(7336, "LK Kusel"),
    @SerializedName(value = "LK Suedliche Weinstrasse", alternate = "7337")
    LK_SUEDLICHE_WEINSTRASSE(7337, "LK Südliche Weinstraße"),
    @SerializedName(value = "LK Rhein-Pfalz-Kreis", alternate = "7338")
    LK_RHEIN_PFALZ_KREIS(7338, "LK Rhein-Pfalz-Kreis"),
    @SerializedName(value = "LK Mainz-Bingen", alternate = "7339")
    LK_MAINZ_BINGEN(7339, "LK Mainz-Bingen"),
    @SerializedName(value = "LK Suedwestpfalz", alternate = "7340")
    LK_SUEDWESTPFALZ(7340, "LK Südwestpfalz"),
    @SerializedName(value = "SK Stuttgart", alternate = "8111")
    SK_STUTTGART(8111, "SK Stuttgart"),
    @SerializedName(value = "LK Boeblingen", alternate = "8115")
    LK_BOEBLINGEN(8115, "LK Böblingen"),
    @SerializedName(value = "LK Esslingen", alternate = "8116")
    LK_ESSLINGEN(8116, "LK Esslingen"),
    @SerializedName(value = "LK Goeppingen", alternate = "8117")
    LK_GOEPPINGEN(8117, "LK Göppingen"),
    @SerializedName(value = "LK Ludwigsburg", alternate = "8118")
    LK_LUDWIGSBURG(8118, "LK Ludwigsburg"),
    @SerializedName(value = "LK Rems-Murr-Kreis", alternate = "8119")
    LK_REMS_MURR_KREIS(8119, "LK Rems-Murr-Kreis"),
    @SerializedName(value = "SK Heilbronn", alternate = "8121")
    SK_HEILBRONN(8121, "SK Heilbronn"),
    @SerializedName(value = "LK Heilbronn", alternate = "8125")
    LK_HEILBRONN(8125, "LK Heilbronn"),
    @SerializedName(value = "LK Hohenlohekreis", alternate = "8126")
    LK_HOHENLOHEKREIS(8126, "LK Hohenlohekreis"),
    @SerializedName(value = "LK Schwaebisch Hall", alternate = "8127")
    LK_SCHWAEBISCH_HALL(8127, "LK Schwäbisch Hall"),
    @SerializedName(value = "LK Main-Tauber-Kreis", alternate = "8128")
    LK_MAIN_TAUBER_KREIS(8128, "LK Main-Tauber-Kreis"),
    @SerializedName(value = "LK Heidenheim", alternate = "8135")
    LK_HEIDENHEIM(8135, "LK Heidenheim"),
    @SerializedName(value = "LK Ostalbkreis", alternate = "8136")
    LK_OSTALBKREIS(8136, "LK Ostalbkreis"),
    @SerializedName(value = "SK Baden-Baden", alternate = "8211")
    SK_BADEN_BADEN(8211, "SK Baden-Baden"),
    @SerializedName(value = "SK Karlsruhe", alternate = "8212")
    SK_KARLSRUHE(8212, "SK Karlsruhe"),
    @SerializedName(value = "LK Karlsruhe", alternate = "8215")
    LK_KARLSRUHE(8215, "LK Karlsruhe"),
    @SerializedName(value = "LK Rastatt", alternate = "8216")
    LK_RASTATT(8216, "LK Rastatt"),
    @SerializedName(value = "SK Heidelberg", alternate = "8221")
    SK_HEIDELBERG(8221, "SK Heidelberg"),
    @SerializedName(value = "SK Mannheim", alternate = "8222")
    SK_MANNHEIM(8222, "SK Mannheim"),
    @SerializedName(value = "LK Neckar-Odenwald-Kreis", alternate = "8225")
    LK_NECKAR_ODENWALD_KREIS(8225, "LK Neckar-Odenwald-Kreis"),
    @SerializedName(value = "LK Rhein-Neckar-Kreis", alternate = "8226")
    LK_RHEIN_NECKAR_KREIS(8226, "LK Rhein-Neckar-Kreis"),
    @SerializedName(value = "SK Pforzheim", alternate = "8231")
    SK_PFORZHEIM(8231, "SK Pforzheim"),
    @SerializedName(value = "LK Calw", alternate = "8235")
    LK_CALW(8235, "LK Calw"),
    @SerializedName(value = "LK Enzkreis", alternate = "8236")
    LK_ENZKREIS(8236, "LK Enzkreis"),
    @SerializedName(value = "LK Freudenstadt", alternate = "8237")
    LK_FREUDENSTADT(8237, "LK Freudenstadt"),
    @SerializedName(value = "SK Freiburg i.Breisgau", alternate = "8311")
    SK_FREIBURG_I_BREISGAU(8311, "SK Freiburg i.Breisgau"),
    @SerializedName(value = "LK Breisgau-Hochschwarzwald", alternate = "8315")
    LK_BREISGAU_HOCHSCHWARZWALD(8315, "LK Breisgau-Hochschwarzwald"),
    @SerializedName(value = "LK Emmendingen", alternate = "8316")
    LK_EMMENDINGEN(8316, "LK Emmendingen"),
    @SerializedName(value = "LK Ortenaukreis", alternate = "8317")
    LK_ORTENAUKREIS(8317, "LK Ortenaukreis"),
    @SerializedName(value = "LK Rottweil", alternate = "8325")
    LK_ROTTWEIL(8325, "LK Rottweil"),
    @SerializedName(value = "LK Schwarzwald-Baar-Kreis", alternate = "8326")
    LK_SCHWARZWALD_BAAR_KREIS(8326, "LK Schwarzwald-Baar-Kreis"),
    @SerializedName(value = "LK Tuttlingen", alternate = "8327")
    LK_TUTTLINGEN(8327, "LK Tuttlingen"),
    @SerializedName(value = "LK Konstanz", alternate = "8335")
    LK_KONSTANZ(8335, "LK Konstanz"),
    @SerializedName(value = "LK Loerrach", alternate = "8336")
    LK_LOERRACH(8336, "LK Lörrach"),
    @SerializedName(value = "LK Waldshut", alternate = "8337")
    LK_WALDSHUT(8337, "LK Waldshut"),
    @SerializedName(value = "LK Reutlingen", alternate = "8415")
    LK_REUTLINGEN(8415, "LK Reutlingen"),
    @SerializedName(value = "LK Tuebingen", alternate = "8416")
    LK_TUEBINGEN(8416, "LK Tübingen"),
    @SerializedName(value = "LK Zollernalbkreis", alternate = "8417")
    LK_ZOLLERNALBKREIS(8417, "LK Zollernalbkreis"),
    @SerializedName(value = "SK Ulm", alternate = "8421")
    SK_ULM(8421, "SK Ulm"),
    @SerializedName(value = "LK Alb-Donau-Kreis", alternate = "8425")
    LK_ALB_DONAU_KREIS(8425, "LK Alb-Donau-Kreis"),
    @SerializedName(value = "LK Biberach", alternate = "8426")
    LK_BIBERACH(8426, "LK Biberach"),
    @SerializedName(value = "LK Bodenseekreis", alternate = "8435")
    LK_BODENSEEKREIS(8435, "LK Bodenseekreis"),
    @SerializedName(value = "LK Ravensburg", alternate = "8436")
    LK_RAVENSBURG(8436, "LK Ravensburg"),
    @SerializedName(value = "LK Sigmaringen", alternate = "8437")
    LK_SIGMARINGEN(8437, "LK Sigmaringen"),
    @SerializedName(value = "SK Ingolstadt", alternate = "9161")
    SK_INGOLSTADT(9161, "SK Ingolstadt"),
    @SerializedName(value = "SK Muenchen", alternate = "9162")
    SK_MUENCHEN(9162, "SK München"),
    @SerializedName(value = "SK Rosenheim", alternate = "9163")
    SK_ROSENHEIM(9163, "SK Rosenheim"),
    @SerializedName(value = "LK Altoetting", alternate = "9171")
    LK_ALTOETTING(9171, "LK Altötting"),
    @SerializedName(value = "LK Berchtesgadener Land", alternate = "9172")
    LK_BERCHTESGADENER_LAND(9172, "LK Berchtesgadener Land"),
    @SerializedName(value = "LK Bad Toelz-Wolfratshausen", alternate = "9173")
    LK_BAD_TOELZ_WOLFRATSHAUSEN(9173, "LK Bad Tölz-Wolfratshausen"),
    @SerializedName(value = "LK Dachau", alternate = "9174")
    LK_DACHAU(9174, "LK Dachau"),
    @SerializedName(value = "LK Ebersberg", alternate = "9175")
    LK_EBERSBERG(9175, "LK Ebersberg"),
    @SerializedName(value = "LK Eichstaett", alternate = "9176")
    LK_EICHSTAETT(9176, "LK Eichstätt"),
    @SerializedName(value = "LK Erding", alternate = "9177")
    LK_ERDING(9177, "LK Erding"),
    @SerializedName(value = "LK Freising", alternate = "9178")
    LK_FREISING(9178, "LK Freising"),
    @SerializedName(value = "LK Fuerstenfeldbruck", alternate = "9179")
    LK_FUERSTENFELDBRUCK(9179, "LK Fürstenfeldbruck"),
    @SerializedName(value = "LK Garmisch-Partenkirchen", alternate = "9180")
    LK_GARMISCH_PARTENKIRCHEN(9180, "LK Garmisch-Partenkirchen"),
    @SerializedName(value = "LK Landsberg a.Lech", alternate = "9181")
    LK_LANDSBERG_A_LECH(9181, "LK Landsberg a.Lech"),
    @SerializedName(value = "LK Miesbach", alternate = "9182")
    LK_MIESBACH(9182, "LK Miesbach"),
    @SerializedName(value = "LK Muehldorf a.Inn", alternate = "9183")
    LK_MUEHLDORF_A_INN(9183, "LK Mühldorf a.Inn"),
    @SerializedName(value = "LK Muenchen", alternate = "9184")
    LK_MUENCHEN(9184, "LK München"),
    @SerializedName(value = "LK Neuburg-Schrobenhausen", alternate = "9185")
    LK_NEUBURG_SCHROBENHAUSEN(9185, "LK Neuburg-Schrobenhausen"),
    @SerializedName(value = "LK Pfaffenhofen a.d.Ilm", alternate = "9186")
    LK_PFAFFENHOFEN_A_D_ILM(9186, "LK Pfaffenhofen a.d.Ilm"),
    @SerializedName(value = "LK Rosenheim", alternate = "9187")
    LK_ROSENHEIM(9187, "LK Rosenheim"),
    @SerializedName(value = "LK Starnberg", alternate = "9188")
    LK_STARNBERG(9188, "LK Starnberg"),
    @SerializedName(value = "LK Traunstein", alternate = "9189")
    LK_TRAUNSTEIN(9189, "LK Traunstein"),
    @SerializedName(value = "LK Weilheim-Schongau", alternate = "9190")
    LK_WEILHEIM_SCHONGAU(9190, "LK Weilheim-Schongau"),
    @SerializedName(value = "SK Landshut", alternate = "9261")
    SK_LANDSHUT(9261, "SK Landshut"),
    @SerializedName(value = "SK Passau", alternate = "9262")
    SK_PASSAU(9262, "SK Passau"),
    @SerializedName(value = "SK Straubing", alternate = "9263")
    SK_STRAUBING(9263, "SK Straubing"),
    @SerializedName(value = "LK Deggendorf", alternate = "9271")
    LK_DEGGENDORF(9271, "LK Deggendorf"),
    @SerializedName(value = "LK Freyung-Grafenau", alternate = "9272")
    LK_FREYUNG_GRAFENAU(9272, "LK Freyung-Grafenau"),
    @SerializedName(value = "LK Kelheim", alternate = "9273")
    LK_KELHEIM(9273, "LK Kelheim"),
    @SerializedName(value = "LK Landshut", alternate = "9274")
    LK_LANDSHUT(9274, "LK Landshut"),
    @SerializedName(value = "LK Passau", alternate = "9275")
    LK_PASSAU(9275, "LK Passau"),
    @SerializedName(value = "LK Regen", alternate = "9276")
    LK_REGEN(9276, "LK Regen"),
    @SerializedName(value = "LK Rottal-Inn", alternate = "9277")
    LK_ROTTAL_INN(9277, "LK Rottal-Inn"),
    @SerializedName(value = "LK Straubing-Bogen", alternate = "9278")
    LK_STRAUBING_BOGEN(9278, "LK Straubing-Bogen"),
    @SerializedName(value = "LK Dingolfing-Landau", alternate = "9279")
    LK_DINGOLFING_LANDAU(9279, "LK Dingolfing-Landau"),
    @SerializedName(value = "SK Amberg", alternate = "9361")
    SK_AMBERG(9361, "SK Amberg"),
    @SerializedName(value = "SK Regensburg", alternate = "9362")
    SK_REGENSBURG(9362, "SK Regensburg"),
    @SerializedName(value = "SK Weiden i.d.OPf.", alternate = "9363")
    SK_WEIDEN_I_D_OPF_(9363, "SK Weiden i.d.OPf."),
    @SerializedName(value = "LK Amberg-Sulzbach", alternate = "9371")
    LK_AMBERG_SULZBACH(9371, "LK Amberg-Sulzbach"),
    @SerializedName(value = "LK Cham", alternate = "9372")
    LK_CHAM(9372, "LK Cham"),
    @SerializedName(value = "LK Neumarkt i.d.OPf.", alternate = "9373")
    LK_NEUMARKT_I_D_OPF_(9373, "LK Neumarkt i.d.OPf."),
    @SerializedName(value = "LK Neustadt a.d.Waldnaab", alternate = "9374")
    LK_NEUSTADT_A_D_WALDNAAB(9374, "LK Neustadt a.d.Waldnaab"),
    @SerializedName(value = "LK Regensburg", alternate = "9375")
    LK_REGENSBURG(9375, "LK Regensburg"),
    @SerializedName(value = "LK Schwandorf", alternate = "9376")
    LK_SCHWANDORF(9376, "LK Schwandorf"),
    @SerializedName(value = "LK Tirschenreuth", alternate = "9377")
    LK_TIRSCHENREUTH(9377, "LK Tirschenreuth"),
    @SerializedName(value = "SK Bamberg", alternate = "9461")
    SK_BAMBERG(9461, "SK Bamberg"),
    @SerializedName(value = "SK Bayreuth", alternate = "9462")
    SK_BAYREUTH(9462, "SK Bayreuth"),
    @SerializedName(value = "SK Coburg", alternate = "9463")
    SK_COBURG(9463, "SK Coburg"),
    @SerializedName(value = "SK Hof", alternate = "9464")
    SK_HOF(9464, "SK Hof"),
    @SerializedName(value = "LK Bamberg", alternate = "9471")
    LK_BAMBERG(9471, "LK Bamberg"),
    @SerializedName(value = "LK Bayreuth", alternate = "9472")
    LK_BAYREUTH(9472, "LK Bayreuth"),
    @SerializedName(value = "LK Coburg", alternate = "9473")
    LK_COBURG(9473, "LK Coburg"),
    @SerializedName(value = "LK Forchheim", alternate = "9474")
    LK_FORCHHEIM(9474, "LK Forchheim"),
    @SerializedName(value = "LK Hof", alternate = "9475")
    LK_HOF(9475, "LK Hof"),
    @SerializedName(value = "LK Kronach", alternate = "9476")
    LK_KRONACH(9476, "LK Kronach"),
    @SerializedName(value = "LK Kulmbach", alternate = "9477")
    LK_KULMBACH(9477, "LK Kulmbach"),
    @SerializedName(value = "LK Lichtenfels", alternate = "9478")
    LK_LICHTENFELS(9478, "LK Lichtenfels"),
    @SerializedName(value = "LK Wunsiedel i.Fichtelgebirge", alternate = "9479")
    LK_WUNSIEDEL_I_FICHTELGEBIRGE(9479, "LK Wunsiedel i.Fichtelgebirge"),
    @SerializedName(value = "SK Ansbach", alternate = "9561")
    SK_ANSBACH(9561, "SK Ansbach"),
    @SerializedName(value = "SK Erlangen", alternate = "9562")
    SK_ERLANGEN(9562, "SK Erlangen"),
    @SerializedName(value = "SK Fuerth", alternate = "9563")
    SK_FUERTH(9563, "SK Fürth"),
    @SerializedName(value = "SK Nuernberg", alternate = "9564")
    SK_NUERNBERG(9564, "SK Nürnberg"),
    @SerializedName(value = "SK Schwabach", alternate = "9565")
    SK_SCHWABACH(9565, "SK Schwabach"),
    @SerializedName(value = "LK Ansbach", alternate = "9571")
    LK_ANSBACH(9571, "LK Ansbach"),
    @SerializedName(value = "LK Erlangen-Hoechstadt", alternate = "9572")
    LK_ERLANGEN_HOECHSTADT(9572, "LK Erlangen-Höchstadt"),
    @SerializedName(value = "LK Fuerth", alternate = "9573")
    LK_FUERTH(9573, "LK Fürth"),
    @SerializedName(value = "LK Nuernberger Land", alternate = "9574")
    LK_NUERNBERGER_LAND(9574, "LK Nürnberger Land"),
    @SerializedName(value = "LK Neustadt a.d.Aisch-Bad Windsheim", alternate = "9575")
    LK_NEUSTADT_A_D_AISCH_BAD_WINDSHEIM(9575, "LK Neustadt a.d.Aisch-Bad Windsheim"),
    @SerializedName(value = "LK Roth", alternate = "9576")
    LK_ROTH(9576, "LK Roth"),
    @SerializedName(value = "LK Weissenburg-Gunzenhausen", alternate = "9577")
    LK_WEISSENBURG_GUNZENHAUSEN(9577, "LK Weißenburg-Gunzenhausen"),
    @SerializedName(value = "SK Aschaffenburg", alternate = "9661")
    SK_ASCHAFFENBURG(9661, "SK Aschaffenburg"),
    @SerializedName(value = "SK Schweinfurt", alternate = "9662")
    SK_SCHWEINFURT(9662, "SK Schweinfurt"),
    @SerializedName(value = "SK Wuerzburg", alternate = "9663")
    SK_WUERZBURG(9663, "SK Würzburg"),
    @SerializedName(value = "LK Aschaffenburg", alternate = "9671")
    LK_ASCHAFFENBURG(9671, "LK Aschaffenburg"),
    @SerializedName(value = "LK Bad Kissingen", alternate = "9672")
    LK_BAD_KISSINGEN(9672, "LK Bad Kissingen"),
    @SerializedName(value = "LK Rhoen-Grabfeld", alternate = "9673")
    LK_RHOEN_GRABFELD(9673, "LK Rhön-Grabfeld"),
    @SerializedName(value = "LK Hassberge", alternate = "9674")
    LK_HASSBERGE(9674, "LK Haßberge"),
    @SerializedName(value = "LK Kitzingen", alternate = "9675")
    LK_KITZINGEN(9675, "LK Kitzingen"),
    @SerializedName(value = "LK Miltenberg", alternate = "9676")
    LK_MILTENBERG(9676, "LK Miltenberg"),
    @SerializedName(value = "LK Main-Spessart", alternate = "9677")
    LK_MAIN_SPESSART(9677, "LK Main-Spessart"),
    @SerializedName(value = "LK Schweinfurt", alternate = "9678")
    LK_SCHWEINFURT(9678, "LK Schweinfurt"),
    @SerializedName(value = "LK Wuerzburg", alternate = "9679")
    LK_WUERZBURG(9679, "LK Würzburg"),
    @SerializedName(value = "SK Augsburg", alternate = "9761")
    SK_AUGSBURG(9761, "SK Augsburg"),
    @SerializedName(value = "SK Kaufbeuren", alternate = "9762")
    SK_KAUFBEUREN(9762, "SK Kaufbeuren"),
    @SerializedName(value = "SK Kempten", alternate = "9763")
    SK_KEMPTEN(9763, "SK Kempten"),
    @SerializedName(value = "SK Memmingen", alternate = "9764")
    SK_MEMMINGEN(9764, "SK Memmingen"),
    @SerializedName(value = "LK Aichach-Friedberg", alternate = "9771")
    LK_AICHACH_FRIEDBERG(9771, "LK Aichach-Friedberg"),
    @SerializedName(value = "LK Augsburg", alternate = "9772")
    LK_AUGSBURG(9772, "LK Augsburg"),
    @SerializedName(value = "LK Dillingen a.d.Donau", alternate = "9773")
    LK_DILLINGEN_A_D_DONAU(9773, "LK Dillingen a.d.Donau"),
    @SerializedName(value = "LK Guenzburg", alternate = "9774")
    LK_GUENZBURG(9774, "LK Günzburg"),
    @SerializedName(value = "LK Neu-Ulm", alternate = "9775")
    LK_NEU_ULM(9775, "LK Neu-Ulm"),
    @SerializedName(value = "LK Lindau", alternate = "9776")
    LK_LINDAU(9776, "LK Lindau"),
    @SerializedName(value = "LK Ostallgaeu", alternate = "9777")
    LK_OSTALLGAEU(9777, "LK Ostallgäu"),
    @SerializedName(value = "LK Unterallgaeu", alternate = "9778")
    LK_UNTERALLGAEU(9778, "LK Unterallgäu"),
    @SerializedName(value = "LK Donau-Ries", alternate = "9779")
    LK_DONAU_RIES(9779, "LK Donau-Ries"),
    @SerializedName(value = "LK Oberallgaeu", alternate = "9780")
    LK_OBERALLGAEU(9780, "LK Oberallgäu"),
    @SerializedName(value = "LK Stadtverband Saarbruecken", alternate = "10041")
    LK_STADTVERBAND_SAARBRUECKEN(10041, "LK Stadtverband Saarbrücken"),
    @SerializedName(value = "LK Merzig-Wadern", alternate = "10042")
    LK_MERZIG_WADERN(10042, "LK Merzig-Wadern"),
    @SerializedName(value = "LK Neunkirchen", alternate = "10043")
    LK_NEUNKIRCHEN(10043, "LK Neunkirchen"),
    @SerializedName(value = "LK Saarlouis", alternate = "10044")
    LK_SAARLOUIS(10044, "LK Saarlouis"),
    @SerializedName(value = "LK Saar-Pfalz-Kreis", alternate = "10045")
    LK_SAAR_PFALZ_KREIS(10045, "LK Saar-Pfalz-Kreis"),
    @SerializedName(value = "LK Sankt Wendel", alternate = "10046")
    LK_SANKT_WENDEL(10046, "LK Sankt Wendel"),
    @SerializedName(value = "SK Brandenburg a.d.Havel", alternate = "12051")
    SK_BRANDENBURG_A_D_HAVEL(12051, "SK Brandenburg a.d.Havel"),
    @SerializedName(value = "SK Cottbus", alternate = "12052")
    SK_COTTBUS(12052, "SK Cottbus"),
    @SerializedName(value = "SK Frankfurt (Oder)", alternate = "12053")
    SK_FRANKFURT_ODER(12053, "SK Frankfurt (Oder)"),
    @SerializedName(value = "SK Potsdam", alternate = "12054")
    SK_POTSDAM(12054, "SK Potsdam"),
    @SerializedName(value = "LK Barnim", alternate = "12060")
    LK_BARNIM(12060, "LK Barnim"),
    @SerializedName(value = "LK Dahme-Spreewald", alternate = "12061")
    LK_DAHME_SPREEWALD(12061, "LK Dahme-Spreewald"),
    @SerializedName(value = "LK Elbe-Elster", alternate = "12062")
    LK_ELBE_ELSTER(12062, "LK Elbe-Elster"),
    @SerializedName(value = "LK Havelland", alternate = "12063")
    LK_HAVELLAND(12063, "LK Havelland"),
    @SerializedName(value = "LK Maerkisch-Oderland", alternate = "12064")
    LK_MAERKISCH_ODERLAND(12064, "LK Märkisch-Oderland"),
    @SerializedName(value = "LK Oberhavel", alternate = "12065")
    LK_OBERHAVEL(12065, "LK Oberhavel"),
    @SerializedName(value = "LK Oberspreewald-Lausitz", alternate = "12066")
    LK_OBERSPREEWALD_LAUSITZ(12066, "LK Oberspreewald-Lausitz"),
    @SerializedName(value = "LK Oder-Spree", alternate = "12067")
    LK_ODER_SPREE(12067, "LK Oder-Spree"),
    @SerializedName(value = "LK Ostprignitz-Ruppin", alternate = "12068")
    LK_OSTPRIGNITZ_RUPPIN(12068, "LK Ostprignitz-Ruppin"),
    @SerializedName(value = "LK Potsdam-Mittelmark", alternate = "12069")
    LK_POTSDAM_MITTELMARK(12069, "LK Potsdam-Mittelmark"),
    @SerializedName(value = "LK Prignitz", alternate = "12070")
    LK_PRIGNITZ(12070, "LK Prignitz"),
    @SerializedName(value = "LK Spree-Neisse", alternate = "12071")
    LK_SPREE_NEISSE(12071, "LK Spree-Neiße"),
    @SerializedName(value = "LK Teltow-Flaeming", alternate = "12072")
    LK_TELTOW_FLAEMING(12072, "LK Teltow-Fläming"),
    @SerializedName(value = "LK Uckermark", alternate = "12073")
    LK_UCKERMARK(12073, "LK Uckermark"),
    @SerializedName(value = "SK Rostock", alternate = "13003")
    SK_ROSTOCK(13003, "SK Rostock"),
    @SerializedName(value = "SK Schwerin", alternate = "13004")
    SK_SCHWERIN(13004, "SK Schwerin"),
    @SerializedName(value = "LK Mecklenburgische Seenplatte", alternate = "13071")
    LK_MECKLENBURGISCHE_SEENPLATTE(13071, "LK Mecklenburgische Seenplatte"),
    @SerializedName(value = "LK Rostock", alternate = "13072")
    LK_ROSTOCK(13072, "LK Rostock"),
    @SerializedName(value = "LK Vorpommern-Ruegen", alternate = "13073")
    LK_VORPOMMERN_RUEGEN(13073, "LK Vorpommern-Rügen"),
    @SerializedName(value = "LK Nordwestmecklenburg", alternate = "13074")
    LK_NORDWESTMECKLENBURG(13074, "LK Nordwestmecklenburg"),
    @SerializedName(value = "LK Vorpommern-Greifswald", alternate = "13075")
    LK_VORPOMMERN_GREIFSWALD(13075, "LK Vorpommern-Greifswald"),
    @SerializedName(value = "LK Ludwigslust-Parchim", alternate = "13076")
    LK_LUDWIGSLUST_PARCHIM(13076, "LK Ludwigslust-Parchim"),
    @SerializedName(value = "SK Chemnitz", alternate = "14511")
    SK_CHEMNITZ(14511, "SK Chemnitz"),
    @SerializedName(value = "LK Erzgebirgskreis", alternate = "14521")
    LK_ERZGEBIRGSKREIS(14521, "LK Erzgebirgskreis"),
    @SerializedName(value = "LK Mittelsachsen", alternate = "14522")
    LK_MITTELSACHSEN(14522, "LK Mittelsachsen"),
    @SerializedName(value = "LK Vogtlandkreis", alternate = "14523")
    LK_VOGTLANDKREIS(14523, "LK Vogtlandkreis"),
    @SerializedName(value = "LK Zwickau", alternate = "14524")
    LK_ZWICKAU(14524, "LK Zwickau"),
    @SerializedName(value = "SK Dresden", alternate = "14612")
    SK_DRESDEN(14612, "SK Dresden"),
    @SerializedName(value = "LK Bautzen", alternate = "14625")
    LK_BAUTZEN(14625, "LK Bautzen"),
    @SerializedName(value = "LK Goerlitz", alternate = "14626")
    LK_GOERLITZ(14626, "LK Görlitz"),
    @SerializedName(value = "LK Meissen", alternate = "14627")
    LK_MEISSEN(14627, "LK Meißen"),
    @SerializedName(value = "LK Saechsische Schweiz-Osterzgebirge", alternate = "14628")
    LK_SAECHSISCHE_SCHWEIZ_OSTERZGEBIRGE(14628, "LK Sächsische Schweiz-Osterzgebirge"),
    @SerializedName(value = "SK Leipzig", alternate = "14713")
    SK_LEIPZIG(14713, "SK Leipzig"),
    @SerializedName(value = "LK Leipzig", alternate = "14729")
    LK_LEIPZIG(14729, "LK Leipzig"),
    @SerializedName(value = "LK Nordsachsen", alternate = "14730")
    LK_NORDSACHSEN(14730, "LK Nordsachsen"),
    @SerializedName(value = "SK Dessau-Rosslau", alternate = "15001")
    SK_DESSAU_ROSSLAU(15001, "SK Dessau-Roßlau"),
    @SerializedName(value = "SK Halle", alternate = "15002")
    SK_HALLE(15002, "SK Halle"),
    @SerializedName(value = "SK Magdeburg", alternate = "15003")
    SK_MAGDEBURG(15003, "SK Magdeburg"),
    @SerializedName(value = "LK Altmarkkreis Salzwedel", alternate = "15081")
    LK_ALTMARKKREIS_SALZWEDEL(15081, "LK Altmarkkreis Salzwedel"),
    @SerializedName(value = "LK Anhalt-Bitterfeld", alternate = "15082")
    LK_ANHALT_BITTERFELD(15082, "LK Anhalt-Bitterfeld"),
    @SerializedName(value = "LK Boerde", alternate = "15083")
    LK_BOERDE(15083, "LK Börde"),
    @SerializedName(value = "LK Burgenlandkreis", alternate = "15084")
    LK_BURGENLANDKREIS(15084, "LK Burgenlandkreis"),
    @SerializedName(value = "LK Harz", alternate = "15085")
    LK_HARZ(15085, "LK Harz"),
    @SerializedName(value = "LK Jerichower Land", alternate = "15086")
    LK_JERICHOWER_LAND(15086, "LK Jerichower Land"),
    @SerializedName(value = "LK Mansfeld-Suedharz", alternate = "15087")
    LK_MANSFELD_SUEDHARZ(15087, "LK Mansfeld-Südharz"),
    @SerializedName(value = "LK Saalekreis", alternate = "15088")
    LK_SAALEKREIS(15088, "LK Saalekreis"),
    @SerializedName(value = "LK Salzlandkreis", alternate = "15089")
    LK_SALZLANDKREIS(15089, "LK Salzlandkreis"),
    @SerializedName(value = "LK Stendal", alternate = "15090")
    LK_STENDAL(15090, "LK Stendal"),
    @SerializedName(value = "LK Wittenberg", alternate = "15091")
    LK_WITTENBERG(15091, "LK Wittenberg"),
    @SerializedName(value = "SK Erfurt", alternate = "16051")
    SK_ERFURT(16051, "SK Erfurt"),
    @SerializedName(value = "SK Gera", alternate = "16052")
    SK_GERA(16052, "SK Gera"),
    @SerializedName(value = "SK Jena", alternate = "16053")
    SK_JENA(16053, "SK Jena"),
    @SerializedName(value = "SK Suhl", alternate = "16054")
    SK_SUHL(16054, "SK Suhl"),
    @SerializedName(value = "SK Weimar", alternate = "16055")
    SK_WEIMAR(16055, "SK Weimar"),
    @SerializedName(value = "SK Eisenach", alternate = "16056")
    SK_EISENACH(16056, "SK Eisenach"),
    @SerializedName(value = "LK Eichsfeld", alternate = "16061")
    LK_EICHSFELD(16061, "LK Eichsfeld"),
    @SerializedName(value = "LK Nordhausen", alternate = "16062")
    LK_NORDHAUSEN(16062, "LK Nordhausen"),
    @SerializedName(value = "LK Wartburgkreis", alternate = "16063")
    LK_WARTBURGKREIS(16063, "LK Wartburgkreis"),
    @SerializedName(value = "LK Unstrut-Hainich-Kreis", alternate = "16064")
    LK_UNSTRUT_HAINICH_KREIS(16064, "LK Unstrut-Hainich-Kreis"),
    @SerializedName(value = "LK Kyffhaeuserkreis", alternate = "16065")
    LK_KYFFHAEUSERKREIS(16065, "LK Kyffhäuserkreis"),
    @SerializedName(value = "LK Schmalkalden-Meiningen", alternate = "16066")
    LK_SCHMALKALDEN_MEININGEN(16066, "LK Schmalkalden-Meiningen"),
    @SerializedName(value = "LK Gotha", alternate = "16067")
    LK_GOTHA(16067, "LK Gotha"),
    @SerializedName(value = "LK Soemmerda", alternate = "16068")
    LK_SOEMMERDA(16068, "LK Sömmerda"),
    @SerializedName(value = "LK Hildburghausen", alternate = "16069")
    LK_HILDBURGHAUSEN(16069, "LK Hildburghausen"),
    @SerializedName(value = "LK Ilm-Kreis", alternate = "16070")
    LK_ILM_KREIS(16070, "LK Ilm-Kreis"),
    @SerializedName(value = "LK Weimarer Land", alternate = "16071")
    LK_WEIMARER_LAND(16071, "LK Weimarer Land"),
    @SerializedName(value = "LK Sonneberg", alternate = "16072")
    LK_SONNEBERG(16072, "LK Sonneberg"),
    @SerializedName(value = "LK Saalfeld-Rudolstadt", alternate = "16073")
    LK_SAALFELD_RUDOLSTADT(16073, "LK Saalfeld-Rudolstadt"),
    @SerializedName(value = "LK Saale-Holzland-Kreis", alternate = "16074")
    LK_SAALE_HOLZLAND_KREIS(16074, "LK Saale-Holzland-Kreis"),
    @SerializedName(value = "LK Saale-Orla-Kreis", alternate = "16075")
    LK_SAALE_ORLA_KREIS(16075, "LK Saale-Orla-Kreis"),
    @SerializedName(value = "LK Greiz", alternate = "16076")
    LK_GREIZ(16076, "LK Greiz"),
    @SerializedName(value = "LK Altenburger Land", alternate = "16077")
    LK_ALTENBURGER_LAND(16077, "LK Altenburger Land"),
    @SerializedName(value = "SK Berlin Reinickendorf", alternate = "11012")
    SK_BERLIN_REINICKENDORF(11012, "SK Berlin Reinickendorf"),
    @SerializedName(value = "SK Berlin Charlottenburg-Wilmersdorf", alternate = "11004")
    SK_BERLIN_CHARLOTTENBURG_WILMERSDORF(11004, "SK Berlin Charlottenburg-Wilmersdorf"),
    @SerializedName(value = "SK Berlin Treptow-Koepenick", alternate = "11009")
    SK_BERLIN_TREPTOW_KOEPENICK(11009, "SK Berlin Treptow-Köpenick"),
    @SerializedName(value = "SK Berlin Pankow", alternate = "11003")
    SK_BERLIN_PANKOW(11003, "SK Berlin Pankow"),
    @SerializedName(value = "SK Berlin Neukoelln", alternate = "11008")
    SK_BERLIN_NEUKOELLN(11008, "SK Berlin Neukölln"),
    @SerializedName(value = "SK Berlin Lichtenberg", alternate = "11011")
    SK_BERLIN_LICHTENBERG(11011, "SK Berlin Lichtenberg"),
    @SerializedName(value = "SK Berlin Marzahn-Hellersdorf", alternate = "11010")
    SK_BERLIN_MARZAHN_HELLERSDORF(11010, "SK Berlin Marzahn-Hellersdorf"),
    @SerializedName(value = "SK Berlin Spandau", alternate = "11005")
    SK_BERLIN_SPANDAU(11005, "SK Berlin Spandau"),
    @SerializedName(value = "SK Berlin Steglitz-Zehlendorf", alternate = "11006")
    SK_BERLIN_STEGLITZ_ZEHLENDORF(11006, "SK Berlin Steglitz-Zehlendorf"),
    @SerializedName(value = "SK Berlin Mitte", alternate = "11001")
    SK_BERLIN_MITTE(11001, "SK Berlin Mitte"),
    @SerializedName(value = "SK Berlin Friedrichshain-Kreuzberg", alternate = "11002")
    SK_BERLIN_FRIEDRICHSHAIN_KREUZBERG(11002, "SK Berlin Friedrichshain-Kreuzberg"),
    @SerializedName(value = "SK Berlin Tempelhof-Schoeneberg", alternate = "11007")
    SK_BERLIN_TEMPELHOF_SCHOENEBERG(11007, "SK Berlin Tempelhof-Schöneberg");


    private final int id;
    private final String displayName;

    District(int id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }
}
