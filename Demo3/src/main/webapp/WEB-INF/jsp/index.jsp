<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String user = (String)session.getAttribute("user");
 %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

   <!-- Bootstrap Core CSS -->
    <link href="css/mybootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin-2.css" rel="stylesheet">
	
    <!-- Custom Fonts -->
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<!--JS incluse-->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="Build/Cesium/Cesium.js"></script>
	<style>
		@import url(Build/Cesium/Widgets/widgets.css);
		html, body, #cesiumContainer {
			width: 100%; height: 100%; margin: 0; padding: 0; 
		}
	</style>
</head>

<body>

    <div id="wrapper">

		<nav class="navbar navbar-inverse"><!--xiugai1-->
            <div class="navbar-header">
				<h3>卫星预测系统</h3>
            </div>
            <!-- /.navbar-header -->
			<ul class="nav navbar-top-links navbar-right">
               <!-- /.dropdown -->
                
				<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                       
                </li>
                <!-- /.dropdown -->
            </ul>
            <ul class="nav navbar-top-links navbar-right">
               <!-- /.dropdown -->
                
				<li><a href="#"><i class="fa fa-user fa-fw"></i>  User</a>
                </li>
                <!-- /.dropdown -->
            </ul>
			
            <!-- /.navbar-top-links -->

        </nav>


        <div id="page-wrapper">
            
            <div class="row">
                 <div class="col-lg-4">
                    <div class="panel panel-warning">
                        <div class="panel-heading">
                            Bordered Table
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive table-bordered">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Username</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>Mark</td>
                                            <td>Otto</td>
                                            <td>@mdo</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>Larry</td>
                                            <td>the Bird</td>
                                            <td>@twitter</td>
                                        </tr>
                                    </tbody>
                                </table>
								<a class="btn btn-default btn-block" data-toggle="modal" 
									data-target="#table1" >Full Screen
									<span class="pull-right"><i class="fa fa-expand"></i></span>
								</a>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 --> <!-- /.col-lg-6 -->
				  <div class="col-lg-4">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            Bordered Table
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive table-bordered">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Username</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>Mark</td>
                                            <td>Otto</td>
                                            <td>@mdo</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>Larry</td>
                                            <td>the Bird</td>
                                            <td>@twitter</td>
                                        </tr>
                                    </tbody>
                                </table>
								<a class="btn btn-default btn-block" data-toggle="modal" 
									data-target="#form1" >Full Screen
									<span class="pull-right"><i class="fa fa-expand"></i></span>
								</a>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
                <div class="col-lg-4">
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            Bordered Table
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive table-bordered">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Username</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>Mark</td>
                                            <td>Otto</td>
                                            <td>@mdo</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>Larry</td>
                                            <td>the Bird</td>
                                            <td>@twitter</td>
                                        </tr>
                                    </tbody>
                                </table>
								<a class="btn btn-default btn-block" data-toggle="modal" 
									data-target="#table2" >Full Screen
									<span class="pull-right"><i class="fa fa-expand"></i></span>
								</a>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-4">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            Striped Rows
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                           <div id="cesiumContainer1"></div>
							<script>
							var viewer = new Cesium.Viewer('cesiumContainer1');
								viewer.dataSources.add(Cesium.CzmlDataSource.load('SampleData/simple.czml'));
							</script>
							<a class="btn btn-default btn-block" data-toggle="modal" 
									data-target="#chart1" >Full Screen
									<span class="pull-right"><i class="fa fa-expand"></i></span>
							</a>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
				<div class="col-lg-4">
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            Striped Rows
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div id="cesiumContainer2"></div>
							<script>
							var viewer = new Cesium.Viewer('cesiumContainer2');
								viewer.dataSources.add(Cesium.CzmlDataSource.load('SampleData/simple.czml'));
							</script>
							<a class="btn btn-default btn-block" data-toggle="modal" 
									data-target="#chart2" >Full Screen
									<span class="pull-right"><i class="fa fa-expand"></i></span>
							</a>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                
                <div class="col-lg-4">
                    <div class="panel panel-warning">
                        <div class="panel-heading">
                            Bordered Table
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div id="cesiumContainer3"></div>
							<script>
							var viewer = new Cesium.Viewer('cesiumContainer3');
								viewer.dataSources.add(Cesium.CzmlDataSource.load('SampleData/simple.czml'));
							</script>
							<a class="btn btn-default btn-block" data-toggle="modal" 
									data-target="#chart3" >Full Screen
									<span class="pull-right"><i class="fa fa-expand"></i></span>
							</a>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
			
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
	
	<!-- 模态框 -->
	<div class="modal fade" id="table1" tabindex="-1" role="dialog" aria-hidden="true" >
	    <div class="modal-dialog modal-lg" style="width:100%;height:550px;">
		    <div class="modal-content">
			    <div class="modal-body">
                    <iframe id="table1" src="table1.html" style="width:100%;height:550px;">
                    </iframe>
			    </div>
		    </div>

	    </div>
    </div>
	<div class="modal fade" id="form1" tabindex="-1" role="dialog" aria-hidden="true" >
	    <div class="modal-dialog modal-lg" style="width:100%;height:550px;">
		    <div class="modal-content">
			    <div class="modal-body">
                    <iframe id="form1" src="form1.html" style="width:100%;height:550px;">
                    </iframe>
			    </div>
		    </div>

	    </div>
    </div>
	<div class="modal fade" id="table2" tabindex="-1" role="dialog" aria-hidden="true" >
	    <div class="modal-dialog modal-lg" style="width:100%;height:550px;">
		    <div class="modal-content">
			    <div class="modal-body">

                    <iframe id="table2" src="table2.html" style="width:100%;height:550px;">
                    </iframe>
			    </div>
		    </div>

	    </div>
    </div>
		<div class="modal fade" id="chart1" tabindex="-1" role="dialog" aria-hidden="true" >
	    <div class="modal-dialog modal-lg" style="width:100%;height:550px;">
		    <div class="modal-content">
			    <div class="modal-body">

                    <iframe id="chart1" src="1.html" style="width:100%;height:550px;">
                    </iframe>
			    </div>
		    </div>

	    </div>
    </div>
		<div class="modal fade" id="chart2" tabindex="-1" role="dialog" aria-hidden="true" >
	    <div class="modal-dialog modal-lg" style="width:100%;height:550px;">
		    <div class="modal-content">
			    <div class="modal-body">

                    <iframe id="chart2" src="1.html" style="width:100%;height:550px;">
                    </iframe>
			    </div>
		    </div>

	    </div>
    </div>
		<div class="modal fade" id="chart3" tabindex="-1" role="dialog" aria-hidden="true" >
	    <div class="modal-dialog modal-lg" style="width:100%;height:550px;">
		    <div class="modal-content">
			    <div class="modal-body">

                    <iframe id="chart3" src="1.html" style="width:100%;height:550px;">
                    </iframe>
			    </div>
		    </div>

	    </div>
    </div>
    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
   
</body>

</html>


