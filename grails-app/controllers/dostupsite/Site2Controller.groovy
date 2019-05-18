package dostupsite

class Site2Controller {

    static scaffold = Site2

    def myList(){

        Site1 site2 = Site2.findByAdres(adres: '1')

        render view: "/site2/list", model: [site2: site2]
    }
}
