modules = {

    json2 {
        resource url:[plugin: 'backbonejs', dir: 'js', file: 'json2.js']
    }

    backbone {
        dependsOn 'underscore', 'json2'
        resource url:[plugin: 'backbonejs', dir: 'js', file: 'backbone.js']
    }

}