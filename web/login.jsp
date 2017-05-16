<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>电子商城-登录页</title>
    
	<link href="css/Layout.css" rel="stylesheet" type="text/css" />
	
  </head>
  
  <body>

<!--主体开始-->
	<div class="main mt10">
		<div class="mleft fl ah">
		<!--登录开始-->
			<div class="login_b fl">
				<p class="title fl">用户登录</p>
				<div class="login_d fl">
					<form name="loginform" action="loginAction" method="post">
						<table width="350" border="0" cellpadding="0" cellspacing="0">
						  <tr>
						    <td width="100" height="40" align="middle" colspan=2>
						   		 <font color="red">${message} </font>  <!--s:property value="message"/-->
						    </td>   
						  </tr>		 		 
						  <tr>
						    <td width="100" height="40" align="right" valign="middle">用户名：</td>
						    <td width="250" align="left" valign="middle">
						    	<input name="user.userName" type="text" class="login_input" />
						    </td>
						  </tr>
						  <tr>
						    <td width="100" height="40" align="right" valign="middle">密码：</td>
						    <td width="250" align="left" valign="middle">
						    	<input name="user.password" type="password" class="login_input" />
						    </td>
						  </tr>
						  
						  <tr>
						    <td height="50" colspan="2" align="center" valign="middle">
						    <input type="submit" height="50" value="登录"></td>
						  </tr>
						  
						</table>
					</form>
				</div>
			</div>
			
		<!--登录结束-->
		</div>
		
	</div>
<!--主体结束-->

	

  </body>
</html>
