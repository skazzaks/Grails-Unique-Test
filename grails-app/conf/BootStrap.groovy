import unique.User

class BootStrap {

    def init = { servletContext ->
		
		User a = new User()
		a.username = "test"
		a.save()
		
		a = new User()
		a.username = "test"
		def b = a.validate()
		def c = a.errors
		a.save()
    }
    def destroy = {
    }
}
