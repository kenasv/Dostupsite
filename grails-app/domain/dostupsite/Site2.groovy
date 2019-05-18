package dostupsite

class Site2 {

    Integer nomer
    String diapazon
    String adres
    String infrastructura
    String prinadlegnost
    String dostup
    String kluch
    String aparatnaa
    String ad
    String contact
    String wgs
    String primechanie


    static constraints = {

        nomer unique: true
        diapazon blank: false, nullable: false
        adres blank: false, nullable: false
        infrastructura blank: false, nullable: false
        prinadlegnost blank: false, nullable: false
        dostup blank: false, nullable: false
        kluch blank: false, nullable: false
        aparatnaa blank: false, nullable: false
        ad blank: false, nullable: false
        contact blank: false
        wgs blank: false, nullable: false
        primechanie blank: false, nullable: false
    }
}