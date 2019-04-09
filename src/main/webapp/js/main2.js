$('#id_usuario').keyup(
		function(){
			var id_usuario=$('#id_usuario').val();
			alert(id_usuario);
			$('#email').children().remove();  
			$.post('/email/{id_usuario}',{"id_usuario":id_usuario},function(email){
				
				
					$('#email').append('email')
				}
				
			})
			
		function(){
			var id_usuario=$('#id_usuario').val();
			alert(id_usuario);
			$('#password').children().remove();  
			$.post('/password/{id_usuario}',{"id_usuario":id_usuario},function(password){
				
				
					$('#password').append('password')
				}
				
			})
		
		
)