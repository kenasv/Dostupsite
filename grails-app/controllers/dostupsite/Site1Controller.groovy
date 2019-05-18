package dostupsite

import grails.rest.*
import grails.converters.*

class Site1Controller {
    static responseFormats = ['json', 'xml']

    def index() {}

    def create() {}

    def list() {
        Site1 site1 = Site1.findByAd("1")
        if (!site1)
            throw new Exception("Bla net")
        render view: "/site1/list", model: [site1: site1]

    }

    def save() {

        def site1 = new Site1(params)
        if (!site1.hasErrors() && site1.save()) {
            flash.message = "Site1 ${site1.id} created"
            redirect(action: show, id: site1.id)
        } else {
            render(view: 'create', model: [site1: site1])
        }
    }

}