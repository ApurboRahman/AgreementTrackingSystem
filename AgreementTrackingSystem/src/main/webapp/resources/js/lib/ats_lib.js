/**
 * Created by md.rahman on 11/18/2017.
 */
//region === asGlobal Object ===
atsGlobal = (function () {
    "use strict";

    function _strip(html) {
        var tmp = document.createElement("DIV");
        tmp.innerHTML = html;
        return tmp.textContent || tmp.innerHTML || "";
    }

    function _zeroLeftPad(number, width) {
        width -= number.toString().length;
        if (width > 0) {
            return new Array(width + (/\./.test(number) ? 2 : 1)).join('0') + number;
        }
        return number + '';
    }

    function _zeroRightPad(number, width) {
        return number.toString() + new Array(width + 1 - number.toString().length).join('0');
    }

    /*
     * Returns base url of the system
     * @returns {string}
     * */
    function baseUrl() {
        return window.location.protocol + '//' + window.location.host + '/ats.web/';
    }

    function baseReportLocation() {
        return window.location.protocol + '//' + window.location.host + '/ats.web/resources/reports/';
    }

    /*
     * Wrapper of the jquery ajax call
     * */
    function ajax(url, type, data, callback) {
        $.ajax(
            {
                url: url,
                type: type,
                data: data,
                success: callback
            }
        );

        /*
         * Format the control if the element is valid
         * @param {jQuery} element
         *
         * return void
         * */
    }

    function valid(element) {
        element.removeClass('error link-tooltip');
        element.removeAttr('data-original-title');
    }

    /*
     * Format the control if the element is invalid for client
     * @param {jQuery}element
     * @param {string} validationMsg
     * @param {boolean} isEmpty
     *
     * return {void}
     * */
    function invalidForClient(element, validationMsg, isEmpty) {
        if (isEmpty) {
            element.val('');
        }
        element.addClass('error');
    }

    /*Responsible to show the error message*/
    function errorMsg(msg, element) {
        alertify.errorAlert(msg).set({
            transition: 'zoom',
            onok: function () {
                $("body").removeClass("ajs-no-overflow");
            }
        });
    }

    /*Responsible to show the success message*/
    function successMsg(msg, element) {
        alertify.successAlert(msg).set({
            transition: 'zoom',
            onok: function () {
                $("body").removeClass("ajs-no-overflow");
            }
        });
    }

    /*Responsible to show the warning message*/
    function successMsg(msg, element) {
        alertify.warningAlert(msg).set({
            transition: 'zoom',
            onok: function () {
                $("body").removeClass("ajs-no-overflow");
            }
        });
    }
})();