<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript"
	src="/hec/dwr/interface/dwrMoblieSmsService.js"></script>
<script type="text/javascript"
	src="/hec/dwr/interface/dwrMailService.js"></script>
<script src="/hec/js/echarts/build/dist/echarts.js"></script>

<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
%>
<title>首页</title>
<script type="text/javascript">
	window.onload = function() {
		initTemperatureCharts();
		initHeatCharts();
		initOfflineCharts();
		initInfoCharts();
	}

	function initTemperatureCharts() {
		// 路径配置
		require.config({
			paths : {
				echarts : '/hec/js/echarts/build/dist'
			}
		});

		// 使用
		require([ 'echarts', 'echarts/chart/pie', 'echarts/chart/funnel'
		], function(ec) {
			// 基于准备好的dom，初始化echarts图表
			var myChart = ec.init(document.getElementById('test'));

			var option = {
				title : {
					text : 'sdlf',
					subtext : 'sdf',
					x : 'left'
				},
				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b} : {c} ({d}%)"
				},
				legend : {
					orient : 'vertical',
					x : 'left',
					data : [ '>25', '20-25', '16-20', '<16' ]
				},
				toolbox : {
					show : true,
					feature : {
						mark : {
							show : false
						},
						dataView : {
							show : true,
							readOnly : false
						},
						magicType : {
							show : true,
							type : [ 'pie', 'funnel' ],
							option : {
								funnel : {
									x : '25%',
									width : '50%',
									funnelAlign : 'left',
									max : 1548
								}
							}
						},
						restore : {
							show : false
						},
						saveAsImage : {
							show : true
						}
					}
				},
				calculable : true,
				series : [ {
					name : '温度分布',
					type : 'pie',
					radius : '60%',
					center : [ '50%', '50%' ],
					data : [ {
						value : 35,
						name : '>25'
					}, {
						value : 310,
						name : '20-25'
					}, {
						value : 234,
						name : '16-20'
					}, {
						value : 135,
						name : '<16'
					}
					 ]
				} ]
			};

			// 为echarts对象加载数据 
			myChart.setOption(option);
		});

	}
</script>

</head>
<body>

<div id="test" style="width:500px;height:400px;"></div>

</body>
</html>