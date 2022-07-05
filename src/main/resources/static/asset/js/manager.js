$(function () {
    //클릭시 이미지 변경 및 상세검색 추가
    var list = $(".detail_list");

    $("#detail_btn").click(function (e) {
        if (list.css("display") != "none") {
            $("#detail_btn").html("상세검색 열기");
            $("#detail_btn").removeClass("off");
            $("#detail_btn").addClass("on");
            $(".detail_list").hide();
        } else {
            $("#detail_btn").html("상세검색 닫기");
            $("#detail_btn").removeClass("on");
            $("#detail_btn").addClass("off");
            $(".detail_list").show();
        }
    });
    //초기 페이지 또는 검색 후 버튼 이미지 설정
    if (list.css("display") != "none") {
        $("#detail_btn").attr("src", "/images/newdandi/detail_search_up.gif");
    } else {
        $("#detail_btn").attr("src", "/images/newdandi/detail_search.gif");
    }
});

function search_form_submit(ty, val1, val2, code) {
    var f = document.search_box;
    if (ty == "area") {
        //$(".list_area_gugun > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제

        area1_len = $("form[name=search_box] > input[name='area1[]']").length;
        area1_chk = "";
        area_delete_chk = "";
        //중복체크해서 똑같은 데이터 있으면 다시 해제되도록 설정
        for (i = 0; i < area1_len; i++) {
            if ($("form[name=search_box] > input[name='area1[]']").eq(i).val() == val1 && $("form[name=search_box] > input[name='area2[]']").eq(i).val() == val2) {
                search_form_delete('area', i, code);
                $("#area2_" + code).removeClass("on");
                area_delete_chk = "y";
            }
            if (val2 == "전체") {
                //2018-03-30 전체인 경우 동일한 지역 선택이 있으면 전부 해제
                if ($("form[name=search_box] > input[name='area1[]']").eq(i).val() == val1 && $("form[name=search_box] > input[name='area2[]']").eq(i).val() != "전체") {
                    search_form_delete('area', i, code);
                    $(".list_area_" + code + " > li > input[type=button]").removeClass("on");
                }
            } else {
                //2018-03-30 지역 선택 시 해당 지역의 전체가 선택되어있으면 해제
                if ($("form[name=search_box] > input[name='area1[]']").eq(i).val() == val1 && ($("form[name=search_box] > input[name='area2[]']").eq(i).val() == "전체" || $("form[name=search_box] > input[name='area2[]']").eq(i).val() == "")) {
                    search_form_delete('area', i, code);
                    $(".list_area_" + code + " > li > input[type=button]").removeClass("on");
                }
            }
        }
        if (area_delete_chk == "y") {
            return false;
        }

        //값 입력
        for (i = 0; i < area1_len; i++) {
            if ($("form[name=search_box] > input[name='area1[]']").eq(i).val() == "") {
                $("form[name=search_box] > input[name='area1[]']").eq(i).val(val1);
                $("form[name=search_box] > input[name='area2[]']").eq(i).val(val2);
                $("form[name=search_box] > input[name='area2[]']").eq(i).data("val", code);

                $searchArea.eq(i).val(val1 + " " +val2);

                console.log($searchArea.eq(i).val());
                area1_chk = "y";
                break;
            }
        }

        if (area1_chk == "") {
            alert('5개 이상은 선택되지 않습니다.');
            return false;
        } else {
            //2018-04-06 구군 선택 시 시도 선택한 값 날려버리도록 설정
            $("form[name=search_box] > input[name='area1_all']").val("");

            $("#area2_" + code).addClass("on");
            search_form_text('area');
        }
    } //2018-03-31 area


    if (ty == "sphere") {
        //$(".list_sphere > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제

        sphere_len = $("form[name=search_box] > input[name='sphere[]']").length;
        sphere_chk = "";
        sphere_yoyang_chk = "";
        sphere_ganbyeong_chk = "";
        sphere_delete_chk = "";
        //중복체크해서 똑같은 데이터 있으면 다시 해제되도록 설정
        for (i = 0; i < sphere_len; i++) {
            if ($("form[name=search_box] > input[name='sphere[]']").eq(i).val() == val1) {
                search_form_delete('sphere', i, code);
                sphere_delete_chk = "y";
            }
            if (val2 == "전체") {
                //2018-03-30 전체인 경우 다 해제
                $("form[name=search_box] > input[name='sphere[]']").eq(i).val("");
                $(".list_sphere > ul > li > input[type=button]").removeClass("on");
            } else {
                //2018-03-30 지역 선택 시 해당 지역의 전체가 선택되어있으면 해제
                if ($("form[name=search_box] > input[name='sphere[]']").eq(i).val() == val1) {
                    search_form_delete('sphere', i, code);
                    $(".list_sphere > ul > li > input[type=button]").removeClass("on");
                }
            }

            //2018-04-05 요양보호사인 경우 해당 부분 선택할 수 있도록 chk값 부여
            if ($("form[name=search_box] > input[name='sphere[]'").eq(i).val() == "요양보호사") {
                sphere_yoyang_chk = "y";
            }
        }

        //2018-04-05 선택된 값이 요양보호사인 경우 해제 말고 선택했을때에만 show되도록 설정
        if (val1 == "요양보호사" && sphere_delete_chk == "") {
            sphere_yoyang_chk = "y";
        }

        if (val1 == "간병인" && sphere_delete_chk == "") {
            sphere_ganbyeong_chk = "y";
        }

        //2018-04-05 요양보호사 선택값 보이기
        if (sphere_yoyang_chk == "y") {
            $(".tr_yoyang").show();
        } else {
            $(".tr_yoyang").hide();
        }

        if (sphere_ganbyeong_chk == "y") {
            $(".tr_ganbyeong").show();
        } else {
            $(".tr_ganbyeong").hide();
        }

        if (sphere_delete_chk == "y") {
            return false;
        }

        //값 입력
        for (i = 0; i < sphere_len; i++) {
            if ($("form[name=search_box] > input[name='sphere[]']").eq(i).val() == "") {
                $("form[name=search_box] > input[name='sphere[]']").eq(i).val(val1);
                sphere_chk = "y";
                break;
            }
        }

        if (sphere_chk == "") {
            alert('5개 이상은 선택되지 않습니다.');
            return false;
        } else {
            $("#sphere_" + code).addClass("on");
            search_form_text('sphere');
        }
    } //2018-03-31 sphere

    if (ty == "shape") {
        $(".list_search_sub_shape > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("#shape_" + code).addClass("on");
        $("form[name=search_box] > input[name='shape']").val(val1);
    } //2018-03-31 shape

    if (ty == "career") {
        $(".list_search_sub_career > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("#career_" + code).addClass("on");
        $("form[name=search_box] > input[name='career']").val(val1);
    } //2018-03-31 career

    if (ty == "newname") {
        $(".list_search_sub_newname > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("#newname_" + code).addClass("on");
        $("form[name=search_box] > input[name='newname']").val(val1);
    } //2018-03-31 newname

    if (ty == "sex") {
        $(".list_search_sub_sex > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("#sex_" + code).addClass("on");
        $("form[name=search_box] > input[name='sex']").val(val1);
    } //2018-03-31 sex


    if (ty == "vaccine") {
        $(".list_search_sub_vaccine > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("#vaccine_" + code).addClass("on");
        $("form[name=search_box] > input[name='vaccine']").val(val1);
    } //2021-08-31 vaccine

    if (ty == "nationality") {
        $(".list_search_sub_nationality > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("#nationality_" + code).addClass("on");
        $("form[name=search_box] > input[name='nationality']").val(val1);
    } //2018-03-31 nationality

    if (ty == "yoyang") {
        $(".list_search_sub_yoyang > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("#yoyang_" + code).addClass("on");
        $("form[name=search_box] > input[name='yoyang']").val(val1);
    } //2018-03-31 yoyang

    if (ty == "ganbyeong_corona") {
        $(".list_search_sub_ganbyeong > ul > li > input[type=button]").removeClass("on"); //2020-11-19 버튼 on 해제
        $("#ganbyeong_corona_" + code).addClass("on");
        $("form[name=search_box] > input[name='ganbyeong_corona']").val(val2);
    } //2020-11-19 간병
}

function search_form_text(ty) {
    if (ty == "area") {
        $(".common_search > .search_area > .choice > .choice_text > .none_choice").hide();

        $(".common_search > .search_area > .choice > .choice_text > ul").html("");

        area1_len = $("form[name=search_box] > input[name='area1[]']").length;
        area1_chk = "";
        for (k = 0; k < area1_len; k++) {
            if ($("form[name=search_box] > input[name='area1[]']").eq(k).val()) {
                area1_val = $("form[name=search_box] > input[name='area1[]']").eq(k).val();
                area2_val = $("form[name=search_box] > input[name='area2[]']").eq(k).val();
                area2_code = $("form[name=search_box] > input[name='area2[]']").eq(k).data("val");
                $(".common_search > .search_area > .choice > .choice_text > ul").append("<li>" + area1_val + " " + area2_val + "<a class='search_text_delete' href='javascript:search_form_delete(\"area\", \"" + k + "\", \"" + area2_code + "\")' style='color:#FFF'><span class='delete'>X</span></a></li>");
                area1_chk = "y";
            }
        }

        if (area1_chk == "") {
            $(".common_search > .search_area > .choice > .choice_text > .none_choice").show();
        }
    }
}

function search_form_delete(ty, n, code) {
    if (ty == "area") {
        //$(".list_area_gugun > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("form[name=search_box] > input[name='area1[]']").eq(n).val("");
        $("form[name=search_box] > input[name='area2[]']").eq(n).val("");
        $("#area2_" + code).removeClass("on");
    }
    if (ty == "sphere") {
        //$(".list_sphere > ul > li > input[type=button]").removeClass("on"); //2018-03-30 버튼 on 해제
        $("form[name=search_box] > input[name='sphere[]']").eq(n).val("");
        $("#sphere_" + code).removeClass("on");
    }
    search_form_text(ty);
}

$(document).ready(function () {
    search_form_text('area');
    search_form_text('sphere');
});


function search_area_view(code, name, flag) {
    $(".td_sido").removeClass("on");

    if (code) {
        $("#area1_" + code).addClass("on");
        $(".list_area_gugun").show();
        $(".list_area_gugun > ul").hide();
        $(".list_area_" + code).show();
        if (flag == "") $("form[name=search_box] > input[name='area1_all']").val(name);

        //2018-04-09 사장님 요청으로 지역만 선택해도 아래 상세검색 열기 열리도록 설정
        $("#detail_btn").html("상세검색 닫기");
        $("#detail_btn").removeClass("on");
        $("#detail_btn").addClass("off");
        $(".detail_list").show();
    } else {
        $(".td_sido").eq(0).addClass("on");
        $(".list_area_gugun").hide();
        $(".list_area_gugun > ul").hide();

        $(".common_search > .search_area > .choice > .choice_text > ul").html("");
        $(".common_search > .search_area > .choice > .choice_text > .none_choice").show();

        for (k = 0; k < 5; k++) {
            if ($("form[name=search_box] > input[name='area1[]']").eq(k).val()) {
                $("form[name=search_box] > input[name='area1[]']").eq(k).val('');
                $("form[name=search_box] > input[name='area2[]']").eq(k).val('');
            }
        }

        $("form[name=search_box] > input[name='area1_all']").val('');
    }

}

$(document).ready(function () {
    var first_chk = 1;
    var area1_code = "";
    var area1_name = "";
    //2019-06-04 flag "ready"추가하여 플래그가 있을 때에는 area1_all 등록안함
    search_area_view(area1_code, area1_name, "ready");

});


$(".search_slide").jCarouselLite({
    visible: 1,
    auto: 5000,
    speed: 1000,
    vertical: true
});
$(".banner_slide").jCarouselLite({
    visible: 1,
    auto: 5000,
    speed: 1000,
    vertical: true
});


/*     $(document).ready(function() {
        //var position_s01 = $(".r_nor").offset(); //특정위치로 스크롤 이동			
        //$('html, body').animate({scrollTop : position_s01.top}, 1000);
    }); */
