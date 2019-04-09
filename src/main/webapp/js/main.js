$('#provincias').change(
		function(){
			var codigoprovincia=$('#provincias').val();
			alert(codigoprovincia);
			$('#localidades').children().remove();                                      
			$.post('/localidades/{codigoprovincia}',{"codigoprovincia":codigoprovincia},function(localidades){
				
				for(var i = 0; i<= localidades.length; i++ ){
					$('#localidades').append('<option id='+localidades[i].codigo+'>'+localidades[i].descripcion+'</option>')
				}
				
			})
		}
		
)