<script type="text/javascript">
  var returnData = [];
  $.ajax({
    url: "/webservices/admin/pagelayouts",
    type: "GET",
    dataType: "json",
    success: function (data) {
         returnData = data;
         for (var x = 0; x < data.length; x++) {
            var statusString = '<span class="label-default label">Inactive</span>';
            if(returnData[x].active) {
                statusString = '<span class="label-success label label-default">Active</span>';
            }
            $('#pagelayout-table').append('<tr><td class="center">'+returnData[x].name+'</td><td class="center">'+statusString+'</td><td class="center">'+returnData[x].defaultLayout+'</td><td class="center">'+returnData[x].createdDate+'</td><td class="center"><a class="btn btn-success" href="#"><i class="glyphicon glyphicon-zoom-in icon-white"></i> View</a><a class="btn btn-info" href="#"><i class="glyphicon glyphicon-edit icon-white"></i> Edit</a><a class="btn btn-danger" href="#"><i class="glyphicon glyphicon-trash icon-white"></i> Delete</a></td></tr>)');
         }
    }
  });
</script>
<div class="box col-md-12">
            <div class="box-inner">
                <div class="box-header well" data-original-title="">
                    <h2><i class="glyphicon glyphicon-tasks"></i> Page Layouts</h2>
                </div>
                <div class="box-content">
                    <table class="table table-striped table-bordered responsive" id="pagelayout-table">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Active</th>
                            <th>Default Layout</th>
                            <th>Date Created</th>
                            <th>Actions</th>
                        </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <!--/span-->