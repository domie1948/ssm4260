<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<style>

</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="content">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul class="navbar-nav mr-auto" id="navUl">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑员工工资</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>员工工资管理</span></li>
								<li class="breadcrumb-item active"><span>编辑员工工资</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">员工工资信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
									<label>工资月份</label>

									<input id="gongziyuefen" name="gongziyuefen" class="form-control" v-model="ruleForm.gongziyuefen" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>员工工号</label>

									<input id="yuangonggonghao" name="yuangonggonghao" class="form-control" v-model="ruleForm.yuangonggonghao" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>员工姓名</label>

									<input id="yuangongxingming" name="yuangongxingming" class="form-control" v-model="ruleForm.yuangongxingming" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>部门</label>

									<input id="bumen" name="bumen" class="form-control" v-model="ruleForm.bumen" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>性别</label>

									<input id="xingbie" name="xingbie" class="form-control" v-model="ruleForm.xingbie" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>职位</label>

									<input id="zhiwei" name="zhiwei" class="form-control" v-model="ruleForm.zhiwei" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>底薪</label>

									<input id="dixin" name="dixin" class="form-control" v-model="ruleForm.dixin" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>绩效</label>

									<input id="jixiao" name="jixiao" class="form-control" v-model="ruleForm.jixiao" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>岗位补贴</label>

									<input id="gangweibutie" name="gangweibutie" class="form-control" v-model="ruleForm.gangweibutie" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>全勤奖</label>

									<input id="quanqinjiang" name="quanqinjiang" class="form-control" v-model="ruleForm.quanqinjiang" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>加班费</label>

									<input id="jiabanfei" name="jiabanfei" class="form-control" v-model="ruleForm.jiabanfei" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>扣绩效</label>

									<input id="koujixiao" name="koujixiao" class="form-control" v-model="ruleForm.koujixiao" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>其它扣款</label>

									<input id="qitakoukuan" name="qitakoukuan" class="form-control" v-model="ruleForm.qitakoukuan" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>扣五险一金</label>

									<input id="kouwuxianyijin" name="kouwuxianyijin" class="form-control" v-model="ruleForm.kouwuxianyijin" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>实发工资</label>

									<input id="shifagongzi" name="shifagongzi" class="form-control" v-model="ruleForm.shifagongzi" readonly>
									</div>
									<div class="form-group col-md-6">
									<label>工资备注</label>

									<input id="gongzibeizhu" name="gongzibeizhu" class="form-control" v-model="ruleForm.gongzibeizhu" readonly>
									</div>

									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button id="exitBtn" type="button" class="btn btn-primary btn-lg">返回</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>

	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "yuangonggongzi";
		var pageType = "add-or-update";
		var updateId = "";		

		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "yuangonggongzi/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 填充富文本框
		function setContent(){
		}  

		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				$("#submitBtn").addClass("修改");
				updateId = id;
				window.sessionStorage.removeItem('id');
				$.ajax({ 
	                type: "GET",
	                url: baseUrl + "yuangonggongzi/info/" + id,
	                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
	                success: function(res){           
	                	if(res.code == 0){
	                		ruleForm = res.data
							showImg();
							setContent();		
							setMediaUrl();	
							setDownloadBtn();
			    		}else if(res.code ==401){
			    			 <%@ include file="../../static/toLogin.jsp"%>	
			    		}else{
							 alert(res.msg);
						}
	                },
	            });
			}else{
				$("#submitBtn").addClass("新增");
			}
		}	

		//图片显示
		function showImg(){
		}		
		function exit(){
			window.sessionStorage.removeItem("id");
			window.location.href = "list.jsp";
		}			
		// 下载
		function download(fileName){
			var url = baseUrl+'file/download?fileName='+fileName;
			window.open(url);
		}	
		//设置下载
		function setDownloadBtn(){
		}			
		//设置音视频播放链接
		function setMediaUrl(){
		}	
		//打开新窗口播放媒体
		function mediaPlay(url){
			//var url = baseUrl + "upload/" + fileName;
			window.open(url);
		}		
		$(document).ready(function() { 
			//设置右上角用户名
			$('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			setMenu();
			$('#exitBtn').on('click', function(e) {
			    e.preventDefault();
				exit();
			});
			getDetails();
			<%@ include file="../../static/myInfo.js"%>
		});			
		// 用户登出
        <%@ include file="../../static/logout.jsp"%>	
	</script>
</body>

</html>
