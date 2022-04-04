package appimobiliaria;


/*
.------------------.
| made by: < N / > |
'------------------'
1. Herança
    Com a herança é possível economizar tempo e reaproveitar código, e utilizando
    ela conseguimos que as classes comparilhem atributos e métodos em hierarquia,
    temos uma classe pai conhecida também por SuperClasse e as classes filhas conhecida
    também por  SubClasse e ela herda os atributos e métodos da SuperClasse.

2. Sobrecarga e Sobrescrita.
2.1 Sobrecarga
    Criação de de variações de um mesmo método, com atributos diferentes.
2.2 Sobrescrita
    Reescrever na subclasse um método definido na superclasse.
*/

public class AppImobiliaria {

    public static void main(String[] args) {
        
        //Casas (Outros, Quintal, Quartos, Banheiros, Garagem, Código, Tipo,
        //Rua, Bairro, M², Número, Preço à vista e Preço à prazo.
        Casa casa1 = new Casa("Sala: 1, Cozinha: 1", 1, 3, 2, 1, 1,"Residencial",
        "R. Santo Antonio", "Zona 07", "120m²", 897, 1000000, 150000);
        
        //Codominio (Nome, Tipo, Rua, Bairro, Número, Valor)
        Condominio condo1 = new Condominio("Plaza", "Residencial", "R. Avenida Brasil",
        "Zona 04", 15484, 800);
        
        //Apartamento (Condominio, Bloco, NumeroAp, Quartos, Banheiros, Garagem,
        //Código, Tipo, Rua, Bairro, M², Número, Preço à vista e Preço à prazo.
        Apartamento ap1 = new Apartamento(condo1, "B5", 301, 2, 1, 1, 1, "Residencial",
        "R. Avenida Brasil", "Zona 04", "32M²", 15484, 2000000, 2500000);
        
        //Terreno (Aterro, Código, Tipo, Rua, Bairro, M², Número, Preço à vista e Preço à prazo.
        Terreno terreno1 = new Terreno("SeiLáOQueÉIssoMasTamoAE", 1, "Não Comercial",
        "R. Carlos Chargas", "Zona 03", "500M²", 151, 100000, 150000);
        
        
        //Souts
        System.out.println("\n= = = = Apartamentos = = = =\n");
        System.out.println(ap1.toString());
        ap1.imprimeResidirStatus();
        System.out.println();
    
        System.out.println("\n= = = = Casas= = = =\n");
        System.out.println(casa1.toString());
        casa1.imprimeResidirStatus();
        System.out.println();
        
        System.out.println("\n= = = = Terreno = = = =\n");
        System.out.println(terreno1.toString());
        terreno1.imprimeConstrucaoStatus();
        System.out.println();
        
    }

}
