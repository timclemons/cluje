
class TestClass 
	attr_accessor :value

	def initialize( value = 7 )
		@value = value
	end

	def output_only( output = "test" )
		puts "#{output}"
	end
end
