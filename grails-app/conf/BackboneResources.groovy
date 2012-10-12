modules = {

    json2 {
        resource url: '/js/json2.js'
    }

    backbone {
        dependsOn 'underscore', 'json2'
        resource url: '/js/backbone.js'
    }

}