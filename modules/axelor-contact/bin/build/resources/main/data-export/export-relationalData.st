<?xml version="1.0" encoding="utf-8"?>
<address-book>

	<contact>
			
		<firstName>$firstName$</firstName>
		<lastName>$lastName$</lastName>
		<dateOfBirth>$dateOfbirth$</dateOfBirth>
		<mobile>$contactNo$</mobile>
		<email>$emailId$</email>
		
		
		$circalList:{
			it|
			<circle>
				
				<name>$it.circal$</name>
			</circle>	
		}$
	
	</contact>