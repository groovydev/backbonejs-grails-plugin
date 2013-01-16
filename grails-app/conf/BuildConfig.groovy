grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
	}

	plugins {
		build(':release:2.2.0', ':rest-client-builder:1.0.2') {
			export = false
		}

		runtime ':resources:1.2-RC1'
		compile ':underscore:1.4.3'
	}
}
