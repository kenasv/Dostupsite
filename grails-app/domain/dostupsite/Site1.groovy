package dostupsite

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Site1 {

    Integer nomer
    String diapazn
    String adres
    String infrastructura
    String prinadlegnost
    String dostup
    String kluch
    String aparatnaa
    String ad

    static constraints = {

        nomer unique: true
        diapazn blank: false, nullable: false
        adres blank: false, nullable: false
        infrastructura blank: false, nullable: false
        prinadlegnost blank: false, nullable: false
        dostup blank: false, nullable: false
        kluch blank: false, nullable: false
        aparatnaa blank: false, nullable: false
        ad blank: false, nullable: false
    }
}