<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:pt="http://xmlns.jcp.org/jsf/passthrough"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:opt="http://primefaces.prime.com.br/optimus"
	xmlns:p="http://primefaces.org/ui">

<h:head>
	<link rel="stylesheet" href="css/bootstrap.css" type="text/css"
		media="all" />
	<link rel="stylesheet" href="css/bootstrap-theme.css" type="text/css"
		media="all" />
	<link rel="stylesheet" href="css/CSS.css" type="text/css" media="all" />
</h:head>

<h:body>
	<fieldset>
		<div class="daocss">
			<div id="templete">
			<ui:insert name="corpo">
				<center>
					<form method="POST" action="cadastrar">
						Digite seu nome: <input type="text" name=nome id="nome" value="" /><br />
						<br /> Digite o login: <input type="text" name=login id="login"
							value="" /><br />
						<br /> Digite a senha: <input type="password" name=Senha
							id="senha" value="" /><br />
						<br /> <input type="submit" name=enviar id="enviar"
							value="Salvar" />

					</form>
				</center>
				</ui:insert>
			</div>
		</div>
	</fieldset>
</h:body>
</html>