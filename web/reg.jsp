<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title><s:text name="register.page"></s:text> </title>
	
	<link href="css/Layout.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
   
<!--主体开始-->
	<div class="main mt10">
		<div class="mleft fl ah">
		<!--注册开始-->
			<div class="reg_a jiacu">会员注册</div>
			<div class="reg_b fl">填写会员信息</div>
			<div class="reg_c fl ah">
				<!-- 使用Struts 2标签完成注册功能 -->
				<s:form action="registerAction" method="post" name="frm">
					<table width="300" align="center" style="text-align:center;">
						<s:textfield name="user.userName" key="用户名" />
						<s:textfield name="user.password" key="密码"  />
						<s:textfield name="repassword" key="确认密码" />
						<s:submit value="提交" align="center"></s:submit>
					</table>
				</s:form>
			</div>			

		<!--注册结束-->
		</div>
		
		
	</div>

  </body>
</html>
