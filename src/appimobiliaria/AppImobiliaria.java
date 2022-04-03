package appimobiliaria;


/*
.------------------.
| made by: < N / > |
'------------------'
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
        System.out.println(casa1.toString());
        casa1.imprimeResidirStatus();
    }

}
