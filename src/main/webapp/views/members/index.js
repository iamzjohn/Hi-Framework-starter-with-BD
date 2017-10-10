Hi.view(function ($scope) {

    $scope.aux_user = {
        firsname: '',
        lastname: '',
        username: ''
    };
    function init() {
        $scope.user = {
            firsname: '',
            lastname: '',
            username: ''
        };
    }
    $scope.members;

    $scope.$preLoad = () => {

    };

    function initializeData() {
        MemberFrontier.findAll().try((result) => {
            $scope.members = result;
        });
    }

    $scope.$postLoad = () => {
        initializeData();
        init();
    }

    $scope.addUser = (user) => {
        MemberFrontier.add(user).try((result) => {
            if (result) {
                $scope.members.push(user);
                init();
            } else {
                alert("Error Something went Wrong");
            }
        });

    };
    $scope.editUser = (user) => {

        $scope.aux_user = user;
        $('#editUserModal').modal();
    };

    $scope.updateUser = (user) => {
        MemberFrontier.update(user).try((result) => {
            if (result) {
                alert("Success user data updated");
            } else {
                alert("Error Something went Wrong");
            }
        });
    };

    $scope.deleteUser = (user) => {
        MemberFrontier.delete(user.id).try((result) => {
            if (result) {
                initializeData();
                alert("Success user data updated");
            } else {
                alert("Error Something went Wrong");
            }
        });
    };
});
