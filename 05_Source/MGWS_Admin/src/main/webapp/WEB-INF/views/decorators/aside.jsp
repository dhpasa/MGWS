<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
            <li class="header">MAIN NAVIGATION</li>
            <li class="treeview active">
              <a href="#">
                <i class="fa fa-table"></i> <span>管理</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="#" url="${pageContext.request.contextPath}/recruitmentInit" data-addtab="recruitment" title="招聘信息"><i class="fa fa-circle-o"></i> 招聘信息</a></li>
                <li><a href="#" url="${pageContext.request.contextPath}/courseInit" data-addtab="course" title="课程信息"><i class="fa fa-circle-o"></i> 课程信息</a></li>
                <li><a href="#" url="${pageContext.request.contextPath}/assetCartInit" data-addtab="asset" title="资产管理"><i class="fa fa-circle-o"></i> 资产管理</a></li>
              </ul>
            </li>
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>