<!DOCTYPE html>
<!-- saved from url=(0059)https://leetcode.com/problems/maximum-depth-of-binary-tree/ -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="./104-Maximum-Depth-of-Binary-Tree_files/nr-1123.min.js.download"></script><script async="" src="./104-Maximum-Depth-of-Binary-Tree_files/analytics.js.download"></script><script type="text/javascript">(window.NREUM||(NREUM={})).loader_config={xpid:"UAQDVFVRGwEAXVlbBAg="};window.NREUM||(NREUM={}),__nr_require=function(t,n,e){function r(e){if(!n[e]){var o=n[e]={exports:{}};t[e][0].call(o.exports,function(n){var o=t[e][1][n];return r(o||n)},o,o.exports)}return n[e].exports}if("function"==typeof __nr_require)return __nr_require;for(var o=0;o<e.length;o++)r(e[o]);return r}({1:[function(t,n,e){function r(t){try{s.console&&console.log(t)}catch(n){}}var o,i=t("ee"),a=t(18),s={};try{o=localStorage.getItem("__nr_flags").split(","),console&&"function"==typeof console.log&&(s.console=!0,o.indexOf("dev")!==-1&&(s.dev=!0),o.indexOf("nr_dev")!==-1&&(s.nrDev=!0))}catch(c){}s.nrDev&&i.on("internal-error",function(t){r(t.stack)}),s.dev&&i.on("fn-err",function(t,n,e){r(e.stack)}),s.dev&&(r("NR AGENT IN DEVELOPMENT MODE"),r("flags: "+a(s,function(t,n){return t}).join(", ")))},{}],2:[function(t,n,e){function r(t,n,e,r,s){try{p?p-=1:o(s||new UncaughtException(t,n,e),!0)}catch(f){try{i("ierr",[f,c.now(),!0])}catch(d){}}return"function"==typeof u&&u.apply(this,a(arguments))}function UncaughtException(t,n,e){this.message=t||"Uncaught error with no additional information",this.sourceURL=n,this.line=e}function o(t,n){var e=n?null:c.now();i("err",[t,e])}var i=t("handle"),a=t(19),s=t("ee"),c=t("loader"),f=t("gos"),u=window.onerror,d=!1,l="nr@seenError",p=0;c.features.err=!0,t(1),window.onerror=r;try{throw new Error}catch(h){"stack"in h&&(t(8),t(7),"addEventListener"in window&&t(5),c.xhrWrappable&&t(9),d=!0)}s.on("fn-start",function(t,n,e){d&&(p+=1)}),s.on("fn-err",function(t,n,e){d&&!e[l]&&(f(e,l,function(){return!0}),this.thrown=!0,o(e))}),s.on("fn-end",function(){d&&!this.thrown&&p>0&&(p-=1)}),s.on("internal-error",function(t){i("ierr",[t,c.now(),!0])})},{}],3:[function(t,n,e){t("loader").features.ins=!0},{}],4:[function(t,n,e){function r(t){}if(window.performance&&window.performance.timing&&window.performance.getEntriesByType){var o=t("ee"),i=t("handle"),a=t(8),s=t(7),c="learResourceTimings",f="addEventListener",u="resourcetimingbufferfull",d="bstResource",l="resource",p="-start",h="-end",m="fn"+p,w="fn"+h,v="bstTimer",y="pushState",g=t("loader");g.features.stn=!0,t(6);var x=NREUM.o.EV;o.on(m,function(t,n){var e=t[0];e instanceof x&&(this.bstStart=g.now())}),o.on(w,function(t,n){var e=t[0];e instanceof x&&i("bst",[e,n,this.bstStart,g.now()])}),a.on(m,function(t,n,e){this.bstStart=g.now(),this.bstType=e}),a.on(w,function(t,n){i(v,[n,this.bstStart,g.now(),this.bstType])}),s.on(m,function(){this.bstStart=g.now()}),s.on(w,function(t,n){i(v,[n,this.bstStart,g.now(),"requestAnimationFrame"])}),o.on(y+p,function(t){this.time=g.now(),this.startPath=location.pathname+location.hash}),o.on(y+h,function(t){i("bstHist",[location.pathname+location.hash,this.startPath,this.time])}),f in window.performance&&(window.performance["c"+c]?window.performance[f](u,function(t){i(d,[window.performance.getEntriesByType(l)]),window.performance["c"+c]()},!1):window.performance[f]("webkit"+u,function(t){i(d,[window.performance.getEntriesByType(l)]),window.performance["webkitC"+c]()},!1)),document[f]("scroll",r,{passive:!0}),document[f]("keypress",r,!1),document[f]("click",r,!1)}},{}],5:[function(t,n,e){function r(t){for(var n=t;n&&!n.hasOwnProperty(u);)n=Object.getPrototypeOf(n);n&&o(n)}function o(t){s.inPlace(t,[u,d],"-",i)}function i(t,n){return t[1]}var a=t("ee").get("events"),s=t(21)(a,!0),c=t("gos"),f=XMLHttpRequest,u="addEventListener",d="removeEventListener";n.exports=a,"getPrototypeOf"in Object?(r(document),r(window),r(f.prototype)):f.prototype.hasOwnProperty(u)&&(o(window),o(f.prototype)),a.on(u+"-start",function(t,n){var e=t[1],r=c(e,"nr@wrapped",function(){function t(){if("function"==typeof e.handleEvent)return e.handleEvent.apply(e,arguments)}var n={object:t,"function":e}[typeof e];return n?s(n,"fn-",null,n.name||"anonymous"):e});this.wrapped=t[1]=r}),a.on(d+"-start",function(t){t[1]=this.wrapped||t[1]})},{}],6:[function(t,n,e){var r=t("ee").get("history"),o=t(21)(r);n.exports=r,o.inPlace(window.history,["pushState","replaceState"],"-")},{}],7:[function(t,n,e){var r=t("ee").get("raf"),o=t(21)(r),i="equestAnimationFrame";n.exports=r,o.inPlace(window,["r"+i,"mozR"+i,"webkitR"+i,"msR"+i],"raf-"),r.on("raf-start",function(t){t[0]=o(t[0],"fn-")})},{}],8:[function(t,n,e){function r(t,n,e){t[0]=a(t[0],"fn-",null,e)}function o(t,n,e){this.method=e,this.timerDuration=isNaN(t[1])?0:+t[1],t[0]=a(t[0],"fn-",this,e)}var i=t("ee").get("timer"),a=t(21)(i),s="setTimeout",c="setInterval",f="clearTimeout",u="-start",d="-";n.exports=i,a.inPlace(window,[s,"setImmediate"],s+d),a.inPlace(window,[c],c+d),a.inPlace(window,[f,"clearImmediate"],f+d),i.on(c+u,r),i.on(s+u,o)},{}],9:[function(t,n,e){function r(t,n){d.inPlace(n,["onreadystatechange"],"fn-",s)}function o(){var t=this,n=u.context(t);t.readyState>3&&!n.resolved&&(n.resolved=!0,u.emit("xhr-resolved",[],t)),d.inPlace(t,y,"fn-",s)}function i(t){g.push(t),h&&(b?b.then(a):w?w(a):(E=-E,R.data=E))}function a(){for(var t=0;t<g.length;t++)r([],g[t]);g.length&&(g=[])}function s(t,n){return n}function c(t,n){for(var e in t)n[e]=t[e];return n}t(5);var f=t("ee"),u=f.get("xhr"),d=t(21)(u),l=NREUM.o,p=l.XHR,h=l.MO,m=l.PR,w=l.SI,v="readystatechange",y=["onload","onerror","onabort","onloadstart","onloadend","onprogress","ontimeout"],g=[];n.exports=u;var x=window.XMLHttpRequest=function(t){var n=new p(t);try{u.emit("new-xhr",[n],n),n.addEventListener(v,o,!1)}catch(e){try{u.emit("internal-error",[e])}catch(r){}}return n};if(c(p,x),x.prototype=p.prototype,d.inPlace(x.prototype,["open","send"],"-xhr-",s),u.on("send-xhr-start",function(t,n){r(t,n),i(n)}),u.on("open-xhr-start",r),h){var b=m&&m.resolve();if(!w&&!m){var E=1,R=document.createTextNode(E);new h(a).observe(R,{characterData:!0})}}else f.on("fn-end",function(t){t[0]&&t[0].type===v||a()})},{}],10:[function(t,n,e){function r(){var t=window.NREUM,n=t.info.accountID||null,e=t.info.agentID||null,r=t.info.trustKey||null,i="btoa"in window&&"function"==typeof window.btoa;if(!n||!e||!i)return null;var a={v:[0,1],d:{ty:"Browser",ac:n,ap:e,id:o.generateCatId(),tr:o.generateCatId(),ti:Date.now()}};return r&&n!==r&&(a.d.tk=r),btoa(JSON.stringify(a))}var o=t(16);n.exports={generateTraceHeader:r}},{}],11:[function(t,n,e){function r(t){var n=this.params,e=this.metrics;if(!this.ended){this.ended=!0;for(var r=0;r<p;r++)t.removeEventListener(l[r],this.listener,!1);n.aborted||(e.duration=s.now()-this.startTime,this.loadCaptureCalled||4!==t.readyState?null==n.status&&(n.status=0):a(this,t),e.cbTime=this.cbTime,d.emit("xhr-done",[t],t),c("xhr",[n,e,this.startTime]))}}function o(t,n){var e=t.responseType;if("json"===e&&null!==n)return n;var r="arraybuffer"===e||"blob"===e||"json"===e?t.response:t.responseText;return w(r)}function i(t,n){var e=f(n),r=t.params;r.host=e.hostname+":"+e.port,r.pathname=e.pathname,t.sameOrigin=e.sameOrigin}function a(t,n){t.params.status=n.status;var e=o(n,t.lastSize);if(e&&(t.metrics.rxSize=e),t.sameOrigin){var r=n.getResponseHeader("X-NewRelic-App-Data");r&&(t.params.cat=r.split(", ").pop())}t.loadCaptureCalled=!0}var s=t("loader");if(s.xhrWrappable){var c=t("handle"),f=t(12),u=t(10).generateTraceHeader,d=t("ee"),l=["load","error","abort","timeout"],p=l.length,h=t("id"),m=t(15),w=t(14),v=window.XMLHttpRequest;s.features.xhr=!0,t(9),d.on("new-xhr",function(t){var n=this;n.totalCbs=0,n.called=0,n.cbTime=0,n.end=r,n.ended=!1,n.xhrGuids={},n.lastSize=null,n.loadCaptureCalled=!1,t.addEventListener("load",function(e){a(n,t)},!1),m&&(m>34||m<10)||window.opera||t.addEventListener("progress",function(t){n.lastSize=t.loaded},!1)}),d.on("open-xhr-start",function(t){this.params={method:t[0]},i(this,t[1]),this.metrics={}}),d.on("open-xhr-end",function(t,n){"loader_config"in NREUM&&"xpid"in NREUM.loader_config&&this.sameOrigin&&n.setRequestHeader("X-NewRelic-ID",NREUM.loader_config.xpid);var e=!1;if("init"in NREUM&&"distributed_tracing"in NREUM.init&&(e=!!NREUM.init.distributed_tracing.enabled),e&&this.sameOrigin){var r=u();r&&n.setRequestHeader("newrelic",r)}}),d.on("send-xhr-start",function(t,n){var e=this.metrics,r=t[0],o=this;if(e&&r){var i=w(r);i&&(e.txSize=i)}this.startTime=s.now(),this.listener=function(t){try{"abort"!==t.type||o.loadCaptureCalled||(o.params.aborted=!0),("load"!==t.type||o.called===o.totalCbs&&(o.onloadCalled||"function"!=typeof n.onload))&&o.end(n)}catch(e){try{d.emit("internal-error",[e])}catch(r){}}};for(var a=0;a<p;a++)n.addEventListener(l[a],this.listener,!1)}),d.on("xhr-cb-time",function(t,n,e){this.cbTime+=t,n?this.onloadCalled=!0:this.called+=1,this.called!==this.totalCbs||!this.onloadCalled&&"function"==typeof e.onload||this.end(e)}),d.on("xhr-load-added",function(t,n){var e=""+h(t)+!!n;this.xhrGuids&&!this.xhrGuids[e]&&(this.xhrGuids[e]=!0,this.totalCbs+=1)}),d.on("xhr-load-removed",function(t,n){var e=""+h(t)+!!n;this.xhrGuids&&this.xhrGuids[e]&&(delete this.xhrGuids[e],this.totalCbs-=1)}),d.on("addEventListener-end",function(t,n){n instanceof v&&"load"===t[0]&&d.emit("xhr-load-added",[t[1],t[2]],n)}),d.on("removeEventListener-end",function(t,n){n instanceof v&&"load"===t[0]&&d.emit("xhr-load-removed",[t[1],t[2]],n)}),d.on("fn-start",function(t,n,e){n instanceof v&&("onload"===e&&(this.onload=!0),("load"===(t[0]&&t[0].type)||this.onload)&&(this.xhrCbStart=s.now()))}),d.on("fn-end",function(t,n){this.xhrCbStart&&d.emit("xhr-cb-time",[s.now()-this.xhrCbStart,this.onload,n],n)})}},{}],12:[function(t,n,e){n.exports=function(t){var n=document.createElement("a"),e=window.location,r={};n.href=t,r.port=n.port;var o=n.href.split("://");!r.port&&o[1]&&(r.port=o[1].split("/")[0].split("@").pop().split(":")[1]),r.port&&"0"!==r.port||(r.port="https"===o[0]?"443":"80"),r.hostname=n.hostname||e.hostname,r.pathname=n.pathname,r.protocol=o[0],"/"!==r.pathname.charAt(0)&&(r.pathname="/"+r.pathname);var i=!n.protocol||":"===n.protocol||n.protocol===e.protocol,a=n.hostname===document.domain&&n.port===e.port;return r.sameOrigin=i&&(!n.hostname||a),r}},{}],13:[function(t,n,e){function r(){}function o(t,n,e){return function(){return i(t,[f.now()].concat(s(arguments)),n?null:this,e),n?void 0:this}}var i=t("handle"),a=t(18),s=t(19),c=t("ee").get("tracer"),f=t("loader"),u=NREUM;"undefined"==typeof window.newrelic&&(newrelic=u);var d=["setPageViewName","setCustomAttribute","setErrorHandler","finished","addToTrace","inlineHit","addRelease"],l="api-",p=l+"ixn-";a(d,function(t,n){u[n]=o(l+n,!0,"api")}),u.addPageAction=o(l+"addPageAction",!0),u.setCurrentRouteName=o(l+"routeName",!0),n.exports=newrelic,u.interaction=function(){return(new r).get()};var h=r.prototype={createTracer:function(t,n){var e={},r=this,o="function"==typeof n;return i(p+"tracer",[f.now(),t,e],r),function(){if(c.emit((o?"":"no-")+"fn-start",[f.now(),r,o],e),o)try{return n.apply(this,arguments)}catch(t){throw c.emit("fn-err",[arguments,this,t],e),t}finally{c.emit("fn-end",[f.now()],e)}}}};a("actionText,setName,setAttribute,save,ignore,onEnd,getContext,end,get".split(","),function(t,n){h[n]=o(p+n)}),newrelic.noticeError=function(t,n){"string"==typeof t&&(t=new Error(t)),i("err",[t,f.now(),!1,n])}},{}],14:[function(t,n,e){n.exports=function(t){if("string"==typeof t&&t.length)return t.length;if("object"==typeof t){if("undefined"!=typeof ArrayBuffer&&t instanceof ArrayBuffer&&t.byteLength)return t.byteLength;if("undefined"!=typeof Blob&&t instanceof Blob&&t.size)return t.size;if(!("undefined"!=typeof FormData&&t instanceof FormData))try{return JSON.stringify(t).length}catch(n){return}}}},{}],15:[function(t,n,e){var r=0,o=navigator.userAgent.match(/Firefox[\/\s](\d+\.\d+)/);o&&(r=+o[1]),n.exports=r},{}],16:[function(t,n,e){function r(){function t(){return n?15&n[e++]:16*Math.random()|0}var n=null,e=0,r=window.crypto||window.msCrypto;r&&r.getRandomValues&&(n=r.getRandomValues(new Uint8Array(31)));for(var o,i="xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx",a="",s=0;s<i.length;s++)o=i[s],"x"===o?a+=t().toString(16):"y"===o?(o=3&t()|8,a+=o.toString(16)):a+=o;return a}function o(){function t(){return n?15&n[e++]:16*Math.random()|0}var n=null,e=0,r=window.crypto||window.msCrypto;r&&r.getRandomValues&&Uint8Array&&(n=r.getRandomValues(new Uint8Array(31)));for(var o=[],i=0;i<16;i++)o.push(t().toString(16));return o.join("")}n.exports={generateUuid:r,generateCatId:o}},{}],17:[function(t,n,e){function r(t,n){if(!o)return!1;if(t!==o)return!1;if(!n)return!0;if(!i)return!1;for(var e=i.split("."),r=n.split("."),a=0;a<r.length;a++)if(r[a]!==e[a])return!1;return!0}var o=null,i=null,a=/Version\/(\S+)\s+Safari/;if(navigator.userAgent){var s=navigator.userAgent,c=s.match(a);c&&s.indexOf("Chrome")===-1&&s.indexOf("Chromium")===-1&&(o="Safari",i=c[1])}n.exports={agent:o,version:i,match:r}},{}],18:[function(t,n,e){function r(t,n){var e=[],r="",i=0;for(r in t)o.call(t,r)&&(e[i]=n(r,t[r]),i+=1);return e}var o=Object.prototype.hasOwnProperty;n.exports=r},{}],19:[function(t,n,e){function r(t,n,e){n||(n=0),"undefined"==typeof e&&(e=t?t.length:0);for(var r=-1,o=e-n||0,i=Array(o<0?0:o);++r<o;)i[r]=t[n+r];return i}n.exports=r},{}],20:[function(t,n,e){n.exports={exists:"undefined"!=typeof window.performance&&window.performance.timing&&"undefined"!=typeof window.performance.timing.navigationStart}},{}],21:[function(t,n,e){function r(t){return!(t&&t instanceof Function&&t.apply&&!t[a])}var o=t("ee"),i=t(19),a="nr@original",s=Object.prototype.hasOwnProperty,c=!1;n.exports=function(t,n){function e(t,n,e,o){function nrWrapper(){var r,a,s,c;try{a=this,r=i(arguments),s="function"==typeof e?e(r,a):e||{}}catch(f){l([f,"",[r,a,o],s])}u(n+"start",[r,a,o],s);try{return c=t.apply(a,r)}catch(d){throw u(n+"err",[r,a,d],s),d}finally{u(n+"end",[r,a,c],s)}}return r(t)?t:(n||(n=""),nrWrapper[a]=t,d(t,nrWrapper),nrWrapper)}function f(t,n,o,i){o||(o="");var a,s,c,f="-"===o.charAt(0);for(c=0;c<n.length;c++)s=n[c],a=t[s],r(a)||(t[s]=e(a,f?s+o:o,i,s))}function u(e,r,o){if(!c||n){var i=c;c=!0;try{t.emit(e,r,o,n)}catch(a){l([a,e,r,o])}c=i}}function d(t,n){if(Object.defineProperty&&Object.keys)try{var e=Object.keys(t);return e.forEach(function(e){Object.defineProperty(n,e,{get:function(){return t[e]},set:function(n){return t[e]=n,n}})}),n}catch(r){l([r])}for(var o in t)s.call(t,o)&&(n[o]=t[o]);return n}function l(n){try{t.emit("internal-error",n)}catch(e){}}return t||(t=o),e.inPlace=f,e.flag=a,e}},{}],ee:[function(t,n,e){function r(){}function o(t){function n(t){return t&&t instanceof r?t:t?c(t,s,i):i()}function e(e,r,o,i){if(!l.aborted||i){t&&t(e,r,o);for(var a=n(o),s=m(e),c=s.length,f=0;f<c;f++)s[f].apply(a,r);var d=u[g[e]];return d&&d.push([x,e,r,a]),a}}function p(t,n){y[t]=m(t).concat(n)}function h(t,n){var e=y[t];if(e)for(var r=0;r<e.length;r++)e[r]===n&&e.splice(r,1)}function m(t){return y[t]||[]}function w(t){return d[t]=d[t]||o(e)}function v(t,n){f(t,function(t,e){n=n||"feature",g[e]=n,n in u||(u[n]=[])})}var y={},g={},x={on:p,addEventListener:p,removeEventListener:h,emit:e,get:w,listeners:m,context:n,buffer:v,abort:a,aborted:!1};return x}function i(){return new r}function a(){(u.api||u.feature)&&(l.aborted=!0,u=l.backlog={})}var s="nr@context",c=t("gos"),f=t(18),u={},d={},l=n.exports=o();l.backlog=u},{}],gos:[function(t,n,e){function r(t,n,e){if(o.call(t,n))return t[n];var r=e();if(Object.defineProperty&&Object.keys)try{return Object.defineProperty(t,n,{value:r,writable:!0,enumerable:!1}),r}catch(i){}return t[n]=r,r}var o=Object.prototype.hasOwnProperty;n.exports=r},{}],handle:[function(t,n,e){function r(t,n,e,r){o.buffer([t],r),o.emit(t,n,e)}var o=t("ee").get("handle");n.exports=r,r.ee=o},{}],id:[function(t,n,e){function r(t){var n=typeof t;return!t||"object"!==n&&"function"!==n?-1:t===window?0:a(t,i,function(){return o++})}var o=1,i="nr@id",a=t("gos");n.exports=r},{}],loader:[function(t,n,e){function r(){if(!E++){var t=b.info=NREUM.info,n=p.getElementsByTagName("script")[0];if(setTimeout(u.abort,3e4),!(t&&t.licenseKey&&t.applicationID&&n))return u.abort();f(g,function(n,e){t[n]||(t[n]=e)}),c("mark",["onload",a()+b.offset],null,"api");var e=p.createElement("script");e.src="https://"+t.agent,n.parentNode.insertBefore(e,n)}}function o(){"complete"===p.readyState&&i()}function i(){c("mark",["domContent",a()+b.offset],null,"api")}function a(){return R.exists&&performance.now?Math.round(performance.now()):(s=Math.max((new Date).getTime(),s))-b.offset}var s=(new Date).getTime(),c=t("handle"),f=t(18),u=t("ee"),d=t(17),l=window,p=l.document,h="addEventListener",m="attachEvent",w=l.XMLHttpRequest,v=w&&w.prototype;NREUM.o={ST:setTimeout,SI:l.setImmediate,CT:clearTimeout,XHR:w,REQ:l.Request,EV:l.Event,PR:l.Promise,MO:l.MutationObserver};var y=""+location,g={beacon:"bam.nr-data.net",errorBeacon:"bam.nr-data.net",agent:"js-agent.newrelic.com/nr-1123.min.js"},x=w&&v&&v[h]&&!/CriOS/.test(navigator.userAgent),b=n.exports={offset:s,now:a,origin:y,features:{},xhrWrappable:x,userAgent:d};t(13),p[h]?(p[h]("DOMContentLoaded",i,!1),l[h]("load",r,!1)):(p[m]("onreadystatechange",o),l[m]("onload",r)),c("mark",["firstbyte",s],null,"api");var E=0,R=t(20)},{}]},{},["loader",2,11,4,3]);</script><script type="text/javascript">window.NREUM||(NREUM={});NREUM.info={"beacon":"bam.nr-data.net","errorBeacon":"bam.nr-data.net","licenseKey":"8d5fb92f6e","applicationID":"2098939","transactionName":"ZwMAYEdSCktRWxZRXV5JJEFbUBBRX1ZNSEBfBA5RWEABTB5OC11FQ0gGUUFSDVQeSRddQUQPDVpqVwFMUVEOAmNFAxFAXFwKfFVMA1FeZg8HQxtUAUw=","queueTime":0,"applicationTime":42,"agent":""}</script>
    <title>(3) Maximum Depth of Binary Tree - LeetCode</title>
    <meta property="og:title" content="">

    
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, viewport-fit=cover" name="viewport">
    
    <meta name="description" content="Level up your coding skills and quickly land a job. This is the best place to expand your knowledge and get prepared for your next interview.">
    
    <meta property="og:image" content="/static/images/LeetCode_Sharing.png">
    <meta property="og:description" content="Level up your coding skills and quickly land a job. This is the best place to expand your knowledge and get prepared for your next interview.">

    

    <link rel="apple-touch-icon" sizes="57x57" href="https://leetcode.com/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="https://leetcode.com/apple-touch-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="https://leetcode.com/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="https://leetcode.com/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="https://leetcode.com/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="https://leetcode.com/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="https://leetcode.com/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="https://leetcode.com/apple-touch-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="https://leetcode.com/apple-touch-icon-180x180.png">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-16x16.png" sizes="16x16">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-32x32.png" sizes="32x32">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-96x96.png" sizes="96x96">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-160x160.png" sizes="160x160">
    <link rel="icon" type="image/png" href="https://leetcode.com/favicon-192x192.png" sizes="192x192">
    <meta name="application-name" content="LeetCode">
    <meta name="msapplication-TileColor" content="#da532c">
    <meta name="msapplication-TileImage" content="/mstile-144x144.png">

    

    <script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o)
  ,m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a
  ,m)})(window,document,'script','//www.google-analytics.com/analytics.js','ga'
  );
  ga('create', 'UA-6849839-6', 'leetcode.com');
  ga('require', 'displayfeatures');
  ga('send', 'pageview');
</script>

    


<style>
  #app {
    height: 100%;
    width: 100%;
    overflow-y: auto;
  }
</style>

    
  <style type="text/css">/**
 * React Select
 * ============
 * Created by Jed Watson and Joss Mackison for KeystoneJS, http://www.keystonejs.com/
 * https://twitter.com/jedwatson https://twitter.com/jossmackison https://twitter.com/keystonejs
 * MIT License: https://github.com/JedWatson/react-select
*/
.Select {
  position: relative;
}
.Select input::-webkit-contacts-auto-fill-button,
.Select input::-webkit-credentials-auto-fill-button {
  display: none !important;
}
.Select input::-ms-clear {
  display: none !important;
}
.Select input::-ms-reveal {
  display: none !important;
}
.Select,
.Select div,
.Select input,
.Select span {
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.Select.is-disabled .Select-arrow-zone {
  cursor: default;
  pointer-events: none;
  opacity: 0.35;
}
.Select.is-disabled > .Select-control {
  background-color: #f9f9f9;
}
.Select.is-disabled > .Select-control:hover {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.Select.is-open > .Select-control {
  border-bottom-right-radius: 0;
  border-bottom-left-radius: 0;
  background: #fff;
  border-color: #b3b3b3 #ccc #d9d9d9;
}
.Select.is-open > .Select-control .Select-arrow {
  top: -2px;
  border-color: transparent transparent #999;
  border-width: 0 5px 5px;
}
.Select.is-searchable.is-open > .Select-control {
  cursor: text;
}
.Select.is-searchable.is-focused:not(.is-open) > .Select-control {
  cursor: text;
}
.Select.is-focused > .Select-control {
  background: #fff;
}
.Select.is-focused:not(.is-open) > .Select-control {
  border-color: #007eff;
  -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 0 3px rgba(0, 126, 255, 0.1);
          box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 0 3px rgba(0, 126, 255, 0.1);
  background: #fff;
}
.Select.has-value.is-clearable.Select--single > .Select-control .Select-value {
  padding-right: 42px;
}
.Select.has-value.Select--single > .Select-control .Select-value .Select-value-label,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value .Select-value-label {
  color: #333;
}
.Select.has-value.Select--single > .Select-control .Select-value a.Select-value-label,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value a.Select-value-label {
  cursor: pointer;
  text-decoration: none;
}
.Select.has-value.Select--single > .Select-control .Select-value a.Select-value-label:hover,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value a.Select-value-label:hover,
.Select.has-value.Select--single > .Select-control .Select-value a.Select-value-label:focus,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value a.Select-value-label:focus {
  color: #007eff;
  outline: none;
  text-decoration: underline;
}
.Select.has-value.Select--single > .Select-control .Select-value a.Select-value-label:focus,
.Select.has-value.is-pseudo-focused.Select--single > .Select-control .Select-value a.Select-value-label:focus {
  background: #fff;
}
.Select.has-value.is-pseudo-focused .Select-input {
  opacity: 0;
}
.Select.is-open .Select-arrow,
.Select .Select-arrow-zone:hover > .Select-arrow {
  border-top-color: #666;
}
.Select.Select--rtl {
  direction: rtl;
  text-align: right;
}
.Select-control {
  background-color: #fff;
  border-color: #d9d9d9 #ccc #b3b3b3;
  border-radius: 4px;
  border: 1px solid #ccc;
  color: #333;
  cursor: default;
  display: table;
  border-spacing: 0;
  border-collapse: separate;
  height: 36px;
  outline: none;
  overflow: hidden;
  position: relative;
  width: 100%;
}
.Select-control:hover {
  -webkit-box-shadow: 0 1px 0 rgba(0, 0, 0, 0.06);
          box-shadow: 0 1px 0 rgba(0, 0, 0, 0.06);
}
.Select-control .Select-input:focus {
  outline: none;
  background: #fff;
}
.Select-placeholder,
.Select--single > .Select-control .Select-value {
  bottom: 0;
  color: #aaa;
  left: 0;
  line-height: 34px;
  padding-left: 10px;
  padding-right: 10px;
  position: absolute;
  right: 0;
  top: 0;
  max-width: 100%;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.Select-input {
  height: 34px;
  padding-left: 10px;
  padding-right: 10px;
  vertical-align: middle;
}
.Select-input > input {
  width: 100%;
  background: none transparent;
  border: 0 none;
  -webkit-box-shadow: none;
          box-shadow: none;
  cursor: default;
  display: inline-block;
  font-family: inherit;
  font-size: inherit;
  margin: 0;
  outline: none;
  line-height: 17px;
  /* For IE 8 compatibility */
  padding: 8px 0 12px;
  /* For IE 8 compatibility */
  -webkit-appearance: none;
}
.is-focused .Select-input > input {
  cursor: text;
}
.has-value.is-pseudo-focused .Select-input {
  opacity: 0;
}
.Select-control:not(.is-searchable) > .Select-input {
  outline: none;
}
.Select-loading-zone {
  cursor: pointer;
  display: table-cell;
  position: relative;
  text-align: center;
  vertical-align: middle;
  width: 16px;
}
.Select-loading {
  -webkit-animation: Select-animation-spin 400ms infinite linear;
  animation: Select-animation-spin 400ms infinite linear;
  width: 16px;
  height: 16px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  border-radius: 50%;
  border: 2px solid #ccc;
  border-right-color: #333;
  display: inline-block;
  position: relative;
  vertical-align: middle;
}
.Select-clear-zone {
  -webkit-animation: Select-animation-fadeIn 200ms;
  animation: Select-animation-fadeIn 200ms;
  color: #999;
  cursor: pointer;
  display: table-cell;
  position: relative;
  text-align: center;
  vertical-align: middle;
  width: 17px;
}
.Select-clear-zone:hover {
  color: #D0021B;
}
.Select-clear {
  display: inline-block;
  font-size: 18px;
  line-height: 1;
}
.Select--multi .Select-clear-zone {
  width: 17px;
}
.Select-arrow-zone {
  cursor: pointer;
  display: table-cell;
  position: relative;
  text-align: center;
  vertical-align: middle;
  width: 25px;
  padding-right: 5px;
}
.Select--rtl .Select-arrow-zone {
  padding-right: 0;
  padding-left: 5px;
}
.Select-arrow {
  border-color: #999 transparent transparent;
  border-style: solid;
  border-width: 5px 5px 2.5px;
  display: inline-block;
  height: 0;
  width: 0;
  position: relative;
}
.Select-control > *:last-child {
  padding-right: 5px;
}
.Select--multi .Select-multi-value-wrapper {
  display: inline-block;
}
.Select .Select-aria-only {
  position: absolute;
  display: inline-block;
  height: 1px;
  width: 1px;
  margin: -1px;
  clip: rect(0, 0, 0, 0);
  overflow: hidden;
  float: left;
}
@-webkit-keyframes Select-animation-fadeIn {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}
@keyframes Select-animation-fadeIn {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}
.Select-menu-outer {
  border-bottom-right-radius: 4px;
  border-bottom-left-radius: 4px;
  background-color: #fff;
  border: 1px solid #ccc;
  border-top-color: #e6e6e6;
  -webkit-box-shadow: 0 1px 0 rgba(0, 0, 0, 0.06);
          box-shadow: 0 1px 0 rgba(0, 0, 0, 0.06);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin-top: -1px;
  max-height: 200px;
  position: absolute;
  left: 0;
  top: 100%;
  width: 100%;
  z-index: 1;
  -webkit-overflow-scrolling: touch;
}
.Select-menu {
  max-height: 198px;
  overflow-y: auto;
}
.Select-option {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  background-color: #fff;
  color: #666666;
  cursor: pointer;
  display: block;
  padding: 8px 10px;
}
.Select-option:last-child {
  border-bottom-right-radius: 4px;
  border-bottom-left-radius: 4px;
}
.Select-option.is-selected {
  background-color: #f5faff;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 126, 255, 0.04);
  color: #333;
}
.Select-option.is-focused {
  background-color: #ebf5ff;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 126, 255, 0.08);
  color: #333;
}
.Select-option.is-disabled {
  color: #cccccc;
  cursor: default;
}
.Select-noresults {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  color: #999999;
  cursor: default;
  display: block;
  padding: 8px 10px;
}
.Select--multi .Select-input {
  vertical-align: middle;
  margin-left: 10px;
  padding: 0;
}
.Select--multi.Select--rtl .Select-input {
  margin-left: 0;
  margin-right: 10px;
}
.Select--multi.has-value .Select-input {
  margin-left: 5px;
}
.Select--multi .Select-value {
  background-color: #ebf5ff;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 126, 255, 0.08);
  border-radius: 2px;
  border: 1px solid #c2e0ff;
  /* Fallback color for IE 8 */
  border: 1px solid rgba(0, 126, 255, 0.24);
  color: #007eff;
  display: inline-block;
  font-size: 0.9em;
  line-height: 1.4;
  margin-left: 5px;
  margin-top: 5px;
  vertical-align: top;
}
.Select--multi .Select-value-icon,
.Select--multi .Select-value-label {
  display: inline-block;
  vertical-align: middle;
}
.Select--multi .Select-value-label {
  border-bottom-right-radius: 2px;
  border-top-right-radius: 2px;
  cursor: default;
  padding: 2px 5px;
}
.Select--multi a.Select-value-label {
  color: #007eff;
  cursor: pointer;
  text-decoration: none;
}
.Select--multi a.Select-value-label:hover {
  text-decoration: underline;
}
.Select--multi .Select-value-icon {
  cursor: pointer;
  border-bottom-left-radius: 2px;
  border-top-left-radius: 2px;
  border-right: 1px solid #c2e0ff;
  /* Fallback color for IE 8 */
  border-right: 1px solid rgba(0, 126, 255, 0.24);
  padding: 1px 5px 3px;
}
.Select--multi .Select-value-icon:hover,
.Select--multi .Select-value-icon:focus {
  background-color: #d8eafd;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 113, 230, 0.08);
  color: #0071e6;
}
.Select--multi .Select-value-icon:active {
  background-color: #c2e0ff;
  /* Fallback color for IE 8 */
  background-color: rgba(0, 126, 255, 0.24);
}
.Select--multi.Select--rtl .Select-value {
  margin-left: 0;
  margin-right: 5px;
}
.Select--multi.Select--rtl .Select-value-icon {
  border-right: none;
  border-left: 1px solid #c2e0ff;
  /* Fallback color for IE 8 */
  border-left: 1px solid rgba(0, 126, 255, 0.24);
}
.Select--multi.is-disabled .Select-value {
  background-color: #fcfcfc;
  border: 1px solid #e3e3e3;
  color: #333;
}
.Select--multi.is-disabled .Select-value-icon {
  cursor: not-allowed;
  border-right: 1px solid #e3e3e3;
}
.Select--multi.is-disabled .Select-value-icon:hover,
.Select--multi.is-disabled .Select-value-icon:focus,
.Select--multi.is-disabled .Select-value-icon:active {
  background-color: #fcfcfc;
}
@keyframes Select-animation-spin {
  to {
    -webkit-transform: rotate(1turn);
            transform: rotate(1turn);
  }
}
@-webkit-keyframes Select-animation-spin {
  to {
    -webkit-transform: rotate(1turn);
  }
}
</style><style type="text/css">.rc-dialog {
  position: relative;
  width: auto;
  margin: 10px;
}
.rc-dialog-wrap {
  position: fixed;
  overflow: auto;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1050;
  -webkit-overflow-scrolling: touch;
  outline: 0;
}
.rc-dialog-content {
  position: relative;
  background-color: #fff;
  border: 1px solid #999;
  border: 1px solid rgba(0, 0, 0, 0.2);
  border-radius: 6px;
  -webkit-box-shadow: 0 3px 9px rgba(0, 0, 0, 0.5);
          box-shadow: 0 3px 9px rgba(0, 0, 0, 0.5);
  background-clip: padding-box;
  outline: 0;
}
.rc-dialog-header {
  padding: 15px;
  border-bottom: 1px solid #e5e5e5;
}
.rc-dialog-close {
  cursor: pointer;
  border: 0;
  background: transparent;
  font-size: 21px;
  position: absolute;
  right: 20px;
  top: 12px;
  font-weight: 700;
  line-height: 1;
  color: #000;
  text-shadow: 0 1px 0 #fff;
  filter: alpha(opacity=20);
  opacity: .2;
  text-decoration: none;
}
.rc-dialog-close-x:after {
  content: '\D7';
}
.rc-dialog-close:hover {
  opacity: 1;
  filter: alpha(opacity=100);
  text-decoration: none;
}
.rc-dialog-title {
  margin: 0;
  line-height: 1.42857143;
}
.rc-dialog-body {
  position: relative;
  padding: 15px;
}
.rc-dialog-footer {
  padding: 15px;
  text-align: right;
  border-top: 1px solid #e5e5e5;
}
.rc-dialog-footer .btn + .btn {
  margin-left: 5px;
  margin-bottom: 0;
}
.rc-dialog-footer .btn-group .btn + .btn {
  margin-left: -1px;
}
.rc-dialog-footer .btn-block + .btn-block {
  margin-left: 0;
}
@media (min-width: 768px) {
  .rc-dialog {
    width: 600px;
    margin: 30px auto;
  }
  .rc-dialog-content {
    -webkit-box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.5);
  }
}
.rc-dialog-slide-fade-enter,
.rc-dialog-slide-fade-appear {
  -webkit-transform: translate(0, -25%);
          transform: translate(0, -25%);
}
.rc-dialog-slide-fade-enter,
.rc-dialog-slide-fade-appear,
.rc-dialog-slide-fade-leave {
  -webkit-animation-duration: .3s;
          animation-duration: .3s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: ease-out;
          animation-timing-function: ease-out;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.rc-dialog-slide-fade-enter.rc-dialog-slide-fade-enter-active,
.rc-dialog-slide-fade-appear.rc-dialog-slide-fade-appear-active {
  -webkit-animation-name: rcDialogSlideFadeIn;
          animation-name: rcDialogSlideFadeIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.rc-dialog-slide-fade-leave.rc-dialog-slide-fade-leave-active {
  -webkit-animation-name: rcDialogSlideFadeOut;
          animation-name: rcDialogSlideFadeOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
@-webkit-keyframes rcDialogSlideFadeIn {
  0% {
    -webkit-transform: translate(0, -25%);
            transform: translate(0, -25%);
  }
  100% {
    -webkit-transform: translate(0, 0);
            transform: translate(0, 0);
  }
}
@keyframes rcDialogSlideFadeIn {
  0% {
    -webkit-transform: translate(0, -25%);
            transform: translate(0, -25%);
  }
  100% {
    -webkit-transform: translate(0, 0);
            transform: translate(0, 0);
  }
}
@-webkit-keyframes rcDialogSlideFadeOut {
  0% {
    -webkit-transform: translate(0, 0);
            transform: translate(0, 0);
  }
  100% {
    -webkit-transform: translate(0, -25%);
            transform: translate(0, -25%);
  }
}
@keyframes rcDialogSlideFadeOut {
  0% {
    -webkit-transform: translate(0, 0);
            transform: translate(0, 0);
  }
  100% {
    -webkit-transform: translate(0, -25%);
            transform: translate(0, -25%);
  }
}
.rc-dialog-mask {
  position: fixed;
  top: 0;
  right: 0;
  left: 0;
  bottom: 0;
  background-color: #373737;
  background-color: rgba(55, 55, 55, 0.6);
  height: 100%;
  filter: alpha(opacity=50);
  z-index: 1050;
}
.rc-dialog-mask-hidden {
  display: none;
}
.rc-dialog-fade-enter,
.rc-dialog-fade-appear {
  opacity: 0;
  -webkit-animation-duration: 0.3s;
          animation-duration: 0.3s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: cubic-bezier(0.55, 0, 0.55, 0.2);
          animation-timing-function: cubic-bezier(0.55, 0, 0.55, 0.2);
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.rc-dialog-fade-leave {
  -webkit-animation-duration: 0.3s;
          animation-duration: 0.3s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: cubic-bezier(0.55, 0, 0.55, 0.2);
          animation-timing-function: cubic-bezier(0.55, 0, 0.55, 0.2);
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.rc-dialog-fade-enter.rc-dialog-fade-enter-active,
.rc-dialog-fade-appear.rc-dialog-fade-appear-active {
  -webkit-animation-name: rcDialogFadeIn;
          animation-name: rcDialogFadeIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.rc-dialog-fade-leave.rc-dialog-fade-leave-active {
  -webkit-animation-name: rcDialogFadeOut;
          animation-name: rcDialogFadeOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
@-webkit-keyframes rcDialogFadeIn {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
@keyframes rcDialogFadeIn {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
@-webkit-keyframes rcDialogFadeOut {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
@keyframes rcDialogFadeOut {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
</style><style type="text/css">.ReactTable{position:relative;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;border:1px solid rgba(0,0,0,0.1);}.ReactTable *{-webkit-box-sizing:border-box;box-sizing:border-box}.ReactTable .rt-table{-webkit-box-flex:1;-ms-flex:auto 1;flex:auto 1;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-align:stretch;-ms-flex-align:stretch;align-items:stretch;width:100%;border-collapse:collapse;overflow:auto}.ReactTable .rt-thead{-webkit-box-flex:1;-ms-flex:1 0 auto;flex:1 0 auto;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;}.ReactTable .rt-thead.-headerGroups{background:rgba(0,0,0,0.03);border-bottom:1px solid rgba(0,0,0,0.05)}.ReactTable .rt-thead.-filters{border-bottom:1px solid rgba(0,0,0,0.05);}.ReactTable .rt-thead.-filters input,.ReactTable .rt-thead.-filters select{border:1px solid rgba(0,0,0,0.1);background:#fff;padding:5px 7px;font-size:inherit;border-radius:3px;font-weight:normal;outline:none}.ReactTable .rt-thead.-filters .rt-th{border-right:1px solid rgba(0,0,0,0.02)}.ReactTable .rt-thead.-header{-webkit-box-shadow:0 2px 15px 0 rgba(0,0,0,0.15);box-shadow:0 2px 15px 0 rgba(0,0,0,0.15)}.ReactTable .rt-thead .rt-tr{text-align:center}.ReactTable .rt-thead .rt-th,.ReactTable .rt-thead .rt-td{padding:5px 5px;line-height:normal;position:relative;border-right:1px solid rgba(0,0,0,0.05);-webkit-transition:-webkit-box-shadow .3s cubic-bezier(.175,.885,.32,1.275);transition:-webkit-box-shadow .3s cubic-bezier(.175,.885,.32,1.275);-o-transition:box-shadow .3s cubic-bezier(.175,.885,.32,1.275);transition:box-shadow .3s cubic-bezier(.175,.885,.32,1.275);transition:box-shadow .3s cubic-bezier(.175,.885,.32,1.275), -webkit-box-shadow .3s cubic-bezier(.175,.885,.32,1.275);-webkit-box-shadow:inset 0 0 0 0 transparent;box-shadow:inset 0 0 0 0 transparent;}.ReactTable .rt-thead .rt-th.-sort-asc,.ReactTable .rt-thead .rt-td.-sort-asc{-webkit-box-shadow:inset 0 3px 0 0 rgba(0,0,0,0.6);box-shadow:inset 0 3px 0 0 rgba(0,0,0,0.6)}.ReactTable .rt-thead .rt-th.-sort-desc,.ReactTable .rt-thead .rt-td.-sort-desc{-webkit-box-shadow:inset 0 -3px 0 0 rgba(0,0,0,0.6);box-shadow:inset 0 -3px 0 0 rgba(0,0,0,0.6)}.ReactTable .rt-thead .rt-th.-cursor-pointer,.ReactTable .rt-thead .rt-td.-cursor-pointer{cursor:pointer}.ReactTable .rt-thead .rt-th:last-child,.ReactTable .rt-thead .rt-td:last-child{border-right:0}.ReactTable .rt-thead .rt-resizable-header{overflow:visible;}.ReactTable .rt-thead .rt-resizable-header:last-child{overflow:hidden}.ReactTable .rt-thead .rt-resizable-header-content{overflow:hidden;-o-text-overflow:ellipsis;text-overflow:ellipsis}.ReactTable .rt-thead .rt-header-pivot{border-right-color:#f7f7f7}.ReactTable .rt-thead .rt-header-pivot:after,.ReactTable .rt-thead .rt-header-pivot:before{left:100%;top:50%;border:solid transparent;content:" ";height:0;width:0;position:absolute;pointer-events:none}.ReactTable .rt-thead .rt-header-pivot:after{border-color:rgba(255,255,255,0);border-left-color:#fff;border-width:8px;margin-top:-8px}.ReactTable .rt-thead .rt-header-pivot:before{border-color:rgba(102,102,102,0);border-left-color:#f7f7f7;border-width:10px;margin-top:-10px}.ReactTable .rt-tbody{-webkit-box-flex:99999;-ms-flex:99999 1 auto;flex:99999 1 auto;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;overflow:auto;}.ReactTable .rt-tbody .rt-tr-group{border-bottom:solid 1px rgba(0,0,0,0.05);}.ReactTable .rt-tbody .rt-tr-group:last-child{border-bottom:0}.ReactTable .rt-tbody .rt-td{border-right:1px solid rgba(0,0,0,0.02);}.ReactTable .rt-tbody .rt-td:last-child{border-right:0}.ReactTable .rt-tbody .rt-expandable{cursor:pointer;-o-text-overflow:clip;text-overflow:clip}.ReactTable .rt-tr-group{-webkit-box-flex:1;-ms-flex:1 0 auto;flex:1 0 auto;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-align:stretch;-ms-flex-align:stretch;align-items:stretch}.ReactTable .rt-tr{-webkit-box-flex:1;-ms-flex:1 0 auto;flex:1 0 auto;display:-webkit-inline-box;display:-ms-inline-flexbox;display:inline-flex}.ReactTable .rt-th,.ReactTable .rt-td{-webkit-box-flex:1;-ms-flex:1 0 0px;flex:1 0 0;white-space:nowrap;-o-text-overflow:ellipsis;text-overflow:ellipsis;padding:7px 5px;overflow:hidden;-webkit-transition:.3s ease;-o-transition:.3s ease;transition:.3s ease;-webkit-transition-property:width,min-width,padding,opacity;-o-transition-property:width,min-width,padding,opacity;transition-property:width,min-width,padding,opacity;}.ReactTable .rt-th.-hidden,.ReactTable .rt-td.-hidden{width:0 !important;min-width:0 !important;padding:0 !important;border:0 !important;opacity:0 !important}.ReactTable .rt-expander{display:inline-block;position:relative;margin:0;color:transparent;margin:0 10px;}.ReactTable .rt-expander:after{content:'';position:absolute;width:0;height:0;top:50%;left:50%;-webkit-transform:translate(-50%,-50%) rotate(-90deg);transform:translate(-50%,-50%) rotate(-90deg);border-left:5.04px solid transparent;border-right:5.04px solid transparent;border-top:7px solid rgba(0,0,0,0.8);-webkit-transition:all .3s cubic-bezier(.175,.885,.32,1.275);-o-transition:all .3s cubic-bezier(.175,.885,.32,1.275);transition:all .3s cubic-bezier(.175,.885,.32,1.275);cursor:pointer}.ReactTable .rt-expander.-open:after{-webkit-transform:translate(-50%,-50%) rotate(0);transform:translate(-50%,-50%) rotate(0)}.ReactTable .rt-resizer{display:inline-block;position:absolute;width:36px;top:0;bottom:0;right:-18px;cursor:col-resize;z-index:10}.ReactTable .rt-tfoot{-webkit-box-flex:1;-ms-flex:1 0 auto;flex:1 0 auto;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-ms-flex-direction:column;flex-direction:column;-webkit-box-shadow:0 0 15px 0 rgba(0,0,0,0.15);box-shadow:0 0 15px 0 rgba(0,0,0,0.15);}.ReactTable .rt-tfoot .rt-td{border-right:1px solid rgba(0,0,0,0.05);}.ReactTable .rt-tfoot .rt-td:last-child{border-right:0}.ReactTable.-striped .rt-tr.-odd{background:rgba(0,0,0,0.03)}.ReactTable.-highlight .rt-tbody .rt-tr:not(.-padRow):hover{background:rgba(0,0,0,0.05)}.ReactTable .-pagination{z-index:1;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-pack:justify;-ms-flex-pack:justify;justify-content:space-between;-webkit-box-align:stretch;-ms-flex-align:stretch;align-items:stretch;-ms-flex-wrap:wrap;flex-wrap:wrap;padding:3px;-webkit-box-shadow:0 0 15px 0 rgba(0,0,0,0.1);box-shadow:0 0 15px 0 rgba(0,0,0,0.1);border-top:2px solid rgba(0,0,0,0.1);}.ReactTable .-pagination input,.ReactTable .-pagination select{border:1px solid rgba(0,0,0,0.1);background:#fff;padding:5px 7px;font-size:inherit;border-radius:3px;font-weight:normal;outline:none}.ReactTable .-pagination .-btn{-webkit-appearance:none;-moz-appearance:none;appearance:none;display:block;width:100%;height:100%;border:0;border-radius:3px;padding:6px;font-size:1em;color:rgba(0,0,0,0.6);background:rgba(0,0,0,0.1);-webkit-transition:all .1s ease;-o-transition:all .1s ease;transition:all .1s ease;cursor:pointer;outline:none;}.ReactTable .-pagination .-btn[disabled]{opacity:.5;cursor:default}.ReactTable .-pagination .-btn:not([disabled]):hover{background:rgba(0,0,0,0.3);color:#fff}.ReactTable .-pagination .-previous,.ReactTable .-pagination .-next{-webkit-box-flex:1;-ms-flex:1;flex:1;text-align:center}.ReactTable .-pagination .-center{-webkit-box-flex:1.5;-ms-flex:1.5;flex:1.5;text-align:center;margin-bottom:0;display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-ms-flex-direction:row;flex-direction:row;-ms-flex-wrap:wrap;flex-wrap:wrap;-webkit-box-align:center;-ms-flex-align:center;align-items:center;-ms-flex-pack:distribute;justify-content:space-around}.ReactTable .-pagination .-pageInfo{display:inline-block;margin:3px 10px;white-space:nowrap}.ReactTable .-pagination .-pageJump{display:inline-block;}.ReactTable .-pagination .-pageJump input{width:70px;text-align:center}.ReactTable .-pagination .-pageSizeOptions{margin:3px 10px}.ReactTable .rt-noData{display:block;position:absolute;left:50%;top:50%;-webkit-transform:translate(-50%,-50%);transform:translate(-50%,-50%);background:rgba(255,255,255,0.8);-webkit-transition:all .3s ease;-o-transition:all .3s ease;transition:all .3s ease;z-index:1;pointer-events:none;padding:20px;color:rgba(0,0,0,0.5)}.ReactTable .-loading{display:block;position:absolute;left:0;right:0;top:0;bottom:0;background:rgba(255,255,255,0.8);-webkit-transition:all .3s ease;-o-transition:all .3s ease;transition:all .3s ease;z-index:-1;opacity:0;pointer-events:none;}.ReactTable .-loading > div{position:absolute;display:block;text-align:center;width:100%;top:50%;left:0;font-size:15px;color:rgba(0,0,0,0.6);-webkit-transform:translateY(-52%);transform:translateY(-52%);-webkit-transition:all .3s cubic-bezier(.25,.46,.45,.94);-o-transition:all .3s cubic-bezier(.25,.46,.45,.94);transition:all .3s cubic-bezier(.25,.46,.45,.94)}.ReactTable .-loading.-active{opacity:1;z-index:2;pointer-events:all;}.ReactTable .-loading.-active > div{-webkit-transform:translateY(50%);transform:translateY(50%)}.ReactTable .rt-resizing .rt-th,.ReactTable .rt-resizing .rt-td{-webkit-transition:none !important;-o-transition:none !important;transition:none !important;cursor:col-resize;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}</style><style type="text/css">.CodeMirror-foldmarker {
  color: blue;
  text-shadow: #b9f 1px 1px 2px, #b9f -1px -1px 2px, #b9f 1px -1px 2px, #b9f -1px 1px 2px;
  font-family: arial;
  line-height: .3;
  cursor: pointer;
}
.CodeMirror-foldgutter {
  width: .7em;
}
.CodeMirror-foldgutter-open,
.CodeMirror-foldgutter-folded {
  cursor: pointer;
}
.CodeMirror-foldgutter-open:after {
  content: "\25BE";
}
.CodeMirror-foldgutter-folded:after {
  content: "\25B8";
}
</style><style type="text/css">.CodeMirror-dialog {
  position: absolute;
  left: 0; right: 0;
  background: inherit;
  z-index: 15;
  padding: .1em .8em;
  overflow: hidden;
  color: inherit;
}

.CodeMirror-dialog-top {
  border-bottom: 1px solid #eee;
  top: 0;
}

.CodeMirror-dialog-bottom {
  border-top: 1px solid #eee;
  bottom: 0;
}

.CodeMirror-dialog input {
  border: none;
  outline: none;
  background: transparent;
  width: 20em;
  color: inherit;
  font-family: monospace;
}

.CodeMirror-dialog button {
  font-size: 70%;
}
</style><style type="text/css">/* BASICS */

.CodeMirror {
  /* Set height, width, borders, and global font properties here */
  font-family: monospace;
  height: 300px;
  color: black;
  direction: ltr;
}

/* PADDING */

.CodeMirror-lines {
  padding: 4px 0; /* Vertical padding around content */
}
.CodeMirror pre {
  padding: 0 4px; /* Horizontal padding of content */
}

.CodeMirror-scrollbar-filler, .CodeMirror-gutter-filler {
  background-color: white; /* The little square between H and V scrollbars */
}

/* GUTTER */

.CodeMirror-gutters {
  border-right: 1px solid #ddd;
  background-color: #f7f7f7;
  white-space: nowrap;
}
.CodeMirror-linenumbers {}
.CodeMirror-linenumber {
  padding: 0 3px 0 5px;
  min-width: 20px;
  text-align: right;
  color: #999;
  white-space: nowrap;
}

.CodeMirror-guttermarker { color: black; }
.CodeMirror-guttermarker-subtle { color: #999; }

/* CURSOR */

.CodeMirror-cursor {
  border-left: 1px solid black;
  border-right: none;
  width: 0;
}
/* Shown when moving in bi-directional text */
.CodeMirror div.CodeMirror-secondarycursor {
  border-left: 1px solid silver;
}
.cm-fat-cursor .CodeMirror-cursor {
  width: auto;
  border: 0 !important;
  background: #7e7;
}
.cm-fat-cursor div.CodeMirror-cursors {
  z-index: 1;
}
.cm-fat-cursor-mark {
  background-color: rgba(20, 255, 20, 0.5);
  -webkit-animation: blink 1.06s steps(1) infinite;
  animation: blink 1.06s steps(1) infinite;
}
.cm-animate-fat-cursor {
  width: auto;
  border: 0;
  -webkit-animation: blink 1.06s steps(1) infinite;
  animation: blink 1.06s steps(1) infinite;
  background-color: #7e7;
}
@-webkit-keyframes blink {
  0% {}
  50% { background-color: transparent; }
  100% {}
}
@keyframes blink {
  0% {}
  50% { background-color: transparent; }
  100% {}
}

/* Can style cursor different in overwrite (non-insert) mode */
.CodeMirror-overwrite .CodeMirror-cursor {}

.cm-tab { display: inline-block; text-decoration: inherit; }

.CodeMirror-rulers {
  position: absolute;
  left: 0; right: 0; top: -50px; bottom: -20px;
  overflow: hidden;
}
.CodeMirror-ruler {
  border-left: 1px solid #ccc;
  top: 0; bottom: 0;
  position: absolute;
}

/* DEFAULT THEME */

.cm-s-default .cm-header {color: blue;}
.cm-s-default .cm-quote {color: #090;}
.cm-negative {color: #d44;}
.cm-positive {color: #292;}
.cm-header, .cm-strong {font-weight: bold;}
.cm-em {font-style: italic;}
.cm-link {text-decoration: underline;}
.cm-strikethrough {text-decoration: line-through;}

.cm-s-default .cm-keyword {color: #708;}
.cm-s-default .cm-atom {color: #219;}
.cm-s-default .cm-number {color: #164;}
.cm-s-default .cm-def {color: #00f;}
.cm-s-default .cm-variable,
.cm-s-default .cm-punctuation,
.cm-s-default .cm-property,
.cm-s-default .cm-operator {}
.cm-s-default .cm-variable-2 {color: #05a;}
.cm-s-default .cm-variable-3, .cm-s-default .cm-type {color: #085;}
.cm-s-default .cm-comment {color: #a50;}
.cm-s-default .cm-string {color: #a11;}
.cm-s-default .cm-string-2 {color: #f50;}
.cm-s-default .cm-meta {color: #555;}
.cm-s-default .cm-qualifier {color: #555;}
.cm-s-default .cm-builtin {color: #30a;}
.cm-s-default .cm-bracket {color: #997;}
.cm-s-default .cm-tag {color: #170;}
.cm-s-default .cm-attribute {color: #00c;}
.cm-s-default .cm-hr {color: #999;}
.cm-s-default .cm-link {color: #00c;}

.cm-s-default .cm-error {color: #f00;}
.cm-invalidchar {color: #f00;}

.CodeMirror-composing { border-bottom: 2px solid; }

/* Default styles for common addons */

div.CodeMirror span.CodeMirror-matchingbracket {color: #0b0;}
div.CodeMirror span.CodeMirror-nonmatchingbracket {color: #a22;}
.CodeMirror-matchingtag { background: rgba(255, 150, 0, .3); }
.CodeMirror-activeline-background {background: #e8f2ff;}

/* STOP */

/* The rest of this file contains styles related to the mechanics of
   the editor. You probably shouldn't touch them. */

.CodeMirror {
  position: relative;
  overflow: hidden;
  background: white;
}

.CodeMirror-scroll {
  overflow: scroll !important; /* Things will break if this is overridden */
  /* 30px is the magic margin used to hide the element's real scrollbars */
  /* See overflow: hidden in .CodeMirror */
  margin-bottom: -30px; margin-right: -30px;
  padding-bottom: 30px;
  height: 100%;
  outline: none; /* Prevent dragging from highlighting the element */
  position: relative;
}
.CodeMirror-sizer {
  position: relative;
  border-right: 30px solid transparent;
}

/* The fake, visible scrollbars. Used to force redraw during scrolling
   before actual scrolling happens, thus preventing shaking and
   flickering artifacts. */
.CodeMirror-vscrollbar, .CodeMirror-hscrollbar, .CodeMirror-scrollbar-filler, .CodeMirror-gutter-filler {
  position: absolute;
  z-index: 6;
  display: none;
}
.CodeMirror-vscrollbar {
  right: 0; top: 0;
  overflow-x: hidden;
  overflow-y: scroll;
}
.CodeMirror-hscrollbar {
  bottom: 0; left: 0;
  overflow-y: hidden;
  overflow-x: scroll;
}
.CodeMirror-scrollbar-filler {
  right: 0; bottom: 0;
}
.CodeMirror-gutter-filler {
  left: 0; bottom: 0;
}

.CodeMirror-gutters {
  position: absolute; left: 0; top: 0;
  min-height: 100%;
  z-index: 3;
}
.CodeMirror-gutter {
  white-space: normal;
  height: 100%;
  display: inline-block;
  vertical-align: top;
  margin-bottom: -30px;
}
.CodeMirror-gutter-wrapper {
  position: absolute;
  z-index: 4;
  background: none !important;
  border: none !important;
}
.CodeMirror-gutter-background {
  position: absolute;
  top: 0; bottom: 0;
  z-index: 4;
}
.CodeMirror-gutter-elt {
  position: absolute;
  cursor: default;
  z-index: 4;
}
.CodeMirror-gutter-wrapper ::-moz-selection { background-color: transparent }
.CodeMirror-gutter-wrapper ::selection { background-color: transparent }
.CodeMirror-gutter-wrapper ::-moz-selection { background-color: transparent }

.CodeMirror-lines {
  cursor: text;
  min-height: 1px; /* prevents collapsing before first draw */
}
.CodeMirror pre {
  /* Reset some styles that the rest of the page might have set */ border-radius: 0;
  border-width: 0;
  background: transparent;
  font-family: inherit;
  font-size: inherit;
  margin: 0;
  white-space: pre;
  word-wrap: normal;
  line-height: inherit;
  color: inherit;
  z-index: 2;
  position: relative;
  overflow: visible;
  -webkit-tap-highlight-color: transparent;
  -webkit-font-variant-ligatures: contextual;
  font-variant-ligatures: contextual;
}
.CodeMirror-wrap pre {
  word-wrap: break-word;
  white-space: pre-wrap;
  word-break: normal;
}

.CodeMirror-linebackground {
  position: absolute;
  left: 0; right: 0; top: 0; bottom: 0;
  z-index: 0;
}

.CodeMirror-linewidget {
  position: relative;
  z-index: 2;
  padding: 0.1px; /* Force widget margins to stay inside of the container */
}

.CodeMirror-widget {}

.CodeMirror-rtl pre { direction: rtl; }

.CodeMirror-code {
  outline: none;
}

/* Force content-box sizing for the elements where we expect it */
.CodeMirror-scroll,
.CodeMirror-sizer,
.CodeMirror-gutter,
.CodeMirror-gutters,
.CodeMirror-linenumber {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
}

.CodeMirror-measure {
  position: absolute;
  width: 100%;
  height: 0;
  overflow: hidden;
  visibility: hidden;
}

.CodeMirror-cursor {
  position: absolute;
  pointer-events: none;
}
.CodeMirror-measure pre { position: static; }

div.CodeMirror-cursors {
  visibility: hidden;
  position: relative;
  z-index: 3;
}
div.CodeMirror-dragcursors {
  visibility: visible;
}

.CodeMirror-focused div.CodeMirror-cursors {
  visibility: visible;
}

.CodeMirror-selected { background: #d9d9d9; }
.CodeMirror-focused .CodeMirror-selected { background: #d7d4f0; }
.CodeMirror-crosshair { cursor: crosshair; }
.CodeMirror-line::-moz-selection, .CodeMirror-line > span::-moz-selection, .CodeMirror-line > span > span::-moz-selection { background: #d7d4f0; }
.CodeMirror-line::selection, .CodeMirror-line > span::selection, .CodeMirror-line > span > span::selection { background: #d7d4f0; }
.CodeMirror-line::-moz-selection, .CodeMirror-line > span::-moz-selection, .CodeMirror-line > span > span::-moz-selection { background: #d7d4f0; }

.cm-searching {
  background-color: #ffa;
  background-color: rgba(255, 255, 0, .4);
}

/* Used to force a border model for a node */
.cm-force-border { padding-right: .1px; }

@media print {
  /* Hide the cursor when printing */
  .CodeMirror div.CodeMirror-cursors {
    visibility: hidden;
  }
}

/* See issue #2901 */
.cm-tab-wrap-hack:after { content: ''; }

/* Help users use markselection to safely style text background */
span.CodeMirror-selectedtext { background: none; }
</style><style type="text/css">/* Based on Sublime Text's Monokai theme */

.cm-s-monokai.CodeMirror { background: #272822; color: #f8f8f2; }
.cm-s-monokai div.CodeMirror-selected { background: #49483E; }
.cm-s-monokai .CodeMirror-line::-moz-selection, .cm-s-monokai .CodeMirror-line > span::-moz-selection, .cm-s-monokai .CodeMirror-line > span > span::-moz-selection { background: rgba(73, 72, 62, .99); }
.cm-s-monokai .CodeMirror-line::selection, .cm-s-monokai .CodeMirror-line > span::selection, .cm-s-monokai .CodeMirror-line > span > span::selection { background: rgba(73, 72, 62, .99); }
.cm-s-monokai .CodeMirror-line::-moz-selection, .cm-s-monokai .CodeMirror-line > span::-moz-selection, .cm-s-monokai .CodeMirror-line > span > span::-moz-selection { background: rgba(73, 72, 62, .99); }
.cm-s-monokai .CodeMirror-gutters { background: #272822; border-right: 0px; }
.cm-s-monokai .CodeMirror-guttermarker { color: white; }
.cm-s-monokai .CodeMirror-guttermarker-subtle { color: #d0d0d0; }
.cm-s-monokai .CodeMirror-linenumber { color: #d0d0d0; }
.cm-s-monokai .CodeMirror-cursor { border-left: 1px solid #f8f8f0; }

.cm-s-monokai span.cm-comment { color: #75715e; }
.cm-s-monokai span.cm-atom { color: #ae81ff; }
.cm-s-monokai span.cm-number { color: #ae81ff; }

.cm-s-monokai span.cm-comment.cm-attribute { color: #97b757; }
.cm-s-monokai span.cm-comment.cm-def { color: #bc9262; }
.cm-s-monokai span.cm-comment.cm-tag { color: #bc6283; }
.cm-s-monokai span.cm-comment.cm-type { color: #5998a6; }

.cm-s-monokai span.cm-property, .cm-s-monokai span.cm-attribute { color: #a6e22e; }
.cm-s-monokai span.cm-keyword { color: #f92672; }
.cm-s-monokai span.cm-builtin { color: #66d9ef; }
.cm-s-monokai span.cm-string { color: #e6db74; }

.cm-s-monokai span.cm-variable { color: #f8f8f2; }
.cm-s-monokai span.cm-variable-2 { color: #9effff; }
.cm-s-monokai span.cm-variable-3, .cm-s-monokai span.cm-type { color: #66d9ef; }
.cm-s-monokai span.cm-def { color: #fd971f; }
.cm-s-monokai span.cm-bracket { color: #f8f8f2; }
.cm-s-monokai span.cm-tag { color: #f92672; }
.cm-s-monokai span.cm-header { color: #ae81ff; }
.cm-s-monokai span.cm-link { color: #ae81ff; }
.cm-s-monokai span.cm-error { background: #f92672; color: #f8f8f0; }

.cm-s-monokai .CodeMirror-activeline-background { background: #373831; }
.cm-s-monokai .CodeMirror-matchingbracket {
  text-decoration: underline;
  color: white !important;
}
</style><style type="text/css">/* Port of TextMate's Blackboard theme */

.cm-s-blackboard.CodeMirror { background: #0C1021; color: #F8F8F8; }
.cm-s-blackboard div.CodeMirror-selected { background: #253B76; }
.cm-s-blackboard .CodeMirror-line::-moz-selection, .cm-s-blackboard .CodeMirror-line > span::-moz-selection, .cm-s-blackboard .CodeMirror-line > span > span::-moz-selection { background: rgba(37, 59, 118, .99); }
.cm-s-blackboard .CodeMirror-line::selection, .cm-s-blackboard .CodeMirror-line > span::selection, .cm-s-blackboard .CodeMirror-line > span > span::selection { background: rgba(37, 59, 118, .99); }
.cm-s-blackboard .CodeMirror-line::-moz-selection, .cm-s-blackboard .CodeMirror-line > span::-moz-selection, .cm-s-blackboard .CodeMirror-line > span > span::-moz-selection { background: rgba(37, 59, 118, .99); }
.cm-s-blackboard .CodeMirror-gutters { background: #0C1021; border-right: 0; }
.cm-s-blackboard .CodeMirror-guttermarker { color: #FBDE2D; }
.cm-s-blackboard .CodeMirror-guttermarker-subtle { color: #888; }
.cm-s-blackboard .CodeMirror-linenumber { color: #888; }
.cm-s-blackboard .CodeMirror-cursor { border-left: 1px solid #A7A7A7; }

.cm-s-blackboard .cm-keyword { color: #FBDE2D; }
.cm-s-blackboard .cm-atom { color: #D8FA3C; }
.cm-s-blackboard .cm-number { color: #D8FA3C; }
.cm-s-blackboard .cm-def { color: #8DA6CE; }
.cm-s-blackboard .cm-variable { color: #FF6400; }
.cm-s-blackboard .cm-operator { color: #FBDE2D; }
.cm-s-blackboard .cm-comment { color: #AEAEAE; }
.cm-s-blackboard .cm-string { color: #61CE3C; }
.cm-s-blackboard .cm-string-2 { color: #61CE3C; }
.cm-s-blackboard .cm-meta { color: #D8FA3C; }
.cm-s-blackboard .cm-builtin { color: #8DA6CE; }
.cm-s-blackboard .cm-tag { color: #8DA6CE; }
.cm-s-blackboard .cm-attribute { color: #8DA6CE; }
.cm-s-blackboard .cm-header { color: #FF6400; }
.cm-s-blackboard .cm-hr { color: #AEAEAE; }
.cm-s-blackboard .cm-link { color: #8DA6CE; }
.cm-s-blackboard .cm-error { background: #9D1E15; color: #F8F8F8; }

.cm-s-blackboard .CodeMirror-activeline-background { background: #3C3636; }
.cm-s-blackboard .CodeMirror-matchingbracket { outline:1px solid grey;color:white !important; }
</style><style type="text/css">.cm-s-eclipse span.cm-meta { color: #FF1717; }
.cm-s-eclipse span.cm-keyword { line-height: 1em; font-weight: bold; color: #7F0055; }
.cm-s-eclipse span.cm-atom { color: #219; }
.cm-s-eclipse span.cm-number { color: #164; }
.cm-s-eclipse span.cm-def { color: #00f; }
.cm-s-eclipse span.cm-variable { color: black; }
.cm-s-eclipse span.cm-variable-2 { color: #0000C0; }
.cm-s-eclipse span.cm-variable-3, .cm-s-eclipse span.cm-type { color: #0000C0; }
.cm-s-eclipse span.cm-property { color: black; }
.cm-s-eclipse span.cm-operator { color: black; }
.cm-s-eclipse span.cm-comment { color: #3F7F5F; }
.cm-s-eclipse span.cm-string { color: #2A00FF; }
.cm-s-eclipse span.cm-string-2 { color: #f50; }
.cm-s-eclipse span.cm-qualifier { color: #555; }
.cm-s-eclipse span.cm-builtin { color: #30a; }
.cm-s-eclipse span.cm-bracket { color: #cc7; }
.cm-s-eclipse span.cm-tag { color: #170; }
.cm-s-eclipse span.cm-attribute { color: #00c; }
.cm-s-eclipse span.cm-link { color: #219; }
.cm-s-eclipse span.cm-error { color: #f00; }

.cm-s-eclipse .CodeMirror-activeline-background { background: #e8f2ff; }
.cm-s-eclipse .CodeMirror-matchingbracket { outline:1px solid grey; color:black !important; }
</style><style type="text/css">/*

    Name:       Tomorrow Night - Bright
    Author:     Chris Kempson

    Port done by Gerard Braad <me@gbraad.nl>

*/

.cm-s-tomorrow-night-bright.CodeMirror { background: #000000; color: #eaeaea; }
.cm-s-tomorrow-night-bright div.CodeMirror-selected { background: #424242; }
.cm-s-tomorrow-night-bright .CodeMirror-gutters { background: #000000; border-right: 0px; }
.cm-s-tomorrow-night-bright .CodeMirror-guttermarker { color: #e78c45; }
.cm-s-tomorrow-night-bright .CodeMirror-guttermarker-subtle { color: #777; }
.cm-s-tomorrow-night-bright .CodeMirror-linenumber { color: #424242; }
.cm-s-tomorrow-night-bright .CodeMirror-cursor { border-left: 1px solid #6A6A6A; }

.cm-s-tomorrow-night-bright span.cm-comment { color: #d27b53; }
.cm-s-tomorrow-night-bright span.cm-atom { color: #a16a94; }
.cm-s-tomorrow-night-bright span.cm-number { color: #a16a94; }

.cm-s-tomorrow-night-bright span.cm-property, .cm-s-tomorrow-night-bright span.cm-attribute { color: #99cc99; }
.cm-s-tomorrow-night-bright span.cm-keyword { color: #d54e53; }
.cm-s-tomorrow-night-bright span.cm-string { color: #e7c547; }

.cm-s-tomorrow-night-bright span.cm-variable { color: #b9ca4a; }
.cm-s-tomorrow-night-bright span.cm-variable-2 { color: #7aa6da; }
.cm-s-tomorrow-night-bright span.cm-def { color: #e78c45; }
.cm-s-tomorrow-night-bright span.cm-bracket { color: #eaeaea; }
.cm-s-tomorrow-night-bright span.cm-tag { color: #d54e53; }
.cm-s-tomorrow-night-bright span.cm-link { color: #a16a94; }
.cm-s-tomorrow-night-bright span.cm-error { background: #d54e53; color: #6A6A6A; }

.cm-s-tomorrow-night-bright .CodeMirror-activeline-background { background: #2a2a2a; }
.cm-s-tomorrow-night-bright .CodeMirror-matchingbracket { text-decoration: underline; color: white !important; }
</style><style type="text/css">/*
Solarized theme for code-mirror
http://ethanschoonover.com/solarized
*/

/*
Solarized color palette
http://ethanschoonover.com/solarized/img/solarized-palette.png
*/

.solarized.base03 { color: #002b36; }
.solarized.base02 { color: #073642; }
.solarized.base01 { color: #586e75; }
.solarized.base00 { color: #657b83; }
.solarized.base0 { color: #839496; }
.solarized.base1 { color: #93a1a1; }
.solarized.base2 { color: #eee8d5; }
.solarized.base3  { color: #fdf6e3; }
.solarized.solar-yellow  { color: #b58900; }
.solarized.solar-orange  { color: #cb4b16; }
.solarized.solar-red { color: #dc322f; }
.solarized.solar-magenta { color: #d33682; }
.solarized.solar-violet  { color: #6c71c4; }
.solarized.solar-blue { color: #268bd2; }
.solarized.solar-cyan { color: #2aa198; }
.solarized.solar-green { color: #859900; }

/* Color scheme for code-mirror */

.cm-s-solarized {
  line-height: 1.45em;
  color-profile: sRGB;
  rendering-intent: auto;
}
.cm-s-solarized.cm-s-dark {
  color: #839496;
  background-color: #002b36;
  text-shadow: #002b36 0 1px;
}
.cm-s-solarized.cm-s-light {
  background-color: #fdf6e3;
  color: #657b83;
  text-shadow: #eee8d5 0 1px;
}

.cm-s-solarized .CodeMirror-widget {
  text-shadow: none;
}

.cm-s-solarized .cm-header { color: #586e75; }
.cm-s-solarized .cm-quote { color: #93a1a1; }

.cm-s-solarized .cm-keyword { color: #cb4b16; }
.cm-s-solarized .cm-atom { color: #d33682; }
.cm-s-solarized .cm-number { color: #d33682; }
.cm-s-solarized .cm-def { color: #2aa198; }

.cm-s-solarized .cm-variable { color: #839496; }
.cm-s-solarized .cm-variable-2 { color: #b58900; }
.cm-s-solarized .cm-variable-3, .cm-s-solarized .cm-type { color: #6c71c4; }

.cm-s-solarized .cm-property { color: #2aa198; }
.cm-s-solarized .cm-operator { color: #6c71c4; }

.cm-s-solarized .cm-comment { color: #586e75; font-style:italic; }

.cm-s-solarized .cm-string { color: #859900; }
.cm-s-solarized .cm-string-2 { color: #b58900; }

.cm-s-solarized .cm-meta { color: #859900; }
.cm-s-solarized .cm-qualifier { color: #b58900; }
.cm-s-solarized .cm-builtin { color: #d33682; }
.cm-s-solarized .cm-bracket { color: #cb4b16; }
.cm-s-solarized .CodeMirror-matchingbracket { color: #859900; }
.cm-s-solarized .CodeMirror-nonmatchingbracket { color: #dc322f; }
.cm-s-solarized .cm-tag { color: #93a1a1; }
.cm-s-solarized .cm-attribute { color: #2aa198; }
.cm-s-solarized .cm-hr {
  color: transparent;
  border-top: 1px solid #586e75;
  display: block;
}
.cm-s-solarized .cm-link { color: #93a1a1; cursor: pointer; }
.cm-s-solarized .cm-special { color: #6c71c4; }
.cm-s-solarized .cm-em {
  color: #999;
  text-decoration: underline;
  -webkit-text-decoration-style: dotted;
          text-decoration-style: dotted;
}
.cm-s-solarized .cm-error,
.cm-s-solarized .cm-invalidchar {
  color: #586e75;
  border-bottom: 1px dotted #dc322f;
}

.cm-s-solarized.cm-s-dark div.CodeMirror-selected { background: #073642; }
.cm-s-solarized.cm-s-dark.CodeMirror ::-moz-selection { background: rgba(7, 54, 66, 0.99); }
.cm-s-solarized.cm-s-dark.CodeMirror ::selection { background: rgba(7, 54, 66, 0.99); }
.cm-s-solarized.cm-s-dark .CodeMirror-line::-moz-selection, .cm-s-dark .CodeMirror-line > span::-moz-selection, .cm-s-dark .CodeMirror-line > span > span::-moz-selection { background: rgba(7, 54, 66, 0.99); }

.cm-s-solarized.cm-s-light div.CodeMirror-selected { background: #eee8d5; }
.cm-s-solarized.cm-s-light .CodeMirror-line::-moz-selection, .cm-s-light .CodeMirror-line > span::-moz-selection, .cm-s-light .CodeMirror-line > span > span::-moz-selection { background: #eee8d5; }
.cm-s-solarized.cm-s-light .CodeMirror-line::selection, .cm-s-light .CodeMirror-line > span::selection, .cm-s-light .CodeMirror-line > span > span::selection { background: #eee8d5; }
.cm-s-solarized.cm-s-light .CodeMirror-line::-moz-selection, .cm-s-ligh .CodeMirror-line > span::-moz-selection, .cm-s-ligh .CodeMirror-line > span > span::-moz-selection { background: #eee8d5; }

/* Editor styling */



/* Little shadow on the view-port of the buffer view */
.cm-s-solarized.CodeMirror {
  -webkit-box-shadow: inset 7px 0 12px -6px #000;
  box-shadow: inset 7px 0 12px -6px #000;
}

/* Remove gutter border */
.cm-s-solarized .CodeMirror-gutters {
  border-right: 0;
}

/* Gutter colors and line number styling based of color scheme (dark / light) */

/* Dark */
.cm-s-solarized.cm-s-dark .CodeMirror-gutters {
  background-color: #073642;
}

.cm-s-solarized.cm-s-dark .CodeMirror-linenumber {
  color: #586e75;
  text-shadow: #021014 0 -1px;
}

/* Light */
.cm-s-solarized.cm-s-light .CodeMirror-gutters {
  background-color: #eee8d5;
}

.cm-s-solarized.cm-s-light .CodeMirror-linenumber {
  color: #839496;
}

/* Common */
.cm-s-solarized .CodeMirror-linenumber {
  padding: 0 5px;
}
.cm-s-solarized .CodeMirror-guttermarker-subtle { color: #586e75; }
.cm-s-solarized.cm-s-dark .CodeMirror-guttermarker { color: #ddd; }
.cm-s-solarized.cm-s-light .CodeMirror-guttermarker { color: #cb4b16; }

.cm-s-solarized .CodeMirror-gutter .CodeMirror-gutter-text {
  color: #586e75;
}

/* Cursor */
.cm-s-solarized .CodeMirror-cursor { border-left: 1px solid #819090; }

/* Fat cursor */
.cm-s-solarized.cm-s-light.cm-fat-cursor .CodeMirror-cursor { background: #77ee77; }
.cm-s-solarized.cm-s-light .cm-animate-fat-cursor { background-color: #77ee77; }
.cm-s-solarized.cm-s-dark.cm-fat-cursor .CodeMirror-cursor { background: #586e75; }
.cm-s-solarized.cm-s-dark .cm-animate-fat-cursor { background-color: #586e75; }

/* Active line */
.cm-s-solarized.cm-s-dark .CodeMirror-activeline-background {
  background: rgba(255, 255, 255, 0.06);
}
.cm-s-solarized.cm-s-light .CodeMirror-activeline-background {
  background: rgba(0, 0, 0, 0.06);
}
</style><style type="text/css">.cm-s-github.CodeMirror {
  background: #fff;
  color: #24292e;
}

.cm-s-github .CodeMirror-gutters {
  background: #fff;
  border-right-width: 0;
}

.cm-s-github .CodeMirror-guttermarker {
  color: white;
}

.cm-s-github .CodeMirror-guttermarker-subtle {
  color: #d0d0d0;
}

.cm-s-github .CodeMirror-linenumber {
  color: #959da5;
  padding: 0 16px 0 16px;
}

.cm-s-github .CodeMirror-cursor {
  border-left: 1px solid #24292e;
}

.cm-s-github div.CodeMirror-selected,
.cm-s-github .CodeMirror-line::selection,
.cm-s-github .CodeMirror-line > span::selection,
.cm-s-github .CodeMirror-line > span > span::selection,
.cm-s-github .CodeMirror-line::-moz-selection,
.cm-s-github .CodeMirror-line > span::-moz-selection,
.cm-s-github .CodeMirror-line > span > span::-moz-selection {
  background: #c8c8fa;
}

.cm-s-github .CodeMirror-activeline-background {
  background: #fafbfc;
}

.cm-s-github .CodeMirror-matchingbracket {
  text-decoration: underline;
  color: #24292e !important;
}

.cm-s-github .cm-comment { color: #6a737d; }

.cm-s-github .cm-keyword {
  color: #d73a49;
}

.cm-s-github .cm-string {
  font-weight: normal;
  font-style: normal;
  text-decoration: none;
  color: #032f62;
}

.cm-s-github span.cm-def { color: #6f42c1; }
.cm-s-github span.cm-atom { color: #005cc5; }
.cm-s-github span.cm-operator { color: #d73a49; }
.cm-s-github span.cm-number { color: #005cc5; }
.cm-s-github span.cm-meta { color: #005cc5; }
.cm-s-github span.cm-builtin { color: #005cc5; }
.cm-s-github span.cm-variable { color: #24292e; }
.cm-s-github span.cm-variable-2 { color: #005cc5; }
.cm-s-github span.cm-variable-3 { color: #d73a49; }
.cm-s-github span.cm-property { color: #24292e; }
.cm-s-github span.cm-tag { color: #005cc5; }
</style><style type="text/css">.cm-s-textmate.CodeMirror { color: #000000; background: #FFFFFF; }
.cm-s-textmate span.cm-meta {color: rgb(7, 32, 170);}
.cm-s-textmate span.cm-keyword { color: rgb(16, 51, 246); }
.cm-s-textmate span.cm-atom {color: rgb(88, 92, 246);}
.cm-s-textmate span.cm-number {color: rgb(11, 41, 206);}
.cm-s-textmate span.cm-def {color: rgb(16, 51, 246);}
.cm-s-textmate span.cm-variable {color: black;}
.cm-s-textmate span.cm-variable-2 {color: rgb(85, 148, 164);}
.cm-s-textmate span.cm-variable-3 {color: rgb(16, 51, 246);}
.cm-s-textmate span.cm-property {color: black;}
.cm-s-textmate span.cm-operator {color: rgb(16, 51, 246);}
.cm-s-textmate span.cm-comment {color: rgb(51, 126, 247);}
.cm-s-textmate span.cm-string {color: rgb(49, 120, 33);}
.cm-s-textmate span.cm-string-2 {color: rgb(193, 52, 32);}
.cm-s-textmate span.cm-error {color: #F00;}
.cm-s-textmate span.cm-qualifier {color: #555;}
.cm-s-textmate span.cm-builtin {color: rgb(109, 119, 240);}
.cm-s-textmate span.cm-bracket {color: #cc7;}
.cm-s-textmate span.cm-tag {color: rgb(16, 51, 246);}
.cm-s-textmate span.cm-attribute {color: #036A07;}

.cm-s-textmate .CodeMirror-activeline-background {background: #e8f2ff !important;}
.cm-s-textmate .CodeMirror-matchhighlight { background: #e9e9e9 }
.cm-s-textmate div.CodeMirror-selected { background: rgb(208, 227, 253); }
</style><style type="text/css">.cm-s-xcode.CodeMirror { color: #000000; background: #FFFFFF; }
.cm-s-xcode span.cm-meta {color: rgb(127, 75, 48);}
.cm-s-xcode span.cm-keyword { color: #C800A4; }
.cm-s-xcode span.cm-atom {color: rgb(178, 58, 158);}
.cm-s-xcode span.cm-number {color: #3A00DC;}
.cm-s-xcode span.cm-def {color: rgb(16, 51, 246);}
.cm-s-xcode span.cm-variable {color: black;}
.cm-s-xcode span.cm-variable-2 {color: rgb(105, 64, 164);}
.cm-s-xcode span.cm-variable-3 {color: #C900A4;}
.cm-s-xcode span.cm-property {color: black;}
.cm-s-xcode span.cm-operator {color: #C800A4;}
.cm-s-xcode span.cm-comment {color: #008E00;}
.cm-s-xcode span.cm-string {color: #DF0002;}
.cm-s-xcode span.cm-string-2 {color: rgb(193, 52, 32);}
.cm-s-xcode span.cm-error {color: #F00;}
.cm-s-xcode span.cm-qualifier {color: #555;}
.cm-s-xcode span.cm-builtin {color: rgb(178, 58, 158);}
.cm-s-xcode span.cm-bracket {color: #cc7;}
.cm-s-xcode span.cm-tag {color: rgb(16, 51, 246);}
.cm-s-xcode span.cm-attribute {color: #036A07;}

.cm-s-xcode .CodeMirror-matchingbracket {
  outline: 1px solid gray;
  color:black !important;
}
.cm-s-xcode .CodeMirror-activeline-background {background: rgb(238, 245, 254) !important;}
.cm-s-xcode .CodeMirror-matchhighlight { background: #e9e9e9 }
.cm-s-xcode div.CodeMirror-selected { background: rgb(185, 214, 252); }
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/***
 * This file is included in `vendor`.
 * Please avoid to modify it frequently.
 */
@font-face {
  font-family: TypoRound;
  font-weight: normal;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/Typo_Round_Regular.1a899395b.otf) format('opentype');
}
@font-face {
  font-family: TypoRound;
  font-style: italic;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/Typo_Round_Italic.e145f2054.otf) format('opentype');
}
@font-face {
  font-family: TypoRound;
  font-weight: bold;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/Typo_Round_Bold.4391ba69a.otf) format('opentype');
}
@font-face {
  font-family: TypoRound;
  font-weight: bold;
  font-style: italic;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/Typo_Round_Bold_Italic.b03aac909.otf) format('opentype');
}
@font-face {
  font-family: TypoRound;
  font-weight: thin;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/Typo_Round_Thin.81285367c.otf) format('opentype');
}
@font-face {
  font-family: TypoRound;
  font-weight: thin;
  font-style: italic;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/Typo_Round_Thin_Italic.b82184009.otf) format('opentype');
}
@font-face {
  font-family: TypoRound;
  font-weight: lighter;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/Typo_Round_Light.d737fd73e.otf) format('opentype');
}
@font-face {
  font-family: TypoRound;
  font-weight: lighter;
  font-style: italic;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/Typo_Round_Light_Italic.698a944df.otf) format('opentype');
}
@font-face {
  font-family: FetteMittelschrift;
  font-weight: normal;
  font-style: normal;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/FetteMittelschrift_Regular.30a0b93e1.ttf) format('truetype'), url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/FetteMittelschrift_Regular.7284ae0ed.woff2) format('woff2'), url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/FetteMittelschrift_Regular.d0ee387de.woff) format('woff');
}
@font-face {
  font-family: LcIconFont;
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/common_icon.dd75ff0b1.eot);
  src: url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/common_icon.dd75ff0b1.eot#iefix) format('embedded-opentype'), url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/common_icon.e0ddbb6d0.ttf) format('truetype'), url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/common_icon.89e10fa93.woff) format('woff'), url(https://assets.leetcode.com/static_assets/public/webpack_bundles/images/common_icon.e8842540c.svg#common_icon) format('svg');
  font-weight: normal;
  font-style: normal;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-animation-zoom-in-enter,
.lc-animation-zoom-in-appear {
  -webkit-transform: translate3d(0, 0, 0);
          transform: translate3d(0, 0, 0);
  -webkit-transform-origin: center;
          transform-origin: center;
}
.lc-animation-zoom-in-enter,
.lc-animation-zoom-in-appear,
.lc-animation-zoom-in-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: forwards;
          animation-fill-mode: forwards;
  -webkit-animation-timing-function: ease;
          animation-timing-function: ease;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
  opacity: 0;
}
.lc-animation-zoom-in-leave {
  opacity: 1;
}
.lc-animation-zoom-in-enter.lc-animation-zoom-in-enter-active,
.lc-animation-zoom-in-appear.lc-animation-zoom-in-appear-active {
  -webkit-animation-name: lcZoomIn;
          animation-name: lcZoomIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.lc-animation-zoom-in-leave.lc-animation-zoom-in-leave-active {
  -webkit-animation-name: lcZoomIn;
          animation-name: lcZoomIn;
  animation-direction: reverse;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  -webkit-animation-iteration-count: 1;
          animation-iteration-count: 1;
}
@-webkit-keyframes lcZoomIn {
  from {
    -webkit-transform: scale(0);
            transform: scale(0);
    opacity: 0;
  }
  to {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 1;
  }
}
@keyframes lcZoomIn {
  from {
    -webkit-transform: scale(0);
            transform: scale(0);
    opacity: 0;
  }
  to {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 1;
  }
}
</style><style type="text/css">/*! normalize.css v8.0.1 | MIT License | github.com/necolas/normalize.css */

/* Document
   ========================================================================== */

/**
 * 1. Correct the line height in all browsers.
 * 2. Prevent adjustments of font size after orientation changes in iOS.
 */

html {
  line-height: 1.15; /* 1 */
  -webkit-text-size-adjust: 100%; /* 2 */
}

/* Sections
   ========================================================================== */

/**
 * Remove the margin in all browsers.
 */

body {
  margin: 0;
}

/**
 * Render the `main` element consistently in IE.
 */

main {
  display: block;
}

/**
 * Correct the font size and margin on `h1` elements within `section` and
 * `article` contexts in Chrome, Firefox, and Safari.
 */

h1 {
  font-size: 2em;
  margin: 0.67em 0;
}

/* Grouping content
   ========================================================================== */

/**
 * 1. Add the correct box sizing in Firefox.
 * 2. Show the overflow in Edge and IE.
 */

hr {
  box-sizing: content-box; /* 1 */
  height: 0; /* 1 */
  overflow: visible; /* 2 */
}

/**
 * 1. Correct the inheritance and scaling of font size in all browsers.
 * 2. Correct the odd `em` font sizing in all browsers.
 */

pre {
  font-family: monospace, monospace; /* 1 */
  font-size: 1em; /* 2 */
}

/* Text-level semantics
   ========================================================================== */

/**
 * Remove the gray background on active links in IE 10.
 */

a {
  background-color: transparent;
}

/**
 * 1. Remove the bottom border in Chrome 57-
 * 2. Add the correct text decoration in Chrome, Edge, IE, Opera, and Safari.
 */

abbr[title] {
  border-bottom: none; /* 1 */
  text-decoration: underline; /* 2 */
  text-decoration: underline dotted; /* 2 */
}

/**
 * Add the correct font weight in Chrome, Edge, and Safari.
 */

b,
strong {
  font-weight: bolder;
}

/**
 * 1. Correct the inheritance and scaling of font size in all browsers.
 * 2. Correct the odd `em` font sizing in all browsers.
 */

code,
kbd,
samp {
  font-family: monospace, monospace; /* 1 */
  font-size: 1em; /* 2 */
}

/**
 * Add the correct font size in all browsers.
 */

small {
  font-size: 80%;
}

/**
 * Prevent `sub` and `sup` elements from affecting the line height in
 * all browsers.
 */

sub,
sup {
  font-size: 75%;
  line-height: 0;
  position: relative;
  vertical-align: baseline;
}

sub {
  bottom: -0.25em;
}

sup {
  top: -0.5em;
}

/* Embedded content
   ========================================================================== */

/**
 * Remove the border on images inside links in IE 10.
 */

img {
  border-style: none;
}

/* Forms
   ========================================================================== */

/**
 * 1. Change the font styles in all browsers.
 * 2. Remove the margin in Firefox and Safari.
 */

button,
input,
optgroup,
select,
textarea {
  font-family: inherit; /* 1 */
  font-size: 100%; /* 1 */
  line-height: 1.15; /* 1 */
  margin: 0; /* 2 */
}

/**
 * Show the overflow in IE.
 * 1. Show the overflow in Edge.
 */

button,
input { /* 1 */
  overflow: visible;
}

/**
 * Remove the inheritance of text transform in Edge, Firefox, and IE.
 * 1. Remove the inheritance of text transform in Firefox.
 */

button,
select { /* 1 */
  text-transform: none;
}

/**
 * Correct the inability to style clickable types in iOS and Safari.
 */

button,
[type="button"],
[type="reset"],
[type="submit"] {
  -webkit-appearance: button;
}

/**
 * Remove the inner border and padding in Firefox.
 */

button::-moz-focus-inner,
[type="button"]::-moz-focus-inner,
[type="reset"]::-moz-focus-inner,
[type="submit"]::-moz-focus-inner {
  border-style: none;
  padding: 0;
}

/**
 * Restore the focus styles unset by the previous rule.
 */

button:-moz-focusring,
[type="button"]:-moz-focusring,
[type="reset"]:-moz-focusring,
[type="submit"]:-moz-focusring {
  outline: 1px dotted ButtonText;
}

/**
 * Correct the padding in Firefox.
 */

fieldset {
  padding: 0.35em 0.75em 0.625em;
}

/**
 * 1. Correct the text wrapping in Edge and IE.
 * 2. Correct the color inheritance from `fieldset` elements in IE.
 * 3. Remove the padding so developers are not caught out when they zero out
 *    `fieldset` elements in all browsers.
 */

legend {
  box-sizing: border-box; /* 1 */
  color: inherit; /* 2 */
  display: table; /* 1 */
  max-width: 100%; /* 1 */
  padding: 0; /* 3 */
  white-space: normal; /* 1 */
}

/**
 * Add the correct vertical alignment in Chrome, Firefox, and Opera.
 */

progress {
  vertical-align: baseline;
}

/**
 * Remove the default vertical scrollbar in IE 10+.
 */

textarea {
  overflow: auto;
}

/**
 * 1. Add the correct box sizing in IE 10.
 * 2. Remove the padding in IE 10.
 */

[type="checkbox"],
[type="radio"] {
  box-sizing: border-box; /* 1 */
  padding: 0; /* 2 */
}

/**
 * Correct the cursor style of increment and decrement buttons in Chrome.
 */

[type="number"]::-webkit-inner-spin-button,
[type="number"]::-webkit-outer-spin-button {
  height: auto;
}

/**
 * 1. Correct the odd appearance in Chrome and Safari.
 * 2. Correct the outline style in Safari.
 */

[type="search"] {
  -webkit-appearance: textfield; /* 1 */
  outline-offset: -2px; /* 2 */
}

/**
 * Remove the inner padding in Chrome and Safari on macOS.
 */

[type="search"]::-webkit-search-decoration {
  -webkit-appearance: none;
}

/**
 * 1. Correct the inability to style clickable types in iOS and Safari.
 * 2. Change font properties to `inherit` in Safari.
 */

::-webkit-file-upload-button {
  -webkit-appearance: button; /* 1 */
  font: inherit; /* 2 */
}

/* Interactive
   ========================================================================== */

/*
 * Add the correct display in Edge, IE 10+, and Firefox.
 */

details {
  display: block;
}

/*
 * Add the correct display in all browsers.
 */

summary {
  display: list-item;
}

/* Misc
   ========================================================================== */

/**
 * Add the correct display in IE 10+.
 */

template {
  display: none;
}

/**
 * Add the correct display in IE 10.
 */

[hidden] {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.floating-shadow {
  -webkit-box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
}
::-webkit-scrollbar {
  width: 10px;
  height: 10px;
}
::-webkit-scrollbar-track {
  background: transparent;
}
::-webkit-scrollbar-thumb {
  background: rgba(158, 158, 158, 0.3);
  border-radius: 0;
  outline: none;
  border: 2px solid transparent;
  background-clip: padding-box;
}
.dark-mode::-webkit-scrollbar-thumb {
  background: rgba(245, 245, 245, 0.5);
  border-radius: 0;
  outline: none;
  border: 2px solid transparent;
  background-clip: padding-box;
}
/*

XCode style (c) Angel Garcia <angelgarcia.mail@gmail.com>

*/
.hljs {
  display: block;
  overflow-x: auto;
  padding: 0.5em;
  background: #ffffff;
  color: black;
}
.hljs-comment,
.hljs-quote {
  color: #006a00;
}
.hljs-keyword,
.hljs-selector-tag,
.hljs-literal {
  color: #aa0d91;
}
.hljs-name {
  color: #000088;
}
.hljs-variable,
.hljs-template-variable {
  color: #666600;
}
.hljs-string {
  color: #c41a16;
}
.hljs-regexp,
.hljs-link {
  color: #008800;
}
.hljs-title,
.hljs-tag,
.hljs-symbol,
.hljs-bullet,
.hljs-number,
.hljs-meta {
  color: #1c00cf;
}
.hljs-section,
.hljs-class .hljs-title,
.hljs-type,
.hljs-attr,
.hljs-built_in,
.hljs-builtin-name,
.hljs-params {
  color: #5c2699;
}
.hljs-attribute,
.hljs-subst {
  color: #000000;
}
.hljs-formula {
  background-color: #eeeeee;
  font-style: italic;
}
.hljs-addition {
  background-color: #baeeba;
}
.hljs-deletion {
  background-color: #ffc8bd;
}
.hljs-selector-id,
.hljs-selector-class {
  color: #9b703f;
}
.hljs-doctag,
.hljs-strong {
  font-weight: bold;
}
.hljs-emphasis {
  font-style: italic;
}
html {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  background-color: white;
}
*,
*::before,
*::after {
  -webkit-box-sizing: inherit;
          box-sizing: inherit;
}
body {
  margin: 0;
  padding: 0;
  color: #212121;
  font-family: -apple-system, BlinkMacSystemFont, 'SF Pro SC', 'SF Pro Text', 'PingFang SC', 'Arial', 'Hiragino Sans GB', 'Heiti SC', 'Microsoft Yahei', sans-serif;
  font-size: 14px;
  font-weight: 400;
}
h1 {
  font-size: 38px;
  font-weight: 400;
}
h2 {
  font-size: 28px;
  font-weight: 400;
}
h3 {
  font-size: 20px;
  font-weight: 400;
}
h4 {
  font-size: 18px;
  font-weight: 400;
}
h5 {
  font-size: 16px;
  font-weight: 400;
}
p,
input,
textarea,
select,
button {
  font-size: 14px;
  font-weight: 400;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.simple-avatar__1nLM {
  display: inline-block;
}
.simple-avatar__1nLM.hover-effect__2WOZ .simp-avatar__mRN_ {
  -webkit-box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
}
.simple-avatar__1nLM.hover-effect__2WOZ .simp-avatar__mRN_[data-has-link='true'] {
  -webkit-box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
  -webkit-transition: -webkit-box-shadow 0.4s;
  transition: -webkit-box-shadow 0.4s;
  -o-transition: box-shadow 0.4s;
  transition: box-shadow 0.4s;
  transition: box-shadow 0.4s, -webkit-box-shadow 0.4s;
}
.simple-avatar__1nLM.hover-effect__2WOZ .simp-avatar__mRN_[data-has-link='true']:hover {
  -webkit-box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
}
.simp-avatar__mRN_ {
  border-radius: 1020px;
}
.simp-avatar__mRN_[data-has-link='true'] {
  cursor: pointer;
}
.text-avatar__5boC {
  display: inline-block;
  font-weight: 200;
  text-align: center;
  padding-top: 5px;
  font-size: 14px;
  background: #bdc3c7;
  color: white;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.content__3Tyz {
  text-align: left;
}
.header__2HEG b {
  font-size: 20px;
}
.header__2HEG span {
  font-size: 14px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.perfect-wrap__FosU {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.perfect-wrap__FosU::before {
  content: ' ';
  -webkit-box-flex: 0.618;
      -ms-flex-positive: 0.618;
          flex-grow: 0.618;
}
.perfect-wrap__FosU::after {
  content: ' ';
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
}
.base-modal__2SlO {
  min-width: 300px;
  max-width: 80vw;
  margin: 20px auto;
}
.base-modal__2SlO .rc-dialog-body > .close {
  position: absolute;
  top: 15px;
  right: 15px;
}
.reset-rc-dialog-body-style__23jm .rc-dialog-body {
  padding: 0;
}
.reset-rc-dialog-content-border__2pcz .rc-dialog-content {
  border: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.setting-btn__2v2k + .popover {
  white-space: nowrap;
  max-width: none;
}
.setting-board-modal__FolE .description__21Ft {
  padding-bottom: 5px;
}
.setting-board-modal__FolE .description__21Ft .theme-base__3FF5 {
  margin-top: -5px;
  margin-bottom: 5px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: horizontal;
  -webkit-box-direction: normal;
      -ms-flex-flow: row wrap;
          flex-flow: row wrap;
  max-width: 100%;
}
@media (max-width: 480px) {
  .setting-board-modal__FolE .description__21Ft .theme-base__3FF5 {
    display: block;
  }
  .setting-board-modal__FolE .description__21Ft .theme-base__3FF5 .theme-header__3ha3,
  .setting-board-modal__FolE .description__21Ft .theme-base__3FF5 .theme-detail__3hL9,
  .setting-board-modal__FolE .description__21Ft .theme-base__3FF5 .theme-select-wrapper__sJO3 {
    width: 100%;
    margin-top: 0;
    margin-bottom: 10px;
  }
}
.setting-board-modal__FolE .description__21Ft .option-base__2npZ {
  margin-top: 5px;
  margin-bottom: 5px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: horizontal;
  -webkit-box-direction: normal;
      -ms-flex-flow: row wrap;
          flex-flow: row wrap;
  max-width: 100%;
}
@media (max-width: 480px) {
  .setting-board-modal__FolE .description__21Ft .option-base__2npZ {
    display: block;
  }
  .setting-board-modal__FolE .description__21Ft .option-base__2npZ .option-header__al9K,
  .setting-board-modal__FolE .description__21Ft .option-base__2npZ .option-detail__4qEK,
  .setting-board-modal__FolE .description__21Ft .option-base__2npZ .option-select-wrapper__Zj-G {
    width: 100%;
    margin-top: 0;
    margin-bottom: 10px;
  }
}
.setting-board-modal__FolE .description__21Ft .theme-header__3ha3,
.setting-board-modal__FolE .description__21Ft .option-header__al9K {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 70%;
          flex: 0 0 70%;
  font-size: 16px;
  font-weight: 500;
  margin-top: 2px;
}
.setting-board-modal__FolE .description__21Ft .theme-detail__3hL9,
.setting-board-modal__FolE .description__21Ft .option-detail__4qEK {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 65%;
          flex: 0 0 65%;
  margin-top: -15px;
  font-size: small;
  color: grey;
}
.setting-board-modal__FolE .description__21Ft .theme-select-wrapper__sJO3,
.setting-board-modal__FolE .description__21Ft .option-select-wrapper__Zj-G {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  margin-top: 15px;
}
.setting-board-modal__FolE .description__21Ft .base-line__Agul {
  margin-top: 10px;
  margin-bottom: 10px;
}
.block-popover__Bye8 {
  display: block;
  height: 100%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-alert-base__GTOx {
  position: fixed;
  z-index: 150;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  opacity: 0;
}
.lc-alert-base__GTOx[data-status='entered'] {
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
  opacity: 1;
}
.lc-alert-base__GTOx[data-status='entering'],
.lc-alert-base__GTOx[data-status='exiting'],
.lc-alert-base__GTOx[data-status='exited'] {
  -webkit-transition: 0.6s all;
  -o-transition: 0.6s all;
  transition: 0.6s all;
  opacity: 0;
}
.lc-alert-base__GTOx[data-status='entering'] .alert-content__2Ke2 > .inner__3Zl8,
.lc-alert-base__GTOx[data-status='exiting'] .alert-content__2Ke2 > .inner__3Zl8,
.lc-alert-base__GTOx[data-status='exited'] .alert-content__2Ke2 > .inner__3Zl8 {
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
  opacity: 0;
  -webkit-transform: translateY(20px);
          transform: translateY(20px);
  -webkit-animation-timing-function: ease-in;
          animation-timing-function: ease-in;
}
.lc-alert-base__GTOx[data-status='exited'] {
  display: none;
}
.bg-cover__251O {
  position: absolute;
  z-index: -1;
  top: 0;
  left: 0;
  background: rgba(0, 0, 0, 0.6);
  width: 100%;
  height: 100%;
  -webkit-backdrop-filter: blur(5px);
          backdrop-filter: blur(5px);
}
.lc-alert__2567 {
  z-index: 1;
}
.alert-content__2Ke2 {
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  width: 520px;
}
@media (max-width: 520px) {
  .alert-content__2Ke2 {
    width: 100%;
  }
}
.inner__3Zl8 {
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
  opacity: 1;
  -webkit-transform: translateY(0);
          transform: translateY(0);
  -webkit-animation-timing-function: ease-in;
          animation-timing-function: ease-in;
  -webkit-transform-origin: 50% 50%;
          transform-origin: 50% 50%;
  width: calc(100% - 40px);
  margin: auto;
}
.inner-content__3Pbg {
  background-color: white;
  min-height: 100px;
  border-radius: 10px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.close-modal-btn__1W8e {
  cursor: pointer;
  z-index: 1;
  position: absolute;
  right: 10px;
  top: 23px;
  width: 25px;
  height: 25px;
}
.close-modal-btn__1W8e:hover .cross__UZjL {
  background: #ac2925;
}
.close-modal-btn__1W8e .cross__UZjL {
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
  border-radius: 1020px;
  background: #dddddd;
  height: 2px;
  width: 25px;
  -webkit-transform-origin: 50% 50%;
          transform-origin: 50% 50%;
}
.close-modal-btn__1W8e .cross__UZjL:first-child {
  -webkit-transform: rotate(45deg) translateY(1px);
          transform: rotate(45deg) translateY(1px);
}
.close-modal-btn__1W8e .cross__UZjL:last-child {
  -webkit-transform: rotate(-45deg) translateY(-1px);
          transform: rotate(-45deg) translateY(-1px);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-alert-title__3sym {
  width: 100%;
  font-weight: 500;
  white-space: nowrap;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  font-size: 16px;
  padding: 14px 18px 2px 18px;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
}
.lc-alert-title__3sym[data-status='entering'],
.lc-alert-title__3sym[data-status='exiting'],
.lc-alert-title__3sym[data-status='exited'] {
  -webkit-box-flex: 0;
      -ms-flex: 0;
          flex: 0;
  padding: 0;
}
.lc-alert-title__3sym[data-status='exited'] {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-alert-body__E0c3 {
  color: #95a5a6;
  padding: 6px 18px;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
}
.lc-alert-body__E0c3[data-status='entering'],
.lc-alert-body__E0c3[data-status='exiting'],
.lc-alert-body__E0c3[data-status='exited'] {
  -webkit-box-flex: 0;
      -ms-flex: 0;
          flex: 0;
  padding: 0;
}
.lc-alert-body__E0c3[data-status='exited'] {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-alert-button__7Byx,
.lc-alert-dropdown-container__1R8y {
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
}
.lc-alert-button__7Byx {
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  -webkit-box-align: baseline;
      -ms-flex-align: baseline;
          align-items: baseline;
  padding: 6px 10px;
  color: #00acff;
  font-weight: 500;
  border-radius: 4px;
}
.lc-alert-button__7Byx:hover {
  cursor: pointer;
  background-color: #ecf0f1;
}
.lc-alert-dropdown__2OPY {
  position: absolute;
  border-radius: 4px;
  background-color: white;
  -webkit-box-shadow: rgba(0, 0, 0, 0.2) 0 2px 5px;
          box-shadow: rgba(0, 0, 0, 0.2) 0 2px 5px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  top: calc(100% - 10px);
  right: 5px;
}
.lc-alert-dropdown-button__3h8l {
  font-weight: 500;
  padding: 6px 10px;
  border-radius: 0;
  color: #00acff;
  max-width: 250px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.lc-alert-dropdown-button__3h8l:hover {
  cursor: pointer;
  background-color: #ecf0f1;
}
.lc-alert-dropdown-button__3h8l:first-child {
  border-top-left-radius: 4px;
  border-top-right-radius: 4px;
}
.lc-alert-dropdown-button__3h8l:last-child {
  border-bottom-left-radius: 4px;
  border-bottom-right-radius: 4px;
}
.delete__12NY,
.danger__2Bvz {
  color: #d05451;
}
.cancel__16wG {
}
.submit__KYJA {
}
.confirm__3w_p {
}
.delete-dropdown__1Ju6 {
  color: #d05451;
}
.cancel-dropdown__1SO8 {
}
.submit-dropdown__1ydo {
}
.confirm-dropdown__2zkJ {
}
.disabled__1uZ_ {
  color: #bdc3c7;
}
.disabled__1uZ_:hover {
  cursor: default;
  background-color: transparent;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-alert-button-group__2THN {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  -ms-flex-item-align: end;
      align-self: flex-end;
  -webkit-box-flex: 0;
      -ms-flex-positive: 0;
          flex-grow: 0;
  max-height: 32px;
  margin: 2px 12px 8px;
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
}
.lc-alert-button-group__2THN[data-status='entering'],
.lc-alert-button-group__2THN[data-status='exiting'],
.lc-alert-button-group__2THN[data-status='exited'] {
  max-height: 0;
}
.lc-alert-button-group__2THN[data-status='exited'] {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-alert-icon-container__EZ61 {
  color: white;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  height: 65px;
  width: 100%;
  -ms-flex-item-align: start;
      align-self: flex-start;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 60px;
          flex: 0 0 60px;
  max-height: 60px;
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
  border-radius: 4px;
  margin: 8px 0;
}
.lc-alert-icon-container__EZ61[data-status='entering'],
.lc-alert-icon-container__EZ61[data-status='exiting'],
.lc-alert-icon-container__EZ61[data-status='exited'] {
  max-height: 0;
}
.lc-alert-icon-container__EZ61[data-status='exited'] {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-alert-content__4Rv0 {
  width: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.lc-alert-content__4Rv0[data-show-close-button='true'] .lc-alert-title-container__3t-v {
  width: calc(100% - 30px);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-notification-body__3xIU {
  color: black;
  font-size: 12px;
  max-height: 40px;
  line-height: 1.5;
}
.lc-notification-body__3xIU[data-status='exited'] {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-notification-title__1PHD {
  font-weight: 500;
  white-space: nowrap;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  font-size: 11px;
  text-transform: uppercase;
  color: #95a5a6;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-notification-title-body-wrapper__1Jk_ {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  padding: 10px 10px 10px 14px;
  min-width: 0;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-notification-content__2Ub- {
  width: 100%;
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: horizontal;
  -webkit-box-direction: normal;
      -ms-flex-direction: row;
          flex-direction: row;
  -ms-flex-line-pack: stretch;
      align-content: stretch;
}
@media (min-width: 768px) {
  .lc-notification-content__2Ub- {
    width: 300px;
  }
}
.lc-notification-content__2Ub-[data-show-close-button='true'] .lc-notification-title-container__1tNY {
  width: calc(100% - 20px);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-notification-wrapper__129j {
  position: absolute;
  top: 52px;
  right: 0;
  width: 310px;
  padding: 5px;
  overflow-x: hidden;
  z-index: 150;
  -webkit-transition: 0.2s all 0s top;
  -o-transition: 0.2s all 0s top;
  transition: 0.2s all 0s top;
}
@media screen and (max-width: 767px) {
  .lc-notification-wrapper__129j {
    width: 100%;
    position: absolute;
    top: 0;
    margin-top: 0 !important;
    padding: 0;
  }
}
.notification-content__6NBh {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  z-index: 150;
  padding-bottom: 5px;
  /* Animation */
}
@media screen and (max-width: 767px) {
  .notification-content__6NBh {
    width: 100%;
  }
}
.notification-content__6NBh[data-status='entered'] {
  -webkit-transition: all 0.2s, top 0ms;
  -o-transition: all 0.2s, top 0ms;
  transition: all 0.2s, top 0ms;
}
@media screen and (min-width: 768px) {
  .notification-content__6NBh[data-status='entered'] {
    -webkit-transform: translateX(0);
            transform: translateX(0);
  }
}
@media screen and (max-width: 767px) {
  .notification-content__6NBh[data-status='entered'] {
    margin-top: 0;
  }
}
.notification-content__6NBh[data-status='entering'],
.notification-content__6NBh[data-status='exiting'],
.notification-content__6NBh[data-status='exited'] {
  -webkit-transition: all 0.2s, top 0ms;
  -o-transition: all 0.2s, top 0ms;
  transition: all 0.2s, top 0ms;
}
@media screen and (min-width: 768px) {
  .notification-content__6NBh[data-status='entering'],
  .notification-content__6NBh[data-status='exiting'],
  .notification-content__6NBh[data-status='exited'] {
    -webkit-transform: translateX(105%);
            transform: translateX(105%);
  }
}
@media screen and (max-width: 767px) {
  .notification-content__6NBh[data-status='entering'],
  .notification-content__6NBh[data-status='exiting'],
  .notification-content__6NBh[data-status='exited'] {
    margin-top: -65px;
  }
}
.notification-content__6NBh[data-status='entering'] .notification-content__6NBh > .inner__GYIP,
.notification-content__6NBh[data-status='exiting'] .notification-content__6NBh > .inner__GYIP,
.notification-content__6NBh[data-status='exited'] .notification-content__6NBh > .inner__GYIP {
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
  opacity: 0;
  -webkit-transform: translateY(20px);
          transform: translateY(20px);
  -webkit-animation-timing-function: ease-in;
          animation-timing-function: ease-in;
}
.notification-content__6NBh[data-status='exited'] {
  display: none;
}
.notification-content__6NBh > .inner__GYIP {
  -webkit-transition: 0.2s all;
  -o-transition: 0.2s all;
  transition: 0.2s all;
  opacity: 1;
  -webkit-transform: translateY(0);
          transform: translateY(0);
  -webkit-animation-timing-function: ease-in;
          animation-timing-function: ease-in;
  -webkit-transform-origin: 50% 50%;
          transform-origin: 50% 50%;
  width: 100%;
  position: -webkit-sticky;
  position: sticky;
  top: 0;
  -ms-flex-item-align: start;
      align-self: flex-start;
}
.notification-content__6NBh > .inner__GYIP .inner-content__1IIy {
  z-index: 150;
  background-color: white;
  min-width: 100px;
  height: 65px;
  width: 100%;
  padding: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  overflow: hidden;
  -webkit-box-shadow: rgba(0, 0, 0, 0.2) 0 2px 5px;
          box-shadow: rgba(0, 0, 0, 0.2) 0 2px 5px;
}
@media screen and (min-width: 768px) {
  .notification-content__6NBh > .inner__GYIP .inner-content__1IIy {
    border-radius: 4px;
  }
}
.close-notification-btn__2ppp {
  cursor: pointer;
  z-index: 1;
  position: absolute;
  right: 6px;
  top: 13px;
  width: 15px;
  height: 15px;
}
.close-notification-btn__2ppp:hover .cross__q6mv {
  background: #ac2925;
}
.close-notification-btn__2ppp .cross__q6mv {
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
  border-radius: 1020px;
  background: #dddddd;
  height: 2px;
  width: 15px;
  -webkit-transform-origin: 50% 50%;
          transform-origin: 50% 50%;
}
.close-notification-btn__2ppp .cross__q6mv:first-child {
  -webkit-transform: rotate(45deg) translateY(1px);
          transform: rotate(45deg) translateY(1px);
}
.close-notification-btn__2ppp .cross__q6mv:last-child {
  -webkit-transform: rotate(-45deg) translateY(-1px);
          transform: rotate(-45deg) translateY(-1px);
}
@media screen and (min-width: 768px) {
  .fixed__22l5 {
    position: fixed;
    top: 5px;
    right: 5px;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-notification-button__w3Vq,
.lc-notification-dropdown-container__TQAK {
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
}
.lc-notification-dropdown__1vou {
  position: absolute;
  border-radius: 4px;
  background-color: white;
  -webkit-box-shadow: rgba(0, 0, 0, 0.2) 0 2px 5px;
          box-shadow: rgba(0, 0, 0, 0.2) 0 2px 5px;
  top: calc(100% + 1px);
  right: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.lc-notification-dropdown-container__TQAK {
  border-top: 1px solid #ecf0f1;
}
.lc-notification-dropdown-container__TQAK:first-child {
  border-top: none;
}
.lc-notification-dropdown-container__TQAK:first-child .lc-notification-button__w3Vq {
  border-top-right-radius: 4px;
}
.lc-notification-dropdown-container__TQAK .lc-notification-button__w3Vq {
  border-top-right-radius: 0;
  border-bottom-right-radius: 4px;
}
.lc-notification-button__w3Vq {
  width: 100%;
  max-width: 42px;
  padding: 6px;
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  font-size: 12px;
  font-weight: 400;
  color: #95a5a6;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  border-top: 1px solid #ecf0f1;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.lc-notification-button__w3Vq .lc-notification-button__w3Vq {
  border-top: none;
}
.lc-notification-button__w3Vq:hover {
  cursor: pointer;
  background-color: #ecf0f1;
}
.lc-notification-button__w3Vq:first-child {
  border-top: none;
  border-top-right-radius: 4px;
}
.lc-notification-button__w3Vq:last-child {
  border-bottom-right-radius: 4px;
}
.lc-notification-dropdown-button__1Fq5 {
  max-width: 250px;
  min-width: 55px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
  padding: 6px;
  border-top: 1px solid #ecf0f1;
  font-size: 12px;
  font-weight: 400;
  color: #95a5a6;
}
.lc-notification-dropdown-button__1Fq5:first-child {
  border-top: none;
  border-top-right-radius: 4px;
}
.lc-notification-dropdown-button__1Fq5:last-child {
  border-bottom-right-radius: 4px;
}
.lc-notification-dropdown-button__1Fq5:hover {
  cursor: pointer;
  background-color: #ecf0f1;
}
.disabled__1YhJ {
  color: #bdc3c7;
}
.disabled__1YhJ:hover {
  cursor: default;
  background-color: transparent;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-notification-button-group__35sv {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 55px;
          flex: 0 0 55px;
  border-left: 1px solid #ecf0f1;
  -ms-flex-item-align: end;
      align-self: flex-end;
  height: 100%;
}
.lc-notification-button-group__35sv[data-status='exited'] {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-notification-icon-container__1YjM {
  color: white;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  height: 65px;
  -ms-flex-item-align: start;
      align-self: flex-start;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 59px;
          flex: 0 0 59px;
}
@media screen and (min-width: 768px) {
  .lc-notification-icon-container__1YjM {
    border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.message-box__17I3 {
  position: relative;
  margin: 15px 0;
  padding: 15px 20px;
  border-radius: 5px;
}
.message-box__17I3 .close__1QFu {
  position: absolute;
  top: 15px;
  right: 15px;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.crash__1bT4 {
  position: absolute;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  margin: auto;
  width: 300px;
  height: 150px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
</style><script type="text/javascript" charset="utf8" async="" src="./104-Maximum-Depth-of-Binary-Tree_files/en.js.download"></script><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.loading__2SyG {
  display: inline-block;
  color: #3c4859;
  text-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
}
.loading__2SyG[data-show='false'] {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.loading-area__2xs9 {
  position: relative;
  display: block;
  height: 100%;
}
.loading-area__2xs9[data-show='false'] {
  display: none;
}
.loading-icon__1IZD {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  margin: auto;
  width: 24px;
  height: 24px;
  font-size: 24px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.page-drawer-base__-zHW {
  -webkit-transition: 0.4s all !important;
  -o-transition: 0.4s all !important;
  transition: 0.4s all !important;
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
  z-index: 147;
  border-top: 1px solid #dddddd;
  background: white;
  min-height: 200px;
  height: auto;
  -webkit-box-shadow: 0 0 50px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 0 50px 0 rgba(0, 0, 0, 0.15);
  -webkit-transition: -webkit-box-shadow 0.4s;
  transition: -webkit-box-shadow 0.4s;
  -o-transition: box-shadow 0.4s;
  transition: box-shadow 0.4s;
  transition: box-shadow 0.4s, -webkit-box-shadow 0.4s;
}
.page-drawer-base__-zHW:hover {
  -webkit-box-shadow: 0 0 50px 0 rgba(0, 0, 0, 0.3);
          box-shadow: 0 0 50px 0 rgba(0, 0, 0, 0.3);
}
.page-drawer-base__-zHW[data-appear='false'] {
  min-height: 0 !important;
  height: 0 !important;
  opacity: 0;
}
.page-drawer-base__-zHW[data-appear='true'] {
  opacity: 1;
}
.page-drawer-base__-zHW[data-fullscreen='true'] {
  min-height: calc(100vh - 52px - 40px / 2 - 10px);
}
.page-drawer-base__-zHW .btn-container {
  height: 0;
  z-index: 1;
}
.page-drawer-base__-zHW .content-container {
  height: 100%;
  margin: 0 10px;
}
.page-drawer-base__-zHW .fullscreen-btn {
  -webkit-box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
  -webkit-transition: -webkit-box-shadow 0.4s;
  transition: -webkit-box-shadow 0.4s;
  -o-transition: box-shadow 0.4s;
  transition: box-shadow 0.4s;
  transition: box-shadow 0.4s, -webkit-box-shadow 0.4s;
  border: 1px solid #dddddd;
  height: 40px;
  width: 40px;
  margin-top: -22px;
  text-align: center;
  padding: 8px 0 0 0;
}
.page-drawer-base__-zHW .fullscreen-btn:hover {
  -webkit-box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
}
.fullscreen-btn-wrapper__1TBu {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__2vgc .progress {
  height: 12px;
  margin: 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.search-input__1IOH {
  display: inline-block;
  border-top-right-radius: 0;
  border-bottom-right-radius: 0;
  width: calc(100% - 38px);
}
.search-btn__2pHJ {
  border-left: none;
  border-top-left-radius: 0;
  border-bottom-left-radius: 0;
}
.base__1K9q[data-round='true'] .search-input__1IOH {
  border-top-left-radius: 1020px;
  border-bottom-left-radius: 1020px;
}
.base__1K9q[data-round='true'] .search-btn__2pHJ {
  width: 38px;
  border-top-right-radius: 1020px;
  border-bottom-right-radius: 1020px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.switch-base__1Zql {
  display: inline-block;
  position: relative;
  border: 1px solid #dddddd;
  border-radius: 1020px;
  height: 24px;
  width: 45px;
  cursor: pointer;
}
.switch-base__1Zql,
.switch-base__1Zql * {
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
}
.switch-base__1Zql .toggle__3ZBJ {
  height: 20px;
  width: 20px;
  background: white;
  -webkit-box-shadow: 0 3px 5px 0 rgba(0, 0, 0, 0.1);
          box-shadow: 0 3px 5px 0 rgba(0, 0, 0, 0.1);
  border: 1px solid #dddddd;
  border-radius: 1020px;
  position: absolute;
  top: 1px;
}
.switch-base__1Zql[data-on='false'] .toggle__3ZBJ {
  left: 1px;
}
.switch-base__1Zql[data-on='true'] {
  background: #1da09c;
}
.switch-base__1Zql[data-on='true'] .toggle__3ZBJ {
  border: 1px solid white;
  left: 22px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.group__3y5f .btn:focus {
  outline: none;
}
.group__3y5f .btn[data-active='true'] {
  background: #d2d8e0;
  pointer-events: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.pagination-base__aILV .page-btn,
.pagination-base__aILV .prev-btn,
.pagination-base__aILV .next-btn {
  cursor: pointer;
}
.pagination-base__aILV.light-pager__1ng8 {
  text-align: center;
}
.pagination-base__aILV.light-pager__1ng8 .disabled,
.pagination-base__aILV.light-pager__1ng8 *:disabled {
  opacity: 0.5;
  pointer-events: none;
}
.pagination-base__aILV.light-pager__1ng8 .prev-btn,
.pagination-base__aILV.light-pager__1ng8 .next-btn {
  position: absolute;
}
.pagination-base__aILV.light-pager__1ng8 .prev-btn,
.pagination-base__aILV.light-pager__1ng8 .next-btn,
.pagination-base__aILV.light-pager__1ng8 .prev-btn:hover,
.pagination-base__aILV.light-pager__1ng8 .next-btn:hover {
  background: transparent !important;
}
.pagination-base__aILV.light-pager__1ng8 .prev-btn > *,
.pagination-base__aILV.light-pager__1ng8 .next-btn > * {
  height: 32px;
  width: 32px;
  text-align: center;
  padding-left: 0;
  padding-right: 0;
  font-size: 0;
  color: transparent;
  padding-top: 7px;
  border: none;
  border-top-left-radius: 1020px !important;
  border-top-right-radius: 1020px !important;
  border-bottom-left-radius: 1020px !important;
  border-bottom-right-radius: 1020px !important;
  background: white;
  -webkit-box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
  -webkit-transition: -webkit-box-shadow 0.4s;
  transition: -webkit-box-shadow 0.4s;
  -o-transition: box-shadow 0.4s;
  transition: box-shadow 0.4s;
  transition: box-shadow 0.4s, -webkit-box-shadow 0.4s;
}
.pagination-base__aILV.light-pager__1ng8 .prev-btn > *:hover,
.pagination-base__aILV.light-pager__1ng8 .next-btn > *:hover {
  -webkit-box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
}
.pagination-base__aILV.light-pager__1ng8 .page-btn > * {
  border-radius: 10px;
  border: none;
  margin-left: 5px;
  margin-right: 5px;
  background: white;
  -webkit-box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
  -webkit-transition: -webkit-box-shadow 0.4s;
  transition: -webkit-box-shadow 0.4s;
  -o-transition: box-shadow 0.4s;
  transition: box-shadow 0.4s;
  transition: box-shadow 0.4s, -webkit-box-shadow 0.4s;
}
.pagination-base__aILV.light-pager__1ng8 .page-btn > *:hover {
  -webkit-box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
}
.pagination-base__aILV.light-pager__1ng8 .page-btn > *:active,
.pagination-base__aILV.light-pager__1ng8 .page-btn > *.active,
.pagination-base__aILV.light-pager__1ng8 .page-btn > *:focus {
  background-color: #3fbbff !important;
}
.pagination-base__aILV.light-pager__1ng8 .page-btn.disabled > * {
  -webkit-box-shadow: none !important;
          box-shadow: none !important;
  background: none !important;
}
.pagination-base__aILV.light-pager__1ng8 .prev-btn {
  left: 0;
}
.pagination-base__aILV.light-pager__1ng8 .prev-btn > *::after {
  color: black;
  font: normal normal normal 16px/1 FontAwesome;
  /* stylelint-disable-line */
  content: '\F104';
}
.pagination-base__aILV.light-pager__1ng8 .next-btn {
  right: 0;
}
.pagination-base__aILV.light-pager__1ng8 .next-btn > *::after {
  color: black;
  font: normal normal normal 16px/1 FontAwesome;
  /* stylelint-disable-line */
  content: '\F105';
}
.pagination-base__aILV.light-pager__1ng8 .page-btn:active,
.pagination-base__aILV.light-pager__1ng8 .page-btn.active,
.pagination-base__aILV.light-pager__1ng8 .page-btn:focus,
.pagination-base__aILV.light-pager__1ng8 .page-btn:active *,
.pagination-base__aILV.light-pager__1ng8 .page-btn.active *,
.pagination-base__aILV.light-pager__1ng8 .page-btn:focus * {
  background-color: #3fbbff !important;
}
.pagination-base__aILV.light-pager__1ng8 .pagination > .active > a,
.pagination-base__aILV.light-pager__1ng8 .pagination > .active > a:focus,
.pagination-base__aILV.light-pager__1ng8 .pagination > .active > a:hover,
.pagination-base__aILV.light-pager__1ng8 .pagination > .active > span,
.pagination-base__aILV.light-pager__1ng8 .pagination > .active > span:focus,
.pagination-base__aILV.light-pager__1ng8 .pagination > .active > span:hover {
  background-color: #3fbbff !important;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.share-button__1qQ5 {
  display: inline-block;
  margin-right: 5px;
  text-align: center;
  cursor: pointer;
}
.share-button__1qQ5:last-child {
  margin-right: 0;
}
.cn-container__30AW {
  text-align: center;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.not-found-wrapper__3V_q {
  width: 100%;
  margin-top: 140px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.not-found-wrapper__3V_q img,
.not-found-wrapper__3V_q .text__2qI2 {
  width: 300px;
}
@media (max-width: 400px) {
  .not-found-wrapper__3V_q img,
  .not-found-wrapper__3V_q .text__2qI2 {
    width: 100%;
  }
}
.not-found-wrapper__3V_q img {
  padding: 0 15px;
}
.not-found-wrapper__3V_q .text__2qI2 {
  padding: 0 15px 0 30px;
}
.not-found-wrapper__3V_q .text__2qI2 h3 {
  font-size: 30px;
  font-weight: 500;
}
.not-found-wrapper__3V_q .text__2qI2 .redirect-btn__1sb1 {
  padding: 6px 12px;
  margin-top: 25px;
}
@media (max-width: 992px) {
  .not-found-wrapper__3V_q {
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
        -ms-flex-direction: column;
            flex-direction: column;
    margin-top: 40px;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.error-message-container__msvN {
  -webkit-transition: opacity 0.3s;
  -o-transition: opacity 0.3s;
  transition: opacity 0.3s;
}
.error-message-container__msvN[data-is-error='false'] {
  opacity: 0;
  pointer-events: none;
}
.error-message__3Q-C {
  color: #c62928;
  font-size: 12px;
  line-height: 18px;
  margin: 10px 0 20px 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.icon__3Su4 {
  width: 1em;
  height: 1em;
  vertical-align: middle;
  fill: currentColor;
  overflow: hidden;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.btn__2FMG.fancy-btn__CYhs {
  position: relative;
  z-index: 0;
}
.btn__2FMG.fancy-btn__CYhs,
.btn__2FMG.fancy-btn__CYhs:hover:not([disabled]),
.btn__2FMG.fancy-btn__CYhs:active:not([disabled]),
.btn__2FMG.fancy-btn__CYhs:focus {
  color: #ffffff;
  background: transparent;
}
.btn__2FMG.fancy-btn__CYhs::before,
.btn__2FMG.fancy-btn__CYhs::after {
  content: ' ';
  position: absolute;
  width: 100%;
  height: 100%;
  left: 0;
  top: 0;
  border-radius: 3px;
  -webkit-transition: 0.18s opacity ease-in-out;
  -o-transition: 0.18s opacity ease-in-out;
  transition: 0.18s opacity ease-in-out;
}
.btn__2FMG.fancy-btn__CYhs::before {
  z-index: -1;
}
.btn__2FMG.fancy-btn__CYhs::after {
  opacity: 0.8;
  z-index: -2;
}
.btn__2FMG.fancy-btn__CYhs:hover:not([disabled])::before,
.btn__2FMG.fancy-btn__CYhs:focus::before {
  opacity: 0;
}
.btn__2FMG.fancy-btn__CYhs::before,
.btn__2FMG.fancy-btn__CYhs:active:not([disabled])::before {
  opacity: 1;
}
.primary__3S2m.light__3zR9::before {
  background: -webkit-linear-gradient(235deg, #546e7a, #37474f);
  background: -o-linear-gradient(235deg, #546e7a, #37474f);
  background: linear-gradient(215deg, #546e7a, #37474f);
}
.primary__3S2m.light__3zR9::after {
  background: -webkit-linear-gradient(55deg, #546e7a, #37474f);
  background: -o-linear-gradient(55deg, #546e7a, #37474f);
  background: linear-gradient(35deg, #546e7a, #37474f);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.btn__1eiM {
  border: 1px solid #b0bec5;
  border-radius: 3px;
  background: #ffffff;
  color: #455a64;
  line-height: 20px;
  font-size: 14px;
  -webkit-transition: 0.18s all ease-in-out;
  -o-transition: 0.18s all ease-in-out;
  transition: 0.18s all ease-in-out;
  outline: 0;
  cursor: pointer;
  /**
   * size related
   *============================= */
  /**
   * type related
   *============================= */
  /**
   * theme related
   *============================= */
  /**
   * disabled styles
   *============================= */
}
.btn-content-container__214G {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.btn-content__lOBM {
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.btn__1eiM svg:first-child {
  margin-left: -1px;
}
.btn__1eiM svg:last-child {
  margin-right: -1px;
}
.btn__1eiM:hover:not([disabled]),
.btn__1eiM:focus {
  color: #263238;
  border-color: #263238;
  background: #eceff1;
}
.btn__1eiM:active:not([disabled]) {
  color: #455a64;
  border-color: #b0bec5;
  background: #eceff1;
}
.btn__1eiM[data-no-border='true'] {
  border: 0;
}
.btn-lg__2g-N {
  height: 44px;
  padding: 0 14px;
}
.btn-lg__2g-N[data-no-border='true'] {
  padding: 0 15px;
}
.btn-md__3VAX {
  height: 40px;
  padding: 0 12px;
}
.btn-md__3VAX[data-no-border='true'] {
  padding: 0 13px;
}
.btn-sm__Woog {
  height: 32px;
  padding: 0 9px;
}
.btn-sm__Woog[data-no-border='true'] {
  padding: 0 10px;
}
.btn-xs__2rgD {
  height: 28px;
  padding: 0 7px;
}
.btn-xs__2rgD[data-no-border='true'] {
  padding: 0 8px;
}
.btn-lg__2g-N svg,
.btn-md__3VAX svg {
  width: 16px;
  height: 16px;
  margin: 0 5px;
}
.btn-sm__Woog,
.btn-xs__2rgD {
  font-size: 12px;
}
.btn-sm__Woog svg,
.btn-xs__2rgD svg {
  width: 14px;
  height: 14px;
  margin: 0 3px;
}
.btn-info__3x1M:hover:not([disabled]),
.btn-info__3x1M:focus {
  color: #263238;
  border-color: #263238;
  background: #eceff1;
}
.btn-info__3x1M,
.btn-info__3x1M:active:not([disabled]) {
  color: #90a4ae;
  border-color: #cfd8dc;
  background: #ffffff;
}
.btn-warn__1mcT:hover:not([disabled]),
.btn-warn__1mcT:focus {
  color: #f07c18;
  border-color: #f07c18;
  background: #ffffff;
}
.btn-warn__1mcT,
.btn-warn__1mcT:active:not([disabled]) {
  color: #f9a825;
  border-color: #f9a825;
  background: #ffffff;
}
.btn-danger__1rCi:hover:not([disabled]),
.btn-danger__1rCi:focus {
  color: #b71c1c;
  border-color: #b71c1c;
  background: #ffffff;
}
.btn-danger__1rCi,
.btn-danger__1rCi:active:not([disabled]) {
  color: #f54336;
  border-color: #f54336;
  background: #ffffff;
}
.btn-ghost__1PBo {
  color: #b0bec5;
  background: transparent;
}
.btn-ghost__1PBo:hover:not([disabled]),
.btn-ghost__1PBo:focus {
  color: #263238;
  background: #eceff1;
}
.btn-ghost__1PBo:active:not([disabled]) {
  color: #263238;
  background: #f7f9fa;
}
.btn-overlay__17sJ {
  color: #9e9e9e;
  background: transparent;
}
.btn-overlay__17sJ:hover:not([disabled]),
.btn-overlay__17sJ:focus {
  color: #212121;
  background: #f5f5f5;
}
.btn-overlay__17sJ:active:not([disabled]) {
  color: #212121;
  background: #fafafa;
}
.btn__1eiM.dark__3bsK:hover:not([disabled]),
.btn__1eiM.dark__3bsK:focus {
  color: #ffffff;
  border-color: #ffffff;
  background: #212121;
}
.btn__1eiM.dark__3bsK,
.btn__1eiM.dark__3bsK:active:not([disabled]) {
  color: #757575;
  border-color: #757575;
  background: #212121;
}
.btn-danger__1rCi.dark__3bsK:hover:not([disabled]),
.btn-danger__1rCi.dark__3bsK:focus {
  color: #ffffff;
  border-color: #ffffff;
  background: #b71c1c;
}
.btn-danger__1rCi.dark__3bsK,
.btn-danger__1rCi.dark__3bsK:active {
  color: #e53935;
  border-color: #e53935;
  background: #b71c1c;
}
.btn-overlay__17sJ.dark__3bsK:hover:not([disabled]),
.btn-overlay__17sJ.dark__3bsK:focus {
  color: #ffffff;
  border-color: #ffffff;
  background: transparent;
}
.btn-overlay__17sJ.dark__3bsK,
.btn-overlay__17sJ.dark__3bsK:active {
  color: #b0bec5;
  border-color: #b0bec5;
  background: transparent;
}
.btn-overlay__17sJ.dark__3bsK[disabled] {
  color: #90a4ae;
  border-color: #90a4ae;
  background: transparent;
}
.btn-overlay-primary__XYP3.dark__3bsK:hover:not([disabled]),
.btn-overlay-primary__XYP3.dark__3bsK:focus {
  color: #ffffff;
  border-color: #ffffff;
  background: transparent;
}
.btn-overlay-primary__XYP3.dark__3bsK,
.btn-overlay-primary__XYP3.dark__3bsK:active {
  color: #eceff1;
  border-color: #eceff1;
  background: transparent;
}
.btn-overlay-primary__XYP3.dark__3bsK[disabled] {
  color: #90a4ae;
  border-color: #90a4ae;
  background: transparent;
}
.btn__1eiM[disabled]:not(.dark__3bsK) {
  opacity: 0.3;
  cursor: not-allowed;
}
.btn__1eiM.dark__3bsK[disabled] {
  color: white;
  border-color: #bdbdbd;
  cursor: not-allowed;
  opacity: 0.6;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.tag-btn__3shi:hover,
.tag-btn__3shi:focus {
  color: #263238;
  border-color: #263238;
  background: #eceff1;
}
.tag-btn__3shi,
.tag-btn__3shi:active {
  color: #546e7a;
  border-color: #cfd8dc;
  background: #f7f9fa;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__3yGD {
  display: inline-block;
  position: relative;
}
.input__2W4f {
  width: 100%;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  color: #546e7a;
  border: 1px solid #cfd8dc;
  border-radius: 3px;
  font-weight: 300;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
}
.input__2W4f::-webkit-input-placeholder {
  color: #90a4ae;
}
.input__2W4f:-ms-input-placeholder {
  color: #90a4ae;
}
.input__2W4f::-ms-input-placeholder {
  color: #90a4ae;
}
.input__2W4f::placeholder {
  color: #90a4ae;
}
.input__2W4f:hover:not(.error__3Vyn):not(.disabled__1bNY) {
  color: #263238;
  border-color: #263238;
}
.input__2W4f:focus {
  color: #263238;
  border-color: #263238;
  outline: none !important;
  -webkit-box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
          box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
}
.input__2W4f.error__3Vyn:focus {
  border-color: #c62928;
}
.xs__2Gfe .input__2W4f {
  padding: 4.3px 8px;
  font-size: 12px;
}
.sm__YB7w .input__2W4f {
  padding: 6.3px 10px;
  font-size: 12px;
}
.md__fHSR .input__2W4f {
  padding: 8.85px 13px;
  font-size: 14px;
}
.lg__3Xm8 .input__2W4f {
  padding: 10.85px 15px;
  font-size: 14px;
}
.error__3Vyn {
  border-color: #c62928;
}
.errormsg__2piM {
  border-radius: 3px;
  position: absolute;
  top: 1px;
  right: 1px;
  font-size: 14px;
  text-align: right;
  color: #c62928;
  background-image: -webkit-gradient(linear, left top, right top, from(rgba(255, 255, 255, 0)), color-stop(25%, white), to(white));
  background-image: -webkit-linear-gradient(left, rgba(255, 255, 255, 0) 0%, white 25%, white 100%);
  background-image: -o-linear-gradient(left, rgba(255, 255, 255, 0) 0%, white 25%, white 100%);
  background-image: linear-gradient(to right, rgba(255, 255, 255, 0) 0%, white 25%, white 100%);
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
}
.dark__37E4 + .errormsg__2piM {
  background-image: -webkit-gradient(linear, left top, right top, from(rgba(33, 33, 33, 0)), color-stop(25%, #212121), to(#212121));
  background-image: -webkit-linear-gradient(left, rgba(33, 33, 33, 0) 0%, #212121 25%, #212121 100%);
  background-image: -o-linear-gradient(left, rgba(33, 33, 33, 0) 0%, #212121 25%, #212121 100%);
  background-image: linear-gradient(to right, rgba(33, 33, 33, 0) 0%, #212121 25%, #212121 100%);
}
.xs__2Gfe .errormsg__2piM {
  padding: 0 8px 0 16px;
  line-height: 26px;
  height: 26px;
}
.sm__YB7w .errormsg__2piM {
  padding: 0 10px 0 20px;
  line-height: 30px;
  height: 30px;
}
.md__fHSR .errormsg__2piM {
  padding: 0 13px 0 26px;
  line-height: 38px;
  height: 38px;
}
.lg__3Xm8 .errormsg__2piM {
  padding: 0 15px 0 30px;
  line-height: 42px;
  height: 42px;
}
.dark__37E4 {
  color: #e0e0e0;
  background-color: #212121;
  border: 1px solid #757575;
}
.dark__37E4::-webkit-input-placeholder {
  color: #757575;
}
.dark__37E4:-ms-input-placeholder {
  color: #757575;
}
.dark__37E4::-ms-input-placeholder {
  color: #757575;
}
.dark__37E4::placeholder {
  color: #757575;
}
.dark__37E4:hover:not(.error__3Vyn):not(.disabled__1bNY) {
  color: white;
  border-color: white;
}
.dark__37E4:focus:not(.disabled__1bNY) {
  color: white;
  outline: none !important;
  border-color: white;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.dark__37E4.error__3Vyn,
.dark__37E4.error__3Vyn:focus {
  border-color: #c62928;
}
.input__2W4f.disabled__1bNY {
  color: #bdbdbd;
  background-color: #fafafa;
  border-color: #e0e0e0;
}
.input__2W4f.disabled__1bNY::-webkit-input-placeholder {
  color: #bdbdbd;
}
.input__2W4f.disabled__1bNY:-ms-input-placeholder {
  color: #bdbdbd;
}
.input__2W4f.disabled__1bNY::-ms-input-placeholder {
  color: #bdbdbd;
}
.input__2W4f.disabled__1bNY::placeholder {
  color: #bdbdbd;
}
.input__2W4f.disabled__1bNY:hover:not(.error__3Vyn) {
  color: #bdbdbd;
  border-color: #e0e0e0;
}
.input__2W4f.disabled__1bNY:focus:not(.error__3Vyn) {
  color: #bdbdbd;
  border-color: #e0e0e0;
  outline: none !important;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.input__2W4f.disabled__1bNY.dark__37E4 {
  color: #9e9e9e;
  background-color: #424242;
  border-color: #757575;
}
.input__2W4f.disabled__1bNY.dark__37E4::-webkit-input-placeholder {
  color: #9e9e9e;
}
.input__2W4f.disabled__1bNY.dark__37E4:-ms-input-placeholder {
  color: #9e9e9e;
}
.input__2W4f.disabled__1bNY.dark__37E4::-ms-input-placeholder {
  color: #9e9e9e;
}
.input__2W4f.disabled__1bNY.dark__37E4::placeholder {
  color: #9e9e9e;
}
.input__2W4f.disabled__1bNY.dark__37E4:hover:not(.error__3Vyn) {
  color: #9e9e9e;
  border-color: #757575;
}
.input__2W4f.disabled__1bNY.dark__37E4:focus:not(.error__3Vyn) {
  color: #9e9e9e;
  border-color: #757575;
  outline: none !important;
  -webkit-box-shadow: none;
          box-shadow: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__3PJ4 {
  display: inline-block;
  position: relative;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.wrapper__3PJ4 input:focus + .search__1Rtr {
  color: #263238;
}
.wrapper__3PJ4:hover:not(.error__F77R):not(.disabled__26rr) .search__1Rtr {
  color: #263238;
}
.wrapper__3PJ4:hover:not(.error__F77R):not(.disabled__26rr) input {
  border-color: #263238;
}
.wrapper__3PJ4 .searchinput__3xUp {
  width: 100%;
}
.wrapper__3PJ4.xs__2TMM input {
  padding-right: 28px;
}
.wrapper__3PJ4.sm__smpp input {
  padding-right: 32px;
}
.wrapper__3PJ4.md__2VvZ input {
  padding-right: 40px;
}
.wrapper__3PJ4.lg__3mwQ input {
  padding-right: 44px;
}
.wrapper__3PJ4.dark__2glv input:focus + .search__1Rtr {
  color: white;
}
.wrapper__3PJ4.dark__2glv:hover:not(.error__F77R):not(.disabled__26rr) .search__1Rtr {
  color: white;
}
.wrapper__3PJ4.dark__2glv:hover:not(.error__F77R):not(.disabled__26rr) input {
  border-color: white;
}
.wrapper__3PJ4.dark__2glv .search__1Rtr {
  color: #757575;
}
.wrapper__3PJ4:not(.disabled__26rr) .search__1Rtr {
  cursor: pointer;
}
.search__1Rtr {
  color: #cfd8dc;
  position: absolute;
  right: 0;
  top: 0;
  margin: 0;
  padding: 0;
}
.search__1Rtr > svg {
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
}
.xs__2TMM .search__1Rtr {
  width: 28px;
  height: 28px;
}
.xs__2TMM .search__1Rtr > svg {
  width: 18px;
  height: 18px;
}
.sm__smpp .search__1Rtr {
  width: 32px;
  height: 32px;
}
.sm__smpp .search__1Rtr > svg {
  width: 20px;
  height: 20px;
}
.md__2VvZ .search__1Rtr {
  width: 40px;
  height: 40px;
}
.md__2VvZ .search__1Rtr > svg {
  width: 24px;
  height: 24px;
}
.lg__3mwQ .search__1Rtr {
  width: 44px;
  height: 44px;
}
.lg__3mwQ .search__1Rtr > svg {
  width: 24px;
  height: 24px;
}
.dark__2glv {
  color: #757575;
}
.disabled__26rr {
  color: #e0e0e0;
}
.disableddark__3Y4C {
  color: #757575;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
/* stylelint-disable at-rule-no-unknown */
html,
body {
  width: 100%;
  height: 100%;
}
input::-ms-clear,
input::-ms-reveal {
  display: none;
}
*,
*::before,
*::after {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
}
html {
  font-family: sans-serif;
  line-height: 1.15;
  -webkit-text-size-adjust: 100%;
  -ms-text-size-adjust: 100%;
  -ms-overflow-style: scrollbar;
  -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
}
@-ms-viewport {
  width: device-width;
}
article,
aside,
dialog,
figcaption,
figure,
footer,
header,
hgroup,
main,
nav,
section {
  display: block;
}
body {
  margin: 0;
  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'PingFang SC', 'Hiragino Sans GB', 'Microsoft YaHei', 'Helvetica Neue', Helvetica, Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol';
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  background-color: #fff;
}
[tabindex='-1']:focus {
  outline: none !important;
}
hr {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  height: 0;
  overflow: visible;
}
h1,
h2,
h3,
h4,
h5,
h6 {
  margin-top: 0;
  margin-bottom: 0.5em;
  color: rgba(0, 0, 0, 0.85);
  font-weight: 500;
}
p {
  margin-top: 0;
  margin-bottom: 1em;
}
abbr[title],
abbr[data-original-title] {
  text-decoration: underline;
  -webkit-text-decoration: underline dotted;
          text-decoration: underline dotted;
  cursor: help;
  border-bottom: 0;
}
address {
  margin-bottom: 1em;
  font-style: normal;
  line-height: inherit;
}
input[type='text'],
input[type='password'],
input[type='number'],
textarea {
  -webkit-appearance: none;
}
ol,
ul,
dl {
  margin-top: 0;
  margin-bottom: 1em;
}
ol ol,
ul ul,
ol ul,
ul ol {
  margin-bottom: 0;
}
dt {
  font-weight: 500;
}
dd {
  margin-bottom: 0.5em;
  margin-left: 0;
}
blockquote {
  margin: 0 0 1em;
}
dfn {
  font-style: italic;
}
b,
strong {
  font-weight: bolder;
}
small {
  font-size: 80%;
}
sub,
sup {
  position: relative;
  font-size: 75%;
  line-height: 0;
  vertical-align: baseline;
}
sub {
  bottom: -0.25em;
}
sup {
  top: -0.5em;
}
a {
  color: #1890ff;
  background-color: transparent;
  text-decoration: none;
  outline: none;
  cursor: pointer;
  -webkit-transition: color 0.3s;
  -o-transition: color 0.3s;
  transition: color 0.3s;
  -webkit-text-decoration-skip: objects;
}
a:focus {
  text-decoration: underline;
  text-decoration-skip-ink: auto;
}
a:hover {
  color: #40a9ff;
}
a:active {
  color: #096dd9;
}
a:active,
a:hover {
  outline: 0;
  text-decoration: none;
}
a[disabled] {
  color: rgba(0, 0, 0, 0.25);
  cursor: not-allowed;
  pointer-events: none;
}
pre,
code,
kbd,
samp {
  font-family: 'SFMono-Regular', Consolas, 'Liberation Mono', Menlo, Courier, monospace;
  font-size: 1em;
}
pre {
  margin-top: 0;
  margin-bottom: 1em;
  overflow: auto;
}
figure {
  margin: 0 0 1em;
}
img {
  vertical-align: middle;
  border-style: none;
}
svg:not(:root) {
  overflow: hidden;
}
a,
area,
button,
[role='button'],
input:not([type='range']),
label,
select,
summary,
textarea {
  -ms-touch-action: manipulation;
      touch-action: manipulation;
}
table {
  border-collapse: collapse;
}
caption {
  padding-top: 0.75em;
  padding-bottom: 0.3em;
  color: rgba(0, 0, 0, 0.45);
  text-align: left;
  caption-side: bottom;
}
th {
  text-align: inherit;
}
input,
button,
select,
optgroup,
textarea {
  margin: 0;
  font-family: inherit;
  font-size: inherit;
  line-height: inherit;
  color: inherit;
}
button,
input {
  overflow: visible;
}
button,
select {
  text-transform: none;
}
button,
html [type="button"],
[type="reset"],
[type="submit"] {
  -webkit-appearance: button;
}
button::-moz-focus-inner,
[type='button']::-moz-focus-inner,
[type='reset']::-moz-focus-inner,
[type='submit']::-moz-focus-inner {
  padding: 0;
  border-style: none;
}
input[type='radio'],
input[type='checkbox'] {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  padding: 0;
}
input[type='date'],
input[type='time'],
input[type='datetime-local'],
input[type='month'] {
  -webkit-appearance: listbox;
}
textarea {
  overflow: auto;
  resize: vertical;
}
fieldset {
  min-width: 0;
  padding: 0;
  margin: 0;
  border: 0;
}
legend {
  display: block;
  width: 100%;
  max-width: 100%;
  padding: 0;
  margin-bottom: 0.5em;
  font-size: 1.5em;
  line-height: inherit;
  color: inherit;
  white-space: normal;
}
progress {
  vertical-align: baseline;
}
[type='number']::-webkit-inner-spin-button,
[type='number']::-webkit-outer-spin-button {
  height: auto;
}
[type='search'] {
  outline-offset: -2px;
  -webkit-appearance: none;
}
[type='search']::-webkit-search-cancel-button,
[type='search']::-webkit-search-decoration {
  -webkit-appearance: none;
}
::-webkit-file-upload-button {
  font: inherit;
  -webkit-appearance: button;
}
output {
  display: inline-block;
}
summary {
  display: list-item;
}
template {
  display: none;
}
[hidden] {
  display: none !important;
}
mark {
  padding: 0.2em;
  background-color: #feffe6;
}
::-moz-selection {
  background: #1890ff;
  color: #fff;
}
::selection {
  background: #1890ff;
  color: #fff;
}
.clearfix {
  zoom: 1;
}
.clearfix::before,
.clearfix::after {
  content: ' ';
  display: table;
}
.clearfix::after {
  clear: both;
}
.clearfix:before,
.clearfix:after {
  content: '';
  display: table;
}
.clearfix:after {
  clear: both;
}
.anticon {
  display: inline-block;
  font-style: normal;
  vertical-align: -0.125em;
  text-align: center;
  text-transform: none;
  line-height: 0;
  text-rendering: optimizeLegibility;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
.anticon > * {
  line-height: 1;
}
.anticon svg {
  display: inline-block;
}
.anticon:before {
  display: none;
}
.anticon .anticon-icon {
  display: block;
}
.anticon[tabindex] {
  cursor: pointer;
}
.anticon-spin:before {
  display: inline-block;
  -webkit-animation: loadingCircle 1s infinite linear;
          animation: loadingCircle 1s infinite linear;
}
.anticon-spin {
  display: inline-block;
  -webkit-animation: loadingCircle 1s infinite linear;
          animation: loadingCircle 1s infinite linear;
}
.fade-enter,
.fade-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.fade-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.fade-enter.fade-enter-active,
.fade-appear.fade-appear-active {
  -webkit-animation-name: antFadeIn;
          animation-name: antFadeIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.fade-leave.fade-leave-active {
  -webkit-animation-name: antFadeOut;
          animation-name: antFadeOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.fade-enter,
.fade-appear {
  opacity: 0;
  -webkit-animation-timing-function: linear;
          animation-timing-function: linear;
}
.fade-leave {
  -webkit-animation-timing-function: linear;
          animation-timing-function: linear;
}
@-webkit-keyframes antFadeIn {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
@keyframes antFadeIn {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
@-webkit-keyframes antFadeOut {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
@keyframes antFadeOut {
  0% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
.move-up-enter,
.move-up-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.move-up-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.move-up-enter.move-up-enter-active,
.move-up-appear.move-up-appear-active {
  -webkit-animation-name: antMoveUpIn;
          animation-name: antMoveUpIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.move-up-leave.move-up-leave-active {
  -webkit-animation-name: antMoveUpOut;
          animation-name: antMoveUpOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.move-up-enter,
.move-up-appear {
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.move-up-leave {
  -webkit-animation-timing-function: cubic-bezier(0.6, 0.04, 0.98, 0.34);
          animation-timing-function: cubic-bezier(0.6, 0.04, 0.98, 0.34);
}
.move-down-enter,
.move-down-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.move-down-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.move-down-enter.move-down-enter-active,
.move-down-appear.move-down-appear-active {
  -webkit-animation-name: antMoveDownIn;
          animation-name: antMoveDownIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.move-down-leave.move-down-leave-active {
  -webkit-animation-name: antMoveDownOut;
          animation-name: antMoveDownOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.move-down-enter,
.move-down-appear {
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.move-down-leave {
  -webkit-animation-timing-function: cubic-bezier(0.6, 0.04, 0.98, 0.34);
          animation-timing-function: cubic-bezier(0.6, 0.04, 0.98, 0.34);
}
.move-left-enter,
.move-left-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.move-left-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.move-left-enter.move-left-enter-active,
.move-left-appear.move-left-appear-active {
  -webkit-animation-name: antMoveLeftIn;
          animation-name: antMoveLeftIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.move-left-leave.move-left-leave-active {
  -webkit-animation-name: antMoveLeftOut;
          animation-name: antMoveLeftOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.move-left-enter,
.move-left-appear {
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.move-left-leave {
  -webkit-animation-timing-function: cubic-bezier(0.6, 0.04, 0.98, 0.34);
          animation-timing-function: cubic-bezier(0.6, 0.04, 0.98, 0.34);
}
.move-right-enter,
.move-right-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.move-right-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.move-right-enter.move-right-enter-active,
.move-right-appear.move-right-appear-active {
  -webkit-animation-name: antMoveRightIn;
          animation-name: antMoveRightIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.move-right-leave.move-right-leave-active {
  -webkit-animation-name: antMoveRightOut;
          animation-name: antMoveRightOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.move-right-enter,
.move-right-appear {
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.move-right-leave {
  -webkit-animation-timing-function: cubic-bezier(0.6, 0.04, 0.98, 0.34);
          animation-timing-function: cubic-bezier(0.6, 0.04, 0.98, 0.34);
}
@-webkit-keyframes antMoveDownIn {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(100%);
            transform: translateY(100%);
    opacity: 0;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(0%);
            transform: translateY(0%);
    opacity: 1;
  }
}
@keyframes antMoveDownIn {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(100%);
            transform: translateY(100%);
    opacity: 0;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(0%);
            transform: translateY(0%);
    opacity: 1;
  }
}
@-webkit-keyframes antMoveDownOut {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(0%);
            transform: translateY(0%);
    opacity: 1;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(100%);
            transform: translateY(100%);
    opacity: 0;
  }
}
@keyframes antMoveDownOut {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(0%);
            transform: translateY(0%);
    opacity: 1;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(100%);
            transform: translateY(100%);
    opacity: 0;
  }
}
@-webkit-keyframes antMoveLeftIn {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(-100%);
            transform: translateX(-100%);
    opacity: 0;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(0%);
            transform: translateX(0%);
    opacity: 1;
  }
}
@keyframes antMoveLeftIn {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(-100%);
            transform: translateX(-100%);
    opacity: 0;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(0%);
            transform: translateX(0%);
    opacity: 1;
  }
}
@-webkit-keyframes antMoveLeftOut {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(0%);
            transform: translateX(0%);
    opacity: 1;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(-100%);
            transform: translateX(-100%);
    opacity: 0;
  }
}
@keyframes antMoveLeftOut {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(0%);
            transform: translateX(0%);
    opacity: 1;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(-100%);
            transform: translateX(-100%);
    opacity: 0;
  }
}
@-webkit-keyframes antMoveRightIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(100%);
            transform: translateX(100%);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(0%);
            transform: translateX(0%);
  }
}
@keyframes antMoveRightIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(100%);
            transform: translateX(100%);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(0%);
            transform: translateX(0%);
  }
}
@-webkit-keyframes antMoveRightOut {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(0%);
            transform: translateX(0%);
    opacity: 1;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(100%);
            transform: translateX(100%);
    opacity: 0;
  }
}
@keyframes antMoveRightOut {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(0%);
            transform: translateX(0%);
    opacity: 1;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateX(100%);
            transform: translateX(100%);
    opacity: 0;
  }
}
@-webkit-keyframes antMoveUpIn {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(-100%);
            transform: translateY(-100%);
    opacity: 0;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(0%);
            transform: translateY(0%);
    opacity: 1;
  }
}
@keyframes antMoveUpIn {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(-100%);
            transform: translateY(-100%);
    opacity: 0;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(0%);
            transform: translateY(0%);
    opacity: 1;
  }
}
@-webkit-keyframes antMoveUpOut {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(0%);
            transform: translateY(0%);
    opacity: 1;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(-100%);
            transform: translateY(-100%);
    opacity: 0;
  }
}
@keyframes antMoveUpOut {
  0% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(0%);
            transform: translateY(0%);
    opacity: 1;
  }
  100% {
    -webkit-transform-origin: 0 0;
            transform-origin: 0 0;
    -webkit-transform: translateY(-100%);
            transform: translateY(-100%);
    opacity: 0;
  }
}
@-webkit-keyframes loadingCircle {
  100% {
    -webkit-transform: rotate(360deg);
            transform: rotate(360deg);
  }
}
@keyframes loadingCircle {
  100% {
    -webkit-transform: rotate(360deg);
            transform: rotate(360deg);
  }
}
[ant-click-animating='true'],
[ant-click-animating-without-extra-node='true'] {
  position: relative;
}
[ant-click-animating-without-extra-node='true']:after,
.ant-click-animating-node {
  content: '';
  position: absolute;
  top: -1px;
  left: -1px;
  bottom: -1px;
  right: -1px;
  border-radius: inherit;
  border: 0 solid #1890ff;
  opacity: 0.2;
  -webkit-animation: fadeEffect 2s cubic-bezier(0.08, 0.82, 0.17, 1), waveEffect 0.4s cubic-bezier(0.08, 0.82, 0.17, 1);
          animation: fadeEffect 2s cubic-bezier(0.08, 0.82, 0.17, 1), waveEffect 0.4s cubic-bezier(0.08, 0.82, 0.17, 1);
  -webkit-animation-fill-mode: forwards;
          animation-fill-mode: forwards;
  display: block;
  pointer-events: none;
}
@-webkit-keyframes waveEffect {
  100% {
    top: -6px;
    left: -6px;
    bottom: -6px;
    right: -6px;
    border-width: 6px;
  }
}
@keyframes waveEffect {
  100% {
    top: -6px;
    left: -6px;
    bottom: -6px;
    right: -6px;
    border-width: 6px;
  }
}
@-webkit-keyframes fadeEffect {
  100% {
    opacity: 0;
  }
}
@keyframes fadeEffect {
  100% {
    opacity: 0;
  }
}
.slide-up-enter,
.slide-up-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.slide-up-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.slide-up-enter.slide-up-enter-active,
.slide-up-appear.slide-up-appear-active {
  -webkit-animation-name: antSlideUpIn;
          animation-name: antSlideUpIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.slide-up-leave.slide-up-leave-active {
  -webkit-animation-name: antSlideUpOut;
          animation-name: antSlideUpOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.slide-up-enter,
.slide-up-appear {
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.23, 1, 0.32, 1);
          animation-timing-function: cubic-bezier(0.23, 1, 0.32, 1);
}
.slide-up-leave {
  -webkit-animation-timing-function: cubic-bezier(0.755, 0.05, 0.855, 0.06);
          animation-timing-function: cubic-bezier(0.755, 0.05, 0.855, 0.06);
}
.slide-down-enter,
.slide-down-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.slide-down-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.slide-down-enter.slide-down-enter-active,
.slide-down-appear.slide-down-appear-active {
  -webkit-animation-name: antSlideDownIn;
          animation-name: antSlideDownIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.slide-down-leave.slide-down-leave-active {
  -webkit-animation-name: antSlideDownOut;
          animation-name: antSlideDownOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.slide-down-enter,
.slide-down-appear {
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.23, 1, 0.32, 1);
          animation-timing-function: cubic-bezier(0.23, 1, 0.32, 1);
}
.slide-down-leave {
  -webkit-animation-timing-function: cubic-bezier(0.755, 0.05, 0.855, 0.06);
          animation-timing-function: cubic-bezier(0.755, 0.05, 0.855, 0.06);
}
.slide-left-enter,
.slide-left-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.slide-left-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.slide-left-enter.slide-left-enter-active,
.slide-left-appear.slide-left-appear-active {
  -webkit-animation-name: antSlideLeftIn;
          animation-name: antSlideLeftIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.slide-left-leave.slide-left-leave-active {
  -webkit-animation-name: antSlideLeftOut;
          animation-name: antSlideLeftOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.slide-left-enter,
.slide-left-appear {
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.23, 1, 0.32, 1);
          animation-timing-function: cubic-bezier(0.23, 1, 0.32, 1);
}
.slide-left-leave {
  -webkit-animation-timing-function: cubic-bezier(0.755, 0.05, 0.855, 0.06);
          animation-timing-function: cubic-bezier(0.755, 0.05, 0.855, 0.06);
}
.slide-right-enter,
.slide-right-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.slide-right-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.slide-right-enter.slide-right-enter-active,
.slide-right-appear.slide-right-appear-active {
  -webkit-animation-name: antSlideRightIn;
          animation-name: antSlideRightIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.slide-right-leave.slide-right-leave-active {
  -webkit-animation-name: antSlideRightOut;
          animation-name: antSlideRightOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.slide-right-enter,
.slide-right-appear {
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.23, 1, 0.32, 1);
          animation-timing-function: cubic-bezier(0.23, 1, 0.32, 1);
}
.slide-right-leave {
  -webkit-animation-timing-function: cubic-bezier(0.755, 0.05, 0.855, 0.06);
          animation-timing-function: cubic-bezier(0.755, 0.05, 0.855, 0.06);
}
@-webkit-keyframes antSlideUpIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(0.8);
            transform: scaleY(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
}
@keyframes antSlideUpIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(0.8);
            transform: scaleY(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
}
@-webkit-keyframes antSlideUpOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(0.8);
            transform: scaleY(0.8);
  }
}
@keyframes antSlideUpOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(0.8);
            transform: scaleY(0.8);
  }
}
@-webkit-keyframes antSlideDownIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 100% 100%;
            transform-origin: 100% 100%;
    -webkit-transform: scaleY(0.8);
            transform: scaleY(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 100% 100%;
            transform-origin: 100% 100%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
}
@keyframes antSlideDownIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 100% 100%;
            transform-origin: 100% 100%;
    -webkit-transform: scaleY(0.8);
            transform: scaleY(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 100% 100%;
            transform-origin: 100% 100%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
}
@-webkit-keyframes antSlideDownOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 100% 100%;
            transform-origin: 100% 100%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 100% 100%;
            transform-origin: 100% 100%;
    -webkit-transform: scaleY(0.8);
            transform: scaleY(0.8);
  }
}
@keyframes antSlideDownOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 100% 100%;
            transform-origin: 100% 100%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 100% 100%;
            transform-origin: 100% 100%;
    -webkit-transform: scaleY(0.8);
            transform: scaleY(0.8);
  }
}
@-webkit-keyframes antSlideLeftIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleX(0.8);
            transform: scaleX(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleX(1);
            transform: scaleX(1);
  }
}
@keyframes antSlideLeftIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleX(0.8);
            transform: scaleX(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleX(1);
            transform: scaleX(1);
  }
}
@-webkit-keyframes antSlideLeftOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleX(1);
            transform: scaleX(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleX(0.8);
            transform: scaleX(0.8);
  }
}
@keyframes antSlideLeftOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleX(1);
            transform: scaleX(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleX(0.8);
            transform: scaleX(0.8);
  }
}
@-webkit-keyframes antSlideRightIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 100% 0%;
            transform-origin: 100% 0%;
    -webkit-transform: scaleX(0.8);
            transform: scaleX(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 100% 0%;
            transform-origin: 100% 0%;
    -webkit-transform: scaleX(1);
            transform: scaleX(1);
  }
}
@keyframes antSlideRightIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 100% 0%;
            transform-origin: 100% 0%;
    -webkit-transform: scaleX(0.8);
            transform: scaleX(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 100% 0%;
            transform-origin: 100% 0%;
    -webkit-transform: scaleX(1);
            transform: scaleX(1);
  }
}
@-webkit-keyframes antSlideRightOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 100% 0%;
            transform-origin: 100% 0%;
    -webkit-transform: scaleX(1);
            transform: scaleX(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 100% 0%;
            transform-origin: 100% 0%;
    -webkit-transform: scaleX(0.8);
            transform: scaleX(0.8);
  }
}
@keyframes antSlideRightOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 100% 0%;
            transform-origin: 100% 0%;
    -webkit-transform: scaleX(1);
            transform: scaleX(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 100% 0%;
            transform-origin: 100% 0%;
    -webkit-transform: scaleX(0.8);
            transform: scaleX(0.8);
  }
}
.swing-enter,
.swing-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.swing-enter.swing-enter-active,
.swing-appear.swing-appear-active {
  -webkit-animation-name: antSwingIn;
          animation-name: antSwingIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
@-webkit-keyframes antSwingIn {
  0%,
  100% {
    -webkit-transform: translateX(0);
            transform: translateX(0);
  }
  20% {
    -webkit-transform: translateX(-10px);
            transform: translateX(-10px);
  }
  40% {
    -webkit-transform: translateX(10px);
            transform: translateX(10px);
  }
  60% {
    -webkit-transform: translateX(-5px);
            transform: translateX(-5px);
  }
  80% {
    -webkit-transform: translateX(5px);
            transform: translateX(5px);
  }
}
@keyframes antSwingIn {
  0%,
  100% {
    -webkit-transform: translateX(0);
            transform: translateX(0);
  }
  20% {
    -webkit-transform: translateX(-10px);
            transform: translateX(-10px);
  }
  40% {
    -webkit-transform: translateX(10px);
            transform: translateX(10px);
  }
  60% {
    -webkit-transform: translateX(-5px);
            transform: translateX(-5px);
  }
  80% {
    -webkit-transform: translateX(5px);
            transform: translateX(5px);
  }
}
.zoom-enter,
.zoom-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-enter.zoom-enter-active,
.zoom-appear.zoom-appear-active {
  -webkit-animation-name: antZoomIn;
          animation-name: antZoomIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.zoom-leave.zoom-leave-active {
  -webkit-animation-name: antZoomOut;
          animation-name: antZoomOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.zoom-enter,
.zoom-appear {
  -webkit-transform: scale(0);
          transform: scale(0);
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.zoom-leave {
  -webkit-animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
          animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.zoom-big-enter,
.zoom-big-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-big-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-big-enter.zoom-big-enter-active,
.zoom-big-appear.zoom-big-appear-active {
  -webkit-animation-name: antZoomBigIn;
          animation-name: antZoomBigIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.zoom-big-leave.zoom-big-leave-active {
  -webkit-animation-name: antZoomBigOut;
          animation-name: antZoomBigOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.zoom-big-enter,
.zoom-big-appear {
  -webkit-transform: scale(0);
          transform: scale(0);
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.zoom-big-leave {
  -webkit-animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
          animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.zoom-big-fast-enter,
.zoom-big-fast-appear {
  -webkit-animation-duration: 0.1s;
          animation-duration: 0.1s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-big-fast-leave {
  -webkit-animation-duration: 0.1s;
          animation-duration: 0.1s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-big-fast-enter.zoom-big-fast-enter-active,
.zoom-big-fast-appear.zoom-big-fast-appear-active {
  -webkit-animation-name: antZoomBigIn;
          animation-name: antZoomBigIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.zoom-big-fast-leave.zoom-big-fast-leave-active {
  -webkit-animation-name: antZoomBigOut;
          animation-name: antZoomBigOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.zoom-big-fast-enter,
.zoom-big-fast-appear {
  -webkit-transform: scale(0);
          transform: scale(0);
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.zoom-big-fast-leave {
  -webkit-animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
          animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.zoom-up-enter,
.zoom-up-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-up-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-up-enter.zoom-up-enter-active,
.zoom-up-appear.zoom-up-appear-active {
  -webkit-animation-name: antZoomUpIn;
          animation-name: antZoomUpIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.zoom-up-leave.zoom-up-leave-active {
  -webkit-animation-name: antZoomUpOut;
          animation-name: antZoomUpOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.zoom-up-enter,
.zoom-up-appear {
  -webkit-transform: scale(0);
          transform: scale(0);
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.zoom-up-leave {
  -webkit-animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
          animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.zoom-down-enter,
.zoom-down-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-down-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-down-enter.zoom-down-enter-active,
.zoom-down-appear.zoom-down-appear-active {
  -webkit-animation-name: antZoomDownIn;
          animation-name: antZoomDownIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.zoom-down-leave.zoom-down-leave-active {
  -webkit-animation-name: antZoomDownOut;
          animation-name: antZoomDownOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.zoom-down-enter,
.zoom-down-appear {
  -webkit-transform: scale(0);
          transform: scale(0);
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.zoom-down-leave {
  -webkit-animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
          animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.zoom-left-enter,
.zoom-left-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-left-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-left-enter.zoom-left-enter-active,
.zoom-left-appear.zoom-left-appear-active {
  -webkit-animation-name: antZoomLeftIn;
          animation-name: antZoomLeftIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.zoom-left-leave.zoom-left-leave-active {
  -webkit-animation-name: antZoomLeftOut;
          animation-name: antZoomLeftOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.zoom-left-enter,
.zoom-left-appear {
  -webkit-transform: scale(0);
          transform: scale(0);
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.zoom-left-leave {
  -webkit-animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
          animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.zoom-right-enter,
.zoom-right-appear {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-right-leave {
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.zoom-right-enter.zoom-right-enter-active,
.zoom-right-appear.zoom-right-appear-active {
  -webkit-animation-name: antZoomRightIn;
          animation-name: antZoomRightIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.zoom-right-leave.zoom-right-leave-active {
  -webkit-animation-name: antZoomRightOut;
          animation-name: antZoomRightOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
  pointer-events: none;
}
.zoom-right-enter,
.zoom-right-appear {
  -webkit-transform: scale(0);
          transform: scale(0);
  opacity: 0;
  -webkit-animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
          animation-timing-function: cubic-bezier(0.08, 0.82, 0.17, 1);
}
.zoom-right-leave {
  -webkit-animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
          animation-timing-function: cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
@-webkit-keyframes antZoomIn {
  0% {
    opacity: 0;
    -webkit-transform: scale(0.2);
            transform: scale(0.2);
  }
  100% {
    opacity: 1;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@keyframes antZoomIn {
  0% {
    opacity: 0;
    -webkit-transform: scale(0.2);
            transform: scale(0.2);
  }
  100% {
    opacity: 1;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@-webkit-keyframes antZoomOut {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(0.2);
            transform: scale(0.2);
  }
}
@keyframes antZoomOut {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(0.2);
            transform: scale(0.2);
  }
}
@-webkit-keyframes antZoomBigIn {
  0% {
    opacity: 0;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@keyframes antZoomBigIn {
  0% {
    opacity: 0;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    opacity: 1;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@-webkit-keyframes antZoomBigOut {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@keyframes antZoomBigOut {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@-webkit-keyframes antZoomUpIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 50% 0%;
            transform-origin: 50% 0%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    -webkit-transform-origin: 50% 0%;
            transform-origin: 50% 0%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@keyframes antZoomUpIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 50% 0%;
            transform-origin: 50% 0%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    -webkit-transform-origin: 50% 0%;
            transform-origin: 50% 0%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@-webkit-keyframes antZoomUpOut {
  0% {
    -webkit-transform-origin: 50% 0%;
            transform-origin: 50% 0%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 50% 0%;
            transform-origin: 50% 0%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@keyframes antZoomUpOut {
  0% {
    -webkit-transform-origin: 50% 0%;
            transform-origin: 50% 0%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 50% 0%;
            transform-origin: 50% 0%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@-webkit-keyframes antZoomLeftIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0% 50%;
            transform-origin: 0% 50%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    -webkit-transform-origin: 0% 50%;
            transform-origin: 0% 50%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@keyframes antZoomLeftIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0% 50%;
            transform-origin: 0% 50%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    -webkit-transform-origin: 0% 50%;
            transform-origin: 0% 50%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@-webkit-keyframes antZoomLeftOut {
  0% {
    -webkit-transform-origin: 0% 50%;
            transform-origin: 0% 50%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 0% 50%;
            transform-origin: 0% 50%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@keyframes antZoomLeftOut {
  0% {
    -webkit-transform-origin: 0% 50%;
            transform-origin: 0% 50%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 0% 50%;
            transform-origin: 0% 50%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@-webkit-keyframes antZoomRightIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 100% 50%;
            transform-origin: 100% 50%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    -webkit-transform-origin: 100% 50%;
            transform-origin: 100% 50%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@keyframes antZoomRightIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 100% 50%;
            transform-origin: 100% 50%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    -webkit-transform-origin: 100% 50%;
            transform-origin: 100% 50%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@-webkit-keyframes antZoomRightOut {
  0% {
    -webkit-transform-origin: 100% 50%;
            transform-origin: 100% 50%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 100% 50%;
            transform-origin: 100% 50%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@keyframes antZoomRightOut {
  0% {
    -webkit-transform-origin: 100% 50%;
            transform-origin: 100% 50%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 100% 50%;
            transform-origin: 100% 50%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@-webkit-keyframes antZoomDownIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 50% 100%;
            transform-origin: 50% 100%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    -webkit-transform-origin: 50% 100%;
            transform-origin: 50% 100%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@keyframes antZoomDownIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 50% 100%;
            transform-origin: 50% 100%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
  100% {
    -webkit-transform-origin: 50% 100%;
            transform-origin: 50% 100%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
}
@-webkit-keyframes antZoomDownOut {
  0% {
    -webkit-transform-origin: 50% 100%;
            transform-origin: 50% 100%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 50% 100%;
            transform-origin: 50% 100%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
@keyframes antZoomDownOut {
  0% {
    -webkit-transform-origin: 50% 100%;
            transform-origin: 50% 100%;
    -webkit-transform: scale(1);
            transform: scale(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 50% 100%;
            transform-origin: 50% 100%;
    -webkit-transform: scale(0.8);
            transform: scale(0.8);
  }
}
.ant-motion-collapse {
  overflow: hidden;
}
.ant-motion-collapse-active {
  -webkit-transition: height 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.15s cubic-bezier(0.645, 0.045, 0.355, 1) !important;
  -o-transition: height 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.15s cubic-bezier(0.645, 0.045, 0.355, 1) !important;
  transition: height 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.15s cubic-bezier(0.645, 0.045, 0.355, 1) !important;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-switch {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  margin: 0;
  padding: 0;
  list-style: none;
  position: relative;
  display: inline-block;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  height: 22px;
  min-width: 44px;
  line-height: 20px;
  vertical-align: middle;
  border-radius: 100px;
  border: 1px solid transparent;
  background-color: rgba(0, 0, 0, 0.25);
  cursor: pointer;
  -webkit-transition: all 0.36s;
  -o-transition: all 0.36s;
  transition: all 0.36s;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.ant-switch-inner {
  color: #fff;
  font-size: 12px;
  margin-left: 24px;
  margin-right: 6px;
  display: block;
}
.ant-switch-loading-icon,
.ant-switch:after {
  position: absolute;
  width: 18px;
  height: 18px;
  left: 1px;
  top: 1px;
  border-radius: 18px;
  background-color: #fff;
  content: ' ';
  cursor: pointer;
  -webkit-transition: all 0.36s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.36s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.36s cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.ant-switch:after {
  -webkit-box-shadow: 0 2px 4px 0 rgba(0, 35, 11, 0.2);
          box-shadow: 0 2px 4px 0 rgba(0, 35, 11, 0.2);
}
.ant-switch:active:before,
.ant-switch:active:after {
  width: 24px;
}
.ant-switch-loading-icon {
  background: transparent;
  z-index: 1;
  display: none;
  font-size: 12px;
}
.ant-switch-loading-icon svg {
  position: absolute;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  margin: auto;
}
.ant-switch-loading .ant-switch-loading-icon {
  display: inline-block;
  color: rgba(0, 0, 0, 0.65);
}
.ant-switch-checked.ant-switch-loading .ant-switch-loading-icon {
  color: #1890ff;
}
.ant-switch:focus {
  -webkit-box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
          box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
  outline: 0;
}
.ant-switch:focus:hover {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-switch-small {
  height: 16px;
  min-width: 28px;
  line-height: 14px;
}
.ant-switch-small .ant-switch-inner {
  margin-left: 18px;
  margin-right: 3px;
  font-size: 12px;
}
.ant-switch-small:after {
  width: 12px;
  height: 12px;
}
.ant-switch-small:active:before,
.ant-switch-small:active:after {
  width: 16px;
}
.ant-switch-small .ant-switch-loading-icon {
  width: 12px;
  height: 12px;
}
.ant-switch-small.ant-switch-checked .ant-switch-inner {
  margin-left: 3px;
  margin-right: 18px;
}
.ant-switch-small.ant-switch-checked .ant-switch-loading-icon {
  left: 100%;
  margin-left: -13px;
}
.ant-switch-small.ant-switch-loading .ant-switch-loading-icon {
  -webkit-transform: scale(0.66667);
          transform: scale(0.66667);
  font-weight: bold;
}
.ant-switch-checked {
  background-color: #1890ff;
}
.ant-switch-checked .ant-switch-inner {
  margin-left: 6px;
  margin-right: 24px;
}
.ant-switch-checked:after {
  left: 100%;
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
  margin-left: -1px;
}
.ant-switch-checked .ant-switch-loading-icon {
  left: 100%;
  margin-left: -19px;
}
.ant-switch-loading,
.ant-switch-disabled {
  cursor: not-allowed;
  opacity: 0.4;
}
.ant-switch-loading *,
.ant-switch-disabled * {
  cursor: not-allowed;
}
@-webkit-keyframes AntSwitchSmallLoadingCircle {
  0% {
    -webkit-transform-origin: 50% 50%;
            transform-origin: 50% 50%;
    -webkit-transform: rotate(0deg) scale(0.66667);
            transform: rotate(0deg) scale(0.66667);
  }
  100% {
    -webkit-transform-origin: 50% 50%;
            transform-origin: 50% 50%;
    -webkit-transform: rotate(360deg) scale(0.66667);
            transform: rotate(360deg) scale(0.66667);
  }
}
@keyframes AntSwitchSmallLoadingCircle {
  0% {
    -webkit-transform-origin: 50% 50%;
            transform-origin: 50% 50%;
    -webkit-transform: rotate(0deg) scale(0.66667);
            transform: rotate(0deg) scale(0.66667);
  }
  100% {
    -webkit-transform-origin: 50% 50%;
            transform-origin: 50% 50%;
    -webkit-transform: rotate(360deg) scale(0.66667);
            transform: rotate(360deg) scale(0.66667);
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-switch {
  border-radius: 3px;
  border: none;
  background-color: #eceff1;
  -webkit-transition-delay: 0.1s;
       -o-transition-delay: 0.1s;
          transition-delay: 0.1s;
}
.ant-switch::after {
  border-radius: 2px;
  top: 2px;
  margin-left: 2px;
  left: 0;
  -webkit-box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.1);
          box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.1);
}
.ant-switch .ant-switch-inner {
  height: 100%;
  text-align: center;
  overflow: hidden;
  position: relative;
  margin-right: 0;
}
.ant-switch .ant-switch-inner > div {
  position: absolute;
  top: 0;
  width: 100%;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
}
.ant-switch .ant-switch-inner .checked-text {
  left: 0;
  color: white;
  opacity: 0;
  display: none;
}
.ant-switch .ant-switch-inner .unchecked-text {
  right: 0;
  color: #212121;
  opacity: 0;
  -webkit-animation: textAnimation 0.3s ease-in forwards;
          animation: textAnimation 0.3s ease-in forwards;
  -webkit-animation-delay: 0.1s;
          animation-delay: 0.1s;
}
.ant-switch.large {
  width: 104px;
  height: 40px;
}
.ant-switch.large::after {
  width: 36px;
  height: 36px;
}
.ant-switch.large .ant-switch-inner {
  margin-left: 36px;
  line-height: 40px;
}
.ant-switch.small {
  width: 80px;
  height: 32px;
}
.ant-switch.small::after {
  width: 28px;
  height: 28px;
}
.ant-switch.small .ant-switch-inner {
  margin-left: 28px;
  line-height: 32px;
}
.ant-switch-checked {
  background: #607d8b;
}
.ant-switch-checked::after {
  left: 100%;
}
.ant-switch-checked .ant-switch-inner .checked-text {
  opacity: 0;
  display: block;
  -webkit-animation: textAnimation 0.3s ease-in forwards;
          animation: textAnimation 0.3s ease-in forwards;
  -webkit-animation-delay: 0.1s;
          animation-delay: 0.1s;
}
.ant-switch-checked .ant-switch-inner .unchecked-text {
  opacity: 0;
  display: none;
}
.ant-switch.large.ant-switch-checked::after {
  margin-left: -2px;
}
.ant-switch.large.ant-switch-checked .ant-switch-inner {
  margin-left: 0;
  margin-right: 36px;
}
.ant-switch.small.ant-switch-checked::after {
  margin-left: -2px;
}
.ant-switch.small.ant-switch-checked .ant-switch-inner {
  margin-left: 0;
  margin-right: 28px;
}
@-webkit-keyframes textAnimation {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
@keyframes textAnimation {
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-tooltip {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: absolute;
  z-index: 1060;
  display: block;
  visibility: visible;
  max-width: 250px;
}
.ant-tooltip-hidden {
  display: none;
}
.ant-tooltip-placement-top,
.ant-tooltip-placement-topLeft,
.ant-tooltip-placement-topRight {
  padding-bottom: 8px;
}
.ant-tooltip-placement-right,
.ant-tooltip-placement-rightTop,
.ant-tooltip-placement-rightBottom {
  padding-left: 8px;
}
.ant-tooltip-placement-bottom,
.ant-tooltip-placement-bottomLeft,
.ant-tooltip-placement-bottomRight {
  padding-top: 8px;
}
.ant-tooltip-placement-left,
.ant-tooltip-placement-leftTop,
.ant-tooltip-placement-leftBottom {
  padding-right: 8px;
}
.ant-tooltip-inner {
  padding: 6px 8px;
  color: #fff;
  text-align: left;
  text-decoration: none;
  background-color: rgba(0, 0, 0, 0.75);
  border-radius: 4px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  min-height: 32px;
  min-width: 30px;
  word-wrap: break-word;
}
.ant-tooltip-arrow {
  position: absolute;
  width: 0;
  height: 0;
  border-color: transparent;
  border-style: solid;
}
.ant-tooltip-placement-top .ant-tooltip-arrow,
.ant-tooltip-placement-topLeft .ant-tooltip-arrow,
.ant-tooltip-placement-topRight .ant-tooltip-arrow {
  bottom: 3px;
  border-width: 5px 5px 0;
  border-top-color: rgba(0, 0, 0, 0.75);
}
.ant-tooltip-placement-top .ant-tooltip-arrow {
  left: 50%;
  margin-left: -5px;
}
.ant-tooltip-placement-topLeft .ant-tooltip-arrow {
  left: 16px;
}
.ant-tooltip-placement-topRight .ant-tooltip-arrow {
  right: 16px;
}
.ant-tooltip-placement-right .ant-tooltip-arrow,
.ant-tooltip-placement-rightTop .ant-tooltip-arrow,
.ant-tooltip-placement-rightBottom .ant-tooltip-arrow {
  left: 3px;
  border-width: 5px 5px 5px 0;
  border-right-color: rgba(0, 0, 0, 0.75);
}
.ant-tooltip-placement-right .ant-tooltip-arrow {
  top: 50%;
  margin-top: -5px;
}
.ant-tooltip-placement-rightTop .ant-tooltip-arrow {
  top: 8px;
}
.ant-tooltip-placement-rightBottom .ant-tooltip-arrow {
  bottom: 8px;
}
.ant-tooltip-placement-left .ant-tooltip-arrow,
.ant-tooltip-placement-leftTop .ant-tooltip-arrow,
.ant-tooltip-placement-leftBottom .ant-tooltip-arrow {
  right: 3px;
  border-width: 5px 0 5px 5px;
  border-left-color: rgba(0, 0, 0, 0.75);
}
.ant-tooltip-placement-left .ant-tooltip-arrow {
  top: 50%;
  margin-top: -5px;
}
.ant-tooltip-placement-leftTop .ant-tooltip-arrow {
  top: 8px;
}
.ant-tooltip-placement-leftBottom .ant-tooltip-arrow {
  bottom: 8px;
}
.ant-tooltip-placement-bottom .ant-tooltip-arrow,
.ant-tooltip-placement-bottomLeft .ant-tooltip-arrow,
.ant-tooltip-placement-bottomRight .ant-tooltip-arrow {
  top: 3px;
  border-width: 0 5px 5px;
  border-bottom-color: rgba(0, 0, 0, 0.75);
}
.ant-tooltip-placement-bottom .ant-tooltip-arrow {
  left: 50%;
  margin-left: -5px;
}
.ant-tooltip-placement-bottomLeft .ant-tooltip-arrow {
  left: 16px;
}
.ant-tooltip-placement-bottomRight .ant-tooltip-arrow {
  right: 16px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-tooltip {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: absolute;
  z-index: 1060;
  display: block;
  visibility: visible;
  max-width: 250px;
}
.ant-tooltip-hidden {
  display: none;
}
.ant-tooltip-placement-top,
.ant-tooltip-placement-topLeft,
.ant-tooltip-placement-topRight {
  padding-bottom: 8px;
}
.ant-tooltip-placement-right,
.ant-tooltip-placement-rightTop,
.ant-tooltip-placement-rightBottom {
  padding-left: 8px;
}
.ant-tooltip-placement-bottom,
.ant-tooltip-placement-bottomLeft,
.ant-tooltip-placement-bottomRight {
  padding-top: 8px;
}
.ant-tooltip-placement-left,
.ant-tooltip-placement-leftTop,
.ant-tooltip-placement-leftBottom {
  padding-right: 8px;
}
.ant-tooltip-inner {
  padding: 6px 8px;
  color: #fff;
  text-align: left;
  text-decoration: none;
  background-color: rgba(0, 0, 0, 0.75);
  border-radius: 4px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  min-height: 32px;
  min-width: 30px;
  word-wrap: break-word;
}
.ant-tooltip-arrow {
  position: absolute;
  width: 0;
  height: 0;
  border-color: transparent;
  border-style: solid;
}
.ant-tooltip-placement-top .ant-tooltip-arrow,
.ant-tooltip-placement-topLeft .ant-tooltip-arrow,
.ant-tooltip-placement-topRight .ant-tooltip-arrow {
  bottom: 3px;
  border-width: 5px 5px 0;
  border-top-color: rgba(0, 0, 0, 0.75);
}
.ant-tooltip-placement-top .ant-tooltip-arrow {
  left: 50%;
  margin-left: -5px;
}
.ant-tooltip-placement-topLeft .ant-tooltip-arrow {
  left: 16px;
}
.ant-tooltip-placement-topRight .ant-tooltip-arrow {
  right: 16px;
}
.ant-tooltip-placement-right .ant-tooltip-arrow,
.ant-tooltip-placement-rightTop .ant-tooltip-arrow,
.ant-tooltip-placement-rightBottom .ant-tooltip-arrow {
  left: 3px;
  border-width: 5px 5px 5px 0;
  border-right-color: rgba(0, 0, 0, 0.75);
}
.ant-tooltip-placement-right .ant-tooltip-arrow {
  top: 50%;
  margin-top: -5px;
}
.ant-tooltip-placement-rightTop .ant-tooltip-arrow {
  top: 8px;
}
.ant-tooltip-placement-rightBottom .ant-tooltip-arrow {
  bottom: 8px;
}
.ant-tooltip-placement-left .ant-tooltip-arrow,
.ant-tooltip-placement-leftTop .ant-tooltip-arrow,
.ant-tooltip-placement-leftBottom .ant-tooltip-arrow {
  right: 3px;
  border-width: 5px 0 5px 5px;
  border-left-color: rgba(0, 0, 0, 0.75);
}
.ant-tooltip-placement-left .ant-tooltip-arrow {
  top: 50%;
  margin-top: -5px;
}
.ant-tooltip-placement-leftTop .ant-tooltip-arrow {
  top: 8px;
}
.ant-tooltip-placement-leftBottom .ant-tooltip-arrow {
  bottom: 8px;
}
.ant-tooltip-placement-bottom .ant-tooltip-arrow,
.ant-tooltip-placement-bottomLeft .ant-tooltip-arrow,
.ant-tooltip-placement-bottomRight .ant-tooltip-arrow {
  top: 3px;
  border-width: 0 5px 5px;
  border-bottom-color: rgba(0, 0, 0, 0.75);
}
.ant-tooltip-placement-bottom .ant-tooltip-arrow {
  left: 50%;
  margin-left: -5px;
}
.ant-tooltip-placement-bottomLeft .ant-tooltip-arrow {
  left: 16px;
}
.ant-tooltip-placement-bottomRight .ant-tooltip-arrow {
  right: 16px;
}
.lc-tooltip {
  line-height: 1;
}
.lc-tooltip .ant-tooltip-content .ant-tooltip-inner {
  min-height: auto;
  font-size: 13px;
  padding: 10px;
  border-radius: 3px;
  background-color: #212121;
  opacity: 0.9;
  word-break: break-word;
}
.ant-tooltip-placement-top .ant-tooltip-arrow,
.ant-tooltip-placement-topLeft .ant-tooltip-arrow,
.ant-tooltip-placement-topRight .ant-tooltip-arrow {
  margin-left: -8px;
  border-width: 6px 8px 0;
  bottom: 2px;
  border-top-color: rgba(33, 33, 33, 0.9);
}
.ant-tooltip-placement-right .ant-tooltip-arrow,
.ant-tooltip-placement-rightTop .ant-tooltip-arrow,
.ant-tooltip-placement-rightBottom .ant-tooltip-arrow {
  left: 2px;
  border-width: 8px 6px 8px 0;
  border-right-color: rgba(33, 33, 33, 0.9);
  margin-top: -8px;
}
.ant-tooltip-placement-bottom .ant-tooltip-arrow,
.ant-tooltip-placement-bottomLeft .ant-tooltip-arrow,
.ant-tooltip-placement-bottomRight .ant-tooltip-arrow {
  top: 2px;
  border-width: 0 8px 6px;
  border-bottom-color: rgba(33, 33, 33, 0.9);
}
.ant-tooltip-placement-left .ant-tooltip-arrow,
.ant-tooltip-placement-leftTop .ant-tooltip-arrow,
.ant-tooltip-placement-leftBottom .ant-tooltip-arrow {
  margin-top: -8px;
  right: 2px;
  border-width: 8px 0 8px 6px;
  border-left-color: rgba(33, 33, 33, 0.9);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-theme-dark .ps__rail-y .ps__thumb-y,
.lc-theme-dark .ps__rail-x .ps__thumb-x {
  background: #f5f5f5;
  opacity: 0.5;
}
.lc-theme-dark .ps__rail-y .ps__thumb-y:hover,
.lc-theme-dark .ps__rail-x .ps__thumb-x:hover {
  background: #f5f5f5;
  opacity: 0.5;
}
.lc-theme-light .ps__rail-y .ps__thumb-y,
.lc-theme-light .ps__rail-x .ps__thumb-x {
  background: #9e9e9e;
  opacity: 0.3;
}
.lc-theme-light .ps__rail-y .ps__thumb-y:hover,
.lc-theme-light .ps__rail-x .ps__thumb-x:hover {
  background: #9e9e9e;
  opacity: 0.3;
}
.ps .ps__rail-y {
  width: 10px;
  padding: 2px;
}
.ps .ps__rail-y:hover > .ps__thumb-y,
.ps .ps__rail-y:focus > .ps__thumb-y,
.ps .ps__rail-y .ps__thumb-y {
  width: 6px;
  border-radius: 0;
}
.ps .ps__rail-x {
  height: 10px;
  padding: 2px;
}
.ps .ps__rail-x:hover > .ps__thumb-x,
.ps .ps__rail-x:focus > .ps__thumb-x,
.ps .ps__rail-x .ps__thumb-x {
  height: 6px;
  border-radius: 0;
}
.ps .ps__rail-y:hover,
.ps .ps__rail-x:hover,
.ps .ps__rail-y:focus,
.ps .ps__rail-x:focus {
  background: transparent;
}
</style><style type="text/css">/*
 * Container style
 */
.ps {
  overflow: hidden !important;
  overflow-anchor: none;
  -ms-overflow-style: none;
  touch-action: auto;
  -ms-touch-action: auto;
}

/*
 * Scrollbar rail styles
 */
.ps__rail-x {
  display: none;
  opacity: 0;
  -o-transition: background-color .2s linear, opacity .2s linear;
  transition: background-color .2s linear, opacity .2s linear;
  -webkit-transition: background-color .2s linear, opacity .2s linear;
  height: 15px;
  /* there must be 'bottom' or 'top' for ps__rail-x */
  bottom: 0px;
  /* please don't change 'position' */
  position: absolute;
}

.ps__rail-y {
  display: none;
  opacity: 0;
  -o-transition: background-color .2s linear, opacity .2s linear;
  transition: background-color .2s linear, opacity .2s linear;
  -webkit-transition: background-color .2s linear, opacity .2s linear;
  width: 15px;
  /* there must be 'right' or 'left' for ps__rail-y */
  right: 0;
  /* please don't change 'position' */
  position: absolute;
}

.ps--active-x > .ps__rail-x,
.ps--active-y > .ps__rail-y {
  display: block;
  background-color: transparent;
}

.ps:hover > .ps__rail-x,
.ps:hover > .ps__rail-y,
.ps--focus > .ps__rail-x,
.ps--focus > .ps__rail-y,
.ps--scrolling-x > .ps__rail-x,
.ps--scrolling-y > .ps__rail-y {
  opacity: 0.6;
}

.ps__rail-x:hover,
.ps__rail-y:hover,
.ps__rail-x:focus,
.ps__rail-y:focus {
  background-color: #eee;
  opacity: 0.9;
}

/*
 * Scrollbar thumb styles
 */
.ps__thumb-x {
  background-color: #aaa;
  border-radius: 6px;
  -o-transition: background-color .2s linear, height .2s ease-in-out;
  transition: background-color .2s linear, height .2s ease-in-out;
  -webkit-transition: background-color .2s linear, height .2s ease-in-out;
  height: 6px;
  /* there must be 'bottom' for ps__thumb-x */
  bottom: 2px;
  /* please don't change 'position' */
  position: absolute;
}

.ps__thumb-y {
  background-color: #aaa;
  border-radius: 6px;
  -o-transition: background-color .2s linear, width .2s ease-in-out;
  transition: background-color .2s linear, width .2s ease-in-out;
  -webkit-transition: background-color .2s linear, width .2s ease-in-out;
  width: 6px;
  /* there must be 'right' for ps__thumb-y */
  right: 2px;
  /* please don't change 'position' */
  position: absolute;
}

.ps__rail-x:hover > .ps__thumb-x,
.ps__rail-x:focus > .ps__thumb-x {
  background-color: #999;
  height: 11px;
}

.ps__rail-y:hover > .ps__thumb-y,
.ps__rail-y:focus > .ps__thumb-y {
  background-color: #999;
  width: 11px;
}

/* MS supports */
@supports (-ms-overflow-style: none) {
  .ps {
    overflow: auto !important;
  }
}

@media screen and (-ms-high-contrast: active), (-ms-high-contrast: none) {
  .ps {
    overflow: auto !important;
  }
}
.scrollbar-container {
  position: relative;
  height: 100%; }</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.scroll-wrapper__2yA1 {
  width: 100%;
  height: 100%;
}
.scroll-wrapper__2yA1 .scroll-inner-wrapper__2apK {
  width: 100%;
  height: 100%;
}
.scroll-content__1y8T {
  width: 100%;
  height: 100%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__36Fw {
  overflow: auto;
  -webkit-overflow-scrolling: touch;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.panel__20s1 {
  color: #263238;
  opacity: 1;
  -webkit-transition: 0.15s all;
  -o-transition: 0.15s all;
  transition: 0.15s all;
}
.header__265O {
  width: 100%;
  padding: 8px 20px;
  background: white;
  border: none;
  border-top: 1px solid #eeeeee;
  border-bottom: 1px solid #eeeeee;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  min-height: 44px;
}
.header__265O .icon-wrapper__2JXs {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-right: -6px;
  color: #cfd8dc;
}
.header__265O .icon-wrapper__2JXs:hover {
  color: #546e7a;
}
.panel__20s1 + .panel__20s1 > .header__265O {
  margin-top: -1px;
}
.panel__20s1.closable__184Z .header__265O {
  background: white;
}
.panel__20s1.closable__184Z .header__265O .icon-wrapper__2JXs {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: start;
      -ms-flex-align: start;
          align-items: flex-start;
  width: 24px;
  padding-top: 6px;
}
.panel__20s1.closable__184Z .header__265O .icon-wrapper__2JXs svg {
  cursor: pointer;
  width: 1.18em;
  height: 1.18em;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.panel__20s1.toggle__26Uk .header__265O {
  cursor: pointer;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.panel__20s1.toggle__26Uk .header__265O .icon-wrapper__2JXs {
  width: 24px;
}
.panel__20s1.toggle__26Uk .header__265O .icon-wrapper__2JXs svg {
  width: 1.72em;
  height: 1.72em;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.panel__20s1.toggle__26Uk .header__265O:hover .icon-wrapper__2JXs {
  color: #546e7a;
}
.header__265O.active__14Ki .icon-wrapper__2JXs svg {
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}
.header__265O.collapse__2U19 {
  border-bottom-width: 0;
}
.content-wrapper__25xX {
  background: white;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.content-wrapper__25xX.entering__603l,
.content-wrapper__25xX.exiting__1wz5 {
  margin: 0 20;
  height: 0;
  overflow: hidden;
}
.content-wrapper__25xX.exited__1E9r {
  display: none;
}
.content-wrapper__25xX.collapse__2U19 {
  border-top: 1px solid #eeeeee;
}
.content__FaW7 {
  padding: 20px;
}
.warn__1qFI,
.warning__3P7w {
  color: #f9a825;
}
.warn__1qFI.closable__184Z .header__265O,
.warning__3P7w.closable__184Z .header__265O {
  border-top: 1px solid #ffecb3;
  background-color: #fff8e1;
}
.warn__1qFI.closable__184Z .header__265O .icon-wrapper__2JXs,
.warning__3P7w.closable__184Z .header__265O .icon-wrapper__2JXs {
  color: #f9a825;
}
.warn__1qFI.closable__184Z .header__265O .icon-wrapper__2JXs:hover,
.warning__3P7w.closable__184Z .header__265O .icon-wrapper__2JXs:hover {
  color: #f07c18;
}
.header-content__23Bh {
  min-height: 28px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-popover {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: absolute;
  top: 0;
  left: 0;
  z-index: 1030;
  cursor: auto;
  -webkit-user-select: text;
     -moz-user-select: text;
      -ms-user-select: text;
          user-select: text;
  white-space: normal;
  font-weight: normal;
  text-align: left;
}
.ant-popover:after {
  content: '';
  position: absolute;
  background: rgba(255, 255, 255, 0.01);
}
.ant-popover-hidden {
  display: none;
}
.ant-popover-placement-top,
.ant-popover-placement-topLeft,
.ant-popover-placement-topRight {
  padding-bottom: 10px;
}
.ant-popover-placement-right,
.ant-popover-placement-rightTop,
.ant-popover-placement-rightBottom {
  padding-left: 10px;
}
.ant-popover-placement-bottom,
.ant-popover-placement-bottomLeft,
.ant-popover-placement-bottomRight {
  padding-top: 10px;
}
.ant-popover-placement-left,
.ant-popover-placement-leftTop,
.ant-popover-placement-leftBottom {
  padding-right: 10px;
}
.ant-popover-inner {
  background-color: #fff;
  background-clip: padding-box;
  border-radius: 4px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  -webkit-box-shadow: 0 0 8px rgba(0, 0, 0, 0.15) \9;
          box-shadow: 0 0 8px rgba(0, 0, 0, 0.15) \9;
}
@media screen and (-ms-high-contrast: active), (-ms-high-contrast: none) {
  .ant-popover {
    /* IE10+ */
  }
  .ant-popover-inner {
    -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  }
}
.ant-popover-title {
  min-width: 177px;
  margin: 0;
  padding: 5px 16px 4px;
  min-height: 32px;
  border-bottom: 1px solid #e8e8e8;
  color: rgba(0, 0, 0, 0.85);
  font-weight: 500;
}
.ant-popover-inner-content {
  padding: 12px 16px;
  color: rgba(0, 0, 0, 0.65);
}
.ant-popover-message {
  padding: 4px 0 12px;
  font-size: 14px;
  color: rgba(0, 0, 0, 0.65);
  position: relative;
}
.ant-popover-message > .anticon {
  position: absolute;
  top: 8px;
  color: #faad14;
  font-size: 14px;
}
.ant-popover-message-title {
  padding-left: 22px;
}
.ant-popover-buttons {
  text-align: right;
  margin-bottom: 4px;
}
.ant-popover-buttons button {
  margin-left: 8px;
}
.ant-popover-arrow {
  background: transparent;
  width: 8.48528137px;
  height: 8.48528137px;
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
  position: absolute;
  display: block;
  border-width: 4.24264069px;
  border-style: solid;
}
.ant-popover-placement-top > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-topLeft > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-topRight > .ant-popover-content > .ant-popover-arrow {
  bottom: 6.2px;
  -webkit-box-shadow: 3px 3px 7px rgba(0, 0, 0, 0.07);
          box-shadow: 3px 3px 7px rgba(0, 0, 0, 0.07);
  border-top-color: transparent;
  border-right-color: #fff;
  border-bottom-color: #fff;
  border-left-color: transparent;
}
.ant-popover-placement-top > .ant-popover-content > .ant-popover-arrow {
  left: 50%;
  -webkit-transform: translateX(-50%) rotate(45deg);
          transform: translateX(-50%) rotate(45deg);
}
.ant-popover-placement-topLeft > .ant-popover-content > .ant-popover-arrow {
  left: 16px;
}
.ant-popover-placement-topRight > .ant-popover-content > .ant-popover-arrow {
  right: 16px;
}
.ant-popover-placement-right > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-rightTop > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-rightBottom > .ant-popover-content > .ant-popover-arrow {
  left: 6px;
  -webkit-box-shadow: -3px 3px 7px rgba(0, 0, 0, 0.07);
          box-shadow: -3px 3px 7px rgba(0, 0, 0, 0.07);
  border-top-color: transparent;
  border-right-color: transparent;
  border-bottom-color: #fff;
  border-left-color: #fff;
}
.ant-popover-placement-right > .ant-popover-content > .ant-popover-arrow {
  top: 50%;
  -webkit-transform: translateY(-50%) rotate(45deg);
          transform: translateY(-50%) rotate(45deg);
}
.ant-popover-placement-rightTop > .ant-popover-content > .ant-popover-arrow {
  top: 12px;
}
.ant-popover-placement-rightBottom > .ant-popover-content > .ant-popover-arrow {
  bottom: 12px;
}
.ant-popover-placement-bottom > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-bottomLeft > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-bottomRight > .ant-popover-content > .ant-popover-arrow {
  top: 6px;
  -webkit-box-shadow: -2px -2px 5px rgba(0, 0, 0, 0.06);
          box-shadow: -2px -2px 5px rgba(0, 0, 0, 0.06);
  border-top-color: #fff;
  border-right-color: transparent;
  border-bottom-color: transparent;
  border-left-color: #fff;
}
.ant-popover-placement-bottom > .ant-popover-content > .ant-popover-arrow {
  left: 50%;
  -webkit-transform: translateX(-50%) rotate(45deg);
          transform: translateX(-50%) rotate(45deg);
}
.ant-popover-placement-bottomLeft > .ant-popover-content > .ant-popover-arrow {
  left: 16px;
}
.ant-popover-placement-bottomRight > .ant-popover-content > .ant-popover-arrow {
  right: 16px;
}
.ant-popover-placement-left > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-leftTop > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-leftBottom > .ant-popover-content > .ant-popover-arrow {
  right: 6px;
  -webkit-box-shadow: 3px -3px 7px rgba(0, 0, 0, 0.07);
          box-shadow: 3px -3px 7px rgba(0, 0, 0, 0.07);
  border-top-color: #fff;
  border-right-color: #fff;
  border-bottom-color: transparent;
  border-left-color: transparent;
}
.ant-popover-placement-left > .ant-popover-content > .ant-popover-arrow {
  top: 50%;
  -webkit-transform: translateY(-50%) rotate(45deg);
          transform: translateY(-50%) rotate(45deg);
}
.ant-popover-placement-leftTop > .ant-popover-content > .ant-popover-arrow {
  top: 12px;
}
.ant-popover-placement-leftBottom > .ant-popover-content > .ant-popover-arrow {
  bottom: 12px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-popover {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: absolute;
  top: 0;
  left: 0;
  z-index: 1030;
  cursor: auto;
  -webkit-user-select: text;
     -moz-user-select: text;
      -ms-user-select: text;
          user-select: text;
  white-space: normal;
  font-weight: normal;
  text-align: left;
}
.ant-popover:after {
  content: '';
  position: absolute;
  background: rgba(255, 255, 255, 0.01);
}
.ant-popover-hidden {
  display: none;
}
.ant-popover-placement-top,
.ant-popover-placement-topLeft,
.ant-popover-placement-topRight {
  padding-bottom: 10px;
}
.ant-popover-placement-right,
.ant-popover-placement-rightTop,
.ant-popover-placement-rightBottom {
  padding-left: 10px;
}
.ant-popover-placement-bottom,
.ant-popover-placement-bottomLeft,
.ant-popover-placement-bottomRight {
  padding-top: 10px;
}
.ant-popover-placement-left,
.ant-popover-placement-leftTop,
.ant-popover-placement-leftBottom {
  padding-right: 10px;
}
.ant-popover-inner {
  background-color: #fff;
  background-clip: padding-box;
  border-radius: 4px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  -webkit-box-shadow: 0 0 8px rgba(0, 0, 0, 0.15) \9;
          box-shadow: 0 0 8px rgba(0, 0, 0, 0.15) \9;
}
@media screen and (-ms-high-contrast: active), (-ms-high-contrast: none) {
  .ant-popover {
    /* IE10+ */
  }
  .ant-popover-inner {
    -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  }
}
.ant-popover-title {
  min-width: 177px;
  margin: 0;
  padding: 5px 16px 4px;
  min-height: 32px;
  border-bottom: 1px solid #e8e8e8;
  color: rgba(0, 0, 0, 0.85);
  font-weight: 500;
}
.ant-popover-inner-content {
  padding: 12px 16px;
  color: rgba(0, 0, 0, 0.65);
}
.ant-popover-message {
  padding: 4px 0 12px;
  font-size: 14px;
  color: rgba(0, 0, 0, 0.65);
  position: relative;
}
.ant-popover-message > .anticon {
  position: absolute;
  top: 8px;
  color: #faad14;
  font-size: 14px;
}
.ant-popover-message-title {
  padding-left: 22px;
}
.ant-popover-buttons {
  text-align: right;
  margin-bottom: 4px;
}
.ant-popover-buttons button {
  margin-left: 8px;
}
.ant-popover-arrow {
  background: transparent;
  width: 8.48528137px;
  height: 8.48528137px;
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
  position: absolute;
  display: block;
  border-width: 4.24264069px;
  border-style: solid;
}
.ant-popover-placement-top > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-topLeft > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-topRight > .ant-popover-content > .ant-popover-arrow {
  bottom: 6.2px;
  -webkit-box-shadow: 3px 3px 7px rgba(0, 0, 0, 0.07);
          box-shadow: 3px 3px 7px rgba(0, 0, 0, 0.07);
  border-top-color: transparent;
  border-right-color: #fff;
  border-bottom-color: #fff;
  border-left-color: transparent;
}
.ant-popover-placement-top > .ant-popover-content > .ant-popover-arrow {
  left: 50%;
  -webkit-transform: translateX(-50%) rotate(45deg);
          transform: translateX(-50%) rotate(45deg);
}
.ant-popover-placement-topLeft > .ant-popover-content > .ant-popover-arrow {
  left: 16px;
}
.ant-popover-placement-topRight > .ant-popover-content > .ant-popover-arrow {
  right: 16px;
}
.ant-popover-placement-right > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-rightTop > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-rightBottom > .ant-popover-content > .ant-popover-arrow {
  left: 6px;
  -webkit-box-shadow: -3px 3px 7px rgba(0, 0, 0, 0.07);
          box-shadow: -3px 3px 7px rgba(0, 0, 0, 0.07);
  border-top-color: transparent;
  border-right-color: transparent;
  border-bottom-color: #fff;
  border-left-color: #fff;
}
.ant-popover-placement-right > .ant-popover-content > .ant-popover-arrow {
  top: 50%;
  -webkit-transform: translateY(-50%) rotate(45deg);
          transform: translateY(-50%) rotate(45deg);
}
.ant-popover-placement-rightTop > .ant-popover-content > .ant-popover-arrow {
  top: 12px;
}
.ant-popover-placement-rightBottom > .ant-popover-content > .ant-popover-arrow {
  bottom: 12px;
}
.ant-popover-placement-bottom > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-bottomLeft > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-bottomRight > .ant-popover-content > .ant-popover-arrow {
  top: 6px;
  -webkit-box-shadow: -2px -2px 5px rgba(0, 0, 0, 0.06);
          box-shadow: -2px -2px 5px rgba(0, 0, 0, 0.06);
  border-top-color: #fff;
  border-right-color: transparent;
  border-bottom-color: transparent;
  border-left-color: #fff;
}
.ant-popover-placement-bottom > .ant-popover-content > .ant-popover-arrow {
  left: 50%;
  -webkit-transform: translateX(-50%) rotate(45deg);
          transform: translateX(-50%) rotate(45deg);
}
.ant-popover-placement-bottomLeft > .ant-popover-content > .ant-popover-arrow {
  left: 16px;
}
.ant-popover-placement-bottomRight > .ant-popover-content > .ant-popover-arrow {
  right: 16px;
}
.ant-popover-placement-left > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-leftTop > .ant-popover-content > .ant-popover-arrow,
.ant-popover-placement-leftBottom > .ant-popover-content > .ant-popover-arrow {
  right: 6px;
  -webkit-box-shadow: 3px -3px 7px rgba(0, 0, 0, 0.07);
          box-shadow: 3px -3px 7px rgba(0, 0, 0, 0.07);
  border-top-color: #fff;
  border-right-color: #fff;
  border-bottom-color: transparent;
  border-left-color: transparent;
}
.ant-popover-placement-left > .ant-popover-content > .ant-popover-arrow {
  top: 50%;
  -webkit-transform: translateY(-50%) rotate(45deg);
          transform: translateY(-50%) rotate(45deg);
}
.ant-popover-placement-leftTop > .ant-popover-content > .ant-popover-arrow {
  top: 12px;
}
.ant-popover-placement-leftBottom > .ant-popover-content > .ant-popover-arrow {
  bottom: 12px;
}
.lc-popover {
  line-height: 1;
}
.lc-popover .ant-popover-content .ant-popover-inner {
  min-height: auto;
  border-radius: 3px;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.lc-popover .ant-popover-content .ant-popover-inner-content {
  font-size: 13px;
  padding: 10px;
  color: #212121;
}
.border-transparent {
  border-top-color: rgba(0, 0, 0, 0);
  border-bottom-color: rgba(0, 0, 0, 0);
  border-left-color: rgba(0, 0, 0, 0);
  border-right-color: rgba(0, 0, 0, 0);
}
.ant-popover-content {
  -webkit-box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
}
.ant-popover-arrow {
  width: 0;
  height: 0;
  background: transparent;
}
.ant-popover-placement-top .ant-popover-content .ant-popover-arrow,
.ant-popover-placement-topLeft .ant-popover-content .ant-popover-arrow,
.ant-popover-placement-topRight .ant-popover-content .ant-popover-arrow {
  border-top-color: rgba(0, 0, 0, 0);
  border-bottom-color: rgba(0, 0, 0, 0);
  border-left-color: rgba(0, 0, 0, 0);
  border-right-color: rgba(0, 0, 0, 0);
  margin-left: -8px;
  border-width: 6px 8px 0;
  bottom: 4px;
  border-top-color: white;
  -webkit-transform: rotate(0);
          transform: rotate(0);
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-popover-placement-bottom .ant-popover-content .ant-popover-arrow,
.ant-popover-placement-bottomLeft .ant-popover-content .ant-popover-arrow,
.ant-popover-placement-bottomRight .ant-popover-content .ant-popover-arrow {
  border-top-color: rgba(0, 0, 0, 0);
  border-bottom-color: rgba(0, 0, 0, 0);
  border-left-color: rgba(0, 0, 0, 0);
  border-right-color: rgba(0, 0, 0, 0);
  top: 4px;
  border-width: 0 8px 6px;
  border-bottom-color: white;
  -webkit-transform: rotate(0) translateX(-50%);
          transform: rotate(0) translateX(-50%);
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-popover-placement-right .ant-popover-content .ant-popover-arrow,
.ant-popover-placement-rightTop .ant-popover-content .ant-popover-arrow,
.ant-popover-placement-rightBottom .ant-popover-content .ant-popover-arrow {
  border-top-color: rgba(0, 0, 0, 0);
  border-bottom-color: rgba(0, 0, 0, 0);
  border-left-color: rgba(0, 0, 0, 0);
  border-right-color: rgba(0, 0, 0, 0);
  left: 4px;
  top: 50%;
  border-width: 8px 6px 8px 0;
  border-right-color: white;
  -webkit-box-shadow: none;
          box-shadow: none;
  -webkit-transform: rotate(0) translateY(-50%);
          transform: rotate(0) translateY(-50%);
}
.ant-popover-placement-left .ant-popover-content .ant-popover-arrow,
.ant-popover-placement-leftTop .ant-popover-content .ant-popover-arrow,
.ant-popover-placement-leftBottom .ant-popover-content .ant-popover-arrow {
  border-top-color: rgba(0, 0, 0, 0);
  border-bottom-color: rgba(0, 0, 0, 0);
  border-left-color: rgba(0, 0, 0, 0);
  border-right-color: rgba(0, 0, 0, 0);
  right: 4px;
  top: 50%;
  border-width: 8px 0 8px 6px;
  border-left-color: white;
  -webkit-box-shadow: none;
          box-shadow: none;
  -webkit-transform: rotate(0) translateY(-50%);
          transform: rotate(0) translateY(-50%);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-select-auto-complete {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
}
.ant-select-auto-complete.ant-select .ant-select-selection {
  border: 0;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-select-auto-complete.ant-select .ant-select-selection__rendered {
  margin-left: 0;
  margin-right: 0;
  height: 100%;
  line-height: 32px;
}
.ant-select-auto-complete.ant-select .ant-select-selection__placeholder {
  margin-left: 12px;
  margin-right: 12px;
}
.ant-select-auto-complete.ant-select .ant-select-selection--single {
  height: auto;
}
.ant-select-auto-complete.ant-select .ant-select-search--inline {
  position: static;
  float: left;
}
.ant-select-auto-complete.ant-select-allow-clear .ant-select-selection:hover .ant-select-selection__rendered {
  margin-right: 0 !important;
}
.ant-select-auto-complete.ant-select .ant-input {
  background: transparent;
  border-width: 1px;
  line-height: 1.5;
  height: 32px;
}
.ant-select-auto-complete.ant-select .ant-input:focus,
.ant-select-auto-complete.ant-select .ant-input:hover {
  border-color: #40a9ff;
  border-right-width: 1px !important;
}
.ant-select-auto-complete.ant-select .ant-input[disabled] {
  background-color: #f5f5f5;
  opacity: 1;
  cursor: not-allowed;
  color: rgba(0, 0, 0, 0.25);
  background-color: transparent;
}
.ant-select-auto-complete.ant-select .ant-input[disabled]:hover {
  border-color: #e6d8d8;
  border-right-width: 1px !important;
}
.ant-select-auto-complete.ant-select-lg .ant-select-selection__rendered {
  line-height: 40px;
}
.ant-select-auto-complete.ant-select-lg .ant-input {
  padding-top: 6px;
  padding-bottom: 6px;
  height: 40px;
}
.ant-select-auto-complete.ant-select-sm .ant-select-selection__rendered {
  line-height: 24px;
}
.ant-select-auto-complete.ant-select-sm .ant-input {
  padding-top: 1px;
  padding-bottom: 1px;
  height: 24px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-select {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  display: inline-block;
  position: relative;
  outline: 0;
}
.ant-select ul,
.ant-select ol {
  margin: 0;
  padding: 0;
  list-style: none;
}
.ant-select > ul > li > a {
  padding: 0;
  background-color: #fff;
}
.ant-select-arrow {
  display: inline-block;
  font-style: normal;
  vertical-align: -0.125em;
  text-align: center;
  text-transform: none;
  line-height: 0;
  text-rendering: optimizeLegibility;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  position: absolute;
  top: 50%;
  right: 11px;
  line-height: 1;
  margin-top: -6px;
  -webkit-transform-origin: 50% 50%;
          transform-origin: 50% 50%;
  color: rgba(0, 0, 0, 0.25);
  font-size: 12px;
}
.ant-select-arrow > * {
  line-height: 1;
}
.ant-select-arrow svg {
  display: inline-block;
}
.ant-select-arrow:before {
  display: none;
}
.ant-select-arrow .ant-select-arrow-icon {
  display: block;
}
.ant-select-arrow .ant-select-arrow-icon svg {
  -webkit-transition: -webkit-transform 0.3s;
  transition: -webkit-transform 0.3s;
  -o-transition: transform 0.3s;
  transition: transform 0.3s;
  transition: transform 0.3s, -webkit-transform 0.3s;
}
.ant-select-selection {
  outline: none;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  display: block;
  background-color: #fff;
  border-radius: 4px;
  border: 1px solid #d9d9d9;
  border-top-width: 1.02px;
  -webkit-transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-select-selection:hover {
  border-color: #40a9ff;
  border-right-width: 1px !important;
}
.ant-select-focused .ant-select-selection,
.ant-select-selection:focus,
.ant-select-selection:active {
  border-color: #40a9ff;
  outline: 0;
  -webkit-box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
          box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
  border-right-width: 1px !important;
}
.ant-select-selection__clear {
  display: inline-block;
  font-style: normal;
  vertical-align: baseline;
  text-align: center;
  text-transform: none;
  text-rendering: auto;
  opacity: 0;
  position: absolute;
  right: 11px;
  z-index: 1;
  background: #fff;
  top: 50%;
  font-size: 12px;
  color: rgba(0, 0, 0, 0.25);
  width: 12px;
  height: 12px;
  margin-top: -6px;
  line-height: 12px;
  cursor: pointer;
  -webkit-transition: color 0.3s ease, opacity 0.15s ease;
  -o-transition: color 0.3s ease, opacity 0.15s ease;
  transition: color 0.3s ease, opacity 0.15s ease;
}
.ant-select-selection__clear:before {
  display: block;
}
.ant-select-selection__clear:hover {
  color: rgba(0, 0, 0, 0.45);
}
.ant-select-selection:hover .ant-select-selection__clear {
  opacity: 1;
}
.ant-select-selection-selected-value {
  float: left;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
  max-width: 100%;
  padding-right: 20px;
}
.ant-select-no-arrow .ant-select-selection-selected-value {
  padding-right: 0;
}
.ant-select-disabled {
  color: rgba(0, 0, 0, 0.25);
}
.ant-select-disabled .ant-select-selection {
  background: #f5f5f5;
  cursor: not-allowed;
}
.ant-select-disabled .ant-select-selection:hover,
.ant-select-disabled .ant-select-selection:focus,
.ant-select-disabled .ant-select-selection:active {
  border-color: #d9d9d9;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-select-disabled .ant-select-selection__clear {
  display: none;
  visibility: hidden;
  pointer-events: none;
}
.ant-select-disabled .ant-select-selection--multiple .ant-select-selection__choice {
  background: #f5f5f5;
  color: rgba(0, 0, 0, 0.33);
  padding-right: 10px;
}
.ant-select-disabled .ant-select-selection--multiple .ant-select-selection__choice__remove {
  display: none;
}
.ant-select-selection--single {
  height: 32px;
  position: relative;
  cursor: pointer;
}
.ant-select-selection__rendered {
  display: block;
  margin-left: 11px;
  margin-right: 11px;
  position: relative;
  line-height: 30px;
}
.ant-select-selection__rendered:after {
  content: '.';
  visibility: hidden;
  pointer-events: none;
  display: inline-block;
  width: 0;
}
.ant-select-lg {
  font-size: 16px;
}
.ant-select-lg .ant-select-selection--single {
  height: 40px;
}
.ant-select-lg .ant-select-selection__rendered {
  line-height: 38px;
}
.ant-select-lg .ant-select-selection--multiple {
  min-height: 40px;
}
.ant-select-lg .ant-select-selection--multiple .ant-select-selection__rendered li {
  height: 32px;
  line-height: 32px;
}
.ant-select-lg .ant-select-selection--multiple .ant-select-selection__clear {
  top: 20px;
}
.ant-select-sm .ant-select-selection--single {
  height: 24px;
}
.ant-select-sm .ant-select-selection__rendered {
  line-height: 22px;
  margin: 0 7px;
}
.ant-select-sm .ant-select-selection--multiple {
  min-height: 24px;
}
.ant-select-sm .ant-select-selection--multiple .ant-select-selection__rendered li {
  height: 16px;
  line-height: 14px;
}
.ant-select-sm .ant-select-selection--multiple .ant-select-selection__clear {
  top: 12px;
}
.ant-select-sm .ant-select-selection__clear,
.ant-select-sm .ant-select-arrow {
  right: 8px;
}
.ant-select-disabled .ant-select-selection__choice__remove {
  color: rgba(0, 0, 0, 0.25);
  cursor: default;
}
.ant-select-disabled .ant-select-selection__choice__remove:hover {
  color: rgba(0, 0, 0, 0.25);
}
.ant-select-search__field__wrap {
  display: inline-block;
  position: relative;
}
.ant-select-selection__placeholder,
.ant-select-search__field__placeholder {
  position: absolute;
  top: 50%;
  left: 0;
  right: 9px;
  color: #bfbfbf;
  line-height: 20px;
  height: 20px;
  max-width: 100%;
  margin-top: -10px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
  text-align: left;
}
.ant-select-search__field__placeholder {
  left: 12px;
}
.ant-select-search__field__mirror {
  position: absolute;
  top: 0;
  left: 0;
  white-space: pre;
  pointer-events: none;
  opacity: 0;
}
.ant-select-search--inline {
  position: absolute;
  height: 100%;
  width: 100%;
}
.ant-select-search--inline .ant-select-search__field__wrap {
  width: 100%;
  height: 100%;
}
.ant-select-search--inline .ant-select-search__field {
  border-width: 0;
  font-size: 100%;
  height: 100%;
  width: 100%;
  background: transparent;
  outline: 0;
  border-radius: 4px;
  line-height: 1;
}
.ant-select-search--inline > i {
  float: right;
}
.ant-select-selection--multiple {
  min-height: 32px;
  cursor: text;
  padding-bottom: 3px;
  zoom: 1;
}
.ant-select-selection--multiple::before,
.ant-select-selection--multiple::after {
  content: ' ';
  display: table;
}
.ant-select-selection--multiple::after {
  clear: both;
}
.ant-select-selection--multiple:before,
.ant-select-selection--multiple:after {
  content: '';
  display: table;
}
.ant-select-selection--multiple:after {
  clear: both;
}
.ant-select-selection--multiple .ant-select-search--inline {
  float: left;
  position: static;
  width: auto;
  padding: 0;
  max-width: 100%;
}
.ant-select-selection--multiple .ant-select-search--inline .ant-select-search__field {
  max-width: 100%;
  width: 0.75em;
}
.ant-select-selection--multiple .ant-select-selection__rendered {
  margin-left: 5px;
  margin-bottom: -3px;
  height: auto;
}
.ant-select-selection--multiple .ant-select-selection__placeholder {
  margin-left: 6px;
}
.ant-select-selection--multiple > ul > li,
.ant-select-selection--multiple .ant-select-selection__rendered > ul > li {
  margin-top: 3px;
  height: 24px;
  line-height: 22px;
}
.ant-select-selection--multiple .ant-select-selection__choice {
  color: rgba(0, 0, 0, 0.65);
  background-color: #fafafa;
  border: 1px solid #e8e8e8;
  border-radius: 2px;
  cursor: default;
  float: left;
  margin-right: 4px;
  max-width: 99%;
  position: relative;
  overflow: hidden;
  -webkit-transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  padding: 0 20px 0 10px;
}
.ant-select-selection--multiple .ant-select-selection__choice__disabled {
  padding: 0 10px;
}
.ant-select-selection--multiple .ant-select-selection__choice__content {
  display: inline-block;
  white-space: nowrap;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  max-width: 100%;
  -webkit-transition: margin 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: margin 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: margin 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-select-selection--multiple .ant-select-selection__choice__remove {
  font-style: normal;
  vertical-align: -0.125em;
  text-align: center;
  text-transform: none;
  line-height: 0;
  text-rendering: optimizeLegibility;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: rgba(0, 0, 0, 0.45);
  line-height: inherit;
  cursor: pointer;
  font-weight: bold;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  display: inline-block;
  font-size: 12px;
  font-size: 10px \9;
  -webkit-transform: scale(0.83333333) rotate(0deg);
          transform: scale(0.83333333) rotate(0deg);
  position: absolute;
  right: 4px;
}
.ant-select-selection--multiple .ant-select-selection__choice__remove > * {
  line-height: 1;
}
.ant-select-selection--multiple .ant-select-selection__choice__remove svg {
  display: inline-block;
}
.ant-select-selection--multiple .ant-select-selection__choice__remove:before {
  display: none;
}
.ant-select-selection--multiple .ant-select-selection__choice__remove .ant-select-selection--multiple .ant-select-selection__choice__remove-icon {
  display: block;
}
:root .ant-select-selection--multiple .ant-select-selection__choice__remove {
  font-size: 12px;
}
.ant-select-selection--multiple .ant-select-selection__choice__remove:hover {
  color: rgba(0, 0, 0, 0.75);
}
.ant-select-selection--multiple .ant-select-selection__clear {
  top: 16px;
}
.ant-select-allow-clear .ant-select-selection--single .ant-select-selection-selected-value {
  padding-right: 16px;
}
.ant-select-allow-clear .ant-select-selection--multiple .ant-select-selection__rendered {
  margin-right: 20px;
}
.ant-select-open .ant-select-arrow-icon svg {
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}
.ant-select-open .ant-select-selection {
  border-color: #40a9ff;
  outline: 0;
  -webkit-box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
          box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
  border-right-width: 1px !important;
}
.ant-select-combobox .ant-select-arrow {
  display: none;
}
.ant-select-combobox .ant-select-search--inline {
  height: 100%;
  width: 100%;
  float: none;
}
.ant-select-combobox .ant-select-search__field__wrap {
  width: 100%;
  height: 100%;
}
.ant-select-combobox .ant-select-search__field {
  width: 100%;
  height: 100%;
  position: relative;
  z-index: 1;
  -webkit-transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), height 0s;
  -o-transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), height 0s;
  transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), height 0s;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-select-combobox.ant-select-allow-clear .ant-select-selection:hover .ant-select-selection__rendered {
  margin-right: 20px;
}
.ant-select-dropdown {
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  margin: 0;
  padding: 0;
  list-style: none;
  font-variant: initial;
  background-color: #fff;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  border-radius: 4px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  z-index: 1050;
  left: -9999px;
  top: -9999px;
  position: absolute;
  outline: none;
  font-size: 14px;
}
.ant-select-dropdown.slide-up-enter.slide-up-enter-active.ant-select-dropdown-placement-bottomLeft,
.ant-select-dropdown.slide-up-appear.slide-up-appear-active.ant-select-dropdown-placement-bottomLeft {
  -webkit-animation-name: antSlideUpIn;
          animation-name: antSlideUpIn;
}
.ant-select-dropdown.slide-up-enter.slide-up-enter-active.ant-select-dropdown-placement-topLeft,
.ant-select-dropdown.slide-up-appear.slide-up-appear-active.ant-select-dropdown-placement-topLeft {
  -webkit-animation-name: antSlideDownIn;
          animation-name: antSlideDownIn;
}
.ant-select-dropdown.slide-up-leave.slide-up-leave-active.ant-select-dropdown-placement-bottomLeft {
  -webkit-animation-name: antSlideUpOut;
          animation-name: antSlideUpOut;
}
.ant-select-dropdown.slide-up-leave.slide-up-leave-active.ant-select-dropdown-placement-topLeft {
  -webkit-animation-name: antSlideDownOut;
          animation-name: antSlideDownOut;
}
.ant-select-dropdown-hidden {
  display: none;
}
.ant-select-dropdown-menu {
  outline: none;
  margin-bottom: 0;
  padding-left: 0;
  list-style: none;
  max-height: 250px;
  overflow: auto;
}
.ant-select-dropdown-menu-item-group-list {
  margin: 0;
  padding: 0;
}
.ant-select-dropdown-menu-item-group-list > .ant-select-dropdown-menu-item {
  padding-left: 20px;
}
.ant-select-dropdown-menu-item-group-title {
  color: rgba(0, 0, 0, 0.45);
  padding: 0 12px;
  height: 32px;
  line-height: 32px;
  font-size: 12px;
}
.ant-select-dropdown-menu-item-group-list .ant-select-dropdown-menu-item:first-child:not(:last-child),
.ant-select-dropdown-menu-item-group:not(:last-child) .ant-select-dropdown-menu-item-group-list .ant-select-dropdown-menu-item:last-child {
  border-radius: 0;
}
.ant-select-dropdown-menu-item {
  position: relative;
  display: block;
  padding: 5px 12px;
  line-height: 22px;
  font-weight: normal;
  color: rgba(0, 0, 0, 0.65);
  white-space: nowrap;
  cursor: pointer;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  -webkit-transition: background 0.3s ease;
  -o-transition: background 0.3s ease;
  transition: background 0.3s ease;
}
.ant-select-dropdown-menu-item:hover {
  background-color: #e6f7ff;
}
.ant-select-dropdown-menu-item:first-child {
  border-radius: 4px 4px 0 0;
}
.ant-select-dropdown-menu-item:last-child {
  border-radius: 0 0 4px 4px;
}
.ant-select-dropdown-menu-item-disabled {
  color: rgba(0, 0, 0, 0.25);
  cursor: not-allowed;
}
.ant-select-dropdown-menu-item-disabled:hover {
  color: rgba(0, 0, 0, 0.25);
  background-color: #fff;
  cursor: not-allowed;
}
.ant-select-dropdown-menu-item-selected,
.ant-select-dropdown-menu-item-selected:hover {
  background-color: #fafafa;
  font-weight: 600;
  color: rgba(0, 0, 0, 0.65);
}
.ant-select-dropdown-menu-item-active {
  background-color: #e6f7ff;
}
.ant-select-dropdown-menu-item-divider {
  height: 1px;
  margin: 1px 0;
  overflow: hidden;
  background-color: #e8e8e8;
  line-height: 0;
}
.ant-select-dropdown.ant-select-dropdown--multiple .ant-select-dropdown-menu-item {
  padding-right: 32px;
}
.ant-select-dropdown.ant-select-dropdown--multiple .ant-select-dropdown-menu-item .ant-select-selected-icon {
  color: transparent;
  display: inline-block;
  font-size: 12px;
  font-size: 10px \9;
  -webkit-transform: scale(0.83333333) rotate(0deg);
          transform: scale(0.83333333) rotate(0deg);
  -webkit-transition: all 0.2s ease;
  -o-transition: all 0.2s ease;
  transition: all 0.2s ease;
  position: absolute;
  top: 50%;
  -webkit-transform: translateY(-50%);
          transform: translateY(-50%);
  right: 12px;
  font-weight: bold;
  text-shadow: 0 0.1px 0, 0.1px 0 0, 0 -0.1px 0, -0.1px 0;
}
:root .ant-select-dropdown.ant-select-dropdown--multiple .ant-select-dropdown-menu-item .ant-select-selected-icon {
  font-size: 12px;
}
.ant-select-dropdown.ant-select-dropdown--multiple .ant-select-dropdown-menu-item:hover .ant-select-selected-icon {
  color: rgba(0, 0, 0, 0.87);
}
.ant-select-dropdown.ant-select-dropdown--multiple .ant-select-dropdown-menu-item-disabled .ant-select-selected-icon {
  display: none;
}
.ant-select-dropdown.ant-select-dropdown--multiple .ant-select-dropdown-menu-item-selected .ant-select-selected-icon,
.ant-select-dropdown.ant-select-dropdown--multiple .ant-select-dropdown-menu-item-selected:hover .ant-select-selected-icon {
  color: #1890ff;
  display: inline-block;
}
.ant-select-dropdown-container-open .ant-select-dropdown,
.ant-select-dropdown-open .ant-select-dropdown {
  display: block;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-empty {
  text-align: center;
  font-size: 14px;
  line-height: 22px;
  margin: 0 8px;
}
.ant-empty-image {
  margin-bottom: 8px;
  height: 100px;
}
.ant-empty-image img {
  height: 100%;
}
.ant-empty-description {
  margin: 0;
}
.ant-empty-footer {
  margin-top: 16px;
}
.ant-empty-small {
  margin: 8px 0;
}
.ant-empty-small .ant-empty-image {
  height: 35px;
}
.ant-empty-normal {
  margin: 32px 0;
}
.ant-empty-normal .ant-empty-image {
  height: 40px;
}
.ant-select-dropdown--multiple .ant-select-dropdown-menu-item .ant-empty-small {
  margin-left: 32px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-input {
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: relative;
  display: inline-block;
  padding: 4px 11px;
  width: 100%;
  height: 32px;
  font-size: 14px;
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  background-color: #fff;
  background-image: none;
  border: 1px solid #d9d9d9;
  border-radius: 4px;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-input::-moz-placeholder {
  color: #bfbfbf;
  opacity: 1;
}
.ant-input:-ms-input-placeholder {
  color: #bfbfbf;
}
.ant-input::-webkit-input-placeholder {
  color: #bfbfbf;
}
.ant-input:hover {
  border-color: #40a9ff;
  border-right-width: 1px !important;
}
.ant-input:focus {
  border-color: #40a9ff;
  outline: 0;
  -webkit-box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
          box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
  border-right-width: 1px !important;
}
.ant-input-disabled {
  background-color: #f5f5f5;
  opacity: 1;
  cursor: not-allowed;
  color: rgba(0, 0, 0, 0.25);
}
.ant-input-disabled:hover {
  border-color: #e6d8d8;
  border-right-width: 1px !important;
}
textarea.ant-input {
  max-width: 100%;
  height: auto;
  vertical-align: bottom;
  -webkit-transition: all 0.3s, height 0s;
  -o-transition: all 0.3s, height 0s;
  transition: all 0.3s, height 0s;
  min-height: 32px;
}
.ant-input-lg {
  padding: 6px 11px;
  height: 40px;
  font-size: 16px;
}
.ant-input-sm {
  padding: 1px 7px;
  height: 24px;
}
.ant-input-group {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: relative;
  display: table;
  border-collapse: separate;
  border-spacing: 0;
  width: 100%;
}
.ant-input-group[class*='col-'] {
  float: none;
  padding-left: 0;
  padding-right: 0;
}
.ant-input-group > [class*='col-'] {
  padding-right: 8px;
}
.ant-input-group > [class*='col-']:last-child {
  padding-right: 0;
}
.ant-input-group-addon,
.ant-input-group-wrap,
.ant-input-group > .ant-input {
  display: table-cell;
}
.ant-input-group-addon:not(:first-child):not(:last-child),
.ant-input-group-wrap:not(:first-child):not(:last-child),
.ant-input-group > .ant-input:not(:first-child):not(:last-child) {
  border-radius: 0;
}
.ant-input-group-addon,
.ant-input-group-wrap {
  width: 1px;
  white-space: nowrap;
  vertical-align: middle;
}
.ant-input-group-wrap > * {
  display: block !important;
}
.ant-input-group .ant-input {
  float: left;
  width: 100%;
  margin-bottom: 0;
}
.ant-input-group .ant-input:focus {
  z-index: 1;
  border-right-width: 1px;
}
.ant-input-group .ant-input:hover {
  z-index: 1;
  border-right-width: 1px;
}
.ant-input-group-addon {
  padding: 0 11px;
  font-size: 14px;
  font-weight: normal;
  line-height: 1;
  color: rgba(0, 0, 0, 0.65);
  text-align: center;
  background-color: #fafafa;
  border: 1px solid #d9d9d9;
  border-radius: 4px;
  position: relative;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-input-group-addon .ant-select {
  margin: -5px -11px;
}
.ant-input-group-addon .ant-select .ant-select-selection {
  background-color: inherit;
  margin: -1px;
  border: 1px solid transparent;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-input-group-addon .ant-select-open .ant-select-selection,
.ant-input-group-addon .ant-select-focused .ant-select-selection {
  color: #1890ff;
}
.ant-input-group-addon > i:only-child:after {
  position: absolute;
  content: '';
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}
.ant-input-group > .ant-input:first-child,
.ant-input-group-addon:first-child {
  border-bottom-right-radius: 0;
  border-top-right-radius: 0;
}
.ant-input-group > .ant-input:first-child .ant-select .ant-select-selection,
.ant-input-group-addon:first-child .ant-select .ant-select-selection {
  border-bottom-right-radius: 0;
  border-top-right-radius: 0;
}
.ant-input-group > .ant-input-affix-wrapper:not(:first-child) .ant-input {
  border-bottom-left-radius: 0;
  border-top-left-radius: 0;
}
.ant-input-group > .ant-input-affix-wrapper:not(:last-child) .ant-input {
  border-bottom-right-radius: 0;
  border-top-right-radius: 0;
}
.ant-input-group-addon:first-child {
  border-right: 0;
}
.ant-input-group-addon:last-child {
  border-left: 0;
}
.ant-input-group > .ant-input:last-child,
.ant-input-group-addon:last-child {
  border-bottom-left-radius: 0;
  border-top-left-radius: 0;
}
.ant-input-group > .ant-input:last-child .ant-select .ant-select-selection,
.ant-input-group-addon:last-child .ant-select .ant-select-selection {
  border-bottom-left-radius: 0;
  border-top-left-radius: 0;
}
.ant-input-group-lg .ant-input,
.ant-input-group-lg > .ant-input-group-addon {
  padding: 6px 11px;
  height: 40px;
  font-size: 16px;
}
.ant-input-group-sm .ant-input,
.ant-input-group-sm > .ant-input-group-addon {
  padding: 1px 7px;
  height: 24px;
}
.ant-input-group-lg .ant-select-selection--single {
  height: 40px;
}
.ant-input-group-sm .ant-select-selection--single {
  height: 24px;
}
.ant-input-group .ant-input-affix-wrapper {
  display: table-cell;
  width: 100%;
  float: left;
}
.ant-input-group.ant-input-group-compact {
  display: block;
  zoom: 1;
}
.ant-input-group.ant-input-group-compact::before,
.ant-input-group.ant-input-group-compact::after {
  content: ' ';
  display: table;
}
.ant-input-group.ant-input-group-compact::after {
  clear: both;
}
.ant-input-group.ant-input-group-compact:before,
.ant-input-group.ant-input-group-compact:after {
  content: '';
  display: table;
}
.ant-input-group.ant-input-group-compact:after {
  clear: both;
}
.ant-input-group.ant-input-group-compact-addon:not(:first-child):not(:last-child),
.ant-input-group.ant-input-group-compact-wrap:not(:first-child):not(:last-child),
.ant-input-group.ant-input-group-compact > .ant-input:not(:first-child):not(:last-child) {
  border-right-width: 1px;
}
.ant-input-group.ant-input-group-compact-addon:not(:first-child):not(:last-child):hover,
.ant-input-group.ant-input-group-compact-wrap:not(:first-child):not(:last-child):hover,
.ant-input-group.ant-input-group-compact > .ant-input:not(:first-child):not(:last-child):hover {
  z-index: 1;
}
.ant-input-group.ant-input-group-compact-addon:not(:first-child):not(:last-child):focus,
.ant-input-group.ant-input-group-compact-wrap:not(:first-child):not(:last-child):focus,
.ant-input-group.ant-input-group-compact > .ant-input:not(:first-child):not(:last-child):focus {
  z-index: 1;
}
.ant-input-group.ant-input-group-compact > * {
  border-radius: 0;
  vertical-align: top;
  float: none;
  display: inline-block;
}
.ant-input-group.ant-input-group-compact > *:not(:last-child) {
  border-right-width: 1px;
  margin-right: -1px;
}
.ant-input-group.ant-input-group-compact .ant-input {
  float: none;
}
.ant-input-group.ant-input-group-compact > .ant-select > .ant-select-selection,
.ant-input-group.ant-input-group-compact > .ant-calendar-picker .ant-input,
.ant-input-group.ant-input-group-compact > .ant-select-auto-complete .ant-input,
.ant-input-group.ant-input-group-compact > .ant-cascader-picker .ant-input,
.ant-input-group.ant-input-group-compact > .ant-mention-wrapper .ant-mention-editor,
.ant-input-group.ant-input-group-compact > .ant-time-picker .ant-time-picker-input {
  border-radius: 0;
  border-right-width: 1px;
}
.ant-input-group.ant-input-group-compact > .ant-select > .ant-select-selection:hover,
.ant-input-group.ant-input-group-compact > .ant-calendar-picker .ant-input:hover,
.ant-input-group.ant-input-group-compact > .ant-select-auto-complete .ant-input:hover,
.ant-input-group.ant-input-group-compact > .ant-cascader-picker .ant-input:hover,
.ant-input-group.ant-input-group-compact > .ant-mention-wrapper .ant-mention-editor:hover,
.ant-input-group.ant-input-group-compact > .ant-time-picker .ant-time-picker-input:hover {
  z-index: 1;
}
.ant-input-group.ant-input-group-compact > .ant-select > .ant-select-selection:focus,
.ant-input-group.ant-input-group-compact > .ant-calendar-picker .ant-input:focus,
.ant-input-group.ant-input-group-compact > .ant-select-auto-complete .ant-input:focus,
.ant-input-group.ant-input-group-compact > .ant-cascader-picker .ant-input:focus,
.ant-input-group.ant-input-group-compact > .ant-mention-wrapper .ant-mention-editor:focus,
.ant-input-group.ant-input-group-compact > .ant-time-picker .ant-time-picker-input:focus {
  z-index: 1;
}
.ant-input-group.ant-input-group-compact > *:first-child,
.ant-input-group.ant-input-group-compact > .ant-select:first-child > .ant-select-selection,
.ant-input-group.ant-input-group-compact > .ant-calendar-picker:first-child .ant-input,
.ant-input-group.ant-input-group-compact > .ant-select-auto-complete:first-child .ant-input,
.ant-input-group.ant-input-group-compact > .ant-cascader-picker:first-child .ant-input,
.ant-input-group.ant-input-group-compact > .ant-mention-wrapper:first-child .ant-mention-editor,
.ant-input-group.ant-input-group-compact > .ant-time-picker:first-child .ant-time-picker-input {
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
}
.ant-input-group.ant-input-group-compact > *:last-child,
.ant-input-group.ant-input-group-compact > .ant-select:last-child > .ant-select-selection,
.ant-input-group.ant-input-group-compact > .ant-calendar-picker:last-child .ant-input,
.ant-input-group.ant-input-group-compact > .ant-select-auto-complete:last-child .ant-input,
.ant-input-group.ant-input-group-compact > .ant-cascader-picker:last-child .ant-input,
.ant-input-group.ant-input-group-compact > .ant-cascader-picker-focused:last-child .ant-input,
.ant-input-group.ant-input-group-compact > .ant-mention-wrapper:last-child .ant-mention-editor,
.ant-input-group.ant-input-group-compact > .ant-time-picker:last-child .ant-time-picker-input {
  border-top-right-radius: 4px;
  border-bottom-right-radius: 4px;
  border-right-width: 1px;
}
.ant-input-group.ant-input-group-compact > .ant-select-auto-complete .ant-input {
  vertical-align: top;
}
.ant-input-group-wrapper {
  display: inline-block;
  vertical-align: top;
  width: 100%;
}
.ant-input-affix-wrapper {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: relative;
  display: inline-block;
  width: 100%;
}
.ant-input-affix-wrapper:hover .ant-input:not(.ant-input-disabled) {
  border-color: #40a9ff;
  border-right-width: 1px !important;
}
.ant-input-affix-wrapper .ant-input {
  position: relative;
}
.ant-input-affix-wrapper .ant-input-prefix,
.ant-input-affix-wrapper .ant-input-suffix {
  position: absolute;
  top: 50%;
  z-index: 2;
  -webkit-transform: translateY(-50%);
          transform: translateY(-50%);
  line-height: 0;
  color: rgba(0, 0, 0, 0.65);
}
.ant-input-affix-wrapper .ant-input-prefix :not(.anticon),
.ant-input-affix-wrapper .ant-input-suffix :not(.anticon) {
  line-height: 1.5;
}
.ant-input-affix-wrapper .ant-input-prefix {
  left: 12px;
}
.ant-input-affix-wrapper .ant-input-suffix {
  right: 12px;
}
.ant-input-affix-wrapper .ant-input:not(:first-child) {
  padding-left: 30px;
}
.ant-input-affix-wrapper .ant-input:not(:last-child) {
  padding-right: 30px;
}
.ant-input-affix-wrapper .ant-input {
  min-height: 100%;
}
.ant-input-password-icon {
  cursor: pointer;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-input-password-icon:hover {
  color: #333;
}
.ant-input-search-icon {
  color: rgba(0, 0, 0, 0.45);
  cursor: pointer;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-input-search-icon:hover {
  color: rgba(0, 0, 0, 0.8);
}
.ant-input-search .ant-input-group-addon {
  border: 0;
  padding: 0;
}
.ant-input-search .ant-input-group-addon .ant-input-search-button {
  border-top-left-radius: 0;
  border-bottom-left-radius: 0;
  width: 100%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-btn {
  line-height: 1.499;
  display: inline-block;
  font-weight: 400;
  text-align: center;
  -ms-touch-action: manipulation;
      touch-action: manipulation;
  cursor: pointer;
  background-image: none;
  border: 1px solid transparent;
  white-space: nowrap;
  padding: 0 15px;
  font-size: 14px;
  border-radius: 4px;
  height: 32px;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  -webkit-transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  position: relative;
  -webkit-box-shadow: 0 2px 0 rgba(0, 0, 0, 0.015);
          box-shadow: 0 2px 0 rgba(0, 0, 0, 0.015);
  color: rgba(0, 0, 0, 0.65);
  background-color: #fff;
  border-color: #d9d9d9;
}
.ant-btn > .anticon {
  line-height: 1;
}
.ant-btn,
.ant-btn:active,
.ant-btn:focus {
  outline: 0;
}
.ant-btn:not([disabled]):hover {
  text-decoration: none;
}
.ant-btn:not([disabled]):active {
  outline: 0;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-btn.disabled,
.ant-btn[disabled] {
  cursor: not-allowed;
}
.ant-btn.disabled > *,
.ant-btn[disabled] > * {
  pointer-events: none;
}
.ant-btn-lg {
  padding: 0 15px;
  font-size: 16px;
  border-radius: 4px;
  height: 40px;
}
.ant-btn-sm {
  padding: 0 7px;
  font-size: 14px;
  border-radius: 4px;
  height: 24px;
}
.ant-btn > a:only-child {
  color: currentColor;
}
.ant-btn > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn:hover,
.ant-btn:focus {
  color: #40a9ff;
  background-color: #fff;
  border-color: #40a9ff;
}
.ant-btn:hover > a:only-child,
.ant-btn:focus > a:only-child {
  color: currentColor;
}
.ant-btn:hover > a:only-child:after,
.ant-btn:focus > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn:active,
.ant-btn.active {
  color: #096dd9;
  background-color: #fff;
  border-color: #096dd9;
}
.ant-btn:active > a:only-child,
.ant-btn.active > a:only-child {
  color: currentColor;
}
.ant-btn:active > a:only-child:after,
.ant-btn.active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-disabled,
.ant-btn.disabled,
.ant-btn[disabled],
.ant-btn-disabled:hover,
.ant-btn.disabled:hover,
.ant-btn[disabled]:hover,
.ant-btn-disabled:focus,
.ant-btn.disabled:focus,
.ant-btn[disabled]:focus,
.ant-btn-disabled:active,
.ant-btn.disabled:active,
.ant-btn[disabled]:active,
.ant-btn-disabled.active,
.ant-btn.disabled.active,
.ant-btn[disabled].active {
  color: rgba(0, 0, 0, 0.25);
  background-color: #f5f5f5;
  border-color: #d9d9d9;
  text-shadow: none;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-btn-disabled > a:only-child,
.ant-btn.disabled > a:only-child,
.ant-btn[disabled] > a:only-child,
.ant-btn-disabled:hover > a:only-child,
.ant-btn.disabled:hover > a:only-child,
.ant-btn[disabled]:hover > a:only-child,
.ant-btn-disabled:focus > a:only-child,
.ant-btn.disabled:focus > a:only-child,
.ant-btn[disabled]:focus > a:only-child,
.ant-btn-disabled:active > a:only-child,
.ant-btn.disabled:active > a:only-child,
.ant-btn[disabled]:active > a:only-child,
.ant-btn-disabled.active > a:only-child,
.ant-btn.disabled.active > a:only-child,
.ant-btn[disabled].active > a:only-child {
  color: currentColor;
}
.ant-btn-disabled > a:only-child:after,
.ant-btn.disabled > a:only-child:after,
.ant-btn[disabled] > a:only-child:after,
.ant-btn-disabled:hover > a:only-child:after,
.ant-btn.disabled:hover > a:only-child:after,
.ant-btn[disabled]:hover > a:only-child:after,
.ant-btn-disabled:focus > a:only-child:after,
.ant-btn.disabled:focus > a:only-child:after,
.ant-btn[disabled]:focus > a:only-child:after,
.ant-btn-disabled:active > a:only-child:after,
.ant-btn.disabled:active > a:only-child:after,
.ant-btn[disabled]:active > a:only-child:after,
.ant-btn-disabled.active > a:only-child:after,
.ant-btn.disabled.active > a:only-child:after,
.ant-btn[disabled].active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn:hover,
.ant-btn:focus,
.ant-btn:active,
.ant-btn.active {
  background: #fff;
  text-decoration: none;
}
.ant-btn > i,
.ant-btn > span {
  pointer-events: none;
  display: inline-block;
}
.ant-btn-primary {
  color: #fff;
  background-color: #1890ff;
  border-color: #1890ff;
  text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.12);
  -webkit-box-shadow: 0 2px 0 rgba(0, 0, 0, 0.045);
          box-shadow: 0 2px 0 rgba(0, 0, 0, 0.045);
}
.ant-btn-primary > a:only-child {
  color: currentColor;
}
.ant-btn-primary > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-primary:hover,
.ant-btn-primary:focus {
  color: #fff;
  background-color: #40a9ff;
  border-color: #40a9ff;
}
.ant-btn-primary:hover > a:only-child,
.ant-btn-primary:focus > a:only-child {
  color: currentColor;
}
.ant-btn-primary:hover > a:only-child:after,
.ant-btn-primary:focus > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-primary:active,
.ant-btn-primary.active {
  color: #fff;
  background-color: #096dd9;
  border-color: #096dd9;
}
.ant-btn-primary:active > a:only-child,
.ant-btn-primary.active > a:only-child {
  color: currentColor;
}
.ant-btn-primary:active > a:only-child:after,
.ant-btn-primary.active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-primary-disabled,
.ant-btn-primary.disabled,
.ant-btn-primary[disabled],
.ant-btn-primary-disabled:hover,
.ant-btn-primary.disabled:hover,
.ant-btn-primary[disabled]:hover,
.ant-btn-primary-disabled:focus,
.ant-btn-primary.disabled:focus,
.ant-btn-primary[disabled]:focus,
.ant-btn-primary-disabled:active,
.ant-btn-primary.disabled:active,
.ant-btn-primary[disabled]:active,
.ant-btn-primary-disabled.active,
.ant-btn-primary.disabled.active,
.ant-btn-primary[disabled].active {
  color: rgba(0, 0, 0, 0.25);
  background-color: #f5f5f5;
  border-color: #d9d9d9;
  text-shadow: none;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-btn-primary-disabled > a:only-child,
.ant-btn-primary.disabled > a:only-child,
.ant-btn-primary[disabled] > a:only-child,
.ant-btn-primary-disabled:hover > a:only-child,
.ant-btn-primary.disabled:hover > a:only-child,
.ant-btn-primary[disabled]:hover > a:only-child,
.ant-btn-primary-disabled:focus > a:only-child,
.ant-btn-primary.disabled:focus > a:only-child,
.ant-btn-primary[disabled]:focus > a:only-child,
.ant-btn-primary-disabled:active > a:only-child,
.ant-btn-primary.disabled:active > a:only-child,
.ant-btn-primary[disabled]:active > a:only-child,
.ant-btn-primary-disabled.active > a:only-child,
.ant-btn-primary.disabled.active > a:only-child,
.ant-btn-primary[disabled].active > a:only-child {
  color: currentColor;
}
.ant-btn-primary-disabled > a:only-child:after,
.ant-btn-primary.disabled > a:only-child:after,
.ant-btn-primary[disabled] > a:only-child:after,
.ant-btn-primary-disabled:hover > a:only-child:after,
.ant-btn-primary.disabled:hover > a:only-child:after,
.ant-btn-primary[disabled]:hover > a:only-child:after,
.ant-btn-primary-disabled:focus > a:only-child:after,
.ant-btn-primary.disabled:focus > a:only-child:after,
.ant-btn-primary[disabled]:focus > a:only-child:after,
.ant-btn-primary-disabled:active > a:only-child:after,
.ant-btn-primary.disabled:active > a:only-child:after,
.ant-btn-primary[disabled]:active > a:only-child:after,
.ant-btn-primary-disabled.active > a:only-child:after,
.ant-btn-primary.disabled.active > a:only-child:after,
.ant-btn-primary[disabled].active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-group .ant-btn-primary:not(:first-child):not(:last-child) {
  border-right-color: #40a9ff;
  border-left-color: #40a9ff;
}
.ant-btn-group .ant-btn-primary:not(:first-child):not(:last-child):disabled {
  border-color: #d9d9d9;
}
.ant-btn-group .ant-btn-primary:first-child:not(:last-child) {
  border-right-color: #40a9ff;
}
.ant-btn-group .ant-btn-primary:first-child:not(:last-child)[disabled] {
  border-right-color: #d9d9d9;
}
.ant-btn-group .ant-btn-primary:last-child:not(:first-child),
.ant-btn-group .ant-btn-primary + .ant-btn-primary {
  border-left-color: #40a9ff;
}
.ant-btn-group .ant-btn-primary:last-child:not(:first-child)[disabled],
.ant-btn-group .ant-btn-primary + .ant-btn-primary[disabled] {
  border-left-color: #d9d9d9;
}
.ant-btn-ghost {
  color: rgba(0, 0, 0, 0.65);
  background-color: transparent;
  border-color: #d9d9d9;
}
.ant-btn-ghost > a:only-child {
  color: currentColor;
}
.ant-btn-ghost > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-ghost:hover,
.ant-btn-ghost:focus {
  color: #40a9ff;
  background-color: transparent;
  border-color: #40a9ff;
}
.ant-btn-ghost:hover > a:only-child,
.ant-btn-ghost:focus > a:only-child {
  color: currentColor;
}
.ant-btn-ghost:hover > a:only-child:after,
.ant-btn-ghost:focus > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-ghost:active,
.ant-btn-ghost.active {
  color: #096dd9;
  background-color: transparent;
  border-color: #096dd9;
}
.ant-btn-ghost:active > a:only-child,
.ant-btn-ghost.active > a:only-child {
  color: currentColor;
}
.ant-btn-ghost:active > a:only-child:after,
.ant-btn-ghost.active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-ghost-disabled,
.ant-btn-ghost.disabled,
.ant-btn-ghost[disabled],
.ant-btn-ghost-disabled:hover,
.ant-btn-ghost.disabled:hover,
.ant-btn-ghost[disabled]:hover,
.ant-btn-ghost-disabled:focus,
.ant-btn-ghost.disabled:focus,
.ant-btn-ghost[disabled]:focus,
.ant-btn-ghost-disabled:active,
.ant-btn-ghost.disabled:active,
.ant-btn-ghost[disabled]:active,
.ant-btn-ghost-disabled.active,
.ant-btn-ghost.disabled.active,
.ant-btn-ghost[disabled].active {
  color: rgba(0, 0, 0, 0.25);
  background-color: #f5f5f5;
  border-color: #d9d9d9;
  text-shadow: none;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-btn-ghost-disabled > a:only-child,
.ant-btn-ghost.disabled > a:only-child,
.ant-btn-ghost[disabled] > a:only-child,
.ant-btn-ghost-disabled:hover > a:only-child,
.ant-btn-ghost.disabled:hover > a:only-child,
.ant-btn-ghost[disabled]:hover > a:only-child,
.ant-btn-ghost-disabled:focus > a:only-child,
.ant-btn-ghost.disabled:focus > a:only-child,
.ant-btn-ghost[disabled]:focus > a:only-child,
.ant-btn-ghost-disabled:active > a:only-child,
.ant-btn-ghost.disabled:active > a:only-child,
.ant-btn-ghost[disabled]:active > a:only-child,
.ant-btn-ghost-disabled.active > a:only-child,
.ant-btn-ghost.disabled.active > a:only-child,
.ant-btn-ghost[disabled].active > a:only-child {
  color: currentColor;
}
.ant-btn-ghost-disabled > a:only-child:after,
.ant-btn-ghost.disabled > a:only-child:after,
.ant-btn-ghost[disabled] > a:only-child:after,
.ant-btn-ghost-disabled:hover > a:only-child:after,
.ant-btn-ghost.disabled:hover > a:only-child:after,
.ant-btn-ghost[disabled]:hover > a:only-child:after,
.ant-btn-ghost-disabled:focus > a:only-child:after,
.ant-btn-ghost.disabled:focus > a:only-child:after,
.ant-btn-ghost[disabled]:focus > a:only-child:after,
.ant-btn-ghost-disabled:active > a:only-child:after,
.ant-btn-ghost.disabled:active > a:only-child:after,
.ant-btn-ghost[disabled]:active > a:only-child:after,
.ant-btn-ghost-disabled.active > a:only-child:after,
.ant-btn-ghost.disabled.active > a:only-child:after,
.ant-btn-ghost[disabled].active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-dashed {
  color: rgba(0, 0, 0, 0.65);
  background-color: #fff;
  border-color: #d9d9d9;
  border-style: dashed;
}
.ant-btn-dashed > a:only-child {
  color: currentColor;
}
.ant-btn-dashed > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-dashed:hover,
.ant-btn-dashed:focus {
  color: #40a9ff;
  background-color: #fff;
  border-color: #40a9ff;
}
.ant-btn-dashed:hover > a:only-child,
.ant-btn-dashed:focus > a:only-child {
  color: currentColor;
}
.ant-btn-dashed:hover > a:only-child:after,
.ant-btn-dashed:focus > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-dashed:active,
.ant-btn-dashed.active {
  color: #096dd9;
  background-color: #fff;
  border-color: #096dd9;
}
.ant-btn-dashed:active > a:only-child,
.ant-btn-dashed.active > a:only-child {
  color: currentColor;
}
.ant-btn-dashed:active > a:only-child:after,
.ant-btn-dashed.active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-dashed-disabled,
.ant-btn-dashed.disabled,
.ant-btn-dashed[disabled],
.ant-btn-dashed-disabled:hover,
.ant-btn-dashed.disabled:hover,
.ant-btn-dashed[disabled]:hover,
.ant-btn-dashed-disabled:focus,
.ant-btn-dashed.disabled:focus,
.ant-btn-dashed[disabled]:focus,
.ant-btn-dashed-disabled:active,
.ant-btn-dashed.disabled:active,
.ant-btn-dashed[disabled]:active,
.ant-btn-dashed-disabled.active,
.ant-btn-dashed.disabled.active,
.ant-btn-dashed[disabled].active {
  color: rgba(0, 0, 0, 0.25);
  background-color: #f5f5f5;
  border-color: #d9d9d9;
  text-shadow: none;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-btn-dashed-disabled > a:only-child,
.ant-btn-dashed.disabled > a:only-child,
.ant-btn-dashed[disabled] > a:only-child,
.ant-btn-dashed-disabled:hover > a:only-child,
.ant-btn-dashed.disabled:hover > a:only-child,
.ant-btn-dashed[disabled]:hover > a:only-child,
.ant-btn-dashed-disabled:focus > a:only-child,
.ant-btn-dashed.disabled:focus > a:only-child,
.ant-btn-dashed[disabled]:focus > a:only-child,
.ant-btn-dashed-disabled:active > a:only-child,
.ant-btn-dashed.disabled:active > a:only-child,
.ant-btn-dashed[disabled]:active > a:only-child,
.ant-btn-dashed-disabled.active > a:only-child,
.ant-btn-dashed.disabled.active > a:only-child,
.ant-btn-dashed[disabled].active > a:only-child {
  color: currentColor;
}
.ant-btn-dashed-disabled > a:only-child:after,
.ant-btn-dashed.disabled > a:only-child:after,
.ant-btn-dashed[disabled] > a:only-child:after,
.ant-btn-dashed-disabled:hover > a:only-child:after,
.ant-btn-dashed.disabled:hover > a:only-child:after,
.ant-btn-dashed[disabled]:hover > a:only-child:after,
.ant-btn-dashed-disabled:focus > a:only-child:after,
.ant-btn-dashed.disabled:focus > a:only-child:after,
.ant-btn-dashed[disabled]:focus > a:only-child:after,
.ant-btn-dashed-disabled:active > a:only-child:after,
.ant-btn-dashed.disabled:active > a:only-child:after,
.ant-btn-dashed[disabled]:active > a:only-child:after,
.ant-btn-dashed-disabled.active > a:only-child:after,
.ant-btn-dashed.disabled.active > a:only-child:after,
.ant-btn-dashed[disabled].active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-danger {
  color: #f5222d;
  background-color: #f5f5f5;
  border-color: #d9d9d9;
}
.ant-btn-danger > a:only-child {
  color: currentColor;
}
.ant-btn-danger > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-danger:hover {
  color: #fff;
  background-color: #ff4d4f;
  border-color: #ff4d4f;
}
.ant-btn-danger:hover > a:only-child {
  color: currentColor;
}
.ant-btn-danger:hover > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-danger:focus {
  color: #ff4d4f;
  background-color: #fff;
  border-color: #ff4d4f;
}
.ant-btn-danger:focus > a:only-child {
  color: currentColor;
}
.ant-btn-danger:focus > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-danger:active,
.ant-btn-danger.active {
  color: #fff;
  background-color: #cf1322;
  border-color: #cf1322;
}
.ant-btn-danger:active > a:only-child,
.ant-btn-danger.active > a:only-child {
  color: currentColor;
}
.ant-btn-danger:active > a:only-child:after,
.ant-btn-danger.active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-danger-disabled,
.ant-btn-danger.disabled,
.ant-btn-danger[disabled],
.ant-btn-danger-disabled:hover,
.ant-btn-danger.disabled:hover,
.ant-btn-danger[disabled]:hover,
.ant-btn-danger-disabled:focus,
.ant-btn-danger.disabled:focus,
.ant-btn-danger[disabled]:focus,
.ant-btn-danger-disabled:active,
.ant-btn-danger.disabled:active,
.ant-btn-danger[disabled]:active,
.ant-btn-danger-disabled.active,
.ant-btn-danger.disabled.active,
.ant-btn-danger[disabled].active {
  color: rgba(0, 0, 0, 0.25);
  background-color: #f5f5f5;
  border-color: #d9d9d9;
  text-shadow: none;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-btn-danger-disabled > a:only-child,
.ant-btn-danger.disabled > a:only-child,
.ant-btn-danger[disabled] > a:only-child,
.ant-btn-danger-disabled:hover > a:only-child,
.ant-btn-danger.disabled:hover > a:only-child,
.ant-btn-danger[disabled]:hover > a:only-child,
.ant-btn-danger-disabled:focus > a:only-child,
.ant-btn-danger.disabled:focus > a:only-child,
.ant-btn-danger[disabled]:focus > a:only-child,
.ant-btn-danger-disabled:active > a:only-child,
.ant-btn-danger.disabled:active > a:only-child,
.ant-btn-danger[disabled]:active > a:only-child,
.ant-btn-danger-disabled.active > a:only-child,
.ant-btn-danger.disabled.active > a:only-child,
.ant-btn-danger[disabled].active > a:only-child {
  color: currentColor;
}
.ant-btn-danger-disabled > a:only-child:after,
.ant-btn-danger.disabled > a:only-child:after,
.ant-btn-danger[disabled] > a:only-child:after,
.ant-btn-danger-disabled:hover > a:only-child:after,
.ant-btn-danger.disabled:hover > a:only-child:after,
.ant-btn-danger[disabled]:hover > a:only-child:after,
.ant-btn-danger-disabled:focus > a:only-child:after,
.ant-btn-danger.disabled:focus > a:only-child:after,
.ant-btn-danger[disabled]:focus > a:only-child:after,
.ant-btn-danger-disabled:active > a:only-child:after,
.ant-btn-danger.disabled:active > a:only-child:after,
.ant-btn-danger[disabled]:active > a:only-child:after,
.ant-btn-danger-disabled.active > a:only-child:after,
.ant-btn-danger.disabled.active > a:only-child:after,
.ant-btn-danger[disabled].active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-round {
  padding: 0 16px;
  font-size: 16px;
  border-radius: 32px;
  height: 32px;
}
.ant-btn-round.ant-btn-lg {
  padding: 0 20px;
  font-size: 18px;
  border-radius: 40px;
  height: 40px;
}
.ant-btn-round.ant-btn-sm {
  padding: 0 12px;
  font-size: 14px;
  border-radius: 24px;
  height: 24px;
}
.ant-btn-circle,
.ant-btn-circle-outline {
  width: 32px;
  padding: 0;
  font-size: 16px;
  border-radius: 50%;
  height: 32px;
}
.ant-btn-circle.ant-btn-lg,
.ant-btn-circle-outline.ant-btn-lg {
  width: 40px;
  padding: 0;
  font-size: 18px;
  border-radius: 50%;
  height: 40px;
}
.ant-btn-circle.ant-btn-sm,
.ant-btn-circle-outline.ant-btn-sm {
  width: 24px;
  padding: 0;
  font-size: 14px;
  border-radius: 50%;
  height: 24px;
}
.ant-btn:before {
  position: absolute;
  top: -1px;
  left: -1px;
  bottom: -1px;
  right: -1px;
  background: #fff;
  opacity: 0.35;
  content: '';
  border-radius: inherit;
  z-index: 1;
  -webkit-transition: opacity 0.2s;
  -o-transition: opacity 0.2s;
  transition: opacity 0.2s;
  pointer-events: none;
  display: none;
}
.ant-btn .anticon {
  -webkit-transition: margin-left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: margin-left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: margin-left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-btn .anticon.anticon-plus > svg,
.ant-btn .anticon.anticon-minus > svg {
  shape-rendering: optimizeSpeed;
}
.ant-btn.ant-btn-loading:before {
  display: block;
}
.ant-btn.ant-btn-loading:not(.ant-btn-circle):not(.ant-btn-circle-outline):not(.ant-btn-icon-only) {
  padding-left: 29px;
  pointer-events: none;
  position: relative;
}
.ant-btn.ant-btn-loading:not(.ant-btn-circle):not(.ant-btn-circle-outline):not(.ant-btn-icon-only) .anticon:not(:last-child) {
  margin-left: -14px;
}
.ant-btn-sm.ant-btn-loading:not(.ant-btn-circle):not(.ant-btn-circle-outline):not(.ant-btn-icon-only) {
  padding-left: 24px;
}
.ant-btn-sm.ant-btn-loading:not(.ant-btn-circle):not(.ant-btn-circle-outline):not(.ant-btn-icon-only) .anticon {
  margin-left: -17px;
}
.ant-btn-group {
  position: relative;
  display: inline-block;
}
.ant-btn-group > .ant-btn,
.ant-btn-group > span > .ant-btn {
  position: relative;
}
.ant-btn-group > .ant-btn:hover,
.ant-btn-group > span > .ant-btn:hover,
.ant-btn-group > .ant-btn:focus,
.ant-btn-group > span > .ant-btn:focus,
.ant-btn-group > .ant-btn:active,
.ant-btn-group > span > .ant-btn:active,
.ant-btn-group > .ant-btn.active,
.ant-btn-group > span > .ant-btn.active {
  z-index: 2;
}
.ant-btn-group > .ant-btn:disabled,
.ant-btn-group > span > .ant-btn:disabled {
  z-index: 0;
}
.ant-btn-group-lg > .ant-btn,
.ant-btn-group-lg > span > .ant-btn {
  padding: 0 15px;
  font-size: 16px;
  border-radius: 0;
  height: 40px;
  line-height: 38px;
}
.ant-btn-group-sm > .ant-btn,
.ant-btn-group-sm > span > .ant-btn {
  padding: 0 7px;
  font-size: 14px;
  border-radius: 0;
  height: 24px;
  line-height: 22px;
}
.ant-btn-group-sm > .ant-btn > .anticon,
.ant-btn-group-sm > span > .ant-btn > .anticon {
  font-size: 14px;
}
.ant-btn-group .ant-btn + .ant-btn,
.ant-btn + .ant-btn-group,
.ant-btn-group span + .ant-btn,
.ant-btn-group .ant-btn + span,
.ant-btn-group > span + span,
.ant-btn-group + .ant-btn,
.ant-btn-group + .ant-btn-group {
  margin-left: -1px;
}
.ant-btn-group .ant-btn-primary + .ant-btn:not(.ant-btn-primary):not([disabled]) {
  border-left-color: transparent;
}
.ant-btn-group .ant-btn {
  border-radius: 0;
}
.ant-btn-group > .ant-btn:first-child,
.ant-btn-group > span:first-child > .ant-btn {
  margin-left: 0;
}
.ant-btn-group > .ant-btn:only-child {
  border-radius: 4px;
}
.ant-btn-group > span:only-child > .ant-btn {
  border-radius: 4px;
}
.ant-btn-group > .ant-btn:first-child:not(:last-child),
.ant-btn-group > span:first-child:not(:last-child) > .ant-btn {
  border-bottom-left-radius: 4px;
  border-top-left-radius: 4px;
}
.ant-btn-group > .ant-btn:last-child:not(:first-child),
.ant-btn-group > span:last-child:not(:first-child) > .ant-btn {
  border-bottom-right-radius: 4px;
  border-top-right-radius: 4px;
}
.ant-btn-group-sm > .ant-btn:only-child {
  border-radius: 4px;
}
.ant-btn-group-sm > span:only-child > .ant-btn {
  border-radius: 4px;
}
.ant-btn-group-sm > .ant-btn:first-child:not(:last-child),
.ant-btn-group-sm > span:first-child:not(:last-child) > .ant-btn {
  border-bottom-left-radius: 4px;
  border-top-left-radius: 4px;
}
.ant-btn-group-sm > .ant-btn:last-child:not(:first-child),
.ant-btn-group-sm > span:last-child:not(:first-child) > .ant-btn {
  border-bottom-right-radius: 4px;
  border-top-right-radius: 4px;
}
.ant-btn-group > .ant-btn-group {
  float: left;
}
.ant-btn-group > .ant-btn-group:not(:first-child):not(:last-child) > .ant-btn {
  border-radius: 0;
}
.ant-btn-group > .ant-btn-group:first-child:not(:last-child) > .ant-btn:last-child {
  border-bottom-right-radius: 0;
  border-top-right-radius: 0;
  padding-right: 8px;
}
.ant-btn-group > .ant-btn-group:last-child:not(:first-child) > .ant-btn:first-child {
  border-bottom-left-radius: 0;
  border-top-left-radius: 0;
  padding-left: 8px;
}
.ant-btn:not(.ant-btn-circle):not(.ant-btn-circle-outline).ant-btn-icon-only {
  padding-left: 8px;
  padding-right: 8px;
}
.ant-btn:focus > span,
.ant-btn:active > span {
  position: relative;
}
.ant-btn > .anticon + span,
.ant-btn > span + .anticon {
  margin-left: 8px;
}
.ant-btn-background-ghost {
  background: transparent !important;
  border-color: #fff;
  color: #fff;
}
.ant-btn-background-ghost.ant-btn-primary {
  color: #1890ff;
  background-color: transparent;
  border-color: #1890ff;
  text-shadow: none;
}
.ant-btn-background-ghost.ant-btn-primary > a:only-child {
  color: currentColor;
}
.ant-btn-background-ghost.ant-btn-primary > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-background-ghost.ant-btn-primary:hover,
.ant-btn-background-ghost.ant-btn-primary:focus {
  color: #40a9ff;
  background-color: transparent;
  border-color: #40a9ff;
}
.ant-btn-background-ghost.ant-btn-primary:hover > a:only-child,
.ant-btn-background-ghost.ant-btn-primary:focus > a:only-child {
  color: currentColor;
}
.ant-btn-background-ghost.ant-btn-primary:hover > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary:focus > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-background-ghost.ant-btn-primary:active,
.ant-btn-background-ghost.ant-btn-primary.active {
  color: #096dd9;
  background-color: transparent;
  border-color: #096dd9;
}
.ant-btn-background-ghost.ant-btn-primary:active > a:only-child,
.ant-btn-background-ghost.ant-btn-primary.active > a:only-child {
  color: currentColor;
}
.ant-btn-background-ghost.ant-btn-primary:active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary.active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-background-ghost.ant-btn-primary-disabled,
.ant-btn-background-ghost.ant-btn-primary.disabled,
.ant-btn-background-ghost.ant-btn-primary[disabled],
.ant-btn-background-ghost.ant-btn-primary-disabled:hover,
.ant-btn-background-ghost.ant-btn-primary.disabled:hover,
.ant-btn-background-ghost.ant-btn-primary[disabled]:hover,
.ant-btn-background-ghost.ant-btn-primary-disabled:focus,
.ant-btn-background-ghost.ant-btn-primary.disabled:focus,
.ant-btn-background-ghost.ant-btn-primary[disabled]:focus,
.ant-btn-background-ghost.ant-btn-primary-disabled:active,
.ant-btn-background-ghost.ant-btn-primary.disabled:active,
.ant-btn-background-ghost.ant-btn-primary[disabled]:active,
.ant-btn-background-ghost.ant-btn-primary-disabled.active,
.ant-btn-background-ghost.ant-btn-primary.disabled.active,
.ant-btn-background-ghost.ant-btn-primary[disabled].active {
  color: rgba(0, 0, 0, 0.25);
  background-color: #f5f5f5;
  border-color: #d9d9d9;
  text-shadow: none;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-btn-background-ghost.ant-btn-primary-disabled > a:only-child,
.ant-btn-background-ghost.ant-btn-primary.disabled > a:only-child,
.ant-btn-background-ghost.ant-btn-primary[disabled] > a:only-child,
.ant-btn-background-ghost.ant-btn-primary-disabled:hover > a:only-child,
.ant-btn-background-ghost.ant-btn-primary.disabled:hover > a:only-child,
.ant-btn-background-ghost.ant-btn-primary[disabled]:hover > a:only-child,
.ant-btn-background-ghost.ant-btn-primary-disabled:focus > a:only-child,
.ant-btn-background-ghost.ant-btn-primary.disabled:focus > a:only-child,
.ant-btn-background-ghost.ant-btn-primary[disabled]:focus > a:only-child,
.ant-btn-background-ghost.ant-btn-primary-disabled:active > a:only-child,
.ant-btn-background-ghost.ant-btn-primary.disabled:active > a:only-child,
.ant-btn-background-ghost.ant-btn-primary[disabled]:active > a:only-child,
.ant-btn-background-ghost.ant-btn-primary-disabled.active > a:only-child,
.ant-btn-background-ghost.ant-btn-primary.disabled.active > a:only-child,
.ant-btn-background-ghost.ant-btn-primary[disabled].active > a:only-child {
  color: currentColor;
}
.ant-btn-background-ghost.ant-btn-primary-disabled > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary.disabled > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary[disabled] > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary-disabled:hover > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary.disabled:hover > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary[disabled]:hover > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary-disabled:focus > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary.disabled:focus > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary[disabled]:focus > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary-disabled:active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary.disabled:active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary[disabled]:active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary-disabled.active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary.disabled.active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-primary[disabled].active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-background-ghost.ant-btn-danger {
  color: #f5222d;
  background-color: transparent;
  border-color: #f5222d;
  text-shadow: none;
}
.ant-btn-background-ghost.ant-btn-danger > a:only-child {
  color: currentColor;
}
.ant-btn-background-ghost.ant-btn-danger > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-background-ghost.ant-btn-danger:hover,
.ant-btn-background-ghost.ant-btn-danger:focus {
  color: #ff4d4f;
  background-color: transparent;
  border-color: #ff4d4f;
}
.ant-btn-background-ghost.ant-btn-danger:hover > a:only-child,
.ant-btn-background-ghost.ant-btn-danger:focus > a:only-child {
  color: currentColor;
}
.ant-btn-background-ghost.ant-btn-danger:hover > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger:focus > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-background-ghost.ant-btn-danger:active,
.ant-btn-background-ghost.ant-btn-danger.active {
  color: #cf1322;
  background-color: transparent;
  border-color: #cf1322;
}
.ant-btn-background-ghost.ant-btn-danger:active > a:only-child,
.ant-btn-background-ghost.ant-btn-danger.active > a:only-child {
  color: currentColor;
}
.ant-btn-background-ghost.ant-btn-danger:active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger.active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-background-ghost.ant-btn-danger-disabled,
.ant-btn-background-ghost.ant-btn-danger.disabled,
.ant-btn-background-ghost.ant-btn-danger[disabled],
.ant-btn-background-ghost.ant-btn-danger-disabled:hover,
.ant-btn-background-ghost.ant-btn-danger.disabled:hover,
.ant-btn-background-ghost.ant-btn-danger[disabled]:hover,
.ant-btn-background-ghost.ant-btn-danger-disabled:focus,
.ant-btn-background-ghost.ant-btn-danger.disabled:focus,
.ant-btn-background-ghost.ant-btn-danger[disabled]:focus,
.ant-btn-background-ghost.ant-btn-danger-disabled:active,
.ant-btn-background-ghost.ant-btn-danger.disabled:active,
.ant-btn-background-ghost.ant-btn-danger[disabled]:active,
.ant-btn-background-ghost.ant-btn-danger-disabled.active,
.ant-btn-background-ghost.ant-btn-danger.disabled.active,
.ant-btn-background-ghost.ant-btn-danger[disabled].active {
  color: rgba(0, 0, 0, 0.25);
  background-color: #f5f5f5;
  border-color: #d9d9d9;
  text-shadow: none;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-btn-background-ghost.ant-btn-danger-disabled > a:only-child,
.ant-btn-background-ghost.ant-btn-danger.disabled > a:only-child,
.ant-btn-background-ghost.ant-btn-danger[disabled] > a:only-child,
.ant-btn-background-ghost.ant-btn-danger-disabled:hover > a:only-child,
.ant-btn-background-ghost.ant-btn-danger.disabled:hover > a:only-child,
.ant-btn-background-ghost.ant-btn-danger[disabled]:hover > a:only-child,
.ant-btn-background-ghost.ant-btn-danger-disabled:focus > a:only-child,
.ant-btn-background-ghost.ant-btn-danger.disabled:focus > a:only-child,
.ant-btn-background-ghost.ant-btn-danger[disabled]:focus > a:only-child,
.ant-btn-background-ghost.ant-btn-danger-disabled:active > a:only-child,
.ant-btn-background-ghost.ant-btn-danger.disabled:active > a:only-child,
.ant-btn-background-ghost.ant-btn-danger[disabled]:active > a:only-child,
.ant-btn-background-ghost.ant-btn-danger-disabled.active > a:only-child,
.ant-btn-background-ghost.ant-btn-danger.disabled.active > a:only-child,
.ant-btn-background-ghost.ant-btn-danger[disabled].active > a:only-child {
  color: currentColor;
}
.ant-btn-background-ghost.ant-btn-danger-disabled > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger.disabled > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger[disabled] > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger-disabled:hover > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger.disabled:hover > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger[disabled]:hover > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger-disabled:focus > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger.disabled:focus > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger[disabled]:focus > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger-disabled:active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger.disabled:active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger[disabled]:active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger-disabled.active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger.disabled.active > a:only-child:after,
.ant-btn-background-ghost.ant-btn-danger[disabled].active > a:only-child:after {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  background: transparent;
}
.ant-btn-two-chinese-chars:first-letter {
  letter-spacing: 0.34em;
}
.ant-btn-two-chinese-chars > *:not(.anticon) {
  letter-spacing: 0.34em;
  margin-right: -0.34em;
}
.ant-btn-block {
  width: 100%;
}
.ant-btn:empty {
  vertical-align: top;
}
a.ant-btn {
  line-height: 30px;
}
a.ant-btn-lg {
  line-height: 38px;
}
a.ant-btn-sm {
  line-height: 22px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.select-container__1bWP {
  width: 150px;
  position: relative;
  display: inline-block;
}
.select__2WG2 {
  height: 40px;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.select-xs__2mNx {
  height: 28px;
  font-size: 12px;
}
.select-sm__2nYH {
  height: 32px;
  font-size: 12px;
}
.select-lg__LAMe {
  height: 44px;
}
.icon__1zii {
  position: absolute;
  cursor: pointer;
  z-index: 1;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.icon-xs__1LIE {
  margin-top: 6px;
  margin-left: 6px;
  width: 14px;
  height: 14px;
}
.icon-sm__3wR7 {
  margin-top: 9px;
  margin-left: 9px;
  width: 14px;
  height: 14px;
}
.icon-md__3TBr {
  margin-top: 12px;
  margin-left: 11px;
  width: 16px;
  height: 16px;
}
.icon-lg__24UI {
  margin-top: 13px;
  margin-left: 12px;
  width: 18px;
  height: 18px;
}
.icon-light__2Hmd,
.icon-light-blue__3Wrc {
  color: #b0bec5;
}
.icon-light__2Hmd:not(.icon-disabled__1Qew):hover,
.icon-light-blue__3Wrc:not(.icon-disabled__1Qew):hover {
  color: #263238;
}
.icon-light__2Hmd:not(.icon-disabled__1Qew):hover + .select__2WG2,
.icon-light-blue__3Wrc:not(.icon-disabled__1Qew):hover + .select__2WG2 {
  border-color: #263238;
}
.icon-dark__cFPh {
  color: #757575;
}
.icon-dark__cFPh:not(.icon-disabled__1Qew):hover {
  color: white;
}
.icon-dark__cFPh:not(.icon-disabled__1Qew):hover + .select__2WG2 {
  border-color: white;
}
.icon__1zii.icon-disabled__1Qew {
  cursor: not-allowed;
}
.select__2WG2 {
  height: 32px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-select {
  border-radius: 3px;
}
.ant-select-disabled.ant-select-dark .ant-select-selection {
  opacity: 0.6;
  background: transparent;
}
.ant-select:not(.ant-select-disabled) .ant-select-selection:focus {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-select:not(.ant-select-disabled) .ant-select-selection:hover .ant-select-arrow {
  color: #263238;
}
.ant-select-dark.ant-select:not(.ant-select-disabled) .ant-select-selection:hover .ant-select-arrow {
  color: white;
}
.ant-select-arrow {
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
  margin-top: -9px;
  margin-right: -4px;
}
.ant-select-arrow > i {
  display: none !important;
}
.ant-select-arrow::after {
  content: '\E907';
  transition: transform 0.3s, -webkit-transform 0.3s;
  display: block;
  font-family: LcIconFont, sans-serif !important;
  font-size: 18px;
}
.select-with-suffix-icon .ant-select-arrow {
  margin-top: -6px;
}
.select-with-suffix-icon .ant-select-arrow::after {
  display: none;
}
.ant-select-open .ant-select-arrow::after {
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}
.ant-select-selection {
  width: 100%;
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  border: 0;
  background: transparent;
  -webkit-transition: none;
  -o-transition: none;
  transition: none;
}
.ant-select-disabled {
  cursor: not-allowed;
}
.ant-select-disabled .ant-select-selection {
  background: transparent;
}
.ant-select-dropdown-menu {
  padding: 13px 0;
  border-radius: 0 0 3px 3px;
  border: 1px solid;
}
.ant-select-dropdown-menu .ant-select-dropdown-menu-item:first-child {
  border-radius: 0;
}
.ant-select-dropdown-light {
  background-color: white;
  border-color: #263238;
  color: #263238;
}
.ant-select-dropdown-light .ant-select-dropdown-menu-item {
  color: #263238;
}
.ant-select-dropdown-light .ant-select-dropdown-menu-item-selected {
  background-color: #eceff1;
}
.ant-select-dropdown-light .ant-select-dropdown-menu-item:hover,
.ant-select-dropdown-light .ant-select-dropdown-menu-item-active {
  background-color: #eceff1;
}
.ant-select-dropdown-light .ant-select-dropdown-menu-item-disabled,
.ant-select-dropdown-light .ant-select-dropdown-menu-item-disabled:hover {
  background-color: transparent;
  color: #b0bec5;
}
.ant-select-dropdown-light-blue {
  background-color: #f7f9fa;
  border-color: #263238;
  color: #263238;
}
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item {
  color: #263238;
}
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item-selected {
  background-color: #eceff1;
}
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item:hover,
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item-active {
  background-color: #eceff1;
}
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item-disabled,
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item-disabled:hover {
  background-color: transparent;
  color: #b0bec5;
}
.ant-select-dropdown-dark {
  background-color: #212121;
  border-color: white;
  color: white;
}
.ant-select-dropdown-dark .ant-select-dropdown-menu-item {
  color: white;
}
.ant-select-dropdown-dark .ant-select-dropdown-menu-item-selected {
  background-color: #424242;
}
.ant-select-dropdown-dark .ant-select-dropdown-menu-item:hover,
.ant-select-dropdown-dark .ant-select-dropdown-menu-item-active {
  background-color: #424242;
}
.ant-select-dropdown-dark .ant-select-dropdown-menu-item-disabled,
.ant-select-dropdown-dark .ant-select-dropdown-menu-item-disabled:hover {
  background-color: transparent;
  color: #757575;
}
.ant-select-dropdown-menu-item {
  height: 30px;
  padding: 0 13px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 12px;
}
.ant-select-dropdown-menu-item > * {
  height: 100%;
}
.ant-select-dropdown-menu-item > a {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 0 13px;
  margin: 0 -13px;
}
.ant-select-dropdown-menu-item:first-child,
.ant-select-dropdown-menu-item:last-child {
  border-radius: 0;
}
.ant-select-dropdown-xs .ant-select-dropdown-menu {
  padding: 10px 0;
}
.ant-select-dropdown-xs .ant-select-dropdown-menu-item {
  padding: 0 10px;
}
.ant-select-dropdown-sm .ant-select-dropdown-menu {
  padding: 10px 0;
}
.ant-select-dropdown-sm .ant-select-dropdown-menu-item {
  padding: 0 10px;
}
.ant-select-dropdown-lg .ant-select-dropdown-menu {
  padding: 15px 0;
}
.ant-select-dropdown-lg .ant-select-dropdown-menu-item {
  padding: 0 15px;
}
.ant-select-light {
  border: 1px solid #eceff1;
  background-color: white;
  color: #546e7a;
}
.ant-select-light .ant-select-arrow {
  color: #b0bec5;
}
.ant-select-light:not(.ant-select-disabled).ant-select-open,
.ant-select-light:not(.ant-select-disabled):hover,
.ant-select-light:not(.ant-select-disabled):focus {
  border-color: #263238;
  color: #263238;
}
.ant-select-light:not(.ant-select-disabled).ant-select-open .ant-select-arrow,
.ant-select-light:not(.ant-select-disabled):hover .ant-select-arrow,
.ant-select-light:not(.ant-select-disabled):focus .ant-select-arrow {
  color: #263238;
}
.ant-select-light .ant-select-selection__placeholder {
  color: #b0bec5;
}
.ant-select-light-blue {
  border: 1px solid #cfd8dc;
  background-color: #f7f9fa;
  color: #546e7a;
}
.ant-select-light-blue .ant-select-arrow {
  color: #b0bec5;
}
.ant-select-light-blue:not(.ant-select-disabled).ant-select-open,
.ant-select-light-blue:not(.ant-select-disabled).ant-select-selected,
.ant-select-light-blue:not(.ant-select-disabled):hover,
.ant-select-light-blue:not(.ant-select-disabled):focus {
  border-color: #263238;
  color: #263238;
}
.ant-select-light-blue:not(.ant-select-disabled).ant-select-open .ant-select-arrow,
.ant-select-light-blue:not(.ant-select-disabled).ant-select-selected .ant-select-arrow,
.ant-select-light-blue:not(.ant-select-disabled):hover .ant-select-arrow,
.ant-select-light-blue:not(.ant-select-disabled):focus .ant-select-arrow {
  color: #263238;
}
.ant-select-light-blue .ant-select-selection__placeholder {
  color: #b0bec5;
}
.ant-select-dark {
  border: 1px solid #757575;
  background-color: #212121;
  color: #757575;
}
.ant-select-dark .ant-select-arrow {
  color: #757575;
}
.ant-select-dark:not(.ant-select-disabled).ant-select-open,
.ant-select-dark:not(.ant-select-disabled):hover,
.ant-select-dark:not(.ant-select-disabled):focus {
  border-color: white;
  color: white;
}
.ant-select-dark:not(.ant-select-disabled).ant-select-open .ant-select-arrow,
.ant-select-dark:not(.ant-select-disabled):hover .ant-select-arrow,
.ant-select-dark:not(.ant-select-disabled):focus .ant-select-arrow {
  color: white;
}
.ant-select-dark .ant-select-selection__placeholder {
  color: #757575;
}
.ant-select-xs .ant-select-selection__rendered {
  margin: 0 10px;
}
.ant-select-xs.with-icon .ant-select-selection {
  margin-left: 14px;
}
.ant-select-sm .ant-select-selection__rendered {
  margin: 0 10px;
}
.ant-select-sm.with-icon .ant-select-selection {
  margin-left: 14px;
}
.ant-select-md.with-icon .ant-select-selection {
  margin-left: 18px;
}
.ant-select-lg.with-icon .ant-select-selection {
  margin-left: 20px;
}
.ant-select-selection__rendered {
  width: 100%;
}
.ant-select-open {
  border-radius: 3px 3px 0 0;
}
.ant-input {
  border: none;
}
.ant-input:focus {
  -webkit-box-shadow: none;
          box-shadow: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-select {
  border-radius: 3px;
}
.ant-select-disabled.ant-select-dark .ant-select-selection {
  opacity: 0.6;
  background: transparent;
}
.ant-select:not(.ant-select-disabled) .ant-select-selection:focus {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-select:not(.ant-select-disabled) .ant-select-selection:hover .ant-select-arrow {
  color: #263238;
}
.ant-select-dark.ant-select:not(.ant-select-disabled) .ant-select-selection:hover .ant-select-arrow {
  color: white;
}
.ant-select-arrow {
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
  margin-top: -9px;
  margin-right: -4px;
}
.ant-select-arrow > i {
  display: none !important;
}
.ant-select-arrow::after {
  content: '\E907';
  transition: transform 0.3s, -webkit-transform 0.3s;
  display: block;
  font-family: LcIconFont, sans-serif !important;
  font-size: 18px;
}
.select-with-suffix-icon .ant-select-arrow {
  margin-top: -6px;
}
.select-with-suffix-icon .ant-select-arrow::after {
  display: none;
}
.ant-select-open .ant-select-arrow::after {
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}
.ant-select-selection {
  width: 100%;
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  border: 0;
  background: transparent;
  -webkit-transition: none;
  -o-transition: none;
  transition: none;
}
.ant-select-disabled {
  cursor: not-allowed;
}
.ant-select-disabled .ant-select-selection {
  background: transparent;
}
.ant-select-dropdown-menu {
  padding: 13px 0;
  border-radius: 0 0 3px 3px;
  border: 1px solid;
}
.ant-select-dropdown-menu .ant-select-dropdown-menu-item:first-child {
  border-radius: 0;
}
.ant-select-dropdown-light {
  background-color: white;
  border-color: #263238;
  color: #263238;
}
.ant-select-dropdown-light .ant-select-dropdown-menu-item {
  color: #263238;
}
.ant-select-dropdown-light .ant-select-dropdown-menu-item-selected {
  background-color: #eceff1;
}
.ant-select-dropdown-light .ant-select-dropdown-menu-item:hover,
.ant-select-dropdown-light .ant-select-dropdown-menu-item-active {
  background-color: #eceff1;
}
.ant-select-dropdown-light .ant-select-dropdown-menu-item-disabled,
.ant-select-dropdown-light .ant-select-dropdown-menu-item-disabled:hover {
  background-color: transparent;
  color: #b0bec5;
}
.ant-select-dropdown-light-blue {
  background-color: #f7f9fa;
  border-color: #263238;
  color: #263238;
}
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item {
  color: #263238;
}
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item-selected {
  background-color: #eceff1;
}
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item:hover,
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item-active {
  background-color: #eceff1;
}
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item-disabled,
.ant-select-dropdown-light-blue .ant-select-dropdown-menu-item-disabled:hover {
  background-color: transparent;
  color: #b0bec5;
}
.ant-select-dropdown-dark {
  background-color: #212121;
  border-color: white;
  color: white;
}
.ant-select-dropdown-dark .ant-select-dropdown-menu-item {
  color: white;
}
.ant-select-dropdown-dark .ant-select-dropdown-menu-item-selected {
  background-color: #424242;
}
.ant-select-dropdown-dark .ant-select-dropdown-menu-item:hover,
.ant-select-dropdown-dark .ant-select-dropdown-menu-item-active {
  background-color: #424242;
}
.ant-select-dropdown-dark .ant-select-dropdown-menu-item-disabled,
.ant-select-dropdown-dark .ant-select-dropdown-menu-item-disabled:hover {
  background-color: transparent;
  color: #757575;
}
.ant-select-dropdown-menu-item {
  height: 30px;
  padding: 0 13px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 12px;
}
.ant-select-dropdown-menu-item > * {
  height: 100%;
}
.ant-select-dropdown-menu-item > a {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 0 13px;
  margin: 0 -13px;
}
.ant-select-dropdown-menu-item:first-child,
.ant-select-dropdown-menu-item:last-child {
  border-radius: 0;
}
.ant-select-dropdown-xs .ant-select-dropdown-menu {
  padding: 10px 0;
}
.ant-select-dropdown-xs .ant-select-dropdown-menu-item {
  padding: 0 10px;
}
.ant-select-dropdown-sm .ant-select-dropdown-menu {
  padding: 10px 0;
}
.ant-select-dropdown-sm .ant-select-dropdown-menu-item {
  padding: 0 10px;
}
.ant-select-dropdown-lg .ant-select-dropdown-menu {
  padding: 15px 0;
}
.ant-select-dropdown-lg .ant-select-dropdown-menu-item {
  padding: 0 15px;
}
.ant-select-light {
  border: 1px solid #eceff1;
  background-color: white;
  color: #546e7a;
}
.ant-select-light .ant-select-arrow {
  color: #b0bec5;
}
.ant-select-light:not(.ant-select-disabled).ant-select-open,
.ant-select-light:not(.ant-select-disabled):hover,
.ant-select-light:not(.ant-select-disabled):focus {
  border-color: #263238;
  color: #263238;
}
.ant-select-light:not(.ant-select-disabled).ant-select-open .ant-select-arrow,
.ant-select-light:not(.ant-select-disabled):hover .ant-select-arrow,
.ant-select-light:not(.ant-select-disabled):focus .ant-select-arrow {
  color: #263238;
}
.ant-select-light .ant-select-selection__placeholder {
  color: #b0bec5;
}
.ant-select-light-blue {
  border: 1px solid #cfd8dc;
  background-color: #f7f9fa;
  color: #546e7a;
}
.ant-select-light-blue .ant-select-arrow {
  color: #b0bec5;
}
.ant-select-light-blue:not(.ant-select-disabled).ant-select-open,
.ant-select-light-blue:not(.ant-select-disabled).ant-select-selected,
.ant-select-light-blue:not(.ant-select-disabled):hover,
.ant-select-light-blue:not(.ant-select-disabled):focus {
  border-color: #263238;
  color: #263238;
}
.ant-select-light-blue:not(.ant-select-disabled).ant-select-open .ant-select-arrow,
.ant-select-light-blue:not(.ant-select-disabled).ant-select-selected .ant-select-arrow,
.ant-select-light-blue:not(.ant-select-disabled):hover .ant-select-arrow,
.ant-select-light-blue:not(.ant-select-disabled):focus .ant-select-arrow {
  color: #263238;
}
.ant-select-light-blue .ant-select-selection__placeholder {
  color: #b0bec5;
}
.ant-select-dark {
  border: 1px solid #757575;
  background-color: #212121;
  color: #757575;
}
.ant-select-dark .ant-select-arrow {
  color: #757575;
}
.ant-select-dark:not(.ant-select-disabled).ant-select-open,
.ant-select-dark:not(.ant-select-disabled):hover,
.ant-select-dark:not(.ant-select-disabled):focus {
  border-color: white;
  color: white;
}
.ant-select-dark:not(.ant-select-disabled).ant-select-open .ant-select-arrow,
.ant-select-dark:not(.ant-select-disabled):hover .ant-select-arrow,
.ant-select-dark:not(.ant-select-disabled):focus .ant-select-arrow {
  color: white;
}
.ant-select-dark .ant-select-selection__placeholder {
  color: #757575;
}
.ant-select-xs .ant-select-selection__rendered {
  margin: 0 10px;
}
.ant-select-xs.with-icon .ant-select-selection {
  margin-left: 14px;
}
.ant-select-sm .ant-select-selection__rendered {
  margin: 0 10px;
}
.ant-select-sm.with-icon .ant-select-selection {
  margin-left: 14px;
}
.ant-select-md.with-icon .ant-select-selection {
  margin-left: 18px;
}
.ant-select-lg.with-icon .ant-select-selection {
  margin-left: 20px;
}
.ant-select-selection__rendered {
  width: 100%;
}
.ant-select-open {
  border-radius: 3px 3px 0 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.select-container__2w2b {
  width: 150px;
  position: relative;
  display: inline-block;
}
.select__2rIJ {
  height: 40px;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.select-xs__T1oT {
  height: 28px;
  font-size: 12px;
}
.select-sm__zeQ4 {
  height: 32px;
  font-size: 12px;
}
.select-lg__1aLT {
  height: 44px;
}
.icon__3D2N {
  position: absolute;
  cursor: pointer;
  z-index: 1;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.icon-xs__ys7E {
  margin-top: 6px;
  margin-left: 6px;
  width: 14px;
  height: 14px;
}
.icon-sm__QckU {
  margin-top: 9px;
  margin-left: 9px;
  width: 14px;
  height: 14px;
}
.icon-md__sbSw {
  margin-top: 12px;
  margin-left: 11px;
  width: 16px;
  height: 16px;
}
.icon-lg__3Vkv {
  margin-top: 13px;
  margin-left: 12px;
  width: 18px;
  height: 18px;
}
.icon-light__GZvS,
.icon-light-blue__2UhU {
  color: #b0bec5;
}
.icon-light__GZvS:not(.icon-disabled__36xP):hover,
.icon-light-blue__2UhU:not(.icon-disabled__36xP):hover {
  color: #263238;
}
.icon-light__GZvS:not(.icon-disabled__36xP):hover + .select__2rIJ,
.icon-light-blue__2UhU:not(.icon-disabled__36xP):hover + .select__2rIJ {
  border-color: #263238;
}
.icon-dark__290S {
  color: #757575;
}
.icon-dark__290S:not(.icon-disabled__36xP):hover {
  color: white;
}
.icon-dark__290S:not(.icon-disabled__36xP):hover + .select__2rIJ {
  border-color: white;
}
.icon__3D2N.icon-disabled__36xP {
  cursor: not-allowed;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__WKLZ {
  width: 100%;
  height: 100%;
  padding: 10px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  cursor: wait;
}
.wrapper__WKLZ > div {
  pointer-events: none;
}
.wrapper__WKLZ[data-label-position='bottom'] {
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.wrapper__WKLZ[data-label-position='bottom'] .label__3qcf {
  margin-top: 5px;
}
.wrapper__WKLZ[data-label-position='right'] .label__3qcf {
  margin-left: 8px;
  margin-top: 4px;
}
.wrapper__WKLZ[data-theme='dark'] {
  color: white;
}
.wrapper__WKLZ[data-theme='light'] {
  color: #999999;
}
.loading__2OCG {
  display: inline-block;
}
.loading__2OCG path {
  stroke: currentColor;
}
.label__3qcf {
  font-size: 15px;
  line-height: 20px;
}
.global-container__2yts {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-transition: opacity;
  -o-transition: opacity;
  transition: opacity;
}
.global-container__2yts .loading-box__osVR {
  width: 100px;
  height: 100px;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.8);
  -webkit-box-shadow: 0 4px 20px rgba(0, 0, 0, 0.08);
          box-shadow: 0 4px 20px rgba(0, 0, 0, 0.08);
}
.global-container__2yts[data-status='show'] {
  -webkit-animation: FadeIn__27CH 0.3s ease-in forwards;
          animation: FadeIn__27CH 0.3s ease-in forwards;
}
.global-container__2yts[data-status='hide'] {
  -webkit-animation: FadeOut__14EO 0.3s ease-out forwards;
          animation: FadeOut__14EO 0.3s ease-out forwards;
  pointer-events: none;
}
@-webkit-keyframes FadeIn__27CH {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}
@keyframes FadeIn__27CH {
  from {
    opacity: 0;
  }
  to {
    opacity: 1;
  }
}
@-webkit-keyframes FadeOut__14EO {
  from {
    opacity: 1;
  }
  to {
    opacity: 0;
  }
}
@keyframes FadeOut__14EO {
  from {
    opacity: 1;
  }
  to {
    opacity: 0;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-modal {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: relative;
  width: auto;
  margin: 0 auto;
  top: 100px;
  padding-bottom: 24px;
}
.ant-modal-wrap {
  position: fixed;
  overflow: auto;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1000;
  -webkit-overflow-scrolling: touch;
  outline: 0;
}
.ant-modal-title {
  margin: 0;
  font-size: 16px;
  line-height: 22px;
  font-weight: 500;
  color: rgba(0, 0, 0, 0.85);
}
.ant-modal-content {
  position: relative;
  background-color: #fff;
  border: 0;
  border-radius: 4px;
  background-clip: padding-box;
  -webkit-box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
          box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
}
.ant-modal-close {
  cursor: pointer;
  border: 0;
  background: transparent;
  position: absolute;
  right: 0;
  top: 0;
  z-index: 10;
  font-weight: 700;
  line-height: 1;
  text-decoration: none;
  -webkit-transition: color 0.3s;
  -o-transition: color 0.3s;
  transition: color 0.3s;
  color: rgba(0, 0, 0, 0.45);
  outline: 0;
  padding: 0;
}
.ant-modal-close-x {
  display: block;
  font-style: normal;
  vertical-align: baseline;
  text-align: center;
  text-transform: none;
  text-rendering: auto;
  width: 56px;
  height: 56px;
  line-height: 56px;
  font-size: 16px;
}
.ant-modal-close:focus,
.ant-modal-close:hover {
  color: rgba(0, 0, 0, 0.75);
  text-decoration: none;
}
.ant-modal-header {
  padding: 16px 24px;
  border-radius: 4px 4px 0 0;
  background: #fff;
  color: rgba(0, 0, 0, 0.65);
  border-bottom: 1px solid #e8e8e8;
}
.ant-modal-body {
  padding: 24px;
  font-size: 14px;
  line-height: 1.5;
  word-wrap: break-word;
}
.ant-modal-footer {
  border-top: 1px solid #e8e8e8;
  padding: 10px 16px;
  text-align: right;
  border-radius: 0 0 4px 4px;
}
.ant-modal-footer button + button {
  margin-left: 8px;
  margin-bottom: 0;
}
.ant-modal.zoom-enter,
.ant-modal.zoom-appear {
  -webkit-animation-duration: 0.3s;
          animation-duration: 0.3s;
  -webkit-transform: none;
          transform: none;
  opacity: 0;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.ant-modal-mask {
  position: fixed;
  top: 0;
  right: 0;
  left: 0;
  bottom: 0;
  background-color: rgba(0, 0, 0, 0.65);
  height: 100%;
  z-index: 1000;
  filter: alpha(opacity=50);
}
.ant-modal-mask-hidden {
  display: none;
}
.ant-modal-open {
  overflow: hidden;
}
.ant-modal-centered {
  text-align: center;
}
.ant-modal-centered:before {
  content: '';
  display: inline-block;
  height: 100%;
  vertical-align: middle;
  width: 0;
}
.ant-modal-centered .ant-modal {
  display: inline-block;
  vertical-align: middle;
  top: 0;
  text-align: left;
}
@media (max-width: 767px) {
  .ant-modal {
    max-width: calc(100vw - 16px);
    margin: 8px auto;
  }
  .ant-modal-centered .ant-modal {
    -webkit-box-flex: 1;
        -ms-flex: 1;
            flex: 1;
  }
}
.ant-modal-confirm .ant-modal-header {
  display: none;
}
.ant-modal-confirm .ant-modal-close {
  display: none;
}
.ant-modal-confirm .ant-modal-body {
  padding: 32px 32px 24px;
}
.ant-modal-confirm-body-wrapper {
  zoom: 1;
}
.ant-modal-confirm-body-wrapper::before,
.ant-modal-confirm-body-wrapper::after {
  content: ' ';
  display: table;
}
.ant-modal-confirm-body-wrapper::after {
  clear: both;
}
.ant-modal-confirm-body-wrapper:before,
.ant-modal-confirm-body-wrapper:after {
  content: '';
  display: table;
}
.ant-modal-confirm-body-wrapper:after {
  clear: both;
}
.ant-modal-confirm-body .ant-modal-confirm-title {
  color: rgba(0, 0, 0, 0.85);
  font-weight: 500;
  font-size: 16px;
  line-height: 1.4;
  display: block;
  overflow: hidden;
}
.ant-modal-confirm-body .ant-modal-confirm-content {
  margin-left: 38px;
  font-size: 14px;
  color: rgba(0, 0, 0, 0.65);
  margin-top: 8px;
}
.ant-modal-confirm-body > .anticon {
  font-size: 22px;
  margin-right: 16px;
  float: left;
}
.ant-modal-confirm .ant-modal-confirm-btns {
  margin-top: 24px;
  float: right;
}
.ant-modal-confirm .ant-modal-confirm-btns button + button {
  margin-left: 8px;
  margin-bottom: 0;
}
.ant-modal-confirm-error .ant-modal-confirm-body > .anticon {
  color: #f5222d;
}
.ant-modal-confirm-warning .ant-modal-confirm-body > .anticon,
.ant-modal-confirm-confirm .ant-modal-confirm-body > .anticon {
  color: #faad14;
}
.ant-modal-confirm-info .ant-modal-confirm-body > .anticon {
  color: #1890ff;
}
.ant-modal-confirm-success .ant-modal-confirm-body > .anticon {
  color: #52c41a;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-modal {
  min-width: 520px;
  max-width: 600px;
  padding-bottom: 0;
  top: 0;
}
@media (max-width: 767px) {
  .ant-modal {
    max-width: none;
  }
}
@media (max-width: 520px) {
  .ant-modal {
    min-width: 0;
  }
}
.ant-modal-content {
  border-radius: 3px;
}
.ant-modal-header {
  padding: 0;
  border: none;
}
.ant-modal-body {
  max-height: 80vh;
  overflow: auto;
  padding: 0;
  border: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.lc-modal__2lWv {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.lc-modal__2lWv::before,
.lc-modal__2lWv::after {
  content: '';
  display: block;
}
.lc-modal__2lWv::before {
  -webkit-box-flex: 0.618;
      -ms-flex-positive: 0.618;
          flex-grow: 0.618;
}
.lc-modal__2lWv::after {
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
}
.lc-modal__2lWv .lc-modal-body__3yBv {
  width: 100%;
  padding: 20px;
}
.lc-modal__2lWv.typed__4Hf8 .lc-modal-body__3yBv {
  padding: 0 20px 20px 54px;
}
.lc-modal__2lWv.empty-title__19_N .lc-modal-body__3yBv {
  padding: 0 20px 20px;
}
.lc-modal__2lWv .modal-close-btn__Xfws {
  width: 20px;
  height: 20px;
  color: #cfd8dc;
  cursor: pointer;
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  position: absolute;
  right: 0;
  top: 0;
  -webkit-transition: all 0.2s ease;
  -o-transition: all 0.2s ease;
  transition: all 0.2s ease;
}
.lc-modal__2lWv .modal-close-btn__Xfws:hover {
  color: #546e7a;
}
.lc-modal__2lWv .lc-modal-no-title-header__3ibO,
.lc-modal__2lWv .lc-modal-with-title-header__1SAd,
.lc-modal__2lWv .lc-modal-with-type__2uye {
  position: relative;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.lc-modal__2lWv .lc-modal-no-title-header__3ibO .lc-modal-title__Obe-,
.lc-modal__2lWv .lc-modal-with-title-header__1SAd .lc-modal-title__Obe-,
.lc-modal__2lWv .lc-modal-with-type__2uye .lc-modal-title__Obe- {
  font-size: 20px;
  line-height: 20px;
  font-weight: normal;
}
.lc-modal__2lWv .lc-modal-no-title-header__3ibO {
  background: -webkit-gradient(linear, left bottom, left top, from(white), to(#fafafa));
  background: -webkit-linear-gradient(bottom, white, #fafafa);
  background: -o-linear-gradient(bottom, white, #fafafa);
  background: linear-gradient(to top, white, #fafafa);
  border-radius: 3px 3px 0 0;
  padding: 20px;
}
.lc-modal__2lWv .lc-modal-no-title-header__3ibO .modal-close-btn__Xfws {
  padding: 10px;
}
.lc-modal__2lWv .lc-modal-with-title-header__1SAd {
  background: -webkit-gradient(linear, left top, left bottom, from(white), to(#fafafa));
  background: -webkit-linear-gradient(top, white, #fafafa);
  background: -o-linear-gradient(top, white, #fafafa);
  background: linear-gradient(to bottom, white, #fafafa);
  border-radius: 3px 3px 0 0;
  padding: 20px;
}
.lc-modal__2lWv .lc-modal-with-title-header__1SAd .modal-close-btn__Xfws {
  padding: 20px;
}
.lc-modal__2lWv .lc-modal-with-type__2uye {
  border-radius: 3px 3px 0 0;
  background: -webkit-gradient(linear, left bottom, left top, from(white), to(#fafafa));
  background: -webkit-linear-gradient(bottom, white, #fafafa);
  background: -o-linear-gradient(bottom, white, #fafafa);
  background: linear-gradient(to top, white, #fafafa);
  padding: 20px;
}
.lc-modal__2lWv .lc-modal-with-type__2uye .modal-close-btn__Xfws {
  padding: 20px;
}
.lc-modal__2lWv .lc-modal-with-type__2uye .lc-modal-type-icon__1rNj {
  width: 24px;
  height: 24px;
  margin-right: 10px;
}
.lc-modal__2lWv .lc-modal-with-type__2uye .success__2-BG {
  color: #26a69a;
}
.lc-modal__2lWv .lc-modal-with-type__2uye .error__1BDk {
  color: #e53935;
}
.lc-modal__2lWv .lc-modal-with-type__2uye .warning__1iby,
.lc-modal__2lWv .lc-modal-with-type__2uye .confirm__1T4O {
  color: #fbc02e;
}
.lc-modal__2lWv .lc-modal-with-type__2uye .info__2wol {
  color: #607d8b;
}
.lc-modal-footer__qHro {
  padding: 0 20px 20px;
  border-radius: 0 0 3px 3px;
  width: 100%;
  background: -webkit-gradient(linear, left top, left bottom, from(white), to(#fafafa));
  background: -webkit-linear-gradient(top, white, #fafafa);
  background: -o-linear-gradient(top, white, #fafafa);
  background: linear-gradient(to bottom, white, #fafafa);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-dropdown {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: absolute;
  left: -9999px;
  top: -9999px;
  z-index: 1050;
  display: block;
}
.ant-dropdown:before {
  position: absolute;
  top: -7px;
  left: -7px;
  right: 0;
  bottom: -7px;
  content: ' ';
  opacity: 0.0001;
  z-index: -9999;
}
.ant-dropdown-wrap {
  position: relative;
}
.ant-dropdown-wrap .ant-btn > .anticon-down {
  display: inline-block;
  font-size: 12px;
  font-size: 10px \9;
  -webkit-transform: scale(0.83333333) rotate(0deg);
          transform: scale(0.83333333) rotate(0deg);
}
:root .ant-dropdown-wrap .ant-btn > .anticon-down {
  font-size: 12px;
}
.ant-dropdown-wrap .anticon-down:before {
  -webkit-transition: -webkit-transform 0.2s;
  transition: -webkit-transform 0.2s;
  -o-transition: transform 0.2s;
  transition: transform 0.2s;
  transition: transform 0.2s, -webkit-transform 0.2s;
}
.ant-dropdown-wrap-open .anticon-down:before {
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}
.ant-dropdown-hidden,
.ant-dropdown-menu-hidden {
  display: none;
}
.ant-dropdown-menu {
  outline: none;
  position: relative;
  list-style-type: none;
  padding: 4px 0;
  margin: 0;
  text-align: left;
  background-color: #fff;
  border-radius: 4px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  background-clip: padding-box;
  -webkit-transform: translate3d(0, 0, 0);
}
.ant-dropdown-menu-item-group-title {
  color: rgba(0, 0, 0, 0.45);
  padding: 5px 12px;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-dropdown-menu-submenu-popup {
  position: absolute;
  z-index: 1050;
}
.ant-dropdown-menu-submenu-popup > .ant-dropdown-menu {
  -webkit-transform-origin: 0 0;
          transform-origin: 0 0;
}
.ant-dropdown-menu-item,
.ant-dropdown-menu-submenu-title {
  padding: 5px 12px;
  margin: 0;
  clear: both;
  font-size: 14px;
  font-weight: normal;
  color: rgba(0, 0, 0, 0.65);
  white-space: nowrap;
  cursor: pointer;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  line-height: 22px;
}
.ant-dropdown-menu-item > .anticon:first-child,
.ant-dropdown-menu-submenu-title > .anticon:first-child {
  min-width: 12px;
  margin-right: 8px;
}
.ant-dropdown-menu-item > a,
.ant-dropdown-menu-submenu-title > a {
  color: rgba(0, 0, 0, 0.65);
  display: block;
  padding: 5px 12px;
  margin: -5px -12px;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-dropdown-menu-item > a:focus,
.ant-dropdown-menu-submenu-title > a:focus {
  text-decoration: none;
}
.ant-dropdown-menu-item-selected,
.ant-dropdown-menu-submenu-title-selected,
.ant-dropdown-menu-item-selected > a,
.ant-dropdown-menu-submenu-title-selected > a {
  color: #1890ff;
  background-color: #e6f7ff;
}
.ant-dropdown-menu-item:hover,
.ant-dropdown-menu-submenu-title:hover {
  background-color: #e6f7ff;
}
.ant-dropdown-menu-item-disabled,
.ant-dropdown-menu-submenu-title-disabled {
  color: rgba(0, 0, 0, 0.25);
  cursor: not-allowed;
}
.ant-dropdown-menu-item-disabled:hover,
.ant-dropdown-menu-submenu-title-disabled:hover {
  color: rgba(0, 0, 0, 0.25);
  background-color: #fff;
  cursor: not-allowed;
}
.ant-dropdown-menu-item-divider,
.ant-dropdown-menu-submenu-title-divider {
  height: 1px;
  overflow: hidden;
  background-color: #e8e8e8;
  line-height: 0;
  margin: 4px 0;
}
.ant-dropdown-menu-item .ant-dropdown-menu-submenu-arrow,
.ant-dropdown-menu-submenu-title .ant-dropdown-menu-submenu-arrow {
  position: absolute;
  right: 8px;
}
.ant-dropdown-menu-item .ant-dropdown-menu-submenu-arrow-icon,
.ant-dropdown-menu-submenu-title .ant-dropdown-menu-submenu-arrow-icon {
  font-style: normal;
  color: rgba(0, 0, 0, 0.45);
  display: inline-block;
  font-size: 12px;
  font-size: 10px \9;
  -webkit-transform: scale(0.83333333) rotate(0deg);
          transform: scale(0.83333333) rotate(0deg);
}
:root .ant-dropdown-menu-item .ant-dropdown-menu-submenu-arrow-icon,
:root .ant-dropdown-menu-submenu-title .ant-dropdown-menu-submenu-arrow-icon {
  font-size: 12px;
}
.ant-dropdown-menu-submenu-title {
  padding-right: 26px;
}
.ant-dropdown-menu-submenu-vertical {
  position: relative;
}
.ant-dropdown-menu-submenu-vertical > .ant-dropdown-menu {
  top: 0;
  left: 100%;
  position: absolute;
  min-width: 100%;
  margin-left: 4px;
  -webkit-transform-origin: 0 0;
          transform-origin: 0 0;
}
.ant-dropdown-menu-submenu.ant-dropdown-menu-submenu-disabled .ant-dropdown-menu-submenu-title,
.ant-dropdown-menu-submenu.ant-dropdown-menu-submenu-disabled .ant-dropdown-menu-submenu-title .ant-dropdown-menu-submenu-arrow-icon {
  color: rgba(0, 0, 0, 0.25);
}
.ant-dropdown.slide-down-enter.slide-down-enter-active.ant-dropdown-placement-bottomLeft,
.ant-dropdown.slide-down-appear.slide-down-appear-active.ant-dropdown-placement-bottomLeft,
.ant-dropdown.slide-down-enter.slide-down-enter-active.ant-dropdown-placement-bottomCenter,
.ant-dropdown.slide-down-appear.slide-down-appear-active.ant-dropdown-placement-bottomCenter,
.ant-dropdown.slide-down-enter.slide-down-enter-active.ant-dropdown-placement-bottomRight,
.ant-dropdown.slide-down-appear.slide-down-appear-active.ant-dropdown-placement-bottomRight {
  -webkit-animation-name: antSlideUpIn;
          animation-name: antSlideUpIn;
}
.ant-dropdown.slide-up-enter.slide-up-enter-active.ant-dropdown-placement-topLeft,
.ant-dropdown.slide-up-appear.slide-up-appear-active.ant-dropdown-placement-topLeft,
.ant-dropdown.slide-up-enter.slide-up-enter-active.ant-dropdown-placement-topCenter,
.ant-dropdown.slide-up-appear.slide-up-appear-active.ant-dropdown-placement-topCenter,
.ant-dropdown.slide-up-enter.slide-up-enter-active.ant-dropdown-placement-topRight,
.ant-dropdown.slide-up-appear.slide-up-appear-active.ant-dropdown-placement-topRight {
  -webkit-animation-name: antSlideDownIn;
          animation-name: antSlideDownIn;
}
.ant-dropdown.slide-down-leave.slide-down-leave-active.ant-dropdown-placement-bottomLeft,
.ant-dropdown.slide-down-leave.slide-down-leave-active.ant-dropdown-placement-bottomCenter,
.ant-dropdown.slide-down-leave.slide-down-leave-active.ant-dropdown-placement-bottomRight {
  -webkit-animation-name: antSlideUpOut;
          animation-name: antSlideUpOut;
}
.ant-dropdown.slide-up-leave.slide-up-leave-active.ant-dropdown-placement-topLeft,
.ant-dropdown.slide-up-leave.slide-up-leave-active.ant-dropdown-placement-topCenter,
.ant-dropdown.slide-up-leave.slide-up-leave-active.ant-dropdown-placement-topRight {
  -webkit-animation-name: antSlideDownOut;
          animation-name: antSlideDownOut;
}
.ant-dropdown-trigger > .anticon.anticon-down,
.ant-dropdown-link > .anticon.anticon-down {
  display: inline-block;
  font-size: 12px;
  font-size: 10px \9;
  -webkit-transform: scale(0.83333333) rotate(0deg);
          transform: scale(0.83333333) rotate(0deg);
}
:root .ant-dropdown-trigger > .anticon.anticon-down,
:root .ant-dropdown-link > .anticon.anticon-down {
  font-size: 12px;
}
.ant-dropdown-button {
  white-space: nowrap;
}
.ant-dropdown-button.ant-btn-group > .ant-btn:last-child:not(:first-child) {
  padding-left: 8px;
  padding-right: 8px;
}
.ant-dropdown-button .anticon.anticon-down {
  display: inline-block;
  font-size: 12px;
  font-size: 10px \9;
  -webkit-transform: scale(0.83333333) rotate(0deg);
          transform: scale(0.83333333) rotate(0deg);
}
:root .ant-dropdown-button .anticon.anticon-down {
  font-size: 12px;
}
.ant-dropdown-menu-dark,
.ant-dropdown-menu-dark .ant-dropdown-menu {
  background: #001529;
}
.ant-dropdown-menu-dark .ant-dropdown-menu-item,
.ant-dropdown-menu-dark .ant-dropdown-menu-submenu-title,
.ant-dropdown-menu-dark .ant-dropdown-menu-item > a {
  color: rgba(255, 255, 255, 0.65);
}
.ant-dropdown-menu-dark .ant-dropdown-menu-item .ant-dropdown-menu-submenu-arrow:after,
.ant-dropdown-menu-dark .ant-dropdown-menu-submenu-title .ant-dropdown-menu-submenu-arrow:after,
.ant-dropdown-menu-dark .ant-dropdown-menu-item > a .ant-dropdown-menu-submenu-arrow:after {
  color: rgba(255, 255, 255, 0.65);
}
.ant-dropdown-menu-dark .ant-dropdown-menu-item:hover,
.ant-dropdown-menu-dark .ant-dropdown-menu-submenu-title:hover,
.ant-dropdown-menu-dark .ant-dropdown-menu-item > a:hover {
  color: #fff;
  background: transparent;
}
.ant-dropdown-menu-dark .ant-dropdown-menu-item-selected,
.ant-dropdown-menu-dark .ant-dropdown-menu-item-selected:hover,
.ant-dropdown-menu-dark .ant-dropdown-menu-item-selected > a {
  background: #1890ff;
  color: #fff;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-menu {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  outline: none;
  margin-bottom: 0;
  padding-left: 0;
  list-style: none;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  color: rgba(0, 0, 0, 0.65);
  background: #fff;
  line-height: 0;
  -webkit-transition: background 0.3s, width 0.2s;
  -o-transition: background 0.3s, width 0.2s;
  transition: background 0.3s, width 0.2s;
  zoom: 1;
}
.ant-menu::before,
.ant-menu::after {
  content: ' ';
  display: table;
}
.ant-menu::after {
  clear: both;
}
.ant-menu:before,
.ant-menu:after {
  content: '';
  display: table;
}
.ant-menu:after {
  clear: both;
}
.ant-menu ul,
.ant-menu ol {
  list-style: none;
  margin: 0;
  padding: 0;
}
.ant-menu-hidden {
  display: none;
}
.ant-menu-item-group-title {
  color: rgba(0, 0, 0, 0.45);
  font-size: 14px;
  line-height: 1.5;
  padding: 8px 16px;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-menu-submenu,
.ant-menu-submenu-inline {
  -webkit-transition: border-color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: border-color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: border-color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-menu-item:active,
.ant-menu-submenu-title:active {
  background: #e6f7ff;
}
.ant-menu-submenu .ant-menu-sub {
  cursor: initial;
  -webkit-transition: background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-menu-item > a {
  display: block;
  color: rgba(0, 0, 0, 0.65);
}
.ant-menu-item > a:hover {
  color: #1890ff;
}
.ant-menu-item > a:focus {
  text-decoration: none;
}
.ant-menu-item > a:before {
  position: absolute;
  background-color: transparent;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  content: '';
}
.ant-menu-item-divider {
  height: 1px;
  overflow: hidden;
  background-color: #e8e8e8;
  line-height: 0;
}
.ant-menu-item:hover,
.ant-menu-item-active,
.ant-menu:not(.ant-menu-inline) .ant-menu-submenu-open,
.ant-menu-submenu-active,
.ant-menu-submenu-title:hover {
  color: #1890ff;
}
.ant-menu-horizontal .ant-menu-item,
.ant-menu-horizontal .ant-menu-submenu {
  margin-top: -1px;
}
.ant-menu-horizontal > .ant-menu-item:hover,
.ant-menu-horizontal > .ant-menu-item-active,
.ant-menu-horizontal > .ant-menu-submenu .ant-menu-submenu-title:hover {
  background-color: transparent;
}
.ant-menu-item-selected {
  color: #1890ff;
}
.ant-menu-item-selected > a,
.ant-menu-item-selected > a:hover {
  color: #1890ff;
}
.ant-menu:not(.ant-menu-horizontal) .ant-menu-item-selected {
  background-color: #e6f7ff;
}
.ant-menu-inline,
.ant-menu-vertical,
.ant-menu-vertical-left {
  border-right: 1px solid #e8e8e8;
}
.ant-menu-vertical-right {
  border-left: 1px solid #e8e8e8;
}
.ant-menu-vertical.ant-menu-sub,
.ant-menu-vertical-left.ant-menu-sub,
.ant-menu-vertical-right.ant-menu-sub {
  border-right: 0;
  padding: 0;
  -webkit-transform-origin: 0 0;
          transform-origin: 0 0;
}
.ant-menu-vertical.ant-menu-sub .ant-menu-item,
.ant-menu-vertical-left.ant-menu-sub .ant-menu-item,
.ant-menu-vertical-right.ant-menu-sub .ant-menu-item {
  border-right: 0;
  margin-left: 0;
  left: 0;
}
.ant-menu-vertical.ant-menu-sub .ant-menu-item:after,
.ant-menu-vertical-left.ant-menu-sub .ant-menu-item:after,
.ant-menu-vertical-right.ant-menu-sub .ant-menu-item:after {
  border-right: 0;
}
.ant-menu-vertical.ant-menu-sub > .ant-menu-item,
.ant-menu-vertical-left.ant-menu-sub > .ant-menu-item,
.ant-menu-vertical-right.ant-menu-sub > .ant-menu-item,
.ant-menu-vertical.ant-menu-sub > .ant-menu-submenu,
.ant-menu-vertical-left.ant-menu-sub > .ant-menu-submenu,
.ant-menu-vertical-right.ant-menu-sub > .ant-menu-submenu {
  -webkit-transform-origin: 0 0;
          transform-origin: 0 0;
}
.ant-menu-horizontal.ant-menu-sub,
.ant-menu-vertical.ant-menu-sub,
.ant-menu-vertical-left.ant-menu-sub,
.ant-menu-vertical-right.ant-menu-sub {
  min-width: 160px;
}
.ant-menu-item,
.ant-menu-submenu-title {
  cursor: pointer;
  margin: 0;
  padding: 0 20px;
  position: relative;
  display: block;
  white-space: nowrap;
  -webkit-transition: color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), border-color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), border-color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), border-color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), padding 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-menu-item .anticon,
.ant-menu-submenu-title .anticon {
  min-width: 14px;
  margin-right: 10px;
  font-size: 14px;
  -webkit-transition: font-size 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), margin 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: font-size 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), margin 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: font-size 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), margin 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-menu-item .anticon + span,
.ant-menu-submenu-title .anticon + span {
  -webkit-transition: opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  opacity: 1;
}
.ant-menu > .ant-menu-item-divider {
  height: 1px;
  margin: 1px 0;
  overflow: hidden;
  padding: 0;
  line-height: 0;
  background-color: #e8e8e8;
}
.ant-menu-submenu-popup {
  position: absolute;
  border-radius: 4px;
  z-index: 1050;
  background: #fff;
}
.ant-menu-submenu-popup .submenu-title-wrapper {
  padding-right: 20px;
}
.ant-menu-submenu-popup:before {
  position: absolute;
  top: -7px;
  left: 0;
  right: 0;
  bottom: 0;
  content: ' ';
  opacity: 0.0001;
}
.ant-menu-submenu > .ant-menu {
  background-color: #fff;
  border-radius: 4px;
}
.ant-menu-submenu > .ant-menu-submenu-title:after {
  -webkit-transition: -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-menu-submenu-vertical > .ant-menu-submenu-title .ant-menu-submenu-arrow,
.ant-menu-submenu-vertical-left > .ant-menu-submenu-title .ant-menu-submenu-arrow,
.ant-menu-submenu-vertical-right > .ant-menu-submenu-title .ant-menu-submenu-arrow,
.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow {
  -webkit-transition: -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  position: absolute;
  top: 50%;
  right: 16px;
  width: 10px;
}
.ant-menu-submenu-vertical > .ant-menu-submenu-title .ant-menu-submenu-arrow:before,
.ant-menu-submenu-vertical-left > .ant-menu-submenu-title .ant-menu-submenu-arrow:before,
.ant-menu-submenu-vertical-right > .ant-menu-submenu-title .ant-menu-submenu-arrow:before,
.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow:before,
.ant-menu-submenu-vertical > .ant-menu-submenu-title .ant-menu-submenu-arrow:after,
.ant-menu-submenu-vertical-left > .ant-menu-submenu-title .ant-menu-submenu-arrow:after,
.ant-menu-submenu-vertical-right > .ant-menu-submenu-title .ant-menu-submenu-arrow:after,
.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow:after {
  content: '';
  position: absolute;
  vertical-align: baseline;
  background: #fff;
  background-image: -webkit-gradient(linear, left top, right top, from(rgba(0, 0, 0, 0.65)), to(rgba(0, 0, 0, 0.65)));
  background-image: -webkit-linear-gradient(left, rgba(0, 0, 0, 0.65), rgba(0, 0, 0, 0.65));
  background-image: -o-linear-gradient(left, rgba(0, 0, 0, 0.65), rgba(0, 0, 0, 0.65));
  background-image: linear-gradient(to right, rgba(0, 0, 0, 0.65), rgba(0, 0, 0, 0.65));
  width: 6px;
  height: 1.5px;
  border-radius: 2px;
  -webkit-transition: background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: background 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-menu-submenu-vertical > .ant-menu-submenu-title .ant-menu-submenu-arrow:before,
.ant-menu-submenu-vertical-left > .ant-menu-submenu-title .ant-menu-submenu-arrow:before,
.ant-menu-submenu-vertical-right > .ant-menu-submenu-title .ant-menu-submenu-arrow:before,
.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow:before {
  -webkit-transform: rotate(45deg) translateY(-2px);
          transform: rotate(45deg) translateY(-2px);
}
.ant-menu-submenu-vertical > .ant-menu-submenu-title .ant-menu-submenu-arrow:after,
.ant-menu-submenu-vertical-left > .ant-menu-submenu-title .ant-menu-submenu-arrow:after,
.ant-menu-submenu-vertical-right > .ant-menu-submenu-title .ant-menu-submenu-arrow:after,
.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow:after {
  -webkit-transform: rotate(-45deg) translateY(2px);
          transform: rotate(-45deg) translateY(2px);
}
.ant-menu-submenu-vertical > .ant-menu-submenu-title:hover .ant-menu-submenu-arrow:after,
.ant-menu-submenu-vertical-left > .ant-menu-submenu-title:hover .ant-menu-submenu-arrow:after,
.ant-menu-submenu-vertical-right > .ant-menu-submenu-title:hover .ant-menu-submenu-arrow:after,
.ant-menu-submenu-inline > .ant-menu-submenu-title:hover .ant-menu-submenu-arrow:after,
.ant-menu-submenu-vertical > .ant-menu-submenu-title:hover .ant-menu-submenu-arrow:before,
.ant-menu-submenu-vertical-left > .ant-menu-submenu-title:hover .ant-menu-submenu-arrow:before,
.ant-menu-submenu-vertical-right > .ant-menu-submenu-title:hover .ant-menu-submenu-arrow:before,
.ant-menu-submenu-inline > .ant-menu-submenu-title:hover .ant-menu-submenu-arrow:before {
  background: -webkit-gradient(linear, left top, right top, from(#1890ff), to(#1890ff));
  background: -webkit-linear-gradient(left, #1890ff, #1890ff);
  background: -o-linear-gradient(left, #1890ff, #1890ff);
  background: linear-gradient(to right, #1890ff, #1890ff);
}
.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow:before {
  -webkit-transform: rotate(-45deg) translateX(2px);
          transform: rotate(-45deg) translateX(2px);
}
.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow:after {
  -webkit-transform: rotate(45deg) translateX(-2px);
          transform: rotate(45deg) translateX(-2px);
}
.ant-menu-submenu-open.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow {
  -webkit-transform: translateY(-2px);
          transform: translateY(-2px);
}
.ant-menu-submenu-open.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow:after {
  -webkit-transform: rotate(-45deg) translateX(-2px);
          transform: rotate(-45deg) translateX(-2px);
}
.ant-menu-submenu-open.ant-menu-submenu-inline > .ant-menu-submenu-title .ant-menu-submenu-arrow:before {
  -webkit-transform: rotate(45deg) translateX(2px);
          transform: rotate(45deg) translateX(2px);
}
.ant-menu-vertical .ant-menu-submenu-selected,
.ant-menu-vertical-left .ant-menu-submenu-selected,
.ant-menu-vertical-right .ant-menu-submenu-selected {
  color: #1890ff;
}
.ant-menu-vertical .ant-menu-submenu-selected > a,
.ant-menu-vertical-left .ant-menu-submenu-selected > a,
.ant-menu-vertical-right .ant-menu-submenu-selected > a {
  color: #1890ff;
}
.ant-menu-horizontal {
  border: 0;
  border-bottom: 1px solid #e8e8e8;
  -webkit-box-shadow: none;
          box-shadow: none;
  line-height: 46px;
  white-space: nowrap;
}
.ant-menu-horizontal > .ant-menu-item,
.ant-menu-horizontal > .ant-menu-submenu {
  position: relative;
  top: 1px;
  display: inline-block;
  vertical-align: bottom;
  border-bottom: 2px solid transparent;
}
.ant-menu-horizontal > .ant-menu-item:hover,
.ant-menu-horizontal > .ant-menu-submenu:hover,
.ant-menu-horizontal > .ant-menu-item-active,
.ant-menu-horizontal > .ant-menu-submenu-active,
.ant-menu-horizontal > .ant-menu-item-open,
.ant-menu-horizontal > .ant-menu-submenu-open,
.ant-menu-horizontal > .ant-menu-item-selected,
.ant-menu-horizontal > .ant-menu-submenu-selected {
  border-bottom: 2px solid #1890ff;
  color: #1890ff;
}
.ant-menu-horizontal > .ant-menu-item > a {
  display: block;
  color: rgba(0, 0, 0, 0.65);
}
.ant-menu-horizontal > .ant-menu-item > a:hover {
  color: #1890ff;
}
.ant-menu-horizontal > .ant-menu-item > a:before {
  bottom: -2px;
}
.ant-menu-horizontal > .ant-menu-item-selected > a {
  color: #1890ff;
}
.ant-menu-horizontal:after {
  content: ' ';
  display: block;
  height: 0;
  clear: both;
}
.ant-menu-vertical .ant-menu-item,
.ant-menu-vertical-left .ant-menu-item,
.ant-menu-vertical-right .ant-menu-item,
.ant-menu-inline .ant-menu-item {
  position: relative;
}
.ant-menu-vertical .ant-menu-item:after,
.ant-menu-vertical-left .ant-menu-item:after,
.ant-menu-vertical-right .ant-menu-item:after,
.ant-menu-inline .ant-menu-item:after {
  content: '';
  position: absolute;
  right: 0;
  top: 0;
  bottom: 0;
  border-right: 3px solid #1890ff;
  -webkit-transform: scaleY(0.0001);
          transform: scaleY(0.0001);
  opacity: 0;
  -webkit-transition: opacity 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), -webkit-transform 0.15s cubic-bezier(0.215, 0.61, 0.355, 1);
  transition: opacity 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), -webkit-transform 0.15s cubic-bezier(0.215, 0.61, 0.355, 1);
  -o-transition: transform 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), opacity 0.15s cubic-bezier(0.215, 0.61, 0.355, 1);
  transition: transform 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), opacity 0.15s cubic-bezier(0.215, 0.61, 0.355, 1);
  transition: transform 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), opacity 0.15s cubic-bezier(0.215, 0.61, 0.355, 1), -webkit-transform 0.15s cubic-bezier(0.215, 0.61, 0.355, 1);
}
.ant-menu-vertical .ant-menu-item,
.ant-menu-vertical-left .ant-menu-item,
.ant-menu-vertical-right .ant-menu-item,
.ant-menu-inline .ant-menu-item,
.ant-menu-vertical .ant-menu-submenu-title,
.ant-menu-vertical-left .ant-menu-submenu-title,
.ant-menu-vertical-right .ant-menu-submenu-title,
.ant-menu-inline .ant-menu-submenu-title {
  padding: 0 16px;
  font-size: 14px;
  line-height: 40px;
  height: 40px;
  margin-top: 4px;
  margin-bottom: 4px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
}
.ant-menu-vertical .ant-menu-submenu,
.ant-menu-vertical-left .ant-menu-submenu,
.ant-menu-vertical-right .ant-menu-submenu,
.ant-menu-inline .ant-menu-submenu {
  padding-bottom: 0.01px;
}
.ant-menu-vertical .ant-menu-item:not(:last-child),
.ant-menu-vertical-left .ant-menu-item:not(:last-child),
.ant-menu-vertical-right .ant-menu-item:not(:last-child),
.ant-menu-inline .ant-menu-item:not(:last-child) {
  margin-bottom: 8px;
}
.ant-menu-vertical > .ant-menu-item,
.ant-menu-vertical-left > .ant-menu-item,
.ant-menu-vertical-right > .ant-menu-item,
.ant-menu-inline > .ant-menu-item,
.ant-menu-vertical > .ant-menu-submenu > .ant-menu-submenu-title,
.ant-menu-vertical-left > .ant-menu-submenu > .ant-menu-submenu-title,
.ant-menu-vertical-right > .ant-menu-submenu > .ant-menu-submenu-title,
.ant-menu-inline > .ant-menu-submenu > .ant-menu-submenu-title {
  line-height: 40px;
  height: 40px;
}
.ant-menu-inline {
  width: 100%;
}
.ant-menu-inline .ant-menu-selected:after,
.ant-menu-inline .ant-menu-item-selected:after {
  -webkit-transition: opacity 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: opacity 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: transform 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.15s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.15s cubic-bezier(0.645, 0.045, 0.355, 1);
  opacity: 1;
  -webkit-transform: scaleY(1);
          transform: scaleY(1);
}
.ant-menu-inline .ant-menu-item,
.ant-menu-inline .ant-menu-submenu-title {
  width: calc(100% + 1px);
}
.ant-menu-inline .ant-menu-submenu-title {
  padding-right: 34px;
}
.ant-menu-inline-collapsed {
  width: 80px;
}
.ant-menu-inline-collapsed > .ant-menu-item,
.ant-menu-inline-collapsed > .ant-menu-item-group > .ant-menu-item-group-list > .ant-menu-item,
.ant-menu-inline-collapsed > .ant-menu-item-group > .ant-menu-item-group-list > .ant-menu-submenu > .ant-menu-submenu-title,
.ant-menu-inline-collapsed > .ant-menu-submenu > .ant-menu-submenu-title {
  left: 0;
  -o-text-overflow: clip;
     text-overflow: clip;
  padding: 0 32px !important;
}
.ant-menu-inline-collapsed > .ant-menu-item .ant-menu-submenu-arrow,
.ant-menu-inline-collapsed > .ant-menu-item-group > .ant-menu-item-group-list > .ant-menu-item .ant-menu-submenu-arrow,
.ant-menu-inline-collapsed > .ant-menu-item-group > .ant-menu-item-group-list > .ant-menu-submenu > .ant-menu-submenu-title .ant-menu-submenu-arrow,
.ant-menu-inline-collapsed > .ant-menu-submenu > .ant-menu-submenu-title .ant-menu-submenu-arrow {
  display: none;
}
.ant-menu-inline-collapsed > .ant-menu-item .anticon,
.ant-menu-inline-collapsed > .ant-menu-item-group > .ant-menu-item-group-list > .ant-menu-item .anticon,
.ant-menu-inline-collapsed > .ant-menu-item-group > .ant-menu-item-group-list > .ant-menu-submenu > .ant-menu-submenu-title .anticon,
.ant-menu-inline-collapsed > .ant-menu-submenu > .ant-menu-submenu-title .anticon {
  font-size: 16px;
  line-height: 40px;
  margin: 0;
}
.ant-menu-inline-collapsed > .ant-menu-item .anticon + span,
.ant-menu-inline-collapsed > .ant-menu-item-group > .ant-menu-item-group-list > .ant-menu-item .anticon + span,
.ant-menu-inline-collapsed > .ant-menu-item-group > .ant-menu-item-group-list > .ant-menu-submenu > .ant-menu-submenu-title .anticon + span,
.ant-menu-inline-collapsed > .ant-menu-submenu > .ant-menu-submenu-title .anticon + span {
  max-width: 0;
  display: inline-block;
  opacity: 0;
}
.ant-menu-inline-collapsed-tooltip {
  pointer-events: none;
}
.ant-menu-inline-collapsed-tooltip .anticon {
  display: none;
}
.ant-menu-inline-collapsed-tooltip a {
  color: rgba(255, 255, 255, 0.85);
}
.ant-menu-inline-collapsed .ant-menu-item-group-title {
  overflow: hidden;
  white-space: nowrap;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  padding-left: 4px;
  padding-right: 4px;
}
.ant-menu-item-group-list {
  margin: 0;
  padding: 0;
}
.ant-menu-item-group-list .ant-menu-item,
.ant-menu-item-group-list .ant-menu-submenu-title {
  padding: 0 16px 0 28px;
}
.ant-menu-root.ant-menu-vertical,
.ant-menu-root.ant-menu-vertical-left,
.ant-menu-root.ant-menu-vertical-right,
.ant-menu-root.ant-menu-inline {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-menu-sub.ant-menu-inline {
  padding: 0;
  border: 0;
  -webkit-box-shadow: none;
          box-shadow: none;
  border-radius: 0;
}
.ant-menu-sub.ant-menu-inline > .ant-menu-item,
.ant-menu-sub.ant-menu-inline > .ant-menu-submenu > .ant-menu-submenu-title {
  line-height: 40px;
  height: 40px;
  list-style-type: disc;
  list-style-position: inside;
}
.ant-menu-sub.ant-menu-inline .ant-menu-item-group-title {
  padding-left: 32px;
}
.ant-menu-item-disabled,
.ant-menu-submenu-disabled {
  color: rgba(0, 0, 0, 0.25) !important;
  cursor: not-allowed;
  background: none;
  border-color: transparent !important;
}
.ant-menu-item-disabled > a,
.ant-menu-submenu-disabled > a {
  color: rgba(0, 0, 0, 0.25) !important;
  pointer-events: none;
}
.ant-menu-item-disabled > .ant-menu-submenu-title,
.ant-menu-submenu-disabled > .ant-menu-submenu-title {
  color: rgba(0, 0, 0, 0.25) !important;
  cursor: not-allowed;
}
.ant-menu-item-disabled > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-submenu-disabled > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-item-disabled > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after,
.ant-menu-submenu-disabled > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after {
  background: rgba(0, 0, 0, 0.25) !important;
}
.ant-menu-dark,
.ant-menu-dark .ant-menu-sub {
  color: rgba(255, 255, 255, 0.65);
  background: #001529;
}
.ant-menu-dark .ant-menu-submenu-title .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-sub .ant-menu-submenu-title .ant-menu-submenu-arrow {
  opacity: 0.45;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-menu-dark .ant-menu-submenu-title .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-sub .ant-menu-submenu-title .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-title .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-sub .ant-menu-submenu-title .ant-menu-submenu-arrow:before {
  background: #fff;
}
.ant-menu-dark.ant-menu-submenu-popup {
  background: transparent;
}
.ant-menu-dark .ant-menu-inline.ant-menu-sub {
  background: #000c17;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.45) inset;
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.45) inset;
}
.ant-menu-dark.ant-menu-horizontal {
  border-bottom: 0;
}
.ant-menu-dark.ant-menu-horizontal > .ant-menu-item,
.ant-menu-dark.ant-menu-horizontal > .ant-menu-submenu {
  border-color: #001529;
  border-bottom: 0;
  top: 0;
  margin-top: 0;
}
.ant-menu-dark.ant-menu-horizontal > .ant-menu-item > a:before {
  bottom: 0;
}
.ant-menu-dark .ant-menu-item,
.ant-menu-dark .ant-menu-item-group-title,
.ant-menu-dark .ant-menu-item > a {
  color: rgba(255, 255, 255, 0.65);
}
.ant-menu-dark.ant-menu-inline,
.ant-menu-dark.ant-menu-vertical,
.ant-menu-dark.ant-menu-vertical-left,
.ant-menu-dark.ant-menu-vertical-right {
  border-right: 0;
}
.ant-menu-dark.ant-menu-inline .ant-menu-item,
.ant-menu-dark.ant-menu-vertical .ant-menu-item,
.ant-menu-dark.ant-menu-vertical-left .ant-menu-item,
.ant-menu-dark.ant-menu-vertical-right .ant-menu-item {
  border-right: 0;
  margin-left: 0;
  left: 0;
}
.ant-menu-dark.ant-menu-inline .ant-menu-item:after,
.ant-menu-dark.ant-menu-vertical .ant-menu-item:after,
.ant-menu-dark.ant-menu-vertical-left .ant-menu-item:after,
.ant-menu-dark.ant-menu-vertical-right .ant-menu-item:after {
  border-right: 0;
}
.ant-menu-dark.ant-menu-inline .ant-menu-item,
.ant-menu-dark.ant-menu-inline .ant-menu-submenu-title {
  width: 100%;
}
.ant-menu-dark .ant-menu-item:hover,
.ant-menu-dark .ant-menu-item-active,
.ant-menu-dark .ant-menu-submenu-active,
.ant-menu-dark .ant-menu-submenu-open,
.ant-menu-dark .ant-menu-submenu-selected,
.ant-menu-dark .ant-menu-submenu-title:hover {
  background-color: transparent;
  color: #fff;
}
.ant-menu-dark .ant-menu-item:hover > a,
.ant-menu-dark .ant-menu-item-active > a,
.ant-menu-dark .ant-menu-submenu-active > a,
.ant-menu-dark .ant-menu-submenu-open > a,
.ant-menu-dark .ant-menu-submenu-selected > a,
.ant-menu-dark .ant-menu-submenu-title:hover > a {
  color: #fff;
}
.ant-menu-dark .ant-menu-item:hover > .ant-menu-submenu-title > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-item-active > .ant-menu-submenu-title > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-submenu-active > .ant-menu-submenu-title > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-submenu-open > .ant-menu-submenu-title > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-submenu-selected > .ant-menu-submenu-title > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-submenu-title:hover > .ant-menu-submenu-title > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-item:hover > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-item-active > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-submenu-active > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-submenu-open > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-submenu-selected > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow,
.ant-menu-dark .ant-menu-submenu-title:hover > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow {
  opacity: 1;
}
.ant-menu-dark .ant-menu-item:hover > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-item-active > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-active > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-open > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-selected > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-title:hover > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-item:hover > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-item-active > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-active > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-open > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-selected > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-title:hover > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-item:hover > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-item-active > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-active > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-open > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-selected > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-title:hover > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-item:hover > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-item-active > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-active > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-open > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-selected > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-title:hover > .ant-menu-submenu-title:hover > .ant-menu-submenu-arrow:before {
  background: #fff;
}
.ant-menu-dark .ant-menu-item-selected {
  border-right: 0;
  color: #fff;
}
.ant-menu-dark .ant-menu-item-selected:after {
  border-right: 0;
}
.ant-menu-dark .ant-menu-item-selected > a,
.ant-menu-dark .ant-menu-item-selected > a:hover {
  color: #fff;
}
.ant-menu.ant-menu-dark .ant-menu-item-selected,
.ant-menu-submenu-popup.ant-menu-dark .ant-menu-item-selected {
  background-color: #1890ff;
}
.ant-menu-dark .ant-menu-item-disabled,
.ant-menu-dark .ant-menu-submenu-disabled,
.ant-menu-dark .ant-menu-item-disabled > a,
.ant-menu-dark .ant-menu-submenu-disabled > a {
  opacity: 0.8;
  color: rgba(255, 255, 255, 0.35) !important;
}
.ant-menu-dark .ant-menu-item-disabled > .ant-menu-submenu-title,
.ant-menu-dark .ant-menu-submenu-disabled > .ant-menu-submenu-title {
  color: rgba(255, 255, 255, 0.35) !important;
}
.ant-menu-dark .ant-menu-item-disabled > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-submenu-disabled > .ant-menu-submenu-title > .ant-menu-submenu-arrow:before,
.ant-menu-dark .ant-menu-item-disabled > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after,
.ant-menu-dark .ant-menu-submenu-disabled > .ant-menu-submenu-title > .ant-menu-submenu-arrow:after {
  background: rgba(255, 255, 255, 0.35) !important;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-dropdown-menu {
  padding: 15px 0;
}
.ant-dropdown-menu-item {
  height: 30px;
  padding: 0 15px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 12px;
  color: #424242;
}
.ant-dropdown-menu-item > a {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
.ant-dropdown-menu-item > * {
  height: 100%;
}
.ant-dropdown-menu-item > a {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 0 15px;
  margin: 0 -15px;
}
.ant-dropdown-menu-item:first-child,
.ant-dropdown-menu-item:last-child {
  border-radius: 0;
}
.ant-dropdown-menu-item:hover,
.ant-dropdown-menu-item-active {
  background-color: #eceff1;
}
.ant-dropdown-menu-item:hover a,
.ant-dropdown-menu-item-active a {
  color: #263238;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-nav-container {
  height: 40px;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-ink-bar {
  visibility: hidden;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-tab {
  margin: 0;
  border: 1px solid #e8e8e8;
  border-bottom: 0;
  border-radius: 4px 4px 0 0;
  background: #fafafa;
  margin-right: 2px;
  padding: 0 16px;
  -webkit-transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: all 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  line-height: 38px;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-tab-active {
  background: #fff;
  border-color: #e8e8e8;
  color: #1890ff;
  padding-bottom: 1px;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-tab-inactive {
  padding: 0;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-nav-wrap {
  margin-bottom: 0;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-tab .ant-tabs-close-x {
  color: rgba(0, 0, 0, 0.45);
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  font-size: 12px;
  margin-left: 3px;
  margin-right: -5px;
  overflow: hidden;
  vertical-align: middle;
  width: 16px;
  height: 16px;
  height: 14px;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-tab .ant-tabs-close-x:hover {
  color: rgba(0, 0, 0, 0.85);
}
.ant-tabs.ant-tabs-card .ant-tabs-card-content > .ant-tabs-tabpane,
.ant-tabs.ant-tabs-editable-card .ant-tabs-card-content > .ant-tabs-tabpane {
  -webkit-transition: none !important;
  -o-transition: none !important;
  transition: none !important;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-content > .ant-tabs-tabpane-inactive,
.ant-tabs.ant-tabs-editable-card .ant-tabs-card-content > .ant-tabs-tabpane-inactive {
  overflow: hidden;
}
.ant-tabs.ant-tabs-card .ant-tabs-card-bar .ant-tabs-tab:hover .anticon-close {
  opacity: 1;
}
.ant-tabs-extra-content {
  line-height: 40px;
}
.ant-tabs-extra-content .ant-tabs-new-tab {
  position: relative;
  width: 20px;
  height: 20px;
  line-height: 20px;
  text-align: center;
  cursor: pointer;
  border-radius: 2px;
  border: 1px solid #e8e8e8;
  font-size: 12px;
  color: rgba(0, 0, 0, 0.65);
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-tabs-extra-content .ant-tabs-new-tab:hover {
  color: #1890ff;
  border-color: #1890ff;
}
.ant-tabs-extra-content .ant-tabs-new-tab svg {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  margin: auto;
}
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-left-bar .ant-tabs-nav-container,
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-right-bar .ant-tabs-nav-container {
  height: auto;
}
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-left-bar .ant-tabs-tab,
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-right-bar .ant-tabs-tab {
  border-bottom: 1px solid #e8e8e8;
  margin-bottom: 8px;
}
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-left-bar .ant-tabs-tab-active,
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-right-bar .ant-tabs-tab-active {
  padding-bottom: 4px;
}
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-left-bar .ant-tabs-tab:last-child,
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-right-bar .ant-tabs-tab:last-child {
  margin-bottom: 8px;
}
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-left-bar .ant-tabs-new-tab,
.ant-tabs-vertical.ant-tabs-card .ant-tabs-card-bar.ant-tabs-right-bar .ant-tabs-new-tab {
  width: 90%;
}
.ant-tabs-vertical.ant-tabs-card.ant-tabs-left .ant-tabs-card-bar.ant-tabs-left-bar .ant-tabs-nav-wrap {
  margin-right: 0;
}
.ant-tabs-vertical.ant-tabs-card.ant-tabs-left .ant-tabs-card-bar.ant-tabs-left-bar .ant-tabs-tab {
  border-right: 0;
  border-radius: 4px 0 0 4px;
  margin-right: 1px;
}
.ant-tabs-vertical.ant-tabs-card.ant-tabs-left .ant-tabs-card-bar.ant-tabs-left-bar .ant-tabs-tab-active {
  margin-right: -1px;
  padding-right: 18px;
}
.ant-tabs-vertical.ant-tabs-card.ant-tabs-right .ant-tabs-card-bar.ant-tabs-right-bar .ant-tabs-nav-wrap {
  margin-left: 0;
}
.ant-tabs-vertical.ant-tabs-card.ant-tabs-right .ant-tabs-card-bar.ant-tabs-right-bar .ant-tabs-tab {
  border-left: 0;
  border-radius: 0 4px 4px 0;
  margin-left: 1px;
}
.ant-tabs-vertical.ant-tabs-card.ant-tabs-right .ant-tabs-card-bar.ant-tabs-right-bar .ant-tabs-tab-active {
  margin-left: -1px;
  padding-left: 18px;
}
.ant-tabs .ant-tabs-card-bar.ant-tabs-bottom-bar .ant-tabs-tab {
  border-bottom: 1px solid #e8e8e8;
  border-top: 0;
  border-radius: 0 0 4px 4px;
}
.ant-tabs .ant-tabs-card-bar.ant-tabs-bottom-bar .ant-tabs-tab-active {
  color: #1890ff;
  padding-bottom: 0;
  padding-top: 1px;
}
.ant-tabs {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: relative;
  overflow: hidden;
  zoom: 1;
}
.ant-tabs::before,
.ant-tabs::after {
  content: ' ';
  display: table;
}
.ant-tabs::after {
  clear: both;
}
.ant-tabs:before,
.ant-tabs:after {
  content: '';
  display: table;
}
.ant-tabs:after {
  clear: both;
}
.ant-tabs-ink-bar {
  z-index: 1;
  position: absolute;
  left: 0;
  bottom: 1px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  height: 2px;
  background-color: #1890ff;
  -webkit-transform-origin: 0 0;
          transform-origin: 0 0;
}
.ant-tabs-bar {
  border-bottom: 1px solid #e8e8e8;
  margin: 0 0 16px 0;
  outline: none;
  -webkit-transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-tabs-nav-container {
  overflow: hidden;
  font-size: 14px;
  line-height: 1.5;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  position: relative;
  white-space: nowrap;
  margin-bottom: -1px;
  -webkit-transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: padding 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  zoom: 1;
}
.ant-tabs-nav-container::before,
.ant-tabs-nav-container::after {
  content: ' ';
  display: table;
}
.ant-tabs-nav-container::after {
  clear: both;
}
.ant-tabs-nav-container:before,
.ant-tabs-nav-container:after {
  content: '';
  display: table;
}
.ant-tabs-nav-container:after {
  clear: both;
}
.ant-tabs-nav-container-scrolling {
  padding-left: 32px;
  padding-right: 32px;
}
.ant-tabs-bottom .ant-tabs-bottom-bar {
  margin-bottom: 0;
  margin-top: 16px;
  border-bottom: none;
  border-top: 1px solid #e8e8e8;
}
.ant-tabs-bottom .ant-tabs-bottom-bar .ant-tabs-ink-bar {
  bottom: auto;
  top: 1px;
}
.ant-tabs-bottom .ant-tabs-bottom-bar .ant-tabs-nav-container {
  margin-bottom: 0;
  margin-top: -1px;
}
.ant-tabs-tab-prev,
.ant-tabs-tab-next {
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  z-index: 2;
  width: 0;
  height: 100%;
  cursor: pointer;
  border: 0;
  background-color: transparent;
  position: absolute;
  text-align: center;
  color: rgba(0, 0, 0, 0.45);
  -webkit-transition: width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  opacity: 0;
  pointer-events: none;
}
.ant-tabs-tab-prev.ant-tabs-tab-arrow-show,
.ant-tabs-tab-next.ant-tabs-tab-arrow-show {
  opacity: 1;
  width: 32px;
  height: 100%;
  pointer-events: auto;
}
.ant-tabs-tab-prev:hover,
.ant-tabs-tab-next:hover {
  color: rgba(0, 0, 0, 0.65);
}
.ant-tabs-tab-prev-icon,
.ant-tabs-tab-next-icon {
  font-style: normal;
  font-weight: bold;
  font-variant: normal;
  line-height: inherit;
  vertical-align: baseline;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  text-align: center;
  text-transform: none;
}
.ant-tabs-tab-prev-icon-target,
.ant-tabs-tab-next-icon-target {
  display: block;
  display: inline-block;
  font-size: 12px;
  font-size: 10px \9;
  -webkit-transform: scale(0.83333333) rotate(0deg);
          transform: scale(0.83333333) rotate(0deg);
}
:root .ant-tabs-tab-prev-icon-target,
:root .ant-tabs-tab-next-icon-target {
  font-size: 12px;
}
.ant-tabs-tab-btn-disabled {
  cursor: not-allowed;
}
.ant-tabs-tab-btn-disabled,
.ant-tabs-tab-btn-disabled:hover {
  color: rgba(0, 0, 0, 0.25);
}
.ant-tabs-tab-next {
  right: 2px;
}
.ant-tabs-tab-prev {
  left: 0;
}
:root .ant-tabs-tab-prev {
  -webkit-filter: none;
          filter: none;
}
.ant-tabs-nav-wrap {
  overflow: hidden;
  margin-bottom: -1px;
}
.ant-tabs-nav-scroll {
  overflow: hidden;
  white-space: nowrap;
}
.ant-tabs-nav {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  padding-left: 0;
  -webkit-transition: -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  position: relative;
  margin: 0;
  list-style: none;
  display: inline-block;
}
.ant-tabs-nav:before,
.ant-tabs-nav:after {
  display: table;
  content: ' ';
}
.ant-tabs-nav:after {
  clear: both;
}
.ant-tabs-nav .ant-tabs-tab {
  display: inline-block;
  height: 100%;
  margin: 0 32px 0 0;
  padding: 12px 16px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  position: relative;
  -webkit-transition: color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  cursor: pointer;
  text-decoration: none;
}
.ant-tabs-nav .ant-tabs-tab:last-child {
  margin-right: 0;
}
.ant-tabs-nav .ant-tabs-tab:hover {
  color: #40a9ff;
}
.ant-tabs-nav .ant-tabs-tab:active {
  color: #096dd9;
}
.ant-tabs-nav .ant-tabs-tab .anticon {
  margin-right: 8px;
}
.ant-tabs-nav .ant-tabs-tab-disabled,
.ant-tabs-nav .ant-tabs-tab-disabled:hover {
  cursor: not-allowed;
  color: rgba(0, 0, 0, 0.25);
}
.ant-tabs-nav .ant-tabs-tab-active {
  color: #1890ff;
  font-weight: 500;
}
.ant-tabs .ant-tabs-large-bar .ant-tabs-nav-container {
  font-size: 16px;
}
.ant-tabs .ant-tabs-large-bar .ant-tabs-tab {
  padding: 16px;
}
.ant-tabs .ant-tabs-small-bar .ant-tabs-nav-container {
  font-size: 14px;
}
.ant-tabs .ant-tabs-small-bar .ant-tabs-tab {
  padding: 8px 16px;
}
.ant-tabs .ant-tabs-top-content,
.ant-tabs .ant-tabs-bottom-content {
  width: 100%;
}
.ant-tabs .ant-tabs-top-content > .ant-tabs-tabpane,
.ant-tabs .ant-tabs-bottom-content > .ant-tabs-tabpane {
  -ms-flex-negative: 0;
      flex-shrink: 0;
  width: 100%;
  -webkit-transition: opacity 0.45s;
  -o-transition: opacity 0.45s;
  transition: opacity 0.45s;
  opacity: 1;
}
.ant-tabs .ant-tabs-top-content > .ant-tabs-tabpane-inactive,
.ant-tabs .ant-tabs-bottom-content > .ant-tabs-tabpane-inactive {
  opacity: 0;
  height: 0;
  padding: 0 !important;
  pointer-events: none;
}
.ant-tabs .ant-tabs-top-content > .ant-tabs-tabpane-inactive input,
.ant-tabs .ant-tabs-bottom-content > .ant-tabs-tabpane-inactive input {
  visibility: hidden;
}
.ant-tabs .ant-tabs-top-content.ant-tabs-content-animated,
.ant-tabs .ant-tabs-bottom-content.ant-tabs-content-animated {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: horizontal;
  -webkit-box-direction: normal;
      -ms-flex-direction: row;
          flex-direction: row;
  will-change: margin-left;
  -webkit-transition: margin-left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: margin-left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: margin-left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-tabs .ant-tabs-left-bar,
.ant-tabs .ant-tabs-right-bar {
  border-bottom: 0;
  height: 100%;
}
.ant-tabs .ant-tabs-left-bar-tab-prev,
.ant-tabs .ant-tabs-right-bar-tab-prev,
.ant-tabs .ant-tabs-left-bar-tab-next,
.ant-tabs .ant-tabs-right-bar-tab-next {
  width: 32px;
  height: 0;
  -webkit-transition: height 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: height 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: height 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), opacity 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-tabs .ant-tabs-left-bar-tab-prev.ant-tabs-tab-arrow-show,
.ant-tabs .ant-tabs-right-bar-tab-prev.ant-tabs-tab-arrow-show,
.ant-tabs .ant-tabs-left-bar-tab-next.ant-tabs-tab-arrow-show,
.ant-tabs .ant-tabs-right-bar-tab-next.ant-tabs-tab-arrow-show {
  width: 100%;
  height: 32px;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-tab,
.ant-tabs .ant-tabs-right-bar .ant-tabs-tab {
  float: none;
  margin: 0 0 16px 0;
  padding: 8px 24px;
  display: block;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-tab:last-child,
.ant-tabs .ant-tabs-right-bar .ant-tabs-tab:last-child {
  margin-bottom: 0;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-extra-content,
.ant-tabs .ant-tabs-right-bar .ant-tabs-extra-content {
  text-align: center;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav-scroll,
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav-scroll {
  width: auto;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav-container,
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav-container,
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav-wrap,
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav-wrap {
  height: 100%;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav-container,
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav-container {
  margin-bottom: 0;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav-container.ant-tabs-nav-container-scrolling,
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav-container.ant-tabs-nav-container-scrolling {
  padding: 32px 0;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav-wrap,
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav-wrap {
  margin-bottom: 0;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav,
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav {
  width: 100%;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-ink-bar,
.ant-tabs .ant-tabs-right-bar .ant-tabs-ink-bar {
  width: 2px;
  top: 0;
  left: auto;
  height: auto;
  bottom: auto;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-tab-next,
.ant-tabs .ant-tabs-right-bar .ant-tabs-tab-next {
  width: 100%;
  bottom: 0;
  height: 32px;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-tab-prev,
.ant-tabs .ant-tabs-right-bar .ant-tabs-tab-prev {
  top: 0;
  width: 100%;
  height: 32px;
}
.ant-tabs .ant-tabs-left-content,
.ant-tabs .ant-tabs-right-content {
  overflow: hidden;
  width: auto;
  margin-top: 0 !important;
}
.ant-tabs .ant-tabs-left-bar {
  float: left;
  border-right: 1px solid #e8e8e8;
  margin-right: -1px;
  margin-bottom: 0;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-tab {
  text-align: right;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav-container {
  margin-right: -1px;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-nav-wrap {
  margin-right: -1px;
}
.ant-tabs .ant-tabs-left-bar .ant-tabs-ink-bar {
  right: 1px;
}
.ant-tabs .ant-tabs-left-content {
  padding-left: 24px;
  border-left: 1px solid #e8e8e8;
}
.ant-tabs .ant-tabs-right-bar {
  float: right;
  border-left: 1px solid #e8e8e8;
  margin-left: -1px;
  margin-bottom: 0;
}
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav-container {
  margin-left: -1px;
}
.ant-tabs .ant-tabs-right-bar .ant-tabs-nav-wrap {
  margin-left: -1px;
}
.ant-tabs .ant-tabs-right-bar .ant-tabs-ink-bar {
  left: 1px;
}
.ant-tabs .ant-tabs-right-content {
  padding-right: 24px;
  border-right: 1px solid #e8e8e8;
}
.ant-tabs-top .ant-tabs-ink-bar-animated,
.ant-tabs-bottom .ant-tabs-ink-bar-animated {
  -webkit-transition: width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), width 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), left 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-tabs-left .ant-tabs-ink-bar-animated,
.ant-tabs-right .ant-tabs-ink-bar-animated {
  -webkit-transition: height 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: height 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  -o-transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), height 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), height 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
  transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), height 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), top 0.3s cubic-bezier(0.645, 0.045, 0.355, 1), -webkit-transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
}
.no-flex > .ant-tabs-content > .ant-tabs-content-animated,
.ant-tabs-no-animation > .ant-tabs-content > .ant-tabs-content-animated {
  -webkit-transform: none !important;
          transform: none !important;
  margin-left: 0 !important;
}
.no-flex > .ant-tabs-content > .ant-tabs-tabpane-inactive,
.ant-tabs-no-animation > .ant-tabs-content > .ant-tabs-tabpane-inactive {
  display: none;
}
.ant-tabs-left-content > .ant-tabs-content-animated,
.ant-tabs-right-content > .ant-tabs-content-animated {
  -webkit-transform: none !important;
          transform: none !important;
  margin-left: 0 !important;
}
.ant-tabs-left-content > .ant-tabs-tabpane-inactive,
.ant-tabs-right-content > .ant-tabs-tabpane-inactive {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-tabs.ant-tabs-card .ant-tabs-content {
  margin-top: 0;
  padding: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  background: #ffffff;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar {
  margin: 0;
  height: 50px;
  background-color: #fafafa;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab {
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
  -webkit-box-flex: 1;
      -ms-flex: 1 0 0px;
          flex: 1 0 0;
  border: none;
  border-radius: 0;
  margin: 0;
  padding: 16px;
  height: 100%;
  text-align: center;
  font-family: -apple-system, BlinkMacSystemFont, 'SF Pro SC', 'SF Pro Text', 'PingFang SC', 'Arial', 'Hiragino Sans GB', 'Heiti SC', 'Microsoft Yahei', sans-serif;
  font-weight: 400;
  line-height: 18px;
  color: #78909c;
  background: transparent;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab:not(.ant-tabs-tab-active):not(.ant-tabs-tab-disabled):hover {
  color: #263238;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab.ant-tabs-tab-disabled {
  pointer-events: auto;
  color: rgba(120, 144, 156, 0.3);
  cursor: not-allowed;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab + .ant-tabs-tab::before {
  content: '';
  width: 1px;
  height: 24px;
  background-color: #eeeeee;
  position: absolute;
  left: 0;
  top: 50%;
  -webkit-transform: translateY(-50%);
          transform: translateY(-50%);
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab:last-child.ant-tabs-tab-active::after {
  content: '';
  width: 1px;
  height: 100%;
  background-color: #eeeeee;
  position: absolute;
  right: 0;
  top: 50%;
  -webkit-transform: translateY(-50%);
          transform: translateY(-50%);
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab-active + .ant-tabs-tab::before,
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab + .ant-tabs-tab-active::before {
  height: 100%;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab-active {
  background: #ffffff;
  color: #263238;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-tab-arrow-show {
  display: none;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-nav-container {
  height: 50px;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-nav-container.ant-tabs-nav-container-scrolling {
  padding-left: 0;
  padding-right: 0;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-nav-container .ant-tabs-nav-wrap {
  height: 100%;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-nav-container .ant-tabs-nav-wrap .ant-tabs-nav-scroll {
  height: 100%;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-nav-container .ant-tabs-nav-wrap .ant-tabs-nav-scroll .ant-tabs-nav {
  height: 100%;
  width: 100%;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-nav-container .ant-tabs-nav-wrap .ant-tabs-nav-scroll .ant-tabs-nav > div {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  width: 100%;
}
.ant-tabs.ant-tabs-card > .ant-tabs-bar .ant-tabs-nav-container .ant-tabs-nav-wrap .ant-tabs-nav-scroll .ant-tabs-nav > div > div {
  max-width: 160px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.slideUpModal__3E4w {
  position: fixed;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 100;
  background: rgba(33, 33, 33, 0.7);
  opacity: 0;
  pointer-events: none;
  -webkit-transition: opacity 0.15s;
  -o-transition: opacity 0.15s;
  transition: opacity 0.15s;
}
.slideUpModal__3E4w.isShow__1WqE {
  opacity: 1;
  pointer-events: auto;
}
.container__33-U {
  position: absolute;
  left: 0;
  right: 0;
  bottom: 0;
  background: #ffffff;
  -webkit-transform: translateY(100%);
          transform: translateY(100%);
  -webkit-transition: -webkit-transform 0.3s;
  transition: -webkit-transform 0.3s;
  -o-transition: transform 0.3s;
  transition: transform 0.3s;
  transition: transform 0.3s, -webkit-transform 0.3s;
  padding-bottom: 0px;
  padding-bottom: env(safe-area-inset-bottom);
}
@supports (padding-bottom: max(0px)) {
  .container__33-U {
    padding-bottom: max( 0px , env(safe-area-inset-bottom));
  }
}
.container__33-U.isShow__1WqE {
  -webkit-transform: translateY(0%);
          transform: translateY(0%);
}
.children__LnSX,
.header__36If {
  padding-left: 0px;
  padding-left: env(safe-area-inset-left);
  padding-right: 0px;
  padding-right: env(safe-area-inset-right);
}
@supports (padding-left: max(0px)) {
  .children__LnSX,
  .header__36If {
    padding-left: max( 0px , env(safe-area-inset-left));
  }
}
@supports (padding-right: max(0px)) {
  .children__LnSX,
  .header__36If {
    padding-right: max( 0px , env(safe-area-inset-right));
  }
}
.header__36If {
  height: 44px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  border-bottom: 1px solid #eeeeee;
}
.header__36If button {
  height: 100%;
  width: 69px;
  font-size: 16px;
  border: none;
  border-radius: 0;
  background: transparent;
  outline: 0;
}
.header__36If button:hover {
  background: #f7f9fa;
}
.cancel__N9Yj {
  color: #78909c;
}
.done__vohh {
  color: #546e7a;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__zfGq,
.scrollArea__3kjJ {
  height: 220px;
  width: 100%;
}
.root__zfGq {
  overflow: hidden;
  position: relative;
}
.root__zfGq::before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: 1;
  pointer-events: none;
  background: -webkit-linear-gradient(top, white, rgba(255, 255, 255, 0.5) 87px, #eeeeee 87px, #eeeeee 88px, transparent 88px, transparent 132px, #eeeeee 132px, #eeeeee 133px, rgba(255, 255, 255, 0.5) 133px, white 220px);
  background: -o-linear-gradient(top, white, rgba(255, 255, 255, 0.5) 87px, #eeeeee 87px, #eeeeee 88px, transparent 88px, transparent 132px, #eeeeee 132px, #eeeeee 133px, rgba(255, 255, 255, 0.5) 133px, white 220px);
  background: linear-gradient(to bottom, white, rgba(255, 255, 255, 0.5) 87px, #eeeeee 87px, #eeeeee 88px, transparent 88px, transparent 132px, #eeeeee 132px, #eeeeee 133px, rgba(255, 255, 255, 0.5) 133px, white 220px);
}
.scrollArea__3kjJ {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  position: absolute;
  left: 0;
  overflow-x: hidden;
  overflow-y: scroll;
  -webkit-overflow-scrolling: touch;
  padding-right: 17px;
}
.item__1Ld3 {
  height: 44px;
  color: #263238;
  font-size: 16px;
  text-align: center;
  line-height: 44px;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-table-wrapper {
  zoom: 1;
}
.ant-table-wrapper::before,
.ant-table-wrapper::after {
  content: ' ';
  display: table;
}
.ant-table-wrapper::after {
  clear: both;
}
.ant-table-wrapper:before,
.ant-table-wrapper:after {
  content: '';
  display: table;
}
.ant-table-wrapper:after {
  clear: both;
}
.ant-table {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: relative;
  clear: both;
}
.ant-table-body {
  -webkit-transition: opacity 0.3s;
  -o-transition: opacity 0.3s;
  transition: opacity 0.3s;
}
.ant-table-empty .ant-table-body {
  overflow: auto !important;
}
.ant-table table {
  width: 100%;
  border-collapse: collapse;
  text-align: left;
  border-radius: 4px 4px 0 0;
}
.ant-table-thead > tr > th {
  background: #fafafa;
  -webkit-transition: background 0.3s ease;
  -o-transition: background 0.3s ease;
  transition: background 0.3s ease;
  text-align: left;
  color: rgba(0, 0, 0, 0.85);
  font-weight: 500;
  border-bottom: 1px solid #e8e8e8;
}
.ant-table-thead > tr > th[colspan] {
  text-align: center;
}
.ant-table-thead > tr > th .anticon-filter,
.ant-table-thead > tr > th .ant-table-filter-icon {
  font-size: 12px;
  cursor: pointer;
  color: #bfbfbf;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  width: 28px;
  position: absolute;
  top: 0;
  right: 0;
  height: 100%;
  text-align: center;
}
.ant-table-thead > tr > th .anticon-filter > svg,
.ant-table-thead > tr > th .ant-table-filter-icon > svg {
  position: absolute;
  top: 50%;
  left: 50%;
  margin-top: -5px;
  margin-left: -6px;
}
.ant-table-thead > tr > th .ant-table-filter-selected.anticon-filter {
  color: #1890ff;
}
.ant-table-thead > tr > th .ant-table-column-sorter {
  position: absolute;
  right: 6px;
  top: 50%;
  width: 14px;
  height: 17px;
  margin-top: -8.5px;
  text-align: center;
  color: #bfbfbf;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-table-thead > tr > th .ant-table-column-sorter-up,
.ant-table-thead > tr > th .ant-table-column-sorter-down {
  display: inline-block;
  font-size: 12px;
  font-size: 11px \9;
  -webkit-transform: scale(0.91666667) rotate(0deg);
          transform: scale(0.91666667) rotate(0deg);
  line-height: 4px;
  height: 4px;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  display: block;
}
:root .ant-table-thead > tr > th .ant-table-column-sorter-up,
:root .ant-table-thead > tr > th .ant-table-column-sorter-down {
  font-size: 12px;
}
.ant-table-thead > tr > th .ant-table-column-sorter-up.on,
.ant-table-thead > tr > th .ant-table-column-sorter-down.on {
  color: #1890ff;
}
.ant-table-thead > tr > th .ant-table-column-sorter-down {
  margin-top: 4px;
}
.ant-table-thead > tr > th.ant-table-column-has-actions {
  position: relative;
  background-clip: padding-box;
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-filters .anticon-filter.ant-table-filter-open,
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-filters .ant-table-filter-icon.ant-table-filter-open {
  color: rgba(0, 0, 0, 0.45);
  background: #e5e5e5;
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-filters:hover .anticon-filter:hover,
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-filters:hover .ant-table-filter-icon:hover {
  color: rgba(0, 0, 0, 0.45);
  background: #e5e5e5;
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-filters:hover .anticon-filter:active,
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-filters:hover .ant-table-filter-icon:active {
  color: rgba(0, 0, 0, 0.65);
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-sorters {
  cursor: pointer;
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-sorters:hover {
  background: #f2f2f2;
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-sorters:hover .anticon-filter,
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-sorters:hover .ant-table-filter-icon {
  background: #f2f2f2;
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-sorters:active .ant-table-column-sorter-up:not(.on),
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-sorters:active .ant-table-column-sorter-down:not(.on) {
  color: rgba(0, 0, 0, 0.45);
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-sorters,
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-filters {
  padding-right: 30px !important;
}
.ant-table-thead > tr > th.ant-table-column-has-actions.ant-table-column-has-sorters.ant-table-column-has-filters {
  padding-right: 54px !important;
}
.ant-table-thead > tr > th .ant-table-column-sorters > *:not(.ant-table-column-sorter) {
  position: relative;
}
.ant-table-thead > tr > th .ant-table-column-sorters:before {
  position: absolute;
  content: '';
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background: transparent;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-table-thead > tr > th .ant-table-column-sorters:hover:before {
  background: rgba(0, 0, 0, 0.04);
}
.ant-table-thead > tr > th.ant-table-column-has-filters .ant-table-column-sorter {
  right: 34px;
}
.ant-table-thead > tr > th.ant-table-column-has-sorters {
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.ant-table-thead > tr:first-child > th:first-child {
  border-top-left-radius: 4px;
}
.ant-table-thead > tr:first-child > th:last-child {
  border-top-right-radius: 4px;
}
.ant-table-thead > tr:not(:last-child) > th[colspan] {
  border-bottom: 0;
}
.ant-table-tbody > tr > td {
  border-bottom: 1px solid #e8e8e8;
  -webkit-transition: all 0.3s, border 0s;
  -o-transition: all 0.3s, border 0s;
  transition: all 0.3s, border 0s;
}
.ant-table-thead > tr,
.ant-table-tbody > tr {
  -webkit-transition: all 0.3s, height 0s;
  -o-transition: all 0.3s, height 0s;
  transition: all 0.3s, height 0s;
}
.ant-table-thead > tr.ant-table-row-hover:not(.ant-table-expanded-row) > td,
.ant-table-tbody > tr.ant-table-row-hover:not(.ant-table-expanded-row) > td,
.ant-table-thead > tr:hover:not(.ant-table-expanded-row) > td,
.ant-table-tbody > tr:hover:not(.ant-table-expanded-row) > td {
  background: #e6f7ff;
}
.ant-table-thead > tr:hover {
  background: none;
}
.ant-table-footer {
  padding: 16px 16px;
  background: #fafafa;
  border-radius: 0 0 4px 4px;
  position: relative;
  border-top: 1px solid #e8e8e8;
}
.ant-table-footer:before {
  content: '';
  height: 1px;
  background: #fafafa;
  position: absolute;
  top: -1px;
  width: 100%;
  left: 0;
}
.ant-table.ant-table-bordered .ant-table-footer {
  border: 1px solid #e8e8e8;
}
.ant-table-title {
  padding: 16px 0;
  position: relative;
  top: 1px;
  border-radius: 4px 4px 0 0;
}
.ant-table.ant-table-bordered .ant-table-title {
  border: 1px solid #e8e8e8;
  padding-left: 16px;
  padding-right: 16px;
}
.ant-table-title + .ant-table-content {
  position: relative;
  border-radius: 4px 4px 0 0;
  overflow: hidden;
}
.ant-table-bordered .ant-table-title + .ant-table-content,
.ant-table-bordered .ant-table-title + .ant-table-content table,
.ant-table-bordered .ant-table-title + .ant-table-content .ant-table-thead > tr:first-child > th {
  border-radius: 0;
}
.ant-table-without-column-header .ant-table-title + .ant-table-content,
.ant-table-without-column-header table {
  border-radius: 0;
}
.ant-table-tbody > tr.ant-table-row-selected td {
  background: #fafafa;
}
.ant-table-thead > tr > th.ant-table-column-sort {
  background: #f5f5f5;
}
.ant-table-tbody > tr > td.ant-table-column-sort {
  background: rgba(0, 0, 0, 0.01);
}
.ant-table-thead > tr > th,
.ant-table-tbody > tr > td {
  padding: 16px 16px;
}
.ant-table-thead > tr > th.ant-table-selection-column-custom .ant-table-selection {
  margin-right: -15px;
}
.ant-table-thead > tr > th.ant-table-selection-column,
.ant-table-tbody > tr > td.ant-table-selection-column {
  text-align: center;
}
.ant-table-thead > tr > th.ant-table-selection-column .ant-radio-wrapper,
.ant-table-tbody > tr > td.ant-table-selection-column .ant-radio-wrapper {
  margin-right: 0;
}
.ant-table-expand-icon-th,
.ant-table-row-expand-icon-cell {
  text-align: center;
  min-width: 50px;
  width: 50px;
}
.ant-table-header {
  background: #fafafa;
  overflow: hidden;
}
.ant-table-header table {
  border-radius: 4px 4px 0 0;
}
.ant-table-loading {
  position: relative;
}
.ant-table-loading .ant-table-body {
  background: #fff;
  opacity: 0.5;
}
.ant-table-loading .ant-table-spin-holder {
  height: 20px;
  line-height: 20px;
  left: 50%;
  top: 50%;
  margin-left: -30px;
  position: absolute;
}
.ant-table-loading .ant-table-with-pagination {
  margin-top: -20px;
}
.ant-table-loading .ant-table-without-pagination {
  margin-top: 10px;
}
.ant-table-bordered .ant-table-header > table,
.ant-table-bordered .ant-table-body > table,
.ant-table-bordered .ant-table-fixed-left table,
.ant-table-bordered .ant-table-fixed-right table {
  border: 1px solid #e8e8e8;
  border-right: 0;
  border-bottom: 0;
}
.ant-table-bordered.ant-table-empty .ant-table-placeholder {
  border-left: 1px solid #e8e8e8;
  border-right: 1px solid #e8e8e8;
}
.ant-table-bordered.ant-table-fixed-header .ant-table-header > table {
  border-bottom: 0;
}
.ant-table-bordered.ant-table-fixed-header .ant-table-body > table {
  border-top: 0;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}
.ant-table-bordered.ant-table-fixed-header .ant-table-body-inner > table {
  border-top: 0;
}
.ant-table-bordered .ant-table-thead > tr:not(:last-child) > th {
  border-bottom: 1px solid #e8e8e8;
}
.ant-table-bordered .ant-table-thead > tr > th,
.ant-table-bordered .ant-table-tbody > tr > td {
  border-right: 1px solid #e8e8e8;
}
.ant-table-placeholder {
  position: relative;
  padding: 16px 16px;
  background: #fff;
  border-radius: 0 0 4px 4px;
  border-bottom: 1px solid #e8e8e8;
  text-align: center;
  font-size: 14px;
  color: rgba(0, 0, 0, 0.45);
  z-index: 1;
}
.ant-table-placeholder .anticon {
  margin-right: 4px;
}
.ant-table-pagination.ant-pagination {
  margin: 16px 0;
  float: right;
}
.ant-table-filter-dropdown {
  min-width: 96px;
  margin-left: -8px;
  background: #fff;
  border-radius: 4px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  position: relative;
}
.ant-table-filter-dropdown .ant-dropdown-menu {
  border: 0;
  -webkit-box-shadow: none;
          box-shadow: none;
  border-radius: 4px 4px 0 0;
}
.ant-table-filter-dropdown .ant-dropdown-menu-without-submenu {
  max-height: 400px;
  overflow-x: hidden;
}
.ant-table-filter-dropdown .ant-dropdown-menu-item > label + span {
  padding-right: 0;
}
.ant-table-filter-dropdown .ant-dropdown-menu-sub {
  border-radius: 4px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
}
.ant-table-filter-dropdown .ant-dropdown-menu .ant-dropdown-submenu-contain-selected .ant-dropdown-menu-submenu-title:after {
  color: #1890ff;
  font-weight: bold;
  text-shadow: 0 0 2px #bae7ff;
}
.ant-table-filter-dropdown .ant-dropdown-menu-item {
  overflow: hidden;
}
.ant-table-filter-dropdown > .ant-dropdown-menu > .ant-dropdown-menu-item:last-child,
.ant-table-filter-dropdown > .ant-dropdown-menu > .ant-dropdown-menu-submenu:last-child .ant-dropdown-menu-submenu-title {
  border-radius: 0;
}
.ant-table-filter-dropdown-btns {
  overflow: hidden;
  padding: 7px 8px;
  border-top: 1px solid #e8e8e8;
}
.ant-table-filter-dropdown-link {
  color: #1890ff;
}
.ant-table-filter-dropdown-link:hover {
  color: #40a9ff;
}
.ant-table-filter-dropdown-link:active {
  color: #096dd9;
}
.ant-table-filter-dropdown-link.confirm {
  float: left;
}
.ant-table-filter-dropdown-link.clear {
  float: right;
}
.ant-table-selection {
  white-space: nowrap;
}
.ant-table-selection-select-all-custom {
  margin-right: 4px !important;
}
.ant-table-selection .anticon-down {
  color: #bfbfbf;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-table-selection-menu {
  min-width: 96px;
  margin-top: 5px;
  margin-left: -30px;
  background: #fff;
  border-radius: 4px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
}
.ant-table-selection-menu .ant-action-down {
  color: #bfbfbf;
}
.ant-table-selection-down {
  cursor: pointer;
  padding: 0;
  display: inline-block;
  line-height: 1;
}
.ant-table-selection-down:hover .anticon-down {
  color: rgba(0, 0, 0, 0.6);
}
.ant-table-row-expand-icon {
  cursor: pointer;
  display: inline-block;
  width: 17px;
  height: 17px;
  text-align: center;
  line-height: 14px;
  border: 1px solid #e8e8e8;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  background: #fff;
}
.ant-table-row-expanded:after {
  content: '-';
}
.ant-table-row-collapsed:after {
  content: '+';
}
.ant-table-row-spaced {
  visibility: hidden;
}
.ant-table-row-spaced:after {
  content: '.';
}
.ant-table-row[class*='ant-table-row-level-0'] .ant-table-selection-column > span {
  display: inline-block;
}
tr.ant-table-expanded-row,
tr.ant-table-expanded-row:hover {
  background: #fbfbfb;
}
tr.ant-table-expanded-row td > .ant-table-wrapper {
  margin: -16px -16px -17px;
}
.ant-table .ant-table-row-indent + .ant-table-row-expand-icon {
  margin-right: 8px;
}
.ant-table-scroll {
  overflow: auto;
  overflow-x: hidden;
}
.ant-table-scroll table {
  width: auto;
  min-width: 100%;
}
.ant-table-scroll table .ant-table-fixed-columns-in-body {
  visibility: hidden;
}
.ant-table-body-inner {
  height: 100%;
}
.ant-table-fixed-header > .ant-table-content > .ant-table-scroll > .ant-table-body {
  position: relative;
  background: #fff;
}
.ant-table-fixed-header .ant-table-body-inner {
  overflow: scroll;
}
.ant-table-fixed-header .ant-table-scroll .ant-table-header {
  overflow: scroll;
  padding-bottom: 20px;
  margin-bottom: -20px;
  opacity: 0.9999;
}
.ant-table-fixed-left,
.ant-table-fixed-right {
  position: absolute;
  top: 0;
  overflow: hidden;
  -webkit-transition: -webkit-box-shadow 0.3s ease;
  transition: -webkit-box-shadow 0.3s ease;
  -o-transition: box-shadow 0.3s ease;
  transition: box-shadow 0.3s ease;
  transition: box-shadow 0.3s ease, -webkit-box-shadow 0.3s ease;
  border-radius: 0;
  z-index: 20;
}
.ant-table-fixed-left table,
.ant-table-fixed-right table {
  width: auto;
  background: #fff;
}
.ant-table-fixed-header .ant-table-fixed-left .ant-table-body-outer .ant-table-fixed,
.ant-table-fixed-header .ant-table-fixed-right .ant-table-body-outer .ant-table-fixed {
  border-radius: 0;
}
.ant-table-fixed-left {
  left: 0;
  -webkit-box-shadow: 6px 0 6px -4px rgba(0, 0, 0, 0.15);
          box-shadow: 6px 0 6px -4px rgba(0, 0, 0, 0.15);
}
.ant-table-fixed-left .ant-table-header {
  overflow-y: hidden;
}
.ant-table-fixed-left .ant-table-body-inner {
  margin-right: -20px;
  padding-right: 20px;
}
.ant-table-fixed-header .ant-table-fixed-left .ant-table-body-inner {
  padding-right: 0;
}
.ant-table-fixed-left,
.ant-table-fixed-left table {
  border-radius: 4px 0 0 0;
}
.ant-table-fixed-left .ant-table-thead > tr > th:last-child {
  border-top-right-radius: 0;
}
.ant-table-fixed-right {
  right: 0;
  -webkit-box-shadow: -6px 0 6px -4px rgba(0, 0, 0, 0.15);
          box-shadow: -6px 0 6px -4px rgba(0, 0, 0, 0.15);
}
.ant-table-fixed-right,
.ant-table-fixed-right table {
  border-radius: 0 4px 0 0;
}
.ant-table-fixed-right .ant-table-expanded-row {
  color: transparent;
  pointer-events: none;
}
.ant-table-fixed-right .ant-table-thead > tr > th:first-child {
  border-top-left-radius: 0;
}
.ant-table.ant-table-scroll-position-left .ant-table-fixed-left {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-table.ant-table-scroll-position-right .ant-table-fixed-right {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.ant-table-middle > .ant-table-title,
.ant-table-middle > .ant-table-footer {
  padding: 12px 8px;
}
.ant-table-middle > .ant-table-content > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-middle > .ant-table-content > .ant-table-body > table > .ant-table-thead > tr > th,
.ant-table-middle > .ant-table-content > .ant-table-scroll > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-middle > .ant-table-content > .ant-table-scroll > .ant-table-body > table > .ant-table-thead > tr > th,
.ant-table-middle > .ant-table-content > .ant-table-fixed-left > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-middle > .ant-table-content > .ant-table-fixed-right > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-middle > .ant-table-content > .ant-table-fixed-left > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-thead > tr > th,
.ant-table-middle > .ant-table-content > .ant-table-fixed-right > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-thead > tr > th,
.ant-table-middle > .ant-table-content > .ant-table-header > table > .ant-table-tbody > tr > td,
.ant-table-middle > .ant-table-content > .ant-table-body > table > .ant-table-tbody > tr > td,
.ant-table-middle > .ant-table-content > .ant-table-scroll > .ant-table-header > table > .ant-table-tbody > tr > td,
.ant-table-middle > .ant-table-content > .ant-table-scroll > .ant-table-body > table > .ant-table-tbody > tr > td,
.ant-table-middle > .ant-table-content > .ant-table-fixed-left > .ant-table-header > table > .ant-table-tbody > tr > td,
.ant-table-middle > .ant-table-content > .ant-table-fixed-right > .ant-table-header > table > .ant-table-tbody > tr > td,
.ant-table-middle > .ant-table-content > .ant-table-fixed-left > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-tbody > tr > td,
.ant-table-middle > .ant-table-content > .ant-table-fixed-right > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-tbody > tr > td {
  padding: 12px 8px;
}
.ant-table-middle tr.ant-table-expanded-row td > .ant-table-wrapper {
  margin: -12px -16px -13px;
}
.ant-table-small {
  border: 1px solid #e8e8e8;
  border-radius: 4px;
}
.ant-table-small > .ant-table-title,
.ant-table-small > .ant-table-footer {
  padding: 8px 8px;
}
.ant-table-small > .ant-table-title {
  border-bottom: 1px solid #e8e8e8;
  top: 0;
}
.ant-table-small > .ant-table-content > .ant-table-body {
  margin: 0 8px;
}
.ant-table-small > .ant-table-content > .ant-table-header > table,
.ant-table-small > .ant-table-content > .ant-table-body > table,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-header > table,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-body > table,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-header > table,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-header > table,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-body-outer > .ant-table-body-inner > table,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-body-outer > .ant-table-body-inner > table {
  border: 0;
}
.ant-table-small > .ant-table-content > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-body > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-body > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-header > table > .ant-table-tbody > tr > td,
.ant-table-small > .ant-table-content > .ant-table-body > table > .ant-table-tbody > tr > td,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-header > table > .ant-table-tbody > tr > td,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-body > table > .ant-table-tbody > tr > td,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-header > table > .ant-table-tbody > tr > td,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-header > table > .ant-table-tbody > tr > td,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-tbody > tr > td,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-tbody > tr > td {
  padding: 8px 8px;
}
.ant-table-small > .ant-table-content > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-body > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-body > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-header > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-thead > tr > th,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-thead > tr > th {
  background-color: transparent;
  border-bottom: 1px solid #e8e8e8;
}
.ant-table-small > .ant-table-content > .ant-table-header > table > .ant-table-thead > tr > th.ant-table-column-sort,
.ant-table-small > .ant-table-content > .ant-table-body > table > .ant-table-thead > tr > th.ant-table-column-sort,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-header > table > .ant-table-thead > tr > th.ant-table-column-sort,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-body > table > .ant-table-thead > tr > th.ant-table-column-sort,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-header > table > .ant-table-thead > tr > th.ant-table-column-sort,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-header > table > .ant-table-thead > tr > th.ant-table-column-sort,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-thead > tr > th.ant-table-column-sort,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-body-outer > .ant-table-body-inner > table > .ant-table-thead > tr > th.ant-table-column-sort {
  background-color: rgba(0, 0, 0, 0.01);
}
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-header > table,
.ant-table-small > .ant-table-content > .ant-table-scroll > .ant-table-body > table,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-header > table,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-header > table,
.ant-table-small > .ant-table-content > .ant-table-fixed-left > .ant-table-body-outer > .ant-table-body-inner > table,
.ant-table-small > .ant-table-content > .ant-table-fixed-right > .ant-table-body-outer > .ant-table-body-inner > table {
  padding: 0;
}
.ant-table-small > .ant-table-content .ant-table-header {
  background-color: #fff;
}
.ant-table-small > .ant-table-content .ant-table-placeholder,
.ant-table-small > .ant-table-content .ant-table-row:last-child td {
  border-bottom: 0;
}
.ant-table-small.ant-table-bordered {
  border-right: 0;
}
.ant-table-small.ant-table-bordered .ant-table-title {
  border: 0;
  border-bottom: 1px solid #e8e8e8;
  border-right: 1px solid #e8e8e8;
}
.ant-table-small.ant-table-bordered .ant-table-content {
  border-right: 1px solid #e8e8e8;
}
.ant-table-small.ant-table-bordered .ant-table-footer {
  border: 0;
  border-top: 1px solid #e8e8e8;
  border-right: 1px solid #e8e8e8;
}
.ant-table-small.ant-table-bordered .ant-table-footer:before {
  display: none;
}
.ant-table-small.ant-table-bordered .ant-table-placeholder {
  border-left: 0;
  border-bottom: 0;
  border-right: 0;
}
.ant-table-small.ant-table-bordered .ant-table-thead > tr > th:last-child,
.ant-table-small.ant-table-bordered .ant-table-tbody > tr > td:last-child {
  border-right: none;
}
.ant-table-small.ant-table-bordered .ant-table-fixed-left .ant-table-thead > tr > th:last-child,
.ant-table-small.ant-table-bordered .ant-table-fixed-left .ant-table-tbody > tr > td:last-child {
  border-right: 1px solid #e8e8e8;
}
.ant-table-small.ant-table-bordered .ant-table-fixed-right {
  border-left: 1px solid #e8e8e8;
  border-right: 1px solid #e8e8e8;
}
.ant-table-small tr.ant-table-expanded-row td > .ant-table-wrapper {
  margin: -8px -16px -9px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-radio-group {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  display: inline-block;
  line-height: unset;
}
.ant-radio-wrapper {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  display: inline-block;
  position: relative;
  white-space: nowrap;
  margin-right: 8px;
  cursor: pointer;
}
.ant-radio {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  white-space: nowrap;
  outline: none;
  display: inline-block;
  position: relative;
  line-height: 1;
  vertical-align: sub;
  cursor: pointer;
}
.ant-radio-wrapper:hover .ant-radio,
.ant-radio:hover .ant-radio-inner,
.ant-radio-input:focus + .ant-radio-inner {
  border-color: #1890ff;
}
.ant-radio-input:focus + .ant-radio-inner {
  -webkit-box-shadow: 0 0 0 3px rgba(24, 144, 255, 0.08);
          box-shadow: 0 0 0 3px rgba(24, 144, 255, 0.08);
}
.ant-radio-checked:after {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  border-radius: 50%;
  border: 1px solid #1890ff;
  content: '';
  -webkit-animation: antRadioEffect 0.36s ease-in-out;
          animation: antRadioEffect 0.36s ease-in-out;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  visibility: hidden;
}
.ant-radio:hover:after,
.ant-radio-wrapper:hover .ant-radio:after {
  visibility: visible;
}
.ant-radio-inner {
  position: relative;
  top: 0;
  left: 0;
  display: block;
  width: 16px;
  height: 16px;
  border-width: 1px;
  border-style: solid;
  border-radius: 100px;
  border-color: #d9d9d9;
  background-color: #fff;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-radio-inner:after {
  position: absolute;
  width: 8px;
  height: 8px;
  left: 3px;
  top: 3px;
  border-radius: 8px;
  display: table;
  border-top: 0;
  border-left: 0;
  content: ' ';
  background-color: #1890ff;
  opacity: 0;
  -webkit-transform: scale(0);
          transform: scale(0);
  -webkit-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.ant-radio-input {
  position: absolute;
  left: 0;
  z-index: 1;
  cursor: pointer;
  opacity: 0;
  top: 0;
  bottom: 0;
  right: 0;
}
.ant-radio-checked .ant-radio-inner {
  border-color: #1890ff;
}
.ant-radio-checked .ant-radio-inner:after {
  -webkit-transform: scale(0.875);
          transform: scale(0.875);
  opacity: 1;
  -webkit-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.ant-radio-disabled .ant-radio-inner {
  border-color: #d9d9d9 !important;
  background-color: #f5f5f5;
  cursor: not-allowed;
}
.ant-radio-disabled .ant-radio-inner:after {
  background-color: rgba(0, 0, 0, 0.2);
}
.ant-radio-disabled .ant-radio-input {
  cursor: not-allowed;
}
.ant-radio-disabled + span {
  color: rgba(0, 0, 0, 0.25);
  cursor: not-allowed;
}
span.ant-radio + * {
  padding-left: 8px;
  padding-right: 8px;
}
.ant-radio-button-wrapper {
  margin: 0;
  height: 32px;
  line-height: 30px;
  color: rgba(0, 0, 0, 0.65);
  display: inline-block;
  -webkit-transition: color 0.3s, background 0.3s, border-color 0.3s;
  -o-transition: color 0.3s, background 0.3s, border-color 0.3s;
  transition: color 0.3s, background 0.3s, border-color 0.3s;
  cursor: pointer;
  border: 1px solid #d9d9d9;
  border-left: 0;
  border-top-width: 1.02px;
  background: #fff;
  padding: 0 15px;
  position: relative;
}
.ant-radio-button-wrapper a {
  color: rgba(0, 0, 0, 0.65);
}
.ant-radio-button-wrapper > .ant-radio-button {
  margin-left: 0;
  display: block;
  width: 0;
  height: 0;
}
.ant-radio-group-large .ant-radio-button-wrapper {
  height: 40px;
  line-height: 38px;
  font-size: 16px;
}
.ant-radio-group-small .ant-radio-button-wrapper {
  height: 24px;
  line-height: 22px;
  padding: 0 7px;
}
.ant-radio-button-wrapper:not(:first-child)::before {
  content: '';
  display: block;
  top: 0;
  left: -1px;
  width: 1px;
  height: 100%;
  position: absolute;
  background-color: #d9d9d9;
}
.ant-radio-button-wrapper:first-child {
  border-radius: 4px 0 0 4px;
  border-left: 1px solid #d9d9d9;
}
.ant-radio-button-wrapper:last-child {
  border-radius: 0 4px 4px 0;
}
.ant-radio-button-wrapper:first-child:last-child {
  border-radius: 4px;
}
.ant-radio-button-wrapper:hover {
  color: #1890ff;
  position: relative;
}
.ant-radio-button-wrapper:focus-within {
  outline: 3px solid rgba(24, 144, 255, 0.06);
}
.ant-radio-button-wrapper .ant-radio-inner,
.ant-radio-button-wrapper input[type='checkbox'],
.ant-radio-button-wrapper input[type='radio'] {
  opacity: 0;
  width: 0;
  height: 0;
  pointer-events: none;
}
.ant-radio-button-wrapper-checked {
  background: #fff;
  border-color: #1890ff;
  color: #1890ff;
  -webkit-box-shadow: -1px 0 0 0 #1890ff;
          box-shadow: -1px 0 0 0 #1890ff;
  z-index: 1;
}
.ant-radio-button-wrapper-checked::before {
  background-color: #1890ff !important;
  opacity: 0.1;
}
.ant-radio-button-wrapper-checked:first-child {
  border-color: #1890ff;
  -webkit-box-shadow: none !important;
          box-shadow: none !important;
}
.ant-radio-button-wrapper-checked:hover {
  border-color: #40a9ff;
  -webkit-box-shadow: -1px 0 0 0 #40a9ff;
          box-shadow: -1px 0 0 0 #40a9ff;
  color: #40a9ff;
}
.ant-radio-button-wrapper-checked:active {
  border-color: #096dd9;
  -webkit-box-shadow: -1px 0 0 0 #096dd9;
          box-shadow: -1px 0 0 0 #096dd9;
  color: #096dd9;
}
.ant-radio-button-wrapper-checked:focus-within {
  outline: 3px solid rgba(24, 144, 255, 0.06);
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled) {
  background: #1890ff;
  border-color: #1890ff;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):hover {
  border-color: #40a9ff;
  background: #40a9ff;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):active {
  border-color: #096dd9;
  background: #096dd9;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):focus-within {
  outline: 3px solid rgba(24, 144, 255, 0.06);
}
.ant-radio-button-wrapper-disabled {
  border-color: #d9d9d9;
  background-color: #f5f5f5;
  cursor: not-allowed;
  color: rgba(0, 0, 0, 0.25);
}
.ant-radio-button-wrapper-disabled:first-child,
.ant-radio-button-wrapper-disabled:hover {
  border-color: #d9d9d9;
  background-color: #f5f5f5;
  color: rgba(0, 0, 0, 0.25);
}
.ant-radio-button-wrapper-disabled:first-child {
  border-left-color: #d9d9d9;
}
.ant-radio-button-wrapper-disabled.ant-radio-button-wrapper-checked {
  color: #fff;
  background-color: #e6e6e6;
  border-color: #d9d9d9;
  -webkit-box-shadow: none;
          box-shadow: none;
}
@-webkit-keyframes antRadioEffect {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1.6);
            transform: scale(1.6);
    opacity: 0;
  }
}
@keyframes antRadioEffect {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1.6);
            transform: scale(1.6);
    opacity: 0;
  }
}
@supports (-moz-appearance: meterbar) and (background-blend-mode: difference, normal) {
  .ant-radio {
    vertical-align: text-bottom;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
@-webkit-keyframes antCheckboxEffect {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1.6);
            transform: scale(1.6);
    opacity: 0;
  }
}
@keyframes antCheckboxEffect {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1.6);
            transform: scale(1.6);
    opacity: 0;
  }
}
.ant-checkbox {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  white-space: nowrap;
  cursor: pointer;
  outline: none;
  display: inline-block;
  line-height: 1;
  position: relative;
  vertical-align: middle;
  top: -0.09em;
}
.ant-checkbox-wrapper:hover .ant-checkbox-inner,
.ant-checkbox:hover .ant-checkbox-inner,
.ant-checkbox-input:focus + .ant-checkbox-inner {
  border-color: #1890ff;
}
.ant-checkbox-checked:after {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  border-radius: 2px;
  border: 1px solid #1890ff;
  content: '';
  -webkit-animation: antCheckboxEffect 0.36s ease-in-out;
          animation: antCheckboxEffect 0.36s ease-in-out;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  visibility: hidden;
}
.ant-checkbox:hover:after,
.ant-checkbox-wrapper:hover .ant-checkbox:after {
  visibility: visible;
}
.ant-checkbox-inner {
  position: relative;
  top: 0;
  left: 0;
  display: block;
  width: 16px;
  height: 16px;
  border: 1px solid #d9d9d9;
  border-radius: 2px;
  background-color: #fff;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  border-collapse: separate;
}
.ant-checkbox-inner:after {
  -webkit-transform: rotate(45deg) scale(0) translate(-50%, -50%);
          transform: rotate(45deg) scale(0) translate(-50%, -50%);
  position: absolute;
  top: 50%;
  left: 21%;
  display: table;
  width: 5.71428571px;
  height: 9.14285714px;
  border: 2px solid #fff;
  border-top: 0;
  border-left: 0;
  content: ' ';
  -webkit-transition: all 0.1s cubic-bezier(0.71, -0.46, 0.88, 0.6), opacity 0.1s;
  -o-transition: all 0.1s cubic-bezier(0.71, -0.46, 0.88, 0.6), opacity 0.1s;
  transition: all 0.1s cubic-bezier(0.71, -0.46, 0.88, 0.6), opacity 0.1s;
  opacity: 0;
}
.ant-checkbox-input {
  position: absolute;
  left: 0;
  z-index: 1;
  cursor: pointer;
  opacity: 0;
  top: 0;
  bottom: 0;
  right: 0;
  width: 100%;
  height: 100%;
}
.ant-checkbox-checked .ant-checkbox-inner:after {
  -webkit-transform: rotate(45deg) scale(1) translate(-50%, -50%);
          transform: rotate(45deg) scale(1) translate(-50%, -50%);
  position: absolute;
  display: table;
  border: 2px solid #fff;
  border-top: 0;
  border-left: 0;
  content: ' ';
  -webkit-transition: all 0.2s cubic-bezier(0.12, 0.4, 0.29, 1.46) 0.1s;
  -o-transition: all 0.2s cubic-bezier(0.12, 0.4, 0.29, 1.46) 0.1s;
  transition: all 0.2s cubic-bezier(0.12, 0.4, 0.29, 1.46) 0.1s;
  opacity: 1;
}
.ant-checkbox-checked .ant-checkbox-inner {
  background-color: #1890ff;
  border-color: #1890ff;
}
.ant-checkbox-disabled {
  cursor: not-allowed;
}
.ant-checkbox-disabled.ant-checkbox-checked .ant-checkbox-inner:after {
  -webkit-animation-name: none;
          animation-name: none;
  border-color: rgba(0, 0, 0, 0.25);
}
.ant-checkbox-disabled .ant-checkbox-input {
  cursor: not-allowed;
}
.ant-checkbox-disabled .ant-checkbox-inner {
  border-color: #d9d9d9 !important;
  background-color: #f5f5f5;
}
.ant-checkbox-disabled .ant-checkbox-inner:after {
  -webkit-animation-name: none;
          animation-name: none;
  border-color: #f5f5f5;
  border-collapse: separate;
}
.ant-checkbox-disabled + span {
  color: rgba(0, 0, 0, 0.25);
  cursor: not-allowed;
}
.ant-checkbox-wrapper {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  line-height: unset;
  cursor: pointer;
  display: inline-block;
}
.ant-checkbox-wrapper + .ant-checkbox-wrapper {
  margin-left: 8px;
}
.ant-checkbox-wrapper + span,
.ant-checkbox + span {
  padding-left: 8px;
  padding-right: 8px;
}
.ant-checkbox-group {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  display: inline-block;
}
.ant-checkbox-group-item {
  display: inline-block;
  margin-right: 8px;
}
.ant-checkbox-group-item:last-child {
  margin-right: 0;
}
.ant-checkbox-group-item + .ant-checkbox-group-item {
  margin-left: 0;
}
.ant-checkbox-indeterminate .ant-checkbox-inner {
  background-color: #fff;
  border-color: #d9d9d9;
}
.ant-checkbox-indeterminate .ant-checkbox-inner:after {
  content: ' ';
  -webkit-transform: translate(-50%, -50%) scale(1);
          transform: translate(-50%, -50%) scale(1);
  border: 0;
  left: 50%;
  top: 50%;
  width: 8px;
  height: 8px;
  background-color: #1890ff;
  opacity: 1;
}
.ant-checkbox-indeterminate.ant-checkbox-disabled .ant-checkbox-inner:after {
  border-color: rgba(0, 0, 0, 0.25);
  background-color: rgba(0, 0, 0, 0.25);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-spin {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  color: #1890ff;
  vertical-align: middle;
  text-align: center;
  opacity: 0;
  position: absolute;
  -webkit-transition: -webkit-transform 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: -webkit-transform 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: transform 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: transform 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: transform 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86), -webkit-transform 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  display: none;
}
.ant-spin-spinning {
  opacity: 1;
  position: static;
  display: inline-block;
}
.ant-spin-nested-loading {
  position: relative;
}
.ant-spin-nested-loading > div > .ant-spin {
  display: block;
  position: absolute;
  height: 100%;
  max-height: 400px;
  width: 100%;
  z-index: 4;
}
.ant-spin-nested-loading > div > .ant-spin .ant-spin-dot {
  position: absolute;
  top: 50%;
  left: 50%;
  margin: -10px;
}
.ant-spin-nested-loading > div > .ant-spin .ant-spin-text {
  position: absolute;
  top: 50%;
  width: 100%;
  padding-top: 5px;
  text-shadow: 0 1px 2px #fff;
}
.ant-spin-nested-loading > div > .ant-spin.ant-spin-show-text .ant-spin-dot {
  margin-top: -20px;
}
.ant-spin-nested-loading > div > .ant-spin-sm .ant-spin-dot {
  margin: -7px;
}
.ant-spin-nested-loading > div > .ant-spin-sm .ant-spin-text {
  padding-top: 2px;
}
.ant-spin-nested-loading > div > .ant-spin-sm.ant-spin-show-text .ant-spin-dot {
  margin-top: -17px;
}
.ant-spin-nested-loading > div > .ant-spin-lg .ant-spin-dot {
  margin: -16px;
}
.ant-spin-nested-loading > div > .ant-spin-lg .ant-spin-text {
  padding-top: 11px;
}
.ant-spin-nested-loading > div > .ant-spin-lg.ant-spin-show-text .ant-spin-dot {
  margin-top: -26px;
}
.ant-spin-container {
  position: relative;
  -webkit-transition: opacity 0.3s;
  -o-transition: opacity 0.3s;
  transition: opacity 0.3s;
}
.ant-spin-container:after {
  content: '';
  position: absolute;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  background: #fff;
  opacity: 0;
  pointer-events: none;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  height: 100%;
  width: 100%;
  z-index: 10;
  display: none \9;
}
.ant-spin-blur {
  pointer-events: none;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  overflow: hidden;
  opacity: 0.5;
}
.ant-spin-blur:after {
  opacity: 0.4;
  pointer-events: auto;
}
.ant-spin-tip {
  color: rgba(0, 0, 0, 0.45);
}
.ant-spin-dot {
  position: relative;
  display: inline-block;
  font-size: 20px;
  width: 20px;
  height: 20px;
}
.ant-spin-dot i {
  width: 9px;
  height: 9px;
  border-radius: 100%;
  background-color: #1890ff;
  -webkit-transform: scale(0.75);
          transform: scale(0.75);
  display: block;
  position: absolute;
  opacity: 0.3;
  -webkit-animation: antSpinMove 1s infinite linear alternate;
          animation: antSpinMove 1s infinite linear alternate;
  -webkit-transform-origin: 50% 50%;
          transform-origin: 50% 50%;
}
.ant-spin-dot i:nth-child(1) {
  left: 0;
  top: 0;
}
.ant-spin-dot i:nth-child(2) {
  right: 0;
  top: 0;
  -webkit-animation-delay: 0.4s;
          animation-delay: 0.4s;
}
.ant-spin-dot i:nth-child(3) {
  right: 0;
  bottom: 0;
  -webkit-animation-delay: 0.8s;
          animation-delay: 0.8s;
}
.ant-spin-dot i:nth-child(4) {
  left: 0;
  bottom: 0;
  -webkit-animation-delay: 1.2s;
          animation-delay: 1.2s;
}
.ant-spin-dot-spin {
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
  -webkit-animation: antRotate 1.2s infinite linear;
          animation: antRotate 1.2s infinite linear;
}
.ant-spin-sm .ant-spin-dot {
  font-size: 14px;
  width: 14px;
  height: 14px;
}
.ant-spin-sm .ant-spin-dot i {
  width: 6px;
  height: 6px;
}
.ant-spin-lg .ant-spin-dot {
  font-size: 32px;
  width: 32px;
  height: 32px;
}
.ant-spin-lg .ant-spin-dot i {
  width: 14px;
  height: 14px;
}
.ant-spin.ant-spin-show-text .ant-spin-text {
  display: block;
}
@media all and (-ms-high-contrast: none), (-ms-high-contrast: active) {
  /* IE10+ */
  .ant-spin-blur {
    background: #fff;
    opacity: 0.5;
  }
}
@-webkit-keyframes antSpinMove {
  to {
    opacity: 1;
  }
}
@keyframes antSpinMove {
  to {
    opacity: 1;
  }
}
@-webkit-keyframes antRotate {
  to {
    -webkit-transform: rotate(405deg);
            transform: rotate(405deg);
  }
}
@keyframes antRotate {
  to {
    -webkit-transform: rotate(405deg);
            transform: rotate(405deg);
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-pagination {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
}
.ant-pagination ul,
.ant-pagination ol {
  margin: 0;
  padding: 0;
  list-style: none;
}
.ant-pagination:after {
  content: ' ';
  display: block;
  height: 0;
  clear: both;
  overflow: hidden;
  visibility: hidden;
}
.ant-pagination-total-text {
  display: inline-block;
  vertical-align: middle;
  height: 32px;
  line-height: 30px;
  margin-right: 8px;
}
.ant-pagination-item {
  cursor: pointer;
  border-radius: 4px;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  min-width: 32px;
  height: 32px;
  line-height: 30px;
  text-align: center;
  list-style: none;
  display: inline-block;
  vertical-align: middle;
  border: 1px solid #d9d9d9;
  background-color: #fff;
  margin-right: 8px;
  font-family: Arial;
  outline: 0;
}
.ant-pagination-item a {
  text-decoration: none;
  color: rgba(0, 0, 0, 0.65);
  -webkit-transition: none;
  -o-transition: none;
  transition: none;
  margin: 0 6px;
}
.ant-pagination-item:focus,
.ant-pagination-item:hover {
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  border-color: #1890ff;
}
.ant-pagination-item:focus a,
.ant-pagination-item:hover a {
  color: #1890ff;
}
.ant-pagination-item-active {
  border-color: #1890ff;
  font-weight: 500;
}
.ant-pagination-item-active a {
  color: #1890ff;
}
.ant-pagination-item-active:focus,
.ant-pagination-item-active:hover {
  border-color: #40a9ff;
}
.ant-pagination-item-active:focus a,
.ant-pagination-item-active:hover a {
  color: #40a9ff;
}
.ant-pagination-jump-prev,
.ant-pagination-jump-next {
  outline: 0;
}
.ant-pagination-jump-prev .ant-pagination-item-container,
.ant-pagination-jump-next .ant-pagination-item-container {
  position: relative;
}
.ant-pagination-jump-prev .ant-pagination-item-container .ant-pagination-item-link-icon,
.ant-pagination-jump-next .ant-pagination-item-container .ant-pagination-item-link-icon {
  display: inline-block;
  font-size: 12px;
  font-size: 12px \9;
  -webkit-transform: scale(1) rotate(0deg);
          transform: scale(1) rotate(0deg);
  color: #1890ff;
  letter-spacing: -1px;
  opacity: 0;
  -webkit-transition: all 0.2s;
  -o-transition: all 0.2s;
  transition: all 0.2s;
}
:root .ant-pagination-jump-prev .ant-pagination-item-container .ant-pagination-item-link-icon,
:root .ant-pagination-jump-next .ant-pagination-item-container .ant-pagination-item-link-icon {
  font-size: 12px;
}
.ant-pagination-jump-prev .ant-pagination-item-container .ant-pagination-item-link-icon-svg,
.ant-pagination-jump-next .ant-pagination-item-container .ant-pagination-item-link-icon-svg {
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  margin: auto;
}
.ant-pagination-jump-prev .ant-pagination-item-container .ant-pagination-item-ellipsis,
.ant-pagination-jump-next .ant-pagination-item-container .ant-pagination-item-ellipsis {
  position: absolute;
  display: block;
  letter-spacing: 2px;
  text-indent: 0.13em;
  color: rgba(0, 0, 0, 0.25);
  text-align: center;
  opacity: 1;
  -webkit-transition: all 0.2s;
  -o-transition: all 0.2s;
  transition: all 0.2s;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  margin: auto;
}
.ant-pagination-jump-prev:focus .ant-pagination-item-link-icon,
.ant-pagination-jump-next:focus .ant-pagination-item-link-icon,
.ant-pagination-jump-prev:hover .ant-pagination-item-link-icon,
.ant-pagination-jump-next:hover .ant-pagination-item-link-icon {
  opacity: 1;
}
.ant-pagination-jump-prev:focus .ant-pagination-item-ellipsis,
.ant-pagination-jump-next:focus .ant-pagination-item-ellipsis,
.ant-pagination-jump-prev:hover .ant-pagination-item-ellipsis,
.ant-pagination-jump-next:hover .ant-pagination-item-ellipsis {
  opacity: 0;
}
.ant-pagination-prev,
.ant-pagination-jump-prev,
.ant-pagination-jump-next {
  margin-right: 8px;
}
.ant-pagination-prev,
.ant-pagination-next,
.ant-pagination-jump-prev,
.ant-pagination-jump-next {
  font-family: Arial;
  cursor: pointer;
  color: rgba(0, 0, 0, 0.65);
  border-radius: 4px;
  list-style: none;
  min-width: 32px;
  height: 32px;
  line-height: 32px;
  text-align: center;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  display: inline-block;
  vertical-align: middle;
}
.ant-pagination-prev,
.ant-pagination-next {
  outline: 0;
}
.ant-pagination-prev a,
.ant-pagination-next a {
  color: rgba(0, 0, 0, 0.65);
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.ant-pagination-prev:hover a,
.ant-pagination-next:hover a {
  border-color: #40a9ff;
}
.ant-pagination-prev .ant-pagination-item-link,
.ant-pagination-next .ant-pagination-item-link {
  border: 1px solid #d9d9d9;
  background-color: #fff;
  border-radius: 4px;
  outline: none;
  display: block;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  font-size: 12px;
  height: 100%;
  text-align: center;
}
.ant-pagination-prev:focus .ant-pagination-item-link,
.ant-pagination-next:focus .ant-pagination-item-link,
.ant-pagination-prev:hover .ant-pagination-item-link,
.ant-pagination-next:hover .ant-pagination-item-link {
  border-color: #1890ff;
  color: #1890ff;
}
.ant-pagination-disabled,
.ant-pagination-disabled:hover,
.ant-pagination-disabled:focus {
  cursor: not-allowed;
}
.ant-pagination-disabled a,
.ant-pagination-disabled:hover a,
.ant-pagination-disabled:focus a,
.ant-pagination-disabled .ant-pagination-item-link,
.ant-pagination-disabled:hover .ant-pagination-item-link,
.ant-pagination-disabled:focus .ant-pagination-item-link {
  border-color: #d9d9d9;
  color: rgba(0, 0, 0, 0.25);
  cursor: not-allowed;
}
.ant-pagination-slash {
  margin: 0 10px 0 5px;
}
.ant-pagination-options {
  display: inline-block;
  vertical-align: middle;
  margin-left: 16px;
}
.ant-pagination-options-size-changer.ant-select {
  display: inline-block;
  width: auto;
  margin-right: 8px;
}
.ant-pagination-options-quick-jumper {
  display: inline-block;
  vertical-align: top;
  height: 32px;
  line-height: 32px;
}
.ant-pagination-options-quick-jumper input {
  position: relative;
  display: inline-block;
  padding: 4px 11px;
  width: 100%;
  height: 32px;
  font-size: 14px;
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  background-color: #fff;
  background-image: none;
  border: 1px solid #d9d9d9;
  border-radius: 4px;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
  margin: 0 8px;
  width: 50px;
}
.ant-pagination-options-quick-jumper input::-moz-placeholder {
  color: #bfbfbf;
  opacity: 1;
}
.ant-pagination-options-quick-jumper input:-ms-input-placeholder {
  color: #bfbfbf;
}
.ant-pagination-options-quick-jumper input::-webkit-input-placeholder {
  color: #bfbfbf;
}
.ant-pagination-options-quick-jumper input:hover {
  border-color: #40a9ff;
  border-right-width: 1px !important;
}
.ant-pagination-options-quick-jumper input:focus {
  border-color: #40a9ff;
  outline: 0;
  -webkit-box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
          box-shadow: 0 0 0 2px rgba(24, 144, 255, 0.2);
  border-right-width: 1px !important;
}
.ant-pagination-options-quick-jumper input-disabled {
  background-color: #f5f5f5;
  opacity: 1;
  cursor: not-allowed;
  color: rgba(0, 0, 0, 0.25);
}
.ant-pagination-options-quick-jumper input-disabled:hover {
  border-color: #e6d8d8;
  border-right-width: 1px !important;
}
textarea.ant-pagination-options-quick-jumper input {
  max-width: 100%;
  height: auto;
  vertical-align: bottom;
  -webkit-transition: all 0.3s, height 0s;
  -o-transition: all 0.3s, height 0s;
  transition: all 0.3s, height 0s;
  min-height: 32px;
}
.ant-pagination-options-quick-jumper input-lg {
  padding: 6px 11px;
  height: 40px;
  font-size: 16px;
}
.ant-pagination-options-quick-jumper input-sm {
  padding: 1px 7px;
  height: 24px;
}
.ant-pagination-simple .ant-pagination-prev,
.ant-pagination-simple .ant-pagination-next {
  height: 24px;
  line-height: 24px;
  vertical-align: top;
}
.ant-pagination-simple .ant-pagination-prev .ant-pagination-item-link,
.ant-pagination-simple .ant-pagination-next .ant-pagination-item-link {
  border: 0;
  height: 24px;
}
.ant-pagination-simple .ant-pagination-prev .ant-pagination-item-link:after,
.ant-pagination-simple .ant-pagination-next .ant-pagination-item-link:after {
  height: 24px;
  line-height: 24px;
}
.ant-pagination-simple .ant-pagination-simple-pager {
  display: inline-block;
  margin-right: 8px;
  height: 24px;
}
.ant-pagination-simple .ant-pagination-simple-pager input {
  margin-right: 8px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  background-color: #fff;
  border-radius: 4px;
  border: 1px solid #d9d9d9;
  outline: none;
  padding: 0 6px;
  height: 100%;
  text-align: center;
  -webkit-transition: border-color 0.3s;
  -o-transition: border-color 0.3s;
  transition: border-color 0.3s;
}
.ant-pagination-simple .ant-pagination-simple-pager input:hover {
  border-color: #1890ff;
}
.ant-pagination.mini .ant-pagination-total-text,
.ant-pagination.mini .ant-pagination-simple-pager {
  height: 24px;
  line-height: 24px;
}
.ant-pagination.mini .ant-pagination-item {
  margin: 0;
  min-width: 24px;
  height: 24px;
  line-height: 22px;
}
.ant-pagination.mini .ant-pagination-item:not(.ant-pagination-item-active) {
  background: transparent;
  border-color: transparent;
}
.ant-pagination.mini .ant-pagination-prev,
.ant-pagination.mini .ant-pagination-next {
  margin: 0;
  min-width: 24px;
  height: 24px;
  line-height: 24px;
}
.ant-pagination.mini .ant-pagination-prev .ant-pagination-item-link,
.ant-pagination.mini .ant-pagination-next .ant-pagination-item-link {
  border-color: transparent;
  background: transparent;
}
.ant-pagination.mini .ant-pagination-prev .ant-pagination-item-link:after,
.ant-pagination.mini .ant-pagination-next .ant-pagination-item-link:after {
  height: 24px;
  line-height: 24px;
}
.ant-pagination.mini .ant-pagination-jump-prev,
.ant-pagination.mini .ant-pagination-jump-next {
  height: 24px;
  line-height: 24px;
  margin-right: 0;
}
.ant-pagination.mini .ant-pagination-options {
  margin-left: 2px;
}
.ant-pagination.mini .ant-pagination-options-quick-jumper {
  height: 24px;
  line-height: 24px;
}
.ant-pagination.mini .ant-pagination-options-quick-jumper input {
  padding: 1px 7px;
  height: 24px;
  width: 44px;
}
@media only screen and (max-width: 992px) {
  .ant-pagination-item-after-jump-prev,
  .ant-pagination-item-before-jump-next {
    display: none;
  }
}
@media only screen and (max-width: 576px) {
  .ant-pagination-options {
    display: none;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-table {
  font-family: inherit;
}
.ant-table-thead > tr:first-child > th {
  border-top: 1px solid #eeeeee;
}
.ant-table-thead > tr:first-child > th:first-child {
  border-top-left-radius: 0;
}
.ant-table-thead > tr:first-child > th:last-child {
  border-top-right-radius: 0;
}
.ant-table-thead > tr > th {
  padding: 13px;
  border-bottom: 1px solid #eeeeee;
  border-right: 1px solid #eeeeee;
  background: white;
  color: #212121;
  font-weight: 400;
}
.ant-table-thead > tr > th:first-child {
  border-left: 1px solid #eeeeee;
}
.ant-table-thead > tr > th.ant-table-column-sort {
  background: white;
}
.ant-table-thead > tr > th.ant-table-column-has-filters {
  cursor: pointer;
}
.ant-table-thead > tr > th.ant-table-column-has-filters:hover {
  background: #eeeeee;
}
.ant-table-thead > tr > th.ant-table-column-has-filters:hover .ant-table-column-sorter-down.off .anticon,
.ant-table-thead > tr > th.ant-table-column-has-filters:hover .ant-table-column-sorter-up.off .anticon {
  color: #546e7a;
}
.ant-table-thead > tr > th.ant-table-column-has-filters > span {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.ant-table .ant-table-tbody > tr > td {
  padding: 13px;
  border-bottom: 1px solid #eeeeee;
  border-right: 1px solid #eeeeee;
  color: #424242;
}
.ant-table .ant-table-tbody > tr > td:first-child {
  border-left: 1px solid #eeeeee;
}
.ant-table .ant-table-tbody > tr:nth-child(2n) > td {
  background: white;
}
.ant-table .ant-table-tbody > tr:nth-child(2n + 1) > td {
  background: #fafafa;
}
.ant-table-column-sorter {
  margin-right: 8px;
}
.ant-table-column-sorter-up {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  line-height: 14px;
  height: 14px;
}
.ant-table-column-sorter-up:hover .anticon {
  color: inherit;
}
.ant-table-column-sorter-up.on .anticon {
  color: #263238;
}
.ant-table-column-sorter-up.off .anticon {
  color: #cfd8dc;
}
.ant-table-column-sorter-up .anticon {
  font-size: 28px !important;
}
.ant-table-column-sorter-up .anticon::before {
  font-family: LcIconFont, sans-serif !important;
  content: '\E91D';
}
.ant-table-column-sorter-down {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  line-height: 14px;
  height: 14px;
  margin-top: -14px;
}
.ant-table-column-sorter-down:hover .anticon {
  color: inherit;
}
.ant-table-column-sorter-down.on .anticon {
  color: #263238;
}
.ant-table-column-sorter-down.off .anticon {
  color: #cfd8dc;
}
.ant-table-column-sorter-down .anticon {
  font-size: 28px !important;
}
.ant-table-column-sorter-down .anticon::before {
  font-family: LcIconFont, sans-serif !important;
  content: '\E91E';
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-radio-group {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  display: inline-block;
  line-height: unset;
}
.ant-radio-wrapper {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  display: inline-block;
  position: relative;
  white-space: nowrap;
  margin-right: 8px;
  cursor: pointer;
}
.ant-radio {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  white-space: nowrap;
  outline: none;
  display: inline-block;
  position: relative;
  line-height: 1;
  vertical-align: sub;
  cursor: pointer;
}
.ant-radio-wrapper:hover .ant-radio,
.ant-radio:hover .ant-radio-inner,
.ant-radio-input:focus + .ant-radio-inner {
  border-color: #78909c;
}
.ant-radio-input:focus + .ant-radio-inner {
  -webkit-box-shadow: 0 0 0 3px rgba(120, 144, 156, 0.08);
          box-shadow: 0 0 0 3px rgba(120, 144, 156, 0.08);
}
.ant-radio-checked:after {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  border-radius: 50%;
  border: 1px solid #78909c;
  content: '';
  -webkit-animation: antRadioEffect 0.36s ease-in-out;
          animation: antRadioEffect 0.36s ease-in-out;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  visibility: hidden;
}
.ant-radio:hover:after,
.ant-radio-wrapper:hover .ant-radio:after {
  visibility: visible;
}
.ant-radio-inner {
  position: relative;
  top: 0;
  left: 0;
  display: block;
  width: 16px;
  height: 16px;
  border-width: 1px;
  border-style: solid;
  border-radius: 100px;
  border-color: #d9d9d9;
  background-color: #fff;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-radio-inner:after {
  position: absolute;
  width: 8px;
  height: 8px;
  left: 3px;
  top: 3px;
  border-radius: 8px;
  display: table;
  border-top: 0;
  border-left: 0;
  content: ' ';
  background-color: #78909c;
  opacity: 0;
  -webkit-transform: scale(0);
          transform: scale(0);
  -webkit-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.ant-radio-input {
  position: absolute;
  left: 0;
  z-index: 1;
  cursor: pointer;
  opacity: 0;
  top: 0;
  bottom: 0;
  right: 0;
}
.ant-radio-checked .ant-radio-inner {
  border-color: #78909c;
}
.ant-radio-checked .ant-radio-inner:after {
  -webkit-transform: scale(0.875);
          transform: scale(0.875);
  opacity: 1;
  -webkit-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.ant-radio-disabled .ant-radio-inner {
  border-color: #d9d9d9 !important;
  background-color: #f5f5f5;
  cursor: not-allowed;
}
.ant-radio-disabled .ant-radio-inner:after {
  background-color: rgba(0, 0, 0, 0.2);
}
.ant-radio-disabled .ant-radio-input {
  cursor: not-allowed;
}
.ant-radio-disabled + span {
  color: rgba(0, 0, 0, 0.25);
  cursor: not-allowed;
}
span.ant-radio + * {
  padding-left: 8px;
  padding-right: 8px;
}
.ant-radio-button-wrapper {
  margin: 0;
  height: 32px;
  line-height: 30px;
  color: rgba(0, 0, 0, 0.65);
  display: inline-block;
  -webkit-transition: color 0.3s, background 0.3s, border-color 0.3s;
  -o-transition: color 0.3s, background 0.3s, border-color 0.3s;
  transition: color 0.3s, background 0.3s, border-color 0.3s;
  cursor: pointer;
  border: 1px solid #d9d9d9;
  border-left: 0;
  border-top-width: 1.02px;
  background: #fff;
  padding: 0 15px;
  position: relative;
}
.ant-radio-button-wrapper a {
  color: rgba(0, 0, 0, 0.65);
}
.ant-radio-button-wrapper > .ant-radio-button {
  margin-left: 0;
  display: block;
  width: 0;
  height: 0;
}
.ant-radio-group-large .ant-radio-button-wrapper {
  height: 40px;
  line-height: 38px;
  font-size: 16px;
}
.ant-radio-group-small .ant-radio-button-wrapper {
  height: 24px;
  line-height: 22px;
  padding: 0 7px;
}
.ant-radio-button-wrapper:not(:first-child)::before {
  content: '';
  display: block;
  top: 0;
  left: -1px;
  width: 1px;
  height: 100%;
  position: absolute;
  background-color: #d9d9d9;
}
.ant-radio-button-wrapper:first-child {
  border-radius: 4px 0 0 4px;
  border-left: 1px solid #d9d9d9;
}
.ant-radio-button-wrapper:last-child {
  border-radius: 0 4px 4px 0;
}
.ant-radio-button-wrapper:first-child:last-child {
  border-radius: 4px;
}
.ant-radio-button-wrapper:hover {
  color: #78909c;
  position: relative;
}
.ant-radio-button-wrapper:focus-within {
  outline: 3px solid rgba(120, 144, 156, 0.06);
}
.ant-radio-button-wrapper .ant-radio-inner,
.ant-radio-button-wrapper input[type='checkbox'],
.ant-radio-button-wrapper input[type='radio'] {
  opacity: 0;
  width: 0;
  height: 0;
  pointer-events: none;
}
.ant-radio-button-wrapper-checked {
  background: #fff;
  border-color: #78909c;
  color: #78909c;
  -webkit-box-shadow: -1px 0 0 0 #78909c;
          box-shadow: -1px 0 0 0 #78909c;
  z-index: 1;
}
.ant-radio-button-wrapper-checked::before {
  background-color: #78909c !important;
  opacity: 0.1;
}
.ant-radio-button-wrapper-checked:first-child {
  border-color: #78909c;
  -webkit-box-shadow: none !important;
          box-shadow: none !important;
}
.ant-radio-button-wrapper-checked:hover {
  border-color: #9da5a8;
  -webkit-box-shadow: -1px 0 0 0 #9da5a8;
          box-shadow: -1px 0 0 0 #9da5a8;
  color: #9da5a8;
}
.ant-radio-button-wrapper-checked:active {
  border-color: #546975;
  -webkit-box-shadow: -1px 0 0 0 #546975;
          box-shadow: -1px 0 0 0 #546975;
  color: #546975;
}
.ant-radio-button-wrapper-checked:focus-within {
  outline: 3px solid rgba(120, 144, 156, 0.06);
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled) {
  background: #78909c;
  border-color: #78909c;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):hover {
  border-color: #9da5a8;
  background: #9da5a8;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):active {
  border-color: #546975;
  background: #546975;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):focus-within {
  outline: 3px solid rgba(120, 144, 156, 0.06);
}
.ant-radio-button-wrapper-disabled {
  border-color: #d9d9d9;
  background-color: #f5f5f5;
  cursor: not-allowed;
  color: rgba(0, 0, 0, 0.25);
}
.ant-radio-button-wrapper-disabled:first-child,
.ant-radio-button-wrapper-disabled:hover {
  border-color: #d9d9d9;
  background-color: #f5f5f5;
  color: rgba(0, 0, 0, 0.25);
}
.ant-radio-button-wrapper-disabled:first-child {
  border-left-color: #d9d9d9;
}
.ant-radio-button-wrapper-disabled.ant-radio-button-wrapper-checked {
  color: #fff;
  background-color: #e6e6e6;
  border-color: #d9d9d9;
  -webkit-box-shadow: none;
          box-shadow: none;
}
@-webkit-keyframes antRadioEffect {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1.6);
            transform: scale(1.6);
    opacity: 0;
  }
}
@keyframes antRadioEffect {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1.6);
            transform: scale(1.6);
    opacity: 0;
  }
}
@supports (-moz-appearance: meterbar) and (background-blend-mode: difference, normal) {
  .ant-radio {
    vertical-align: text-bottom;
  }
}
.ant-radio-wrapper {
  font-size: 16px;
  font-weight: normal;
  color: #212121;
  margin-right: 10px;
}
.ant-radio-wrapper > .ant-radio {
  display: none;
}
.ant-radio-wrapper > .ant-radio + span {
  padding: 0 10px 0 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  color: inherit;
}
.ant-radio-wrapper > .ant-radio + span::before {
  content: '\E91C';
  font-family: LcIconFont, 'anticon', sans-serif !important;
  font-size: 24px;
  margin-right: 10px;
  color: #546e7a;
  -webkit-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.ant-radio-wrapper > .ant-radio + span:hover::before {
  opacity: 0.8;
}
.ant-radio-wrapper > .ant-radio-checked + span::before {
  content: '\E91B';
}
.ant-radio-wrapper > .ant-radio-checked + span:hover::before {
  opacity: 1;
}
.ant-radio-wrapper > .ant-radio-disabled + span::before,
.ant-radio-wrapper > .ant-radio-disabled + span:hover::before {
  color: #cfd8dc;
  opacity: 1;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-radio-group {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  display: inline-block;
  line-height: unset;
}
.ant-radio-wrapper {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  display: inline-block;
  position: relative;
  white-space: nowrap;
  margin-right: 8px;
  cursor: pointer;
}
.ant-radio {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  white-space: nowrap;
  outline: none;
  display: inline-block;
  position: relative;
  line-height: 1;
  vertical-align: sub;
  cursor: pointer;
}
.ant-radio-wrapper:hover .ant-radio,
.ant-radio:hover .ant-radio-inner,
.ant-radio-input:focus + .ant-radio-inner {
  border-color: #78909c;
}
.ant-radio-input:focus + .ant-radio-inner {
  -webkit-box-shadow: 0 0 0 3px rgba(120, 144, 156, 0.08);
          box-shadow: 0 0 0 3px rgba(120, 144, 156, 0.08);
}
.ant-radio-checked:after {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  border-radius: 50%;
  border: 1px solid #78909c;
  content: '';
  -webkit-animation: antRadioEffect 0.36s ease-in-out;
          animation: antRadioEffect 0.36s ease-in-out;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  visibility: hidden;
}
.ant-radio:hover:after,
.ant-radio-wrapper:hover .ant-radio:after {
  visibility: visible;
}
.ant-radio-inner {
  position: relative;
  top: 0;
  left: 0;
  display: block;
  width: 16px;
  height: 16px;
  border-width: 1px;
  border-style: solid;
  border-radius: 100px;
  border-color: #d9d9d9;
  background-color: #fff;
  -webkit-transition: all 0.3s;
  -o-transition: all 0.3s;
  transition: all 0.3s;
}
.ant-radio-inner:after {
  position: absolute;
  width: 8px;
  height: 8px;
  left: 3px;
  top: 3px;
  border-radius: 8px;
  display: table;
  border-top: 0;
  border-left: 0;
  content: ' ';
  background-color: #78909c;
  opacity: 0;
  -webkit-transform: scale(0);
          transform: scale(0);
  -webkit-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.ant-radio-input {
  position: absolute;
  left: 0;
  z-index: 1;
  cursor: pointer;
  opacity: 0;
  top: 0;
  bottom: 0;
  right: 0;
}
.ant-radio-checked .ant-radio-inner {
  border-color: #78909c;
}
.ant-radio-checked .ant-radio-inner:after {
  -webkit-transform: scale(0.875);
          transform: scale(0.875);
  opacity: 1;
  -webkit-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
}
.ant-radio-disabled .ant-radio-inner {
  border-color: #d9d9d9 !important;
  background-color: #f5f5f5;
  cursor: not-allowed;
}
.ant-radio-disabled .ant-radio-inner:after {
  background-color: rgba(0, 0, 0, 0.2);
}
.ant-radio-disabled .ant-radio-input {
  cursor: not-allowed;
}
.ant-radio-disabled + span {
  color: rgba(0, 0, 0, 0.25);
  cursor: not-allowed;
}
span.ant-radio + * {
  padding-left: 8px;
  padding-right: 8px;
}
.ant-radio-button-wrapper {
  margin: 0;
  height: 32px;
  line-height: 30px;
  color: rgba(0, 0, 0, 0.65);
  display: inline-block;
  -webkit-transition: color 0.3s, background 0.3s, border-color 0.3s;
  -o-transition: color 0.3s, background 0.3s, border-color 0.3s;
  transition: color 0.3s, background 0.3s, border-color 0.3s;
  cursor: pointer;
  border: 1px solid #d9d9d9;
  border-left: 0;
  border-top-width: 1.02px;
  background: #fff;
  padding: 0 15px;
  position: relative;
}
.ant-radio-button-wrapper a {
  color: rgba(0, 0, 0, 0.65);
}
.ant-radio-button-wrapper > .ant-radio-button {
  margin-left: 0;
  display: block;
  width: 0;
  height: 0;
}
.ant-radio-group-large .ant-radio-button-wrapper {
  height: 40px;
  line-height: 38px;
  font-size: 16px;
}
.ant-radio-group-small .ant-radio-button-wrapper {
  height: 24px;
  line-height: 22px;
  padding: 0 7px;
}
.ant-radio-button-wrapper:not(:first-child)::before {
  content: '';
  display: block;
  top: 0;
  left: -1px;
  width: 1px;
  height: 100%;
  position: absolute;
  background-color: #d9d9d9;
}
.ant-radio-button-wrapper:first-child {
  border-radius: 4px 0 0 4px;
  border-left: 1px solid #d9d9d9;
}
.ant-radio-button-wrapper:last-child {
  border-radius: 0 4px 4px 0;
}
.ant-radio-button-wrapper:first-child:last-child {
  border-radius: 4px;
}
.ant-radio-button-wrapper:hover {
  color: #78909c;
  position: relative;
}
.ant-radio-button-wrapper:focus-within {
  outline: 3px solid rgba(120, 144, 156, 0.06);
}
.ant-radio-button-wrapper .ant-radio-inner,
.ant-radio-button-wrapper input[type='checkbox'],
.ant-radio-button-wrapper input[type='radio'] {
  opacity: 0;
  width: 0;
  height: 0;
  pointer-events: none;
}
.ant-radio-button-wrapper-checked {
  background: #fff;
  border-color: #78909c;
  color: #78909c;
  -webkit-box-shadow: -1px 0 0 0 #78909c;
          box-shadow: -1px 0 0 0 #78909c;
  z-index: 1;
}
.ant-radio-button-wrapper-checked::before {
  background-color: #78909c !important;
  opacity: 0.1;
}
.ant-radio-button-wrapper-checked:first-child {
  border-color: #78909c;
  -webkit-box-shadow: none !important;
          box-shadow: none !important;
}
.ant-radio-button-wrapper-checked:hover {
  border-color: #9da5a8;
  -webkit-box-shadow: -1px 0 0 0 #9da5a8;
          box-shadow: -1px 0 0 0 #9da5a8;
  color: #9da5a8;
}
.ant-radio-button-wrapper-checked:active {
  border-color: #546975;
  -webkit-box-shadow: -1px 0 0 0 #546975;
          box-shadow: -1px 0 0 0 #546975;
  color: #546975;
}
.ant-radio-button-wrapper-checked:focus-within {
  outline: 3px solid rgba(120, 144, 156, 0.06);
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled) {
  background: #78909c;
  border-color: #78909c;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):hover {
  border-color: #9da5a8;
  background: #9da5a8;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):active {
  border-color: #546975;
  background: #546975;
  color: #fff;
}
.ant-radio-group-solid .ant-radio-button-wrapper-checked:not(.ant-radio-button-wrapper-disabled):focus-within {
  outline: 3px solid rgba(120, 144, 156, 0.06);
}
.ant-radio-button-wrapper-disabled {
  border-color: #d9d9d9;
  background-color: #f5f5f5;
  cursor: not-allowed;
  color: rgba(0, 0, 0, 0.25);
}
.ant-radio-button-wrapper-disabled:first-child,
.ant-radio-button-wrapper-disabled:hover {
  border-color: #d9d9d9;
  background-color: #f5f5f5;
  color: rgba(0, 0, 0, 0.25);
}
.ant-radio-button-wrapper-disabled:first-child {
  border-left-color: #d9d9d9;
}
.ant-radio-button-wrapper-disabled.ant-radio-button-wrapper-checked {
  color: #fff;
  background-color: #e6e6e6;
  border-color: #d9d9d9;
  -webkit-box-shadow: none;
          box-shadow: none;
}
@-webkit-keyframes antRadioEffect {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1.6);
            transform: scale(1.6);
    opacity: 0;
  }
}
@keyframes antRadioEffect {
  0% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0.5;
  }
  100% {
    -webkit-transform: scale(1.6);
            transform: scale(1.6);
    opacity: 0;
  }
}
@supports (-moz-appearance: meterbar) and (background-blend-mode: difference, normal) {
  .ant-radio {
    vertical-align: text-bottom;
  }
}
.ant-btn-group.radio-group-desktop {
  color: #78909c;
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  -ms-flex-pack: distribute;
      justify-content: space-around;
}
.ant-btn-group.radio-group-desktop.xs {
  height: 28px;
  line-height: 26px;
  font-size: 12px;
}
.ant-btn-group.radio-group-desktop.sm {
  height: 32px;
  line-height: 30px;
  font-size: 12px;
}
.ant-btn-group.radio-group-desktop.md {
  height: 40px;
  line-height: 38px;
}
.ant-btn-group.radio-group-desktop.lg {
  height: 44px;
  line-height: 42px;
}
.ant-btn-group.radio-group-desktop .ant-btn {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  text-align: center;
  line-height: inherit;
}
.ant-btn-group.radio-group-desktop .ant-btn > span:last-child {
  white-space: nowrap;
}
.ant-btn-group.radio-group-desktop[theme='light'] .ant-btn {
  color: #78909c;
  height: 100%;
  line-height: inherit;
}
.ant-btn-group.radio-group-desktop[theme='light'] .ant-btn:hover,
.ant-btn-group.radio-group-desktop[theme='light'] .ant-btn-checked {
  color: #263238;
}
.ant-btn-group.radio-group-desktop[theme='light'] .ant-btn-checked {
  border-color: #546e7a;
  -webkit-box-shadow: -1px 0 0 0 #546e7a;
          box-shadow: -1px 0 0 0 #546e7a;
}
.ant-btn-group.radio-group-desktop[theme='light'] .ant-btn-checked::before {
  background: #546e7a;
}
.ant-btn-group.radio-group-desktop[theme='light'] .ant-btn-disabled,
.ant-btn-group.radio-group-desktop[theme='light'] .ant-btn-disabled:hover {
  color: #9e9e9e;
}
.ant-btn-group.radio-group-desktop[theme='dark'] {
  color: #757575;
  border-color: #757575;
  background: transparent;
}
.ant-btn-group.radio-group-desktop[theme='dark'] .ant-btn {
  height: 100%;
  line-height: inherit;
  background-color: transparent;
  color: #757575;
  border-color: #757575;
}
.ant-btn-group.radio-group-desktop[theme='dark'] .ant-btn:hover,
.ant-btn-group.radio-group-desktop[theme='dark'] .ant-btn-checked {
  color: white;
}
.ant-btn-group.radio-group-desktop[theme='dark'] .ant-btn-checked {
  border-color: white;
  -webkit-box-shadow: -1px 0 0 0 white;
          box-shadow: -1px 0 0 0 white;
}
.ant-btn-group.radio-group-desktop[theme='dark'] .ant-btn-checked::before {
  background: white;
}
.ant-btn-group.radio-group-desktop[theme='dark'] .ant-btn-disabled,
.ant-btn-group.radio-group-desktop[theme='dark'] .ant-btn-disabled:hover {
  background-color: #424242;
  color: #757575;
}
.ant-btn-group.radio-group-desktop[theme='dark'] .ant-btn:not(:first-child)::before {
  background: #757575;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.checkbox__3Y6O {
  cursor: pointer;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.checkbox__3Y6O .checkbox-icon__VfX4 {
  color: #546e7a;
}
.checkbox-disable__2Qqg {
  cursor: not-allowed;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.checkbox-disable__2Qqg .checkbox-icon__VfX4 {
  color: #cfd8dc;
}
.checkbox-icon__VfX4 {
  width: 24px;
  height: 24px;
}
.checkbox-text__268k {
  margin-left: 3px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.textarea__1jUk {
  width: 300px;
  height: 90px;
  resize: none;
  outline: none;
  color: #546e7a;
  line-height: 26px;
  padding: 6px 13px;
  border-radius: 3px;
  border-color: #90a4ae;
}
.textarea__1jUk::-webkit-input-placeholder {
  color: #90a4ae;
}
.textarea__1jUk:-ms-input-placeholder {
  color: #90a4ae;
}
.textarea__1jUk::-ms-input-placeholder {
  color: #90a4ae;
}
.textarea__1jUk::placeholder {
  color: #90a4ae;
}
.textarea__1jUk:hover:not(.disabled__FoGA) {
  color: #263238;
  border-color: #263238;
}
.textarea__1jUk:focus {
  color: #263238;
  border-color: #263238;
  -webkit-box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
          box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
}
.textarea__1jUk.disabled__FoGA {
  color: #bdbdbd;
  background-color: #fafafa;
  border-color: #e0e0e0;
}
.textarea__1jUk.disabled__FoGA::-webkit-input-placeholder {
  color: #bdbdbd;
}
.textarea__1jUk.disabled__FoGA:-ms-input-placeholder {
  color: #bdbdbd;
}
.textarea__1jUk.disabled__FoGA::-ms-input-placeholder {
  color: #bdbdbd;
}
.textarea__1jUk.disabled__FoGA::placeholder {
  color: #bdbdbd;
}
.textarea__1jUk.disabled__FoGA:hover {
  color: #bdbdbd;
  border-color: #e0e0e0;
}
.textarea__1jUk.disabled__FoGA:focus {
  color: #bdbdbd;
  border-color: #e0e0e0;
  -webkit-box-shadow: none;
          box-shadow: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__q3Wk {
  width: initial;
}
.select__1dD0 {
  height: 100%;
  color: #616161;
  background: #f5f5f5;
  -webkit-box-shadow: none;
          box-shadow: none;
  border: 1px solid transparent;
}
.select__1dD0:hover {
  background: #eeeeee;
  border-color: transparent;
}
.select__1dD0.ant-select {
  width: initial;
  height: 32px;
}
.select__1dD0.ant-select-open {
  background: white;
  border-color: #263238;
  -webkit-box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
}
.select__1dD0 .ant-select-arrow {
  color: #616161;
}
.select__1dD0 .ant-select-selection {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.select__1dD0 .ant-select-selection-selected-value {
  padding-right: 23px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-pagination-item {
  font-weight: 400;
  border: none;
  background-color: #f5f5f5;
  width: 32px;
  height: 32px;
  line-height: 32px;
}
.ant-pagination-item a {
  color: #616161 !important;
}
.ant-pagination-prev .ant-pagination-item-link,
.ant-pagination-next .ant-pagination-item-link {
  font-weight: 400;
  border: none;
  background-color: #f5f5f5;
}
.ant-pagination-prev .ant-pagination-item-link a,
.ant-pagination-next .ant-pagination-item-link a {
  color: #616161 !important;
}
.ant-pagination-prev .ant-pagination-item-link::after,
.ant-pagination-next .ant-pagination-item-link::after {
  font-family: LcIconFont, sans-serif;
  font-size: 1.2em;
  width: 32px;
  height: 32px;
  line-height: 32px;
}
.ant-pagination-prev a:not(.ant-pagination-item-link),
.ant-pagination-next a:not(.ant-pagination-item-link) {
  color: #455a64;
}
.ant-pagination-prev a:not(.ant-pagination-item-link):hover,
.ant-pagination-next a:not(.ant-pagination-item-link):hover {
  color: #78909c;
}
.ant-pagination-prev.ant-pagination-disabled a:not(.ant-pagination-item-link),
.ant-pagination-next.ant-pagination-disabled a:not(.ant-pagination-item-link) {
  color: #bdbdbd;
}
.ant-pagination-prev .ant-pagination-item-link::after {
  content: '\E901';
}
.ant-pagination-next .ant-pagination-item-link::after {
  content: '\E900';
}
.ant-pagination-item-active {
  background-color: #37474f;
}
.ant-pagination-item-active a {
  color: white !important;
}
.ant-pagination-item:not(.ant-pagination-item-active):hover {
  background-color: #eeeeee;
}
.ant-pagination-item:not(.ant-pagination-item-active):hover a {
  color: #616161 !important;
}
.ant-pagination-prev:not(.ant-pagination-disabled) a.ant-pagination-item-link:hover,
.ant-pagination-next:not(.ant-pagination-disabled) a.ant-pagination-item-link:hover {
  background-color: #eeeeee;
  color: #616161;
}
.ant-pagination-jump-prev::after,
.ant-pagination-jump-next::after {
  content: '\2026';
  color: #616161 !important;
  font-family: LcIconFont, sans-serif;
  font-size: 12px !important;
}
.ant-pagination-jump-prev:focus::after,
.ant-pagination-jump-prev:hover::after {
  content: '\E90A';
  color: #616161 !important;
  font-family: LcIconFont, sans-serif;
  font-size: 24px !important;
}
.ant-pagination-jump-next:focus::after,
.ant-pagination-jump-next:hover::after {
  content: '\E90B';
  color: #616161 !important;
  font-family: LcIconFont, sans-serif;
  font-size: 24px !important;
}
.ant-pagination-options {
  margin-left: 8px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__ULoT {
  display: inline-block;
  position: relative;
}
.input__2KHt {
  width: 100%;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  color: #546e7a;
  border: 1px solid #cfd8dc;
  border-radius: 3px;
  font-weight: 300;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
}
.input__2KHt::-webkit-input-placeholder {
  color: #90a4ae;
}
.input__2KHt:-ms-input-placeholder {
  color: #90a4ae;
}
.input__2KHt::-ms-input-placeholder {
  color: #90a4ae;
}
.input__2KHt::placeholder {
  color: #90a4ae;
}
.input__2KHt:hover:not(.error__7SOR):not(.disabled__26rL) {
  color: #263238;
  border-color: #263238;
}
.input__2KHt:focus {
  color: #263238;
  border-color: #263238;
  outline: none !important;
  -webkit-box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
          box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
}
.input__2KHt.error__7SOR:focus {
  border-color: #c62928;
}
.xs__1bJv .input__2KHt {
  padding: 4.3px 8px;
  font-size: 12px;
}
.sm__3zpp .input__2KHt {
  padding: 6.3px 10px;
  font-size: 12px;
}
.md__hEAI .input__2KHt {
  padding: 8.85px 13px;
  font-size: 14px;
}
.lg__BzLv .input__2KHt {
  padding: 10.85px 15px;
  font-size: 14px;
}
.error__7SOR {
  border-color: #c62928;
}
.errormsg__1wRV {
  border-radius: 3px;
  position: absolute;
  top: 1px;
  right: 1px;
  font-size: 14px;
  text-align: right;
  color: #c62928;
  background-image: -webkit-gradient(linear, left top, right top, from(rgba(255, 255, 255, 0)), color-stop(25%, white), to(white));
  background-image: -webkit-linear-gradient(left, rgba(255, 255, 255, 0) 0%, white 25%, white 100%);
  background-image: -o-linear-gradient(left, rgba(255, 255, 255, 0) 0%, white 25%, white 100%);
  background-image: linear-gradient(to right, rgba(255, 255, 255, 0) 0%, white 25%, white 100%);
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
}
.dark__3eel + .errormsg__1wRV {
  background-image: -webkit-gradient(linear, left top, right top, from(rgba(33, 33, 33, 0)), color-stop(25%, #212121), to(#212121));
  background-image: -webkit-linear-gradient(left, rgba(33, 33, 33, 0) 0%, #212121 25%, #212121 100%);
  background-image: -o-linear-gradient(left, rgba(33, 33, 33, 0) 0%, #212121 25%, #212121 100%);
  background-image: linear-gradient(to right, rgba(33, 33, 33, 0) 0%, #212121 25%, #212121 100%);
}
.xs__1bJv .errormsg__1wRV {
  padding: 0 8px 0 16px;
  line-height: 26px;
  height: 26px;
}
.sm__3zpp .errormsg__1wRV {
  padding: 0 10px 0 20px;
  line-height: 30px;
  height: 30px;
}
.md__hEAI .errormsg__1wRV {
  padding: 0 13px 0 26px;
  line-height: 38px;
  height: 38px;
}
.lg__BzLv .errormsg__1wRV {
  padding: 0 15px 0 30px;
  line-height: 42px;
  height: 42px;
}
.dark__3eel {
  color: #e0e0e0;
  background-color: #212121;
  border: 1px solid #757575;
}
.dark__3eel::-webkit-input-placeholder {
  color: #757575;
}
.dark__3eel:-ms-input-placeholder {
  color: #757575;
}
.dark__3eel::-ms-input-placeholder {
  color: #757575;
}
.dark__3eel::placeholder {
  color: #757575;
}
.dark__3eel:hover:not(.error__7SOR):not(.disabled__26rL) {
  color: white;
  border-color: white;
}
.dark__3eel:focus:not(.disabled__26rL) {
  color: white;
  outline: none !important;
  border-color: white;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.dark__3eel.error__7SOR,
.dark__3eel.error__7SOR:focus {
  border-color: #c62928;
}
.input__2KHt.disabled__26rL {
  color: #bdbdbd;
  background-color: #fafafa;
  border-color: #e0e0e0;
}
.input__2KHt.disabled__26rL::-webkit-input-placeholder {
  color: #bdbdbd;
}
.input__2KHt.disabled__26rL:-ms-input-placeholder {
  color: #bdbdbd;
}
.input__2KHt.disabled__26rL::-ms-input-placeholder {
  color: #bdbdbd;
}
.input__2KHt.disabled__26rL::placeholder {
  color: #bdbdbd;
}
.input__2KHt.disabled__26rL:hover:not(.error__7SOR) {
  color: #bdbdbd;
  border-color: #e0e0e0;
}
.input__2KHt.disabled__26rL:focus:not(.error__7SOR) {
  color: #bdbdbd;
  border-color: #e0e0e0;
  outline: none !important;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.input__2KHt.disabled__26rL.dark__3eel {
  color: #9e9e9e;
  background-color: #424242;
  border-color: #757575;
}
.input__2KHt.disabled__26rL.dark__3eel::-webkit-input-placeholder {
  color: #9e9e9e;
}
.input__2KHt.disabled__26rL.dark__3eel:-ms-input-placeholder {
  color: #9e9e9e;
}
.input__2KHt.disabled__26rL.dark__3eel::-ms-input-placeholder {
  color: #9e9e9e;
}
.input__2KHt.disabled__26rL.dark__3eel::placeholder {
  color: #9e9e9e;
}
.input__2KHt.disabled__26rL.dark__3eel:hover:not(.error__7SOR) {
  color: #9e9e9e;
  border-color: #757575;
}
.input__2KHt.disabled__26rL.dark__3eel:focus:not(.error__7SOR) {
  color: #9e9e9e;
  border-color: #757575;
  outline: none !important;
  -webkit-box-shadow: none;
          box-shadow: none;
}
.root__1_09 input {
  width: 100%;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  color: #546e7a;
  border: 1px solid #cfd8dc;
  border-radius: 3px;
  font-weight: 300;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  -webkit-transition: 0.4s all;
  -o-transition: 0.4s all;
  transition: 0.4s all;
  padding: 10px;
  width: initial;
}
.root__1_09 input::-webkit-input-placeholder {
  color: #90a4ae;
}
.root__1_09 input:-ms-input-placeholder {
  color: #90a4ae;
}
.root__1_09 input::-ms-input-placeholder {
  color: #90a4ae;
}
.root__1_09 input::placeholder {
  color: #90a4ae;
}
.root__1_09 input:hover:not(.error__7SOR):not(.disabled__26rL) {
  color: #263238;
  border-color: #263238;
}
.root__1_09 input:focus {
  color: #263238;
  border-color: #263238;
  outline: none !important;
  -webkit-box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
          box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
}
.root__1_09 input.error__7SOR:focus {
  border-color: #c62928;
}
.root__1_09 .ant-pagination-options-quick-jumper input {
  width: 50px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-message {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: fixed;
  z-index: 1010;
  width: 100%;
  top: 16px;
  left: 0;
  pointer-events: none;
}
.ant-message-notice {
  padding: 8px;
  text-align: center;
}
.ant-message-notice:first-child {
  margin-top: -8px;
}
.ant-message-notice-content {
  padding: 10px 16px;
  border-radius: 4px;
  -webkit-box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
          box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
  background: #fff;
  display: inline-block;
  pointer-events: all;
}
.ant-message-success .anticon {
  color: #52c41a;
}
.ant-message-error .anticon {
  color: #f5222d;
}
.ant-message-warning .anticon {
  color: #faad14;
}
.ant-message-info .anticon,
.ant-message-loading .anticon {
  color: #1890ff;
}
.ant-message .anticon {
  margin-right: 8px;
  font-size: 16px;
  top: 1px;
  position: relative;
}
.ant-message-notice.move-up-leave.move-up-leave-active {
  -webkit-animation-name: MessageMoveOut;
          animation-name: MessageMoveOut;
  overflow: hidden;
  -webkit-animation-duration: 0.3s;
          animation-duration: 0.3s;
}
@-webkit-keyframes MessageMoveOut {
  0% {
    opacity: 1;
    max-height: 150px;
    padding: 8px;
  }
  100% {
    opacity: 0;
    max-height: 0;
    padding: 0;
  }
}
@keyframes MessageMoveOut {
  0% {
    opacity: 1;
    max-height: 150px;
    padding: 8px;
  }
  100% {
    opacity: 0;
    max-height: 0;
    padding: 0;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-message-notice-content {
  max-width: 600px;
  min-width: 300px;
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.ant-message-notice-content .ant-message-custom-content,
.ant-message-notice-content .ant-message-custom-content > span {
  max-width: 100%;
}
.ant-message-notice-content .ant-message-custom-content > i.anticon:first-child,
.ant-message-notice-content .ant-message-custom-content > span > i.anticon:first-child {
  display: none;
}
.ant-message {
  top: 100px;
  z-index: 1040;
}
.ant-message-success {
  color: #009688;
}
.ant-message-warning {
  color: #f07c18;
}
.ant-message-info {
  color: #455a64;
}
.ant-message-error {
  color: #c62928;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-notification {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: fixed;
  z-index: 1010;
  width: 384px;
  max-width: calc(100vw - 32px);
  margin-right: 24px;
}
.ant-notification-topLeft,
.ant-notification-bottomLeft {
  margin-left: 24px;
  margin-right: 0;
}
.ant-notification-topLeft .ant-notification-fade-enter.ant-notification-fade-enter-active,
.ant-notification-bottomLeft .ant-notification-fade-enter.ant-notification-fade-enter-active,
.ant-notification-topLeft .ant-notification-fade-appear.ant-notification-fade-appear-active,
.ant-notification-bottomLeft .ant-notification-fade-appear.ant-notification-fade-appear-active {
  -webkit-animation-name: NotificationLeftFadeIn;
          animation-name: NotificationLeftFadeIn;
}
.ant-notification-close-icon {
  font-size: 14px;
  cursor: pointer;
}
.ant-notification-notice {
  padding: 16px 24px;
  border-radius: 4px;
  -webkit-box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
          box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
  background: #fff;
  line-height: 1.5;
  position: relative;
  margin-bottom: 16px;
  overflow: hidden;
}
.ant-notification-notice-message {
  font-size: 16px;
  color: rgba(0, 0, 0, 0.85);
  margin-bottom: 8px;
  line-height: 24px;
  display: inline-block;
}
.ant-notification-notice-message-single-line-auto-margin {
  width: calc(384px - 24px * 2 - 24px - 48px - 100%);
  background-color: transparent;
  pointer-events: none;
  display: block;
  max-width: 4px;
}
.ant-notification-notice-message-single-line-auto-margin:before {
  content: '';
  display: block;
}
.ant-notification-notice-description {
  font-size: 14px;
}
.ant-notification-notice-closable .ant-notification-notice-message {
  padding-right: 24px;
}
.ant-notification-notice-with-icon .ant-notification-notice-message {
  font-size: 16px;
  margin-left: 48px;
  margin-bottom: 4px;
}
.ant-notification-notice-with-icon .ant-notification-notice-description {
  margin-left: 48px;
  font-size: 14px;
}
.ant-notification-notice-icon {
  position: absolute;
  font-size: 24px;
  line-height: 24px;
  margin-left: 4px;
}
.ant-notification-notice-icon-success {
  color: #52c41a;
}
.ant-notification-notice-icon-info {
  color: #1890ff;
}
.ant-notification-notice-icon-warning {
  color: #faad14;
}
.ant-notification-notice-icon-error {
  color: #f5222d;
}
.ant-notification-notice-close {
  position: absolute;
  right: 22px;
  top: 16px;
  color: rgba(0, 0, 0, 0.45);
  outline: none;
}
a.ant-notification-notice-close:focus {
  text-decoration: none;
}
.ant-notification-notice-close:hover {
  color: rgba(0, 0, 0, 0.67);
}
.ant-notification-notice-btn {
  float: right;
  margin-top: 16px;
}
.ant-notification .notification-fade-effect {
  -webkit-animation-duration: 0.24s;
          animation-duration: 0.24s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: cubic-bezier(0.645, 0.045, 0.355, 1);
          animation-timing-function: cubic-bezier(0.645, 0.045, 0.355, 1);
}
.ant-notification-fade-enter,
.ant-notification-fade-appear {
  opacity: 0;
  -webkit-animation-duration: 0.24s;
          animation-duration: 0.24s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: cubic-bezier(0.645, 0.045, 0.355, 1);
          animation-timing-function: cubic-bezier(0.645, 0.045, 0.355, 1);
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.ant-notification-fade-leave {
  -webkit-animation-duration: 0.24s;
          animation-duration: 0.24s;
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
  -webkit-animation-timing-function: cubic-bezier(0.645, 0.045, 0.355, 1);
          animation-timing-function: cubic-bezier(0.645, 0.045, 0.355, 1);
  -webkit-animation-duration: 0.2s;
          animation-duration: 0.2s;
  -webkit-animation-play-state: paused;
          animation-play-state: paused;
}
.ant-notification-fade-enter.ant-notification-fade-enter-active,
.ant-notification-fade-appear.ant-notification-fade-appear-active {
  -webkit-animation-name: NotificationFadeIn;
          animation-name: NotificationFadeIn;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
.ant-notification-fade-leave.ant-notification-fade-leave-active {
  -webkit-animation-name: NotificationFadeOut;
          animation-name: NotificationFadeOut;
  -webkit-animation-play-state: running;
          animation-play-state: running;
}
@-webkit-keyframes NotificationFadeIn {
  0% {
    opacity: 0;
    left: 384px;
  }
  100% {
    left: 0;
    opacity: 1;
  }
}
@keyframes NotificationFadeIn {
  0% {
    opacity: 0;
    left: 384px;
  }
  100% {
    left: 0;
    opacity: 1;
  }
}
@-webkit-keyframes NotificationLeftFadeIn {
  0% {
    opacity: 0;
    right: 384px;
  }
  100% {
    right: 0;
    opacity: 1;
  }
}
@keyframes NotificationLeftFadeIn {
  0% {
    opacity: 0;
    right: 384px;
  }
  100% {
    right: 0;
    opacity: 1;
  }
}
@-webkit-keyframes NotificationFadeOut {
  0% {
    opacity: 1;
    margin-bottom: 16px;
    padding-top: 16px 24px;
    padding-bottom: 16px 24px;
    max-height: 150px;
  }
  100% {
    opacity: 0;
    margin-bottom: 0;
    padding-top: 0;
    padding-bottom: 0;
    max-height: 0;
  }
}
@keyframes NotificationFadeOut {
  0% {
    opacity: 1;
    margin-bottom: 16px;
    padding-top: 16px 24px;
    padding-bottom: 16px 24px;
    max-height: 150px;
  }
  100% {
    opacity: 0;
    margin-bottom: 0;
    padding-top: 0;
    padding-bottom: 0;
    max-height: 0;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-notification {
  max-width: 330px;
  min-width: 270px;
  width: auto;
}
.ant-notification-notice {
  padding: 12px 34px 12px 10px;
  color: #455a64;
  min-height: 44px;
}
.ant-notification-notice-with-icon .ant-notification-notice-message {
  font-size: 16px;
  margin-left: 26px;
}
.ant-notification-notice-with-icon .ant-notification-notice-description {
  font-size: 12px;
  margin-left: 26px;
}
.ant-notification-notice-message {
  font-size: 16px;
  line-height: normal;
  display: none;
}
.ant-notification-notice-description {
  font-size: 12px;
  line-height: 20px;
}
.ant-notification-notice-icon {
  font-size: 20px;
  line-height: normal;
  margin-left: 0;
}
.ant-notification-notice-close {
  right: 10px;
  top: 11px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.with-title__3CxN .ant-notification-notice-message {
  display: block;
}
.icon__1dYC {
  width: 20px;
  height: 20px;
}
.icon__1dYC > img,
.icon__1dYC > svg {
  vertical-align: baseline;
  max-width: 100%;
  max-height: 100%;
}
.success-icon__1hG5 {
  color: #26a69a;
}
.error-icon__KsmT {
  color: #e53935;
}
.info-icon__12uX {
  color: #607d8b;
}
.warn-icon__u-GG {
  color: #fbc02e;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.popover__1ieT {
  pointer-events: auto;
  width: 220px;
}
.popover__1ieT .message__2fpd {
  color: #212121;
  font-size: 14px;
  line-height: 21px;
  white-space: pre-wrap;
}
.popover__1ieT .control-area__2BFD {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin-top: 15px;
}
.popover__1ieT .control-area__2BFD .left__3jIx button,
.popover__1ieT .control-area__2BFD .right__3K0L button {
  vertical-align: middle;
}
.popover__1ieT .control-area__2BFD .left__3jIx > button:not(:first-of-type),
.popover__1ieT .control-area__2BFD .right__3K0L > button:not(:first-of-type) {
  margin-left: 15px;
}
.popover__1ieT .control-area__2BFD .left__3jIx {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.popover-target__LxOc {
  width: 100%;
  height: 100%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.background__2vj3,
.spotlight__2RKa {
  position: absolute;
  pointer-events: none;
  opacity: 0;
  -webkit-transition: opacity 0.3s;
  -o-transition: opacity 0.3s;
  transition: opacity 0.3s;
}
.background__2vj3[data-is-show='true'],
.spotlight__2RKa[data-is-show='true'] {
  opacity: 1;
}
.background__2vj3 {
  overflow: hidden;
}
.background__2vj3::before,
.background__2vj3::after {
  content: '';
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}
.background__2vj3::before {
  position: fixed;
  z-index: 1;
  pointer-events: none;
}
.background__2vj3::after {
  position: absolute;
  border-radius: 3px;
  -webkit-box-shadow: 0 0 0 6px rgba(33, 33, 33, 0.7);
          box-shadow: 0 0 0 6px rgba(33, 33, 33, 0.7);
}
.background__2vj3[data-is-show='true']::before {
  pointer-events: auto;
}
.background__2vj3[data-is-fill='true'] {
  background: rgba(33, 33, 33, 0.7);
}
.spotlight__2RKa {
  z-index: 2;
}
.spotlight__2RKa[data-is-show='true'] {
  pointer-events: auto;
}
.spotlight__2RKa[data-is-updating-spotlight='true'] {
  -webkit-transition: none;
  -o-transition: none;
  transition: none;
  opacity: 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.feature-guider__fdYt {
  z-index: 2;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__3iMj {
  max-width: 240px;
  padding: 15px;
  position: fixed;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  border: 1px solid #212121;
  border-radius: 3px;
  -webkit-box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.15);
  background: rgba(33, 33, 33, 0.9);
  opacity: 0;
  pointer-events: none;
}
.content__2Da1 {
  color: white;
  font-size: 14px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.data-structure-viewer__1b3b {
  width: 100%;
}
.data-structure-viewer__1b3b .node__3EdQ circle {
  fill: white;
  stroke: #546e7a;
  stroke-width: 1px;
}
.data-structure-viewer__1b3b .link__asml {
  fill: none;
  stroke: #607d8b;
  stroke-width: 1px;
}
.node-text-container__2zSM {
  width: 100%;
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 14px;
  padding: 2px;
}
.node-text__Ycm8 {
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.database-viewer__1mjc {
  width: 100%;
  height: 100%;
  padding: 10px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  overflow-x: auto;
}
.table-view__1It9 {
  width: 100%;
}
.table-name__p4Qv {
  color: rbga(0, 0, 0, 65%);
  line-height: 17px;
  padding: 8px 16px 8px 1px;
}
.table__1qB4 {
  margin: 0 auto;
  border-radius: 4px;
  border: 1px solid #e8e8e8;
  line-height: 14px;
  width: 100%;
  border-collapse: collapse;
  margin-bottom: 20px;
}
.table__1qB4 thead,
.table__1qB4 tbody tr td:first-child {
  background: #fafafa;
}
.table__1qB4 thead {
  color: black;
  font-weight: 500;
}
.table__1qB4 tbody {
  color: rbga(0, 0, 0, 65%);
}
.table__1qB4 td {
  padding: 8px 16px;
  border: 1px solid #e8e8e8;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.bug-surprise__1NoF {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1000;
  background: transparent;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.bug-surprise__1NoF .desktop__1Vq2 {
  width: 80%;
  max-width: 716.8px;
  margin: 0 auto;
  -ms-flex-item-align: center;
      align-self: center;
}
.bug-surprise__1NoF .mobile__1gBn {
  width: 100%;
  -ms-flex-item-align: center;
      align-self: center;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
/* stylelint-disable at-rule-empty-line-before,at-rule-name-space-after,at-rule-no-unknown */
/* stylelint-disable no-duplicate-selectors */
/* stylelint-disable */
/* stylelint-disable declaration-bang-space-before,no-duplicate-selectors,string-no-newline */
.ant-alert {
  font-size: 14px;
  font-variant: tabular-nums;
  -webkit-font-feature-settings: 'tnum';
          font-feature-settings: 'tnum';
  line-height: 1.5;
  color: rgba(0, 0, 0, 0.65);
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  margin: 0;
  padding: 0;
  list-style: none;
  position: relative;
  padding: 8px 15px 8px 37px;
  border-radius: 4px;
}
.ant-alert.ant-alert-no-icon {
  padding: 8px 15px;
}
.ant-alert.ant-alert-closable {
  padding-right: 30px;
}
.ant-alert-icon {
  top: 11.5px;
  left: 16px;
  position: absolute;
}
.ant-alert-description {
  font-size: 14px;
  line-height: 22px;
  display: none;
}
.ant-alert-success {
  border: 1px solid #b7eb8f;
  background-color: #f6ffed;
}
.ant-alert-success .ant-alert-icon {
  color: #52c41a;
}
.ant-alert-info {
  border: 1px solid #91d5ff;
  background-color: #e6f7ff;
}
.ant-alert-info .ant-alert-icon {
  color: #1890ff;
}
.ant-alert-warning {
  border: 1px solid #ffe58f;
  background-color: #fffbe6;
}
.ant-alert-warning .ant-alert-icon {
  color: #faad14;
}
.ant-alert-error {
  border: 1px solid #ffa39e;
  background-color: #fff1f0;
}
.ant-alert-error .ant-alert-icon {
  color: #f5222d;
}
.ant-alert-close-icon {
  font-size: 12px;
  position: absolute;
  right: 16px;
  top: 8px;
  line-height: 22px;
  overflow: hidden;
  cursor: pointer;
}
.ant-alert-close-icon .anticon-close {
  color: rgba(0, 0, 0, 0.45);
  -webkit-transition: color 0.3s;
  -o-transition: color 0.3s;
  transition: color 0.3s;
}
.ant-alert-close-icon .anticon-close:hover {
  color: rgba(0, 0, 0, 0.75);
}
.ant-alert-close-text {
  position: absolute;
  right: 16px;
}
.ant-alert-with-description {
  padding: 15px 15px 15px 64px;
  position: relative;
  border-radius: 4px;
  color: rgba(0, 0, 0, 0.65);
  line-height: 1.5;
}
.ant-alert-with-description.ant-alert-no-icon {
  padding: 15px;
}
.ant-alert-with-description .ant-alert-icon {
  position: absolute;
  top: 16px;
  left: 24px;
  font-size: 24px;
}
.ant-alert-with-description .ant-alert-close-icon {
  position: absolute;
  top: 16px;
  right: 16px;
  cursor: pointer;
  font-size: 14px;
}
.ant-alert-with-description .ant-alert-message {
  font-size: 16px;
  color: rgba(0, 0, 0, 0.85);
  display: block;
  margin-bottom: 4px;
}
.ant-alert-with-description .ant-alert-description {
  display: block;
}
.ant-alert.ant-alert-close {
  height: 0 !important;
  margin: 0;
  padding-top: 0;
  padding-bottom: 0;
  -webkit-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -o-transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  transition: all 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -webkit-transform-origin: 50% 0;
          transform-origin: 50% 0;
}
.ant-alert-slide-up-leave {
  -webkit-animation: antAlertSlideUpOut 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
          animation: antAlertSlideUpOut 0.3s cubic-bezier(0.78, 0.14, 0.15, 0.86);
  -webkit-animation-fill-mode: both;
          animation-fill-mode: both;
}
.ant-alert-banner {
  border-radius: 0;
  border: 0;
  margin-bottom: 0;
}
@-webkit-keyframes antAlertSlideUpIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(0);
            transform: scaleY(0);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
}
@keyframes antAlertSlideUpIn {
  0% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(0);
            transform: scaleY(0);
  }
  100% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
}
@-webkit-keyframes antAlertSlideUpOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(0);
            transform: scaleY(0);
  }
}
@keyframes antAlertSlideUpOut {
  0% {
    opacity: 1;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(1);
            transform: scaleY(1);
  }
  100% {
    opacity: 0;
    -webkit-transform-origin: 0% 0%;
            transform-origin: 0% 0%;
    -webkit-transform: scaleY(0);
            transform: scaleY(0);
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-alert {
  border-radius: 3px;
  font-size: 12px;
}
.ant-alert-no-icon {
  padding: 9px 13px;
}
.ant-alert-success {
  background-color: #e0f2f1;
  border-color: #b2dfdb;
  color: #00695c;
}
.ant-alert-info {
  background-color: #f7f9fa;
  border-color: #cfd8dc;
  color: #455a64;
}
.ant-alert-error {
  background-color: #feebee;
  border-color: #ffcdd3;
  color: #c62928;
}
.ant-alert-warning {
  background-color: #fffde7;
  border-color: #fdd835;
  color: #f07c18;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.leet-coin__3aI9 {
  width: 40px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.copyright__2Y9E {
  display: block;
  color: #757575;
  margin-right: 20px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.nav-items__VcEf {
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  margin-top: -8px;
  margin-left: -10.5px;
}
.nav-items__VcEf > * {
  margin-top: 8px;
}
.nav-items__VcEf a {
  color: #424242;
  margin: 0 10.5px;
}
.nav-items__VcEf li {
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.nav-items__VcEf li:not(:last-child)::after {
  border-right: 1px solid #e0e0e0;
  content: '';
  height: 10px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.licensing-links__3dSX {
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  margin-top: -8px;
  margin-left: -20px;
}
.licensing-links__3dSX > * {
  margin-top: 8px;
}
.licensing-links__3dSX a {
  color: #757575;
}
.licensing-links__3dSX li {
  margin-left: 20px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__1kNV {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.container__1kNV svg {
  display: block;
  fill: #212121;
  font-size: 22px;
}
.zhihu-icon__3G32:hover {
  fill: #3082e1;
}
.weixin-icon__1Kj_ {
  cursor: pointer;
}
.weixin-icon__1Kj_:hover {
  fill: #6abb11;
}
.toutiao-icon__3lM6:hover {
  fill: #e53935;
}
.weixin-modal-body__30e7 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  padding: 30px 45px;
}
.weixin-modal-body__30e7 svg {
  width: 190px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__23dx {
  display: block;
}
.us-flag__1hhO {
  height: 18px;
  margin-right: 10px;
}
.us-txt__38L3 {
  color: #424242;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__3iAr {
  margin: 0 auto;
  max-width: 1240px;
  padding: 0 20px;
  width: 100%;
}
.root__3iAr a:hover {
  text-decoration: underline;
}
.root__3iAr ul {
  list-style: none;
  padding: 0;
  margin-bottom: 0;
}
.container__vsjd {
  border-top: 1px solid #eeeeee;
  font-size: 12px;
  padding: 15px 0;
  width: 100%;
}
.main__3i3S,
.left-side-contents__1pYO {
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  margin-top: -8px;
}
.main__3i3S > *,
.left-side-contents__1pYO > * {
  margin-top: 8px;
}
.left-side__g8l4 {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
.licensing__1he4 {
  margin-top: 10px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.btn__1oj0 {
  border: none;
  background-color: transparent;
  cursor: pointer;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  padding: 0 2.5px;
  margin: 0;
}
.btn__1oj0:first-child {
  padding-left: 0;
}
.btn__1oj0:focus {
  outline: none;
}
.star-icon__2JAK {
  display: block;
  font-size: 16px;
}
.container__3S4C {
  display: inline-block;
  position: relative;
}
.background-stars__3AY8,
.foreground-stars__jk-I {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.background-stars__3AY8 {
  width: 100%;
}
.background-stars__3AY8 .star-icon__2JAK {
  color: #e0e0e0;
}
.foreground-stars__jk-I {
  pointer-events: none;
  position: absolute;
  overflow: hidden;
  top: 0;
}
.foreground-stars__jk-I .star-icon__2JAK {
  color: #f8a938;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.tag__2PqS {
  display: inline-block;
  line-height: 14px;
  border-radius: 16px;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  cursor: pointer;
  -webkit-transition: color 0.3s, background-color 0.3s;
  -o-transition: color 0.3s, background-color 0.3s;
  transition: color 0.3s, background-color 0.3s;
  color: #546e7a;
  background: #fafafa;
}
.tag__2PqS:hover {
  color: #37474f;
  background: #eceff1;
}
.tag__2PqS:active {
  color: #263238;
  background: #cfd8dc;
}
.tag__2PqS[data-size='sm'] {
  padding: 9px 10px;
}
.tag__2PqS[data-size='xs'] {
  padding: 5px 8px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.panel__2Uom {
  color: #263238;
  opacity: 1;
  -webkit-transition: 0.15s all;
  -o-transition: 0.15s all;
  transition: 0.15s all;
}
.header__1Shn {
  width: 100%;
  padding: 8px 20px;
  background: white;
  border: none;
  border-top: 1px solid #eeeeee;
  border-bottom: 1px solid #eeeeee;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  min-height: 40px;
}
.header__1Shn .icon-wrapper__2q8n {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-right: -6px;
  color: #cfd8dc;
}
.header__1Shn .icon-wrapper__2q8n:hover {
  color: #546e7a;
}
.panel__2Uom + .panel__2Uom > .header__1Shn {
  margin-top: -1px;
}
.panel__2Uom.closable__3940 .header__1Shn .icon-wrapper__2q8n {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: start;
      -ms-flex-align: start;
          align-items: flex-start;
  width: 30px;
  padding-top: 6px;
  padding-left: 6px;
  cursor: pointer;
}
.panel__2Uom.closable__3940 .header__1Shn .icon-wrapper__2q8n svg {
  width: 1.18em;
  height: 1.18em;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.panel__2Uom.toggle__34RP .header__1Shn {
  cursor: pointer;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.panel__2Uom.toggle__34RP .header__1Shn .icon-wrapper__2q8n {
  width: 24px;
}
.panel__2Uom.toggle__34RP .header__1Shn .icon-wrapper__2q8n svg {
  width: 1.72em;
  height: 1.72em;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.panel__2Uom.toggle__34RP .header__1Shn:hover .icon-wrapper__2q8n {
  color: #546e7a;
}
.header__1Shn.active__LPd6 .icon-wrapper__2q8n svg {
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}
.header__1Shn.collapse___CSI {
  border-bottom-width: 0;
}
.content-wrapper__qlUz {
  background: white;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.content-wrapper__qlUz.entering__V-87,
.content-wrapper__qlUz.exiting__1HsY {
  margin: 0 20;
  height: 0;
  overflow: hidden;
}
.content-wrapper__qlUz.exited__24v9 {
  display: none;
}
.content-wrapper__qlUz.collapse___CSI {
  border-top: 1px solid #eeeeee;
}
.content__15D- {
  padding: 20px;
}
.warn__2-yv,
.warning__3vJw {
  color: #f9a825;
}
.warn__2-yv.closable__3940 .header__1Shn,
.warning__3vJw.closable__3940 .header__1Shn {
  border-top: 1px solid #ffecb3;
  background-color: #fff8e1;
}
.warn__2-yv.closable__3940 .header__1Shn .icon-wrapper__2q8n,
.warning__3vJw.closable__3940 .header__1Shn .icon-wrapper__2q8n {
  color: #f9a825;
}
.warn__2-yv.closable__3940 .header__1Shn .icon-wrapper__2q8n:hover,
.warning__3vJw.closable__3940 .header__1Shn .icon-wrapper__2q8n:hover {
  color: #f07c18;
}
.header-content__2Ekc {
  min-height: 24px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__3dQk {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.container__3dQk[data-is-vertical='true'] {
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.disable-user-select__1C7x {
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.container__RpjS {
  position: relative;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
}
.container__RpjS .interactive-area__2Gbf {
  cursor: col-resize;
}
.container__RpjS[data-is-vertical='true'] > .interactive-area__2Gbf {
  cursor: row-resize;
}
.interactive-area__2Gbf {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  position: absolute;
  width: 100%;
  height: 100%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.placeholder__27nw {
  padding: 20px;
  margin-top: 130px;
  text-align: center;
  -webkit-font-smoothing: antialiased;
}
@media (max-width: 414px) {
  .placeholder__27nw {
    margin: 20px 0;
  }
}
.placeholder__27nw .placeholder-title__FPnK {
  margin-bottom: 40px;
  color: #bdbdbd;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.error-message__3vm- {
  color: #c62928;
  font-size: 12px;
  line-height: 18px;
  text-align: center;
}
.form__2-sN {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-align: stretch;
      -ms-flex-align: stretch;
          align-items: stretch;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__1lsb {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin: 25px auto 0;
}
.container__1lsb[data-is-cn='true'] .link__Mcl7 {
  margin: 0 10px;
}
.container__1lsb[data-is-cn='true'] .icon__3F7K {
  width: 24px;
  height: 24px;
}
.tips__3UvI {
  margin-bottom: 15px;
  color: #bdbdbd;
  pointer-events: none;
}
.link__Mcl7 {
  color: #bdbdbd;
  margin: 0 7.5px;
}
.link__Mcl7[data-icon^='weibo']:hover {
  color: #e90e24;
}
.link__Mcl7[data-icon^='baidu']:hover {
  color: #3c49f1;
}
.link__Mcl7[data-icon^='wechat']:hover {
  color: #00ca00;
}
.link__Mcl7[data-icon^='facebook']:hover {
  color: #3a5998;
}
.link__Mcl7[data-icon^='google']:hover {
  color: #dd4b39;
}
.link__Mcl7[data-icon^='github']:hover {
  color: #212121;
}
.link__Mcl7[data-icon^='linkedin']:hover {
  color: #006a9a;
}
.icon__3F7K {
  width: 30px;
  height: 30px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.error-message__27FL {
  color: #c62928;
  font-size: 12px;
  line-height: 18px;
  margin: -10px 0 20px 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__1Q_2 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-align: stretch;
      -ms-flex-align: stretch;
          align-items: stretch;
}
.logo__PDIm {
  height: 77px;
  margin-bottom: 35px;
}
.actions__3_WQ {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-top: 20px;
  color: #bdbdbd;
}
.actions__3_WQ a,
.actions__3_WQ span {
  color: #546e7a;
  font-size: 14px;
  line-height: 20px;
  cursor: pointer;
}
.sign-in-actions__3uV6 {
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.sign-up-actions__3hvs {
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.sign-up-actions__3hvs span {
  margin-left: 0.5em;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.error-message__3phf {
  color: #c62928;
  font-size: 12px;
  line-height: 18px;
  margin: -10px 0 20px 0;
}
.actions__2XTa {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  margin-top: 20px;
  color: #bdbdbd;
}
.actions__2XTa a,
.actions__2XTa span {
  color: #546e7a;
  font-size: 14px;
  line-height: 20px;
  cursor: pointer;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.switch__a46I {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin-bottom: 25px;
}
.switch__a46I[data-is-hide='true'] {
  display: none;
}
.item__1Yy5 {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  color: #bdbdbd;
  font-size: 14px;
  line-height: 40px;
  text-align: center;
  border-bottom: 1px solid;
  cursor: pointer;
}
.item__1Yy5[data-is-selected='true'] {
  color: #263238;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.agreement__3tJU {
  font-size: 12px;
  line-height: 45px;
  text-align: center;
  border-top: 1px solid #eeeeee;
  margin-top: 20px;
  color: #757575;
}
.agreement__3tJU a {
  color: #546e7a;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.go-sign-in__1prr {
  text-align: center;
  margin-top: 20px;
  color: #bdbdbd;
}
.go-sign-in__1prr span {
  color: #546e7a;
  font-size: 14px;
  line-height: 20px;
  cursor: pointer;
  margin-left: 0.5em;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__1YQL {
  border-radius: 3px;
  overflow: hidden;
}
.container__1YQL > div {
  height: 100%;
}
.container__1YQL .nc_wrapper {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  height: 100%;
  padding: 1px;
  background: #eeeeee;
}
.container__1YQL .nc_wrapper .nc_scale {
  height: 100%;
  background: transparent;
}
.container__1YQL .nc_wrapper .nc_scale .nc_bg {
  width: 0;
  border-radius: 3px;
  background: -webkit-gradient(linear, right top, left top, from(#4db6ac), to(#80cbc4));
  background: -webkit-linear-gradient(right, #4db6ac, #80cbc4);
  background: -o-linear-gradient(right, #4db6ac, #80cbc4);
  background: linear-gradient(to left, #4db6ac, #80cbc4);
  z-index: 2;
  -webkit-box-shadow: 3px 0 0 0 #4db6ac;
          box-shadow: 3px 0 0 0 #4db6ac;
}
.container__1YQL .nc_wrapper .nc_scale .nc_iconfont {
  height: 100%;
  width: 50px;
  border-radius: 3px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  border: none;
}
.container__1YQL .nc_wrapper .nc_scale .scale_text {
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.container__1YQL .nc_wrapper .nc_scale .scale_text .nc-lang-cnt,
.container__1YQL .nc_wrapper .nc_scale .scale_text .nc-lang-cnt[data-nc-lang='_startTEXT'] {
  color: #9e9e9e;
  background: transparent;
  -webkit-text-fill-color: initial;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__ukmw {
  position: relative;
  width: 100%;
}
.container__ukmw .input__LWET {
  width: 100%;
}
.container__ukmw .input__LWET input {
  height: 40px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  padding-right: 50%;
}
.action__2giN {
  position: absolute;
  top: 0;
  right: 13px;
  font-size: 14px;
  line-height: 40px;
  cursor: pointer;
  max-width: 50%;
  color: #546e7a;
  opacity: 0.9;
  -webkit-transition: opacity 0.3s;
  -o-transition: opacity 0.3s;
  transition: opacity 0.3s;
}
.action__2giN:hover {
  opacity: 1;
}
.action__2giN[data-is-disabled='true'] {
  pointer-events: none;
  opacity: 0.6;
}
.ali-slide-auth-container__4DNS {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}
.ali-slide-auth-container__4DNS > div {
  width: 100%;
  height: 40px;
  background: white;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.hide__27jK {
  opacity: 0;
  pointer-events: none;
  position: absolute;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.go-prev-step__2-bw {
  display: inline-block;
  margin: 20px auto;
  font-size: 14px;
  color: #546e7a;
  cursor: pointer;
}
.go-sign-in__1gQj {
  text-align: center;
  margin-top: 20px;
  color: #bdbdbd;
}
.go-sign-in__1gQj span {
  color: #546e7a;
  font-size: 14px;
  line-height: 20px;
  cursor: pointer;
  margin-left: 0.5em;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__1yPy {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-align: stretch;
      -ms-flex-align: stretch;
          align-items: stretch;
}
.logo__2NmO {
  height: 39px;
  margin-bottom: 31px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.sign-in-container__3IFW {
  max-width: 340px;
  margin: 0 auto;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
li:last-child .notification-item__QZJ6 {
  border-bottom: 0;
}
.gradient-bg-on-hover__26UW {
  background: white;
}
.gradient-bg-on-hover__26UW::after {
  content: '';
  background: -webkit-gradient(linear, left top, left bottom, from(white), to(#fafafa));
  background: -webkit-linear-gradient(top, white, #fafafa);
  background: -o-linear-gradient(top, white, #fafafa);
  background: linear-gradient(180deg, white, #fafafa);
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  opacity: 0;
  -webkit-transition: opacity 0.18s ease-in-out;
  -o-transition: opacity 0.18s ease-in-out;
  transition: opacity 0.18s ease-in-out;
  z-index: 1;
}
.gradient-bg-on-hover__26UW:hover::after {
  opacity: 1;
}
.notification-link__2RRJ {
  background: white;
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}
.notification-link__2RRJ::after {
  content: '';
  background: -webkit-gradient(linear, left top, left bottom, from(white), to(#fafafa));
  background: -webkit-linear-gradient(top, white, #fafafa);
  background: -o-linear-gradient(top, white, #fafafa);
  background: linear-gradient(180deg, white, #fafafa);
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  opacity: 0;
  -webkit-transition: opacity 0.18s ease-in-out;
  -o-transition: opacity 0.18s ease-in-out;
  transition: opacity 0.18s ease-in-out;
  z-index: 1;
}
.notification-link__2RRJ:hover::after {
  opacity: 1;
}
.unread-notification-link__1k0K {
}
.unread-notification-link__1k0K::after {
  -webkit-box-shadow: inset 1px 0 0 0 #f07c18;
          box-shadow: inset 1px 0 0 0 #f07c18;
}
.notification-item-container__sH-w {
  background: white;
  display: block;
  -webkit-transition: -webkit-box-shadow 0.18s ease-in-out;
  transition: -webkit-box-shadow 0.18s ease-in-out;
  -o-transition: box-shadow 0.18s ease-in-out;
  transition: box-shadow 0.18s ease-in-out;
  transition: box-shadow 0.18s ease-in-out, -webkit-box-shadow 0.18s ease-in-out;
  color: #424242;
  pointer-events: none;
}
.notification-item-container__sH-w::after {
  content: '';
  background: -webkit-gradient(linear, left top, left bottom, from(white), to(#fafafa));
  background: -webkit-linear-gradient(top, white, #fafafa);
  background: -o-linear-gradient(top, white, #fafafa);
  background: linear-gradient(180deg, white, #fafafa);
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  opacity: 0;
  -webkit-transition: opacity 0.18s ease-in-out;
  -o-transition: opacity 0.18s ease-in-out;
  transition: opacity 0.18s ease-in-out;
  z-index: 1;
}
.notification-item-container__sH-w:hover::after {
  opacity: 1;
}
.notification-item-container__sH-w a {
  pointer-events: all;
}
.unread-notification-item-container__3qmM {
  -webkit-box-shadow: inset 1px 0 0 0 #f07c18;
          box-shadow: inset 1px 0 0 0 #f07c18;
}
.unread-notification-item-container__3qmM::after {
  -webkit-box-shadow: inset 1px 0 0 0 #f07c18;
          box-shadow: inset 1px 0 0 0 #f07c18;
}
.notification-menu__3dHP {
  padding: 0;
  overflow: hidden;
  border-bottom-left-radius: 0;
  border-bottom-right-radius: 0;
}
.notification-menu__3dHP > .ant-dropdown-menu-item {
  height: auto;
  background: white;
}
.notification-menu__3dHP > .ant-dropdown-menu-item.ant-dropdown-menu-item-active__2yox {
  background: white;
}
.notification-menu__3dHP > li {
  display: block;
  padding: 0 20px;
  position: relative;
}
.notification-menu-arrow__3yyK {
  background-color: transparent;
  position: absolute;
  top: -6px;
  left: 410px;
  border-top-left-radius: 4px;
  border-width: 0 8px 6px;
  border-bottom-color: white;
  border-style: solid;
  color: transparent;
}
.notification-menu-container__3MW3 {
  background: white;
  width: 500px;
  -webkit-box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
          box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
  border-radius: 4px;
  overflow: hidden;
  -webkit-font-smoothing: antialiased;
}
.notification-scroll-container__1Xwp {
  max-height: 330px;
  overflow-y: hidden;
}
.notification-scroll-container-loading__lxsl {
  height: 100px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.notification-menu-loading__To8m {
  background: white;
}
.notification-skeleton-container__3ggY {
  padding: 0 5px;
  width: 100%;
  height: 74px;
}
.notification-menu-bar__MEeh {
  height: 50px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 15px;
  border-top: 1px solid #f5f5f5;
}
a.notification-settings-icon__1LqF {
  font-size: 20px;
  color: #b0bec5;
  -webkit-transition: color 0.18s ease-in-out;
  -o-transition: color 0.18s ease-in-out;
  transition: color 0.18s ease-in-out;
}
a.notification-settings-icon__1LqF:active,
a.notification-settings-icon__1LqF:focus,
a.notification-settings-icon__1LqF:hover,
a.notification-settings-icon__1LqF:visited {
  text-decoration: none;
}
a.notification-settings-icon__1LqF:hover {
  color: #546e7a;
}
a.notification-list-link__2K7Q {
  color: #78909c;
}
a.notification-list-link__2K7Q:active,
a.notification-list-link__2K7Q:focus,
a.notification-list-link__2K7Q:hover,
a.notification-list-link__2K7Q:visited {
  text-decoration: none;
}
a.notification-list-link__2K7Q:hover {
  color: #546e7a;
}
.notification-item__QZJ6 {
  min-height: 74px;
  padding: 16px 0 12px 0;
  border-bottom: 1px solid #eeeeee;
  position: relative;
  z-index: 2;
  -webkit-transition: border-color 0.18s ease-in-out;
  -o-transition: border-color 0.18s ease-in-out;
  transition: border-color 0.18s ease-in-out;
}
.notification-item__QZJ6 a,
.notification-item__QZJ6 a:visited,
.notification-item__QZJ6 a:focus {
  color: #546e7a;
}
.notification-item__QZJ6 a:hover,
.notification-item__QZJ6 a:visited:hover,
.notification-item__QZJ6 a:focus:hover,
.notification-item__QZJ6 a:active,
.notification-item__QZJ6 a:visited:active,
.notification-item__QZJ6 a:focus:active {
  text-decoration: underline;
}
.notification-header__1Wal {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  z-index: 2;
  line-height: 18px;
  height: 18px;
  margin-bottom: 7px;
}
.notification-title___cgu {
  color: #bdbdbd;
}
.notification-date__3Nqj {
  font-size: 12px;
  color: #9e9e9e;
}
.notification-icon__2kqT {
  color: #f9a825;
  font-size: 18px;
  margin-right: 8px;
}
.notification-content__1AB_ {
  line-height: 20px;
  white-space: nowrap;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
}
.no-notifications-placeholder__38hG {
  height: 74px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.ps__rail-y {
  z-index: 1000;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.notification-ctr__eDQh {
  background: #e53935;
  border: 2px solid #ffffff;
  border-radius: 8px;
  color: #ffffff;
  display: inline-block;
  font-family: FetteMittelschrift, sans-serif;
  font-size: 12px;
  line-height: 12px;
  padding: 0 4px;
  text-align: center;
  pointer-events: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.notification-btn-container__23CT {
  position: relative;
}
.notification-ctr__LtQ4 {
  position: absolute;
  left: 12px;
  top: -3px;
  opacity: 1;
  -webkit-transition: opacity 0.18s ease-in-out;
  -o-transition: opacity 0.18s ease-in-out;
  transition: opacity 0.18s ease-in-out;
}
.notification-ctr-hidden__35Ob {
  opacity: 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
a.playground-type-link__mnyh {
  color: #212121;
}
a.playground-type-link__mnyh:visited,
a.playground-type-link__mnyh:hover,
a.playground-type-link__mnyh:active,
a.playground-type-link__mnyh:focus {
  color: #212121;
  text-decoration: none;
}
.playground-type__3eQv {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 100px;
          flex: 0 0 100px;
  margin-top: 20px;
}
.playground-type-img__20RC {
  width: 100%;
  height: 100%;
  border-radius: 3px;
}
.playground-type-card__2_f8 {
  width: 150px;
  height: 100px;
  border-radius: 3px;
  -webkit-transition: 0.18s border-color ease-in-out;
  -o-transition: 0.18s border-color ease-in-out;
  transition: 0.18s border-color ease-in-out;
}
.playground-type-card-border__1WYz {
  border: 1px dashed #b0bec5;
}
.playground-type-name__3h5K {
  line-height: 40px;
  text-align: center;
}
.playground-new-type__2Jfg {
  background-color: #fafafa;
  color: #90a4ae;
  border-radius: 3px;
  width: 100%;
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 24px;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
  cursor: pointer;
}
.playground-new-type__2Jfg:hover {
  color: #546e7a;
  border-color: #546e7a;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.create-playground-modal__1PNj .create-playground-modal-body__2li6 {
  padding: 0;
  width: 100%;
}
.playground-link-container__1Zpy {
  padding: 0 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  border-bottom: 1px solid #eeeeee;
  color: #546e7a;
  cursor: pointer;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
}
.playground-link-container__1Zpy:hover {
  color: #263238;
}
.playground-link__CFu4 {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  font-size: 16px;
  line-height: 56px;
}
.angle-right__1W2k {
  font-size: 20px;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 20px;
          flex: 0 0 20px;
}
.playground-category-container__1_n4 {
  padding: 20px;
}
.playground-category__2clg {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  margin: 10px 0 30px 0;
}
.playground-category-name__PxzA {
  color: #757575;
  font-size: 16px;
}
.playground-category-types__1maY {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.user-menu__JejQ {
  width: 270px;
  padding: 10px 0;
}
.user-menu__JejQ > .ant-dropdown-menu-item {
  height: 46px;
}
.user-menu__JejQ > li {
  position: relative;
}
.user-menu__JejQ .user-link__2Czf {
  padding: 0;
  margin: 0;
}
.user-menu-link__1jrj > .ant-dropdown-menu-item {
  height: 46px;
}
.user-menu-link__1jrj:hover .icon__2S_5:not(.user-icon__qkLS):not(.premium-user-icon__1rG_) {
  color: #455a64;
}
.user-menu-link__1jrj:hover .item-content__3tay {
  color: #263238;
}
.user-menu-link__1jrj:visited,
.user-menu-link__1jrj:active,
.user-menu-link__1jrj:focus {
  text-decoration: none;
  color: #546e7a;
}
.item__2I37 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  width: 100%;
  height: 100%;
}
.user-item__2mht {
  -webkit-box-shadow: inset 0 -1px 0 0 #eeeeee;
          box-shadow: inset 0 -1px 0 0 #eeeeee;
}
.item-content__3tay {
  -webkit-transition: color 0.18s ease-in-out;
  -o-transition: color 0.18s ease-in-out;
  transition: color 0.18s ease-in-out;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  color: #546e7a;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
.user-item-content__3QxR {
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.icon__2S_5 {
  -webkit-transition: color 0.18s ease-in-out;
  -o-transition: color 0.18s ease-in-out;
  transition: color 0.18s ease-in-out;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  color: #90a4ae;
  font-size: 24px;
  margin-right: 15px;
}
.user-icon__qkLS {
  color: #e0e0e0;
  text-decoration: none;
  margin-right: 0;
}
.premium-user-icon__1rG_ {
  color: #f9a825;
  text-decoration: none;
  margin-right: 0;
}
.user-arrow__1RHN {
  font-size: 24px;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  margin-left: 10px;
  color: #cfd8dc;
}
.premium-user-name__IQ7l {
  color: #f07c18;
}
.user-name__35Mk {
  color: #212121;
}
.subscribe-link-container__1t0w {
  -ms-flex-negative: 0;
      flex-shrink: 0;
  z-index: 1;
}
.subscribe-link__2kVv {
  pointer-events: all;
}
.subscribe-link__2kVv:hover .user-icon__qkLS:not(.premium-user-icon__1rG_) {
  color: #455a64;
}
.user-link__2Czf {
  background: transparent;
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
}
.user-name-container__3PM2 {
  -ms-flex-item-align: stretch;
      align-self: stretch;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding-left: 15px;
}
.user-menu-arrow__Uq9_ {
  background-color: transparent;
  position: absolute;
  top: -6px;
  left: 227px;
  border-top-left-radius: 4px;
  border-width: 0 8px 6px;
  border-bottom-color: white;
  border-style: solid;
  color: transparent;
  z-index: 1;
}
.modal-footer__3y_d {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.modal-footer__3y_d button {
  min-width: 80px;
}
.modal-cancel__mOlV {
  margin-right: 20px;
}
.modal-link__3Ara {
  color: #4db6ac;
  padding: 0 5px;
}
.modal-link__3Ara:hover {
  color: #00796b;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.navbar__1Bue {
  width: 100%;
  height: 44px;
  border-bottom: 1px solid #eeeeee;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: stretch;
      -ms-flex-align: stretch;
          align-items: stretch;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  font-size: 13px;
}
.logo__3xn0 {
  height: 20px;
  margin-bottom: 2px;
}
.nav-item-container__16kF .nav-item__5BvG {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  line-height: 20px;
  position: relative;
}
.nav-item-container__16kF .nav-item__5BvG,
.nav-item-container__16kF .nav-item__5BvG .ant-dropdown-trigger {
  color: #546e7a;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
}
.nav-item-container__16kF .nav-item__5BvG:hover,
.nav-item-container__16kF .nav-item__5BvG .ant-dropdown-trigger:hover {
  color: #263238;
}
.nav-item-container__16kF .nav-item__5BvG:visited,
.nav-item-container__16kF .nav-item__5BvG .ant-dropdown-trigger:visited,
.nav-item-container__16kF .nav-item__5BvG:focus,
.nav-item-container__16kF .nav-item__5BvG .ant-dropdown-trigger:focus {
  text-decoration: none;
}
.nav-item-container__16kF .nav-item-badge__6q2S {
  position: absolute;
  top: -5px;
  right: -16px;
  background: red;
  border-radius: 6px;
  padding: 0 2px;
  color: white;
  font-size: 8px;
  line-height: 12px;
}
.nav-item-container__16kF .store-icon__2GQ5 {
  font-size: 18px;
  margin-right: 3px;
  margin-top: -3px;
}
.nav-item-container__16kF .bright-nav-link__IFNb,
.nav-item-container__16kF .bright-nav-link__IFNb .ant-dropdown-trigger {
  color: #f9a825;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
}
.nav-item-container__16kF .bright-nav-link__IFNb:hover,
.nav-item-container__16kF .bright-nav-link__IFNb .ant-dropdown-trigger:hover {
  color: #f07c18;
}
.nav-dropdown__3ybW {
  -webkit-font-smoothing: antialiased;
}
.nav-dropdown__3ybW .ant-dropdown-menu-item {
  font-size: 14px;
  color: #607d8b;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
}
.nav-dropdown__3ybW .ant-dropdown-menu-item:hover {
  color: #263238;
}
.bright-nav-dropdown__l6zI {
}
.bright-nav-dropdown__l6zI .ant-dropdown-menu-item a {
  color: #f9a825;
}
.bright-nav-dropdown__l6zI .ant-dropdown-menu-item a:hover {
  color: #f07c18;
}
.navbar-left-container__3-qz {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.navbar-left-container__3-qz > :first-child {
  margin-left: 20px;
}
.navbar-left-container__3-qz .nav-item-container__16kF {
  margin-left: 20px;
}
.navbar-right-container__COIx {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.navbar-right-container__COIx > :last-child {
  margin-right: 20px;
}
.navbar-right-container__COIx .nav-item-container__16kF {
  margin-right: 25px;
}
.navbar-right-container__COIx .nav-item-container__16kF button {
  background: none;
}
.navbar-right-container__COIx .nav-item-divider__20Jy {
  margin: 0 15px 0 -10px;
}
.nav-item-divider__20Jy {
  width: 1px;
  height: 20px;
  background-color: #eeeeee;
}
.nav-icon__T80b {
  font-size: 22px;
  color: #90a4ae;
  cursor: pointer;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
}
.nav-icon__T80b:hover {
  color: #546e7a;
}
.notification-icon__2f_U,
.account-icon__3u4B,
.new-playground-icon__k2eV {
}
.auth-links__3huC {
  margin-right: 25px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.auth-links__3huC > a {
  color: #78909c;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
}
.auth-links__3huC > a:hover {
  color: #263238;
}
.auth-link-divider__TXyn {
  margin: 0 15px;
  color: #e0e0e0;
}
.navbar-container__2Y7K {
  width: 100%;
  position: relative;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.constrained-width__2SF0 {
  max-width: 1240px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ant-radio-group.radio-group-mobile {
  color: #78909c;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  width: 100%;
}
.ant-radio-group.radio-group-mobile.xs {
  line-height: 28px;
  font-size: 12px;
}
.ant-radio-group.radio-group-mobile.sm {
  line-height: 32px;
  font-size: 12px;
}
.ant-radio-group.radio-group-mobile.md {
  line-height: 40px;
}
.ant-radio-group.radio-group-mobile.lg {
  line-height: 44px;
}
.ant-radio-group.radio-group-mobile.radio-buttons-2 .ant-radio-button-wrapper {
  min-width: 45%;
}
.ant-radio-group.radio-group-mobile.radio-buttons-4 .ant-radio-button-wrapper {
  -ms-flex-preferred-size: 20%;
      flex-basis: 20%;
}
.ant-radio-group.radio-group-mobile .ant-radio-button-wrapper {
  text-align: center;
  line-height: inherit;
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
  margin: 5px;
  border-radius: 3px;
  border: none;
  -webkit-transition: all 0.2s ease;
  -o-transition: all 0.2s ease;
  transition: all 0.2s ease;
  color: #546e7a;
  height: 100%;
  background: #f7f9fa;
}
.ant-radio-group.radio-group-mobile .ant-radio-button-wrapper span {
  display: block;
  line-height: inherit;
}
.ant-radio-group.radio-group-mobile .ant-radio-button-wrapper-checked {
  background: #90a4ae;
  color: white;
}
.ant-radio-group.radio-group-mobile .ant-radio-button-wrapper-checked span {
  color: white;
}
.ant-radio-group.radio-group-mobile .ant-radio-button-wrapper-disabled {
  color: #9e9e9e;
  background: #f5f5f5;
}
.ant-radio-group.radio-group-mobile .ant-radio-button-wrapper::before {
  content: none;
}
.ant-radio-group.radio-group-mobile .ant-radio-button-wrapper > span:last-child {
  white-space: nowrap;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__2Am7 {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  opacity: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  background: rgba(0, 0, 0, 0.5);
  -webkit-transition: opacity 0.2s 0.2s;
  -o-transition: opacity 0.2s 0.2s;
  transition: opacity 0.2s 0.2s;
  pointer-events: none;
  z-index: 2;
}
.container__2Am7[data-is-show='true'] {
  -webkit-transition: opacity 0.2s;
  -o-transition: opacity 0.2s;
  transition: opacity 0.2s;
  pointer-events: auto;
  opacity: 1;
}
.container__2Am7[data-is-show='true'] .dialog__XS7t {
  -webkit-transition: -webkit-transform 0.2s;
  transition: -webkit-transform 0.2s;
  -o-transition: transform 0.2s;
  transition: transform 0.2s;
  transition: transform 0.2s, -webkit-transform 0.2s;
  -webkit-transform: translateY(0);
          transform: translateY(0);
}
.container__2Am7[data-dialog-type='WARN'] .confirm__1yDO {
  color: #c62928;
}
.container__2Am7[data-dialog-type='INFO'] .cancel__3MjS {
  display: none;
}
.dialog__XS7t {
  max-width: 300px;
  max-height: 50vh;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  padding: 20px;
  background: white;
  border-radius: 3px;
  -webkit-box-shadow: 1px 1px 10px rgba(0, 0, 0, 0.1);
          box-shadow: 1px 1px 10px rgba(0, 0, 0, 0.1);
  -webkit-transform: translateY(10%);
          transform: translateY(10%);
  -webkit-transition: -webkit-transform 0.2s 0.2s;
  transition: -webkit-transform 0.2s 0.2s;
  -o-transition: transform 0.2s 0.2s;
  transition: transform 0.2s 0.2s;
  transition: transform 0.2s 0.2s, -webkit-transform 0.2s 0.2s;
}
.title__2nO4 {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  font-size: 20px;
  font-weight: normal;
  color: #212121;
  margin-bottom: 15px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.content__Tofu {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  color: #424242;
  font-size: 14px;
  line-height: 21px;
  margin: 0 0 20px;
  overflow-y: auto;
  overflow-x: hidden;
  -webkit-overflow-scrolling: touch;
}
.content__Tofu a {
  color: #546e7a;
  text-decoration: underline;
}
.actions__2xXy {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: stretch;
      -ms-flex-align: stretch;
          align-items: stretch;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.actions__2xXy > button {
  background: transparent;
  border: 1px solid transparent;
  border-radius: 3px;
  font-size: 14px;
  padding: 10px;
  margin-left: 10px;
  -webkit-transition: -webkit-box-shadow 0.2s;
  transition: -webkit-box-shadow 0.2s;
  -o-transition: box-shadow 0.2s;
  transition: box-shadow 0.2s;
  transition: box-shadow 0.2s, -webkit-box-shadow 0.2s;
}
.actions__2xXy > button:focus,
.actions__2xXy > button:hover {
  outline: none;
  -webkit-box-shadow: inset 100vmax 100vmax rgba(0, 0, 0, 0.1);
          box-shadow: inset 100vmax 100vmax rgba(0, 0, 0, 0.1);
}
.cancel__3MjS {
  color: #9e9e9e;
}
.confirm__1yDO {
  color: #455a64;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__1ngB {
  margin: 0 auto;
  max-width: 414px;
  padding: 0 15px;
  width: 100%;
}
.root__1ngB a:hover {
  text-decoration: underline;
}
.root__1ngB ul {
  list-style: none;
  padding: 0;
  margin-bottom: 0;
}
.container__HVQX {
  border-top: 1px solid #eeeeee;
  font-size: 12px;
  padding: 15px 0;
  width: 100%;
}
.contents__-Xrd > *:not(:first-child) {
  margin-top: 8px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__3PTl {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  position: fixed;
  z-index: 1;
  pointer-events: none;
}
.container__3PTl[data-is-show='true'] {
  pointer-events: auto;
}
.container__3PTl[data-is-show='true'] .mask__18Mp {
  opacity: 1;
}
.container__3PTl[data-is-show='true'] .menu__1VnG {
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.container__3PTl .mask__18Mp {
  -webkit-transition: opacity 0.3s;
  -o-transition: opacity 0.3s;
  transition: opacity 0.3s;
  opacity: 0;
}
.container__3PTl .menu__1VnG {
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
  -webkit-transition: -webkit-transform 0.3s;
  transition: -webkit-transform 0.3s;
  -o-transition: transform 0.3s;
  transition: transform 0.3s;
  transition: transform 0.3s, -webkit-transform 0.3s;
}
.mask__18Mp {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  z-index: -1;
  background: rgba(33, 33, 33, 0.7);
}
.menu__1VnG {
  width: 220px;
  overflow-y: auto;
  overflow-x: hidden;
  background: white;
  -webkit-overflow-scrolling: touch;
  padding-top: 0px;
  padding-top: env(safe-area-inset-top);
  padding-left: 0px;
  padding-left: env(safe-area-inset-left);
  padding-bottom: 0px;
  padding-bottom: env(safe-area-inset-bottom);
}
@supports (padding-top: max(0px)) {
  .menu__1VnG {
    padding-top: max( 0px , env(safe-area-inset-top));
  }
}
@supports (padding-left: max(0px)) {
  .menu__1VnG {
    padding-left: max( 0px , env(safe-area-inset-left));
  }
}
@supports (padding-bottom: max(0px)) {
  .menu__1VnG {
    padding-bottom: max( 0px , env(safe-area-inset-bottom));
  }
}
.sign-in-area__3SoC,
.user-profile-area__27UZ,
.items-area__nOYH {
  border-bottom: 1px solid #eeeeee;
}
.sign-in-area__3SoC {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  height: 40px;
  font-size: 14px;
  color: #bdbdbd;
  padding: 0 15px;
}
.sign-in-area__3SoC .link__vGLV {
  color: #37474f;
}
.user-profile-area__27UZ {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  height: 71px;
  overflow: hidden;
  padding: 0 15px;
}
.user-profile-area__27UZ .avatar__TzS7 {
  width: 40px;
  height: 40px;
  margin-right: 10px;
  border-radius: 100%;
}
.user-profile-area__27UZ .username__3TIT {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 14px;
  color: #37474f;
  overflow: hidden;
}
.user-profile-area__27UZ .username__3TIT .icon__35VI {
  width: 24px;
  height: 24px;
  display: none;
}
.user-profile-area__27UZ .username__3TIT span {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: pre;
}
.user-profile-area__27UZ .username__3TIT[data-is-premium='true'] {
  color: #f9a825;
}
.user-profile-area__27UZ .username__3TIT[data-is-premium='true'] .icon__35VI {
  display: initial;
}
.items-area__nOYH {
  margin-bottom: 40px;
}
.items-area__nOYH .item__1t0z {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  height: 40px;
  font-size: 14px;
  color: #37474f;
  overflow: hidden;
  padding: 0 15px;
}
.items-area__nOYH .item__1t0z .icon__35VI {
  width: 18px;
  height: 18px;
  margin-right: 5px;
}
.items-area__nOYH .item__1t0z span {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: pre;
}
.items-area__nOYH .item__1t0z[data-highlight='yellow'] {
  color: #f9a825;
}
.items-area__nOYH .item__1t0z[data-highlight='red'] {
  color: #c62928;
}
.items-area__nOYH hr {
  margin: 0;
  border: none;
  height: 1px;
  background: #eeeeee;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.navbar__AHrX {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  height: 46px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  background-color: white;
  border-bottom: 1px solid #eeeeee;
  z-index: 1;
  padding-top: 0px;
  padding-top: env(safe-area-inset-top);
  padding-left: 0px;
  padding-left: env(safe-area-inset-left);
  padding-right: 0px;
  padding-right: env(safe-area-inset-right);
}
@supports (padding-top: max(0px)) {
  .navbar__AHrX {
    padding-top: max( 0px , env(safe-area-inset-top));
  }
}
@supports (padding-left: max(0px)) {
  .navbar__AHrX {
    padding-left: max( 0px , env(safe-area-inset-left));
  }
}
@supports (padding-right: max(0px)) {
  .navbar__AHrX {
    padding-right: max( 0px , env(safe-area-inset-right));
  }
}
.icon__3fRV {
  width: 24px;
  height: 24px;
}
.navbar-item__l60U {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  color: #b0bec5;
}
.navbar-item__l60U[data-is-hide='true'] {
  opacity: 0;
  pointer-events: none;
}
.menu__BkpU {
  width: 24px;
  height: 24px;
  margin-left: 10px;
}
.account__sdB0 {
  width: 24px;
  height: 24px;
  color: inherit;
  margin-right: 10px;
  margin-left: auto;
}
.logo__1h04 {
  height: 23px;
  margin-left: auto;
  margin-right: auto;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__zavH {
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  width: 100%;
  height: 100%;
  background: #eeeeee;
  border: 1px solid #f3e3a3;
}
.content__2JIi {
  color: #cccccc;
  padding: 20px;
  font-size: 20px;
  font-weight: 500;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.link__2hnE {
  color: inherit;
}
.btn__r7r7 {
  outline: 0;
  border: 0;
  line-height: 12px;
  background: transparent;
  cursor: pointer;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
}
.btn__r7r7:disabled {
  cursor: not-allowed;
  color: rgba(120, 144, 156, 0.3);
}
.btn__r7r7 svg {
  margin: 0 6px 0 0;
  width: 14px;
  height: 14px;
}
.btn__r7r7 svg:last-child {
  margin: 0;
}
.btn__r7r7:not(:disabled):hover,
.btn__r7r7:not(:disabled):focus {
  color: #263238;
}
.btn__r7r7:not(:disabled):active {
  color: #263238;
  opacity: 0.9;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.empty-list__32vS {
  width: 100%;
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.empty-list-label__25lw {
  -ms-flex-item-align: center;
      align-self: center;
  font-size: 26px;
  text-align: center;
  color: #424242;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-picker-mask__396x {
  position: fixed;
  width: 100%;
  height: 100%;
  background: #212121;
  will-change: opacity;
  -webkit-transition: opacity 0.2s ease;
  -o-transition: opacity 0.2s ease;
  transition: opacity 0.2s ease;
}
.question-picker-mask__396x.show__3zYv {
  opacity: 0.7;
}
.question-picker-mask__396x.hide__3nyv {
  opacity: 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.picker-toolbar__rvrv {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  width: 100%;
  padding: 14px 20px;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  border-bottom: 1px solid #424242;
  color: #9e9e9e;
  overflow: hidden;
}
.list-filter__2u_1 {
  margin-right: 40px;
  font-size: 16px;
  text-align: center;
  line-height: 32px;
  cursor: pointer;
}
.filter-toggle-highlighted__3U9c {
  color: white !important;
  border-color: white !important;
}
.list-filter-selected__3kA9 {
  margin-right: 7px;
  max-width: 150px;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  overflow: hidden;
  white-space: nowrap;
}
.list-filter-icon__Icmo {
  -ms-flex-item-align: center;
      align-self: center;
}
.handlers__ilNW {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
}
.handlers__ilNW .space__2UuM {
  width: 10px;
}
.picker-toolbar-search__1aUG {
  width: 140px;
}
.picker-toolbar-select__2ww1 {
  width: 55px;
}
.applied-filters__2qlj {
  font-size: 14px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  padding: 10px 20px;
  border-bottom: 1px solid #424242;
}
.applied-filters__2qlj > .applied-filters-item__1mJm {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 5px 10px;
  height: 24px;
  border-radius: 12px;
  color: white;
  border: 1px solid white;
  margin: 3px 5px 3px 0;
}
.filter-close-icon-wrapper__3p5f {
  font-size: 24px;
  width: 100%;
  margin: 0 40px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.filter-close-icon-wrapper__3p5f > .filter-close-icon__zaGY {
  cursor: pointer;
  -webkit-transition: color 0.15s ease-in-out;
  -o-transition: color 0.15s ease-in-out;
  transition: color 0.15s ease-in-out;
  color: #757575;
}
.filter-close-icon-wrapper__3p5f > .filter-close-icon__zaGY:hover:not([disabled]) {
  color: white;
  -webkit-transition: color 0.15s ease-in-out;
  -o-transition: color 0.15s ease-in-out;
  transition: color 0.15s ease-in-out;
}
.applied-filters-clear-icon__3Uow {
  cursor: pointer;
  -webkit-transition: color 0.15s ease-in-out;
  -o-transition: color 0.15s ease-in-out;
  transition: color 0.15s ease-in-out;
  margin-left: 4px;
}
.applied-filters-clear-icon__3Uow:hover:not([disabled]) {
  color: #757575;
  -webkit-transition: color 0.15s ease-in-out;
  -o-transition: color 0.15s ease-in-out;
  transition: color 0.15s ease-in-out;
}
.problem-filter__bTxs {
  width: 100%;
  font-size: 14px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  padding: 10px 20px 0 20px;
  border-bottom: 1px solid #424242;
}
.problem-filter-difficulty__2vyY,
.problem-filter-status__2Hqb,
.problem-filter-topics__39Qe,
.problem-filter-companies__QFav {
  width: 50%;
}
@media (max-width: 650px) {
  .problem-filter-difficulty__2vyY,
  .problem-filter-status__2Hqb,
  .problem-filter-topics__39Qe,
  .problem-filter-companies__QFav {
    width: 100%;
  }
}
.clear-all-icon__xCiB {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 20px;
  cursor: pointer;
  margin: 0 10px;
  color: #757575;
  -webkit-transition: color 0.15s ease-in-out;
  -o-transition: color 0.15s ease-in-out;
  transition: color 0.15s ease-in-out;
}
.clear-all-icon__xCiB:hover:not([disabled]) {
  -webkit-transition: color 0.15s ease-in-out;
  -o-transition: color 0.15s ease-in-out;
  transition: color 0.15s ease-in-out;
  color: white;
}
.problem-filter-select-wrapper__4_CM {
  width: 100%;
  margin: 5px 0;
}
.problem-filter-select-wrapper-selected__2cAg {
  color: white;
}
.problem-filter-select__3uyY {
  height: 28px;
  max-width: 200px;
}
.problem-filter-select__3uyY.ant-select-open > .ant-select-selection {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.problem-filter-select-icon__30yO {
  font-size: 20px;
  margin-top: -3px;
}
.problem-filter-leetcoin__2mUx {
  margin-right: 5px;
  line-height: 12px;
}
.problem-filter-button-wrapper__3-sY {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  -ms-flex-wrap: nowrap;
      flex-wrap: nowrap;
  width: 100%;
}
.problem-filter-button-wrapper__3-sY > .problem-filter-label__1scL {
  color: #e0e0e0;
  min-width: 85px;
}
.problem-filter-button-wrapper__3-sY > .problem-filter-buttons__1TEn {
  width: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
}
.problem-filter-button-wrapper__3-sY > .problem-filter-buttons__1TEn > .problem-filter-button__3I_W {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 0 7px;
  margin: 5px 5px 5px 0;
  border: 1px solid #757575;
  border-radius: 3px;
  height: 24px;
  cursor: pointer;
  color: #757575;
  -webkit-transition: 0.15s ease-in-out;
  -o-transition: 0.15s ease-in-out;
  transition: 0.15s ease-in-out;
  -webkit-transition-property: color, border-color;
  -o-transition-property: color, border-color;
  transition-property: color, border-color;
}
.problem-filter-button-wrapper__3-sY > .problem-filter-buttons__1TEn > .problem-filter-button__3I_W:hover:not([disabled]) {
  -webkit-transition: 0.15s ease-in-out;
  -o-transition: 0.15s ease-in-out;
  transition: 0.15s ease-in-out;
  -webkit-transition-property: color, border-color;
  -o-transition-property: color, border-color;
  transition-property: color, border-color;
  color: white;
  border-color: white;
  background: #212121;
}
.problem-filter-button-wrapper__3-sY > .problem-filter-buttons__1TEn > .problem-filter-button-selected__23Qe {
  color: white;
  border-color: white;
}
.list-filter-popover-wrapper__3_W5 {
  min-width: 160px;
}
.list-filter-popover-wrapper__3_W5 .list-filter-popover__1sB8 {
  padding: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.list-filter-popover-wrapper__3_W5 .list-filter-popover__1sB8 .list-filter-popover-item__2tKt {
  margin-bottom: 15px;
  border: none;
}
.list-filter-popover-wrapper__3_W5 .list-filter-popover__1sB8 .list-filter-popover-item__2tKt:last-child {
  margin-bottom: 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-list__3ytE {
  padding: 10px 0;
  height: 100%;
}
.question-list__3ytE .question__1Nd3 {
  padding: 10px 20px 10px 20px;
  cursor: pointer;
  background: transparent;
  color: #9e9e9e;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  width: 100%;
  line-height: 16px;
  -webkit-transition: all 0.2s ease;
  -o-transition: all 0.2s ease;
  transition: all 0.2s ease;
}
.question-list__3ytE .question__1Nd3.active__iWA5 {
  color: white;
}
.question-list__3ytE .question__1Nd3:hover {
  color: white;
  background: #424242;
}
.question-list__3ytE .question__1Nd3:last-child {
  margin-bottom: 0;
}
.question-row-left__DzOu {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.question-row-left__DzOu .question-status__2HIo {
  width: 16px;
  height: 16px;
  background: transparent;
  margin-right: 4px;
}
.question-row-left__DzOu .question-status__2HIo .question-row-icon__1x3B {
  width: 100%;
  height: 100%;
  vertical-align: inherit;
}
.question-row-right__21IS {
  text-transform: capitalize;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.question-row-right__21IS .paid-only-status__3tei {
  display: block;
  width: 15px;
  height: 15px;
  background: transparent;
  margin-left: 4px;
}
.question-row-right__21IS .paid-only-status__3tei .paid-only-icon__wo3f {
  width: 100%;
  height: 100%;
  vertical-align: inherit;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-picker-detail-menu__1-eB {
  max-width: 650px;
  width: 100%;
  height: 100%;
  background: #212121;
  position: relative;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -ms-flex-wrap: nowrap;
      flex-wrap: nowrap;
  -webkit-transition: -webkit-transform 0.2s ease;
  transition: -webkit-transform 0.2s ease;
  -o-transition: transform 0.2s ease;
  transition: transform 0.2s ease;
  transition: transform 0.2s ease, -webkit-transform 0.2s ease;
}
.question-picker-detail-menu__1-eB.show__N-Ie {
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.question-picker-detail-menu__1-eB.hide___lrv {
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
}
.question-picker-detail-menu__1-eB .question-picker-toolbar-wrapper__d-2J {
  -webkit-box-flex: 0;
      -ms-flex-positive: 0;
          flex-grow: 0;
}
.question-picker-detail-menu__1-eB .question-picker-questions-wrapper__2JGX {
  height: calc(100% - 61px);
  overflow: hidden;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-picker-detail__Rehh {
  position: fixed;
  width: 100%;
  height: 100%;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  pointer-events: none;
}
.question-picker-detail__Rehh.show__1vkQ {
  pointer-events: auto;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-fast-picker-wrapper__2Y97 {
  width: 100%;
  border-top: 1px solid #eeeeee;
  background: #ffffff;
  font-size: 13px;
}
.question-fast-picker-wrapper__2Y97[data-is-over-edged='false'] .picker-pagination-handlers__1MLX > button:first-child {
  padding-left: 8px;
}
.question-fast-picker-wrapper__2Y97[data-is-over-edged='false'] .picker-pagination-handlers__1MLX > button:last-child {
  padding-right: 8px;
}
.question-fast-picker-wrapper__2Y97[data-is-over-edged='true'] .question-fast-picker__3VcA {
  padding: 10px 0 10px 20px;
}
.question-fast-picker-wrapper__2Y97[data-is-over-edged='true'] .question-fast-picker__3VcA button svg {
  margin: 0;
}
.question-fast-picker-wrapper__2Y97[data-is-over-edged='true'] .space-filler__1toa {
  -ms-flex-preferred-size: 15px;
      flex-basis: 15px;
}
.question-fast-picker-wrapper__2Y97[data-is-over-edged='true'] .handler-text__1hMU {
  display: none;
}
.question-fast-picker__3VcA {
  width: 100%;
  padding: 10px 0 10px 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.picker-menu-handler__34CD {
  min-width: 0;
  max-width: 115px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: pre;
}
.picker-menu-handler__34CD svg {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
}
.picker-handlers__2fqm {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
  min-width: 0;
  -webkit-transition: -webkit-transform 0.3s;
  transition: -webkit-transform 0.3s;
  -o-transition: transform 0.3s;
  transition: transform 0.3s;
  transition: transform 0.3s, -webkit-transform 0.3s;
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.picker-handlers__2fqm[data-is-resizer-bar-active='true'] {
  -webkit-transform: translateX(-10px);
          transform: translateX(-10px);
}
.shuffle-handler__3Gzu {
  white-space: nowrap;
}
.space-filler__1toa {
  -ms-flex-preferred-size: 40px;
      flex-basis: 40px;
  -ms-flex-negative: 1;
      flex-shrink: 1;
  min-width: 15px;
}
.picker-pagination-handlers__1MLX {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.pagination-screen__12p7 {
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
  width: 80px;
  text-align: center;
  -ms-flex-item-align: center;
      align-self: center;
}
.problem-tooltip__2h6P {
  white-space: nowrap;
  font-size: 13px;
}
.handler-text__1hMU {
  white-space: nowrap;
}
.handler-text__1hMU,
.shuffle-icon__dV27 {
  color: #455a64;
}
.handler-icon__26i5 {
  color: #607d8b;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.picker-toolbar__1dzL {
  width: 100%;
  height: 44px;
  line-height: 44px;
  position: relative;
  z-index: 10;
}
.picker-toolbar__1dzL .picker-toolbar-container__2hQD {
  background: #212121;
  width: 100%;
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  z-index: 10;
  position: relative;
}
.picker-toolbar__1dzL .picker-toolbar-container__2hQD.hide__2_XR {
  display: none;
}
.picker-toolbar__1dzL .question-list-picker__3Z_G {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  color: #bdbdbd;
  padding: 0 15px;
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
}
.picker-toolbar__1dzL .question-list-picker__3Z_G .question-list-selected__3CIT {
  margin-right: 5px;
  max-width: 150px;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  overflow: hidden;
  display: block;
  white-space: nowrap;
}
.picker-toolbar__1dzL .question-list-picker__3Z_G .question-list-icon__tiir {
  -ms-flex-item-align: center;
      align-self: center;
}
.picker-toolbar__1dzL .question-operation__3H4O {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.picker-toolbar__1dzL .question-operation__3H4O .question-search__1x4_,
.picker-toolbar__1dzL .question-operation__3H4O .question-filter__BxZa {
  -ms-flex-item-align: center;
      align-self: center;
  color: #bdbdbd;
  padding: 0 15px;
}
.question-filter-modal__wcba {
  padding: 5px;
}
.question-picker-toolbar-icon__1TZK {
  width: 15px;
  height: 15px;
}
.picker-search__2b4I {
  position: absolute;
  left: 0;
  width: 100%;
  height: 100%;
  background: #212121;
  pointer-events: none;
}
.picker-search__2b4I .question-operation__3H4O .question-filter__BxZa,
.picker-search__2b4I .question-operation__3H4O .question-search__1x4_ {
  height: 100%;
}
.picker-search__2b4I .fake-solid-grey-border__WyOF {
  position: absolute;
  bottom: -1px;
  height: 1px;
  width: 100%;
  left: 0;
  right: 0;
  z-index: 0;
  background: #424242;
}
.picker-search__2b4I .fake-border__14aS {
  position: absolute;
  bottom: -1px;
  right: 45px;
  width: calc(100% - 45px);
  height: 1px;
  background: white;
  z-index: 1;
  -webkit-transform: scaleX(0);
          transform: scaleX(0);
  -webkit-transform-origin: right;
          transform-origin: right;
  -webkit-transition: -webkit-transform 0.2s ease;
  transition: -webkit-transform 0.2s ease;
  -o-transition: transform 0.2s ease;
  transition: transform 0.2s ease;
  transition: transform 0.2s ease, -webkit-transform 0.2s ease;
  will-change: transform;
  overflow: hidden;
}
.picker-search__2b4I .question-picker-toolbar-icon__1TZK {
  color: #bdbdbd;
  -webkit-transition: all 1s ease;
  -o-transition: all 1s ease;
  transition: all 1s ease;
  will-change: all;
  display: inline;
  -ms-flex-item-align: center;
      align-self: center;
  -webkit-transform: translate(0, 0);
          transform: translate(0, 0);
  z-index: 1;
}
.picker-search-input__3zoV {
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
  display: none;
}
.picker-search-input__3zoV input {
  border: none;
  width: calc(100% + 45px);
  height: 100%;
  background: transparent;
  padding: 0 45px 0 15px;
  color: white;
  position: relative;
}
.picker-search-input__3zoV input:focus,
.picker-search-input__3zoV input:active {
  outline: none;
}
.picker-search__2b4I.show__11m6 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  pointer-events: auto;
}
.picker-search__2b4I.show__11m6 .fake-border__14aS.show__11m6 {
  -webkit-transform: scaleX(1);
          transform: scaleX(1);
}
.picker-search__2b4I.show__11m6 .question-search__1x4_ .question-picker-toolbar-icon__1TZK {
  color: white;
}
.picker-search__2b4I.show__11m6 .picker-search-input__3zoV {
  display: block;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-list__2Owf {
  padding: 5px 0;
  height: 100%;
  background: #212121;
  width: 100%;
  overflow-y: auto;
  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  -webkit-overflow-scrolling: touch;
}
.question-list__2Owf .question__zgKb {
  padding: 10px;
  cursor: pointer;
  background: transparent;
  color: #9e9e9e;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  width: 100%;
  line-height: 16px;
  -webkit-transition: all 0.2s ease;
  -o-transition: all 0.2s ease;
  transition: all 0.2s ease;
}
.question-list__2Owf .question__zgKb.active__1In3 {
  color: white;
}
.question-list__2Owf .question__zgKb:hover {
  color: white;
  background: #424242;
}
.question-list__2Owf .question__zgKb:last-child {
  margin-bottom: 0;
}
.question-row-left__DQxw {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 1;
      -ms-flex: 1 0 0px;
          flex: 1 0 0;
  overflow: hidden;
}
.question-row-left__DQxw .question-status__OkYm {
  width: 14px;
  height: 14px;
  background: transparent;
  margin-right: 4px;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 14px;
          flex: 0 0 14px;
}
.question-row-left__DQxw .question-status__OkYm .question-row-icon__gF1_ {
  width: 100%;
  height: 100%;
  vertical-align: inherit;
}
.question-row-left__DQxw .question-row-title__1iZ6 {
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
  font-size: 14px;
  line-height: 14px;
  overflow: hidden;
}
.question-row-right__1XEn {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-item-align: center;
      align-self: center;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  width: 20px;
}
.question-row-right__1XEn .level__1a2u {
  display: block;
  width: 6px;
  height: 6px;
  border-radius: 50%;
}
.question-row-right__1XEn .level__1a2u.easy__1A6i {
  background: #009688;
}
.question-row-right__1XEn .level__1a2u.medium__2Chh {
  background: #f07c18;
}
.question-row-right__1XEn .level__1a2u.hard__8sIy {
  background: #c62928;
}
.question-row-right__1XEn .paid-only-icon__2WsX {
  margin-right: -3.5px;
}
.question-row-right__1XEn .paid-only-icon__2WsX.easy__1A6i {
  color: #009688;
}
.question-row-right__1XEn .paid-only-icon__2WsX.medium__2Chh {
  color: #f07c18;
}
.question-row-right__1XEn .paid-only-icon__2WsX.hard__8sIy {
  color: #c62928;
}
.load-more__3u6z {
  opacity: 0.5;
  -webkit-transform: scale(0.8);
          transform: scale(0.8);
  -webkit-transform-origin: center;
          transform-origin: center;
}
.load-more__3u6z,
.no-more__4Zx- {
  width: 100%;
  height: 40px;
  background: transparent;
}
.no-more__4Zx- {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.no-more__4Zx- span {
  color: #757575;
  margin: 0 15px;
}
.no-more__4Zx- span,
.no-more__4Zx-::before,
.no-more__4Zx-::after {
  -ms-flex-item-align: center;
      align-self: center;
}
.no-more__4Zx-::before,
.no-more__4Zx-::after {
  content: '';
  width: 30%;
  height: 1px;
  display: block;
}
.no-more__4Zx-::before {
  background: -webkit-gradient(linear, right top, left top, from(#757575), to(#212121));
  background: -webkit-linear-gradient(right, #757575, #212121);
  background: -o-linear-gradient(right, #757575, #212121);
  background: linear-gradient(-90deg, #757575, #212121);
}
.no-more__4Zx-::after {
  background: -webkit-gradient(linear, right top, left top, from(#212121), to(#757575));
  background: -webkit-linear-gradient(right, #212121, #757575);
  background: -o-linear-gradient(right, #212121, #757575);
  background: linear-gradient(-90deg, #212121, #757575);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-picker-detail-menu__3-OP {
  width: calc(100% - 40px);
  height: 100%;
  background: #212121;
  position: relative;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -ms-flex-wrap: nowrap;
      flex-wrap: nowrap;
  -webkit-transition: -webkit-transform 0.2s ease;
  transition: -webkit-transform 0.2s ease;
  -o-transition: transform 0.2s ease;
  transition: transform 0.2s ease;
  transition: transform 0.2s ease, -webkit-transform 0.2s ease;
}
.question-picker-detail-menu__3-OP.show__3fUu {
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.question-picker-detail-menu__3-OP.hide__1_3D {
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
}
.question-picker-detail-menu__3-OP .question-picker-toolbar-wrapper__1p10 {
  -webkit-box-flex: 0;
      -ms-flex-positive: 0;
          flex-grow: 0;
}
.question-picker-detail-menu__3-OP .question-picker-questions-wrapper__RJIX {
  height: calc(100% - 44px);
  overflow: hidden;
  position: relative;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-picker-detail__1dO9 {
  position: fixed;
  width: 100%;
  height: 100%;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  pointer-events: none;
  z-index: 1;
}
.question-picker-detail__1dO9.show__7wCq {
  pointer-events: auto;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.content__2buf {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  margin-bottom: 10px;
}
.content__2buf > svg {
  width: 50px;
  height: 50px;
  color: #f9a825;
}
.content__2buf > p {
  font-size: 14px;
  line-height: 24px;
  text-align: center;
  color: #424242;
  margin: 10px auto 30px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.action__2WAi {
  font-size: 14px;
  margin-left: 15px;
  white-space: nowrap;
  opacity: 0;
  -webkit-transition: opacity 0.3s;
  -o-transition: opacity 0.3s;
  transition: opacity 0.3s;
  pointer-events: none;
}
.action__2WAi,
.action__2WAi:hover,
.action__2WAi:active,
.action__2WAi:focus,
.action__2WAi:visited {
  color: #f07c18;
  text-decoration: underline;
}
.action__2WAi[data-is-show='true'] {
  opacity: 1;
  pointer-events: auto;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.visualizer__15Tr {
  position: absolute;
  height: 100%;
  width: 100%;
  z-index: 10;
  top: 0;
  background: white;
  opacity: 0.9;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__2fED {
  display: inline-block;
  width: 25%;
}
.root__2fED[data-icon='weibo'] svg {
  color: #e6162d;
}
.root__2fED[data-icon='qq'] svg {
  color: #01beff;
}
.root__2fED[data-icon='douban'] svg {
  color: #2d963e;
}
.root__2fED[data-icon='linkedin-o'] svg {
  color: #006a9a;
}
.root__2fED[data-icon='linkedin-c'] svg {
  color: #006a9a;
}
.root__2fED[data-icon='twitter'] svg {
  color: #03aced;
}
.root__2fED[data-icon='google-plus'] svg {
  color: #dd4b39;
}
.root__2fED[data-icon='facebook'] svg {
  color: #3a5998;
}
.root__2fED[data-icon='wechat'] svg {
  color: #00c800;
}
.icon__1sW1 {
  text-align: center;
  margin: 0 auto;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  width: 40px;
  height: 40px;
  border-radius: 40px;
  background: transparent;
}
.icon__1sW1 > svg {
  width: 40px;
  height: 40px;
}
.icon__1sW1 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  width: 28px;
  height: 28px;
  border-radius: 28px;
  background: transparent;
}
.icon__1sW1 > svg {
  width: 28px;
  height: 28px;
}
.icon__1sW1[data-region='china'] {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  width: 20px;
  height: 20px;
  border-radius: 20px;
  background: transparent;
}
.icon__1sW1[data-region='china'] > svg {
  width: 20px;
  height: 20px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.icon-area__oZoj {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  min-width: 120px;
}
.wechat__2dmu {
  width: 71%;
  min-width: 110px;
  margin: 15px auto 0;
}
.wechat__2dmu .tips__1sHi {
  color: #546e7a;
  font-size: 12px;
  font-weight: bold;
  text-align: center;
  white-space: nowrap;
  margin: 10px 0 0;
  letter-spacing: 4px;
  -webkit-transform: translateX(2px);
          transform: translateX(2px);
}
.wechat__2dmu .qr-code-area__oY5s {
  position: relative;
}
.wechat__2dmu .qr-code-area__oY5s .logo__Rg3n {
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  background: white;
  width: 24px;
  height: 24px;
  border-radius: 3px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.wechat__2dmu .qr-code-area__oY5s .logo__Rg3n > svg {
  width: 80%;
  height: 80%;
  color: #00c800;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.popover__1EqU {
  min-width: 155px;
}
.popover__1EqU .ant-popover-content .ant-popover-inner-content {
  padding: 15px 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.create-favorite-pannel__3sAQ {
  margin: 10px 0;
}
.favorite-name-input__3XsI {
  margin-bottom: 10px;
  width: 100%;
}
.create-favorite-block__1jwP {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.select-wrapper__2Tj2 {
  width: 100%;
  margin-right: 15px;
  min-width: calc((100% - 15px) / 2);
}
.create-button__2rq- {
  width: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.icon__1bhm {
  margin-right: 5px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.favorites__aU5X {
  border: 1px solid #eceff1;
  padding: 5px;
  overflow-y: auto;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  -webkit-overflow-scrolling: touch;
}
.desktop__3NG_ {
  width: 210px;
}
.desktop__3NG_ > .favorites__aU5X {
  max-height: 290px;
}
.mobile__3Srw {
  width: 100%;
}
.mobile__3Srw > .favorites__aU5X {
  max-height: 140px;
}
.favorite-name__2lt6 {
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.favorite-name-wrapper__3eeC {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
  overflow: hidden;
}
.favorite-selected__2FJC {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  font-size: 12px;
  width: 100%;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  height: 30px;
  color: #546e7a;
  padding: 0 5px;
  cursor: pointer;
  background-color: #f7f9fa;
}
.favorite-selected__2FJC:not(:nth-last-child(2)) {
  margin-bottom: 5px;
}
.favorite-selected__2FJC:hover {
  background-color: #f7f9fa;
}
.favorite-unselected__k2rQ {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  font-size: 12px;
  width: 100%;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  height: 30px;
  color: #546e7a;
  padding: 0 5px;
  cursor: pointer;
}
.favorite-unselected__k2rQ:not(:nth-last-child(2)) {
  margin-bottom: 5px;
}
.favorite-unselected__k2rQ:hover {
  background-color: #f7f9fa;
}
.favorite-button__KrZu {
  width: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin-top: 10px;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.favorite-button__KrZu:last-child {
  margin-top: 0;
}
.open-my-list-button__1k0I {
  display: block;
  margin: 15px auto 5px;
  text-align: center;
  color: #546e7a;
}
.open-my-list-button__1k0I:hover {
  color: #263238;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__1oGv {
  position: relative;
}
.container__1oGv[data-show-mask='true']::after {
  content: '';
  position: absolute;
  background: white;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
}
.container__1oGv .wrapper__3MwT {
  padding: 12px 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.container__1oGv .wrapper__3MwT[data-constrained-width='true'] {
  max-width: 1240px;
}
.left__1BZt {
  overflow: hidden;
  margin-right: 12px;
}
.left__1BZt .title__20p2 {
  margin: 0;
  font-size: 16px;
  line-height: 16px;
}
.left__1BZt .title__20p2 a {
  color: #212121;
  text-decoration: none;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: pre;
}
.left__1BZt .tools__wTOC {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  color: #78909c;
  margin-top: 12px;
  font-size: 12px;
  line-height: 12px;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.left__1BZt .tools__wTOC .button__1hMm {
  margin-right: 6px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 0 10px;
}
.left__1BZt .tools__wTOC .difficulty__3PK8 {
  margin-right: 15px;
}
.left__1BZt .tools__wTOC .difficulty__3PK8[data-small-spacing='true'] {
  margin-right: 10px;
}
.left__1BZt .tools__wTOC .difficulty__3PK8[data-degree='easy'] {
  color: #009688;
}
.left__1BZt .tools__wTOC .difficulty__3PK8[data-degree='medium'] {
  color: #f07c18;
}
.left__1BZt .tools__wTOC .difficulty__3PK8[data-degree='hard'] {
  color: #c62928;
}
.right__8eE9 {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
}
.right__8eE9 .submission__1ELT {
  text-align: center;
  line-height: 1;
}
.right__8eE9 .submission__1ELT .type__QZzI {
  margin: 0;
  color: #9e9e9e;
  font-size: 12px;
}
.right__8eE9 .submission__1ELT .count__3gbh {
  margin: 10px 0 0;
  font-family: FetteMittelschrift, sans-serif;
  font-size: 16px;
}
.right__8eE9 .separator__1qMW {
  margin: 0 20px;
  width: 1px;
  height: 100%;
  background: #eeeeee;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.help-menu__3FaU {
  padding: 5px 0;
}
.content__R0nn {
  color: #90a4ae;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.content__R0nn:hover {
  color: #546e7a;
}
.on__7Od1 {
  color: #546e7a;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__2WTi {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 10px 20px;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  border-top: 1px solid #eeeeee;
  z-index: 1;
  background: white;
  font-size: 13px;
}
.container__2WTi .func__1DsC {
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.container__2WTi .status__1eAa {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.container__2WTi .status__1eAa > span {
  white-space: nowrap;
  font-weight: bold;
  color: #546e7a;
}
.container__2WTi .action__38Xc {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin-left: auto;
}
.container__2WTi .action__38Xc .runcode__1EDI {
  margin-right: 15px;
  min-width: 80px;
}
.container__2WTi .action__38Xc .runcode__1EDI:not(:disabled) {
  border-color: #b0bec5;
}
.container__2WTi .action__38Xc .runcode__1EDI:not(:disabled):hover {
  border-color: #263238;
  color: #263238;
  background-color: #eceff1;
}
.container__2WTi[data-size='md'] {
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.container__2WTi[data-size='md'] .func__1DsC {
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  width: 100%;
  margin-bottom: 15px;
}
.container__2WTi[data-size='md'] .status__1eAa {
  -ms-flex-item-align: start;
      align-self: flex-start;
  margin-bottom: 15px;
}
.container__2WTi[data-size='md'] .action__38Xc {
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  width: 100%;
}
.container__2WTi[data-size='md'] .action__38Xc .runcode__1EDI,
.container__2WTi[data-size='md'] .action__38Xc .submit__2ISl {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.custom-testcase__2ah7 {
  background-color: transparent;
  border: none;
  outline: none;
  color: #607d8b;
  cursor: pointer;
  margin-right: 20px;
  padding: 0;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.contribute__2Kih {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  cursor: pointer;
  color: #607d8b;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.submit__2ISl {
  min-width: 80px;
}
.test-mode__BfQm {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  color: #607d8b;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
  margin-left: 15px;
}
.queue-animation__2KGZ {
  padding-right: 5px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.code-area__-pmi,
.content__1YQ2,
.editor__2V9B {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.code-area__-pmi {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  overflow-x: hidden;
  overflow-y: auto;
  z-index: 0;
}
.editor__2V9B {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
.content__1YQ2 {
  -webkit-box-flex: 1;
      -ms-flex: 1 0 auto;
          flex: 1 0 auto;
  position: relative;
}
.result__33LP {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  border-left: 1px solid #eeeeee;
}
.reset-code-prompt__20D9 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 12px;
  margin-right: 50px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.reset-code-prompt__20D9 > .reset-code-btn__3e9F,
.reset-code-prompt__20D9 > .reset-code-btn__3e9F:hover:not([disabled]),
.reset-code-prompt__20D9 > .reset-code-btn__3e9F:focus:not([disabled]) {
  border: none;
  background: transparent;
  padding: 6px;
  line-height: 12px;
  height: 24px;
  -webkit-transition: color 0.2s ease-in-out 0s;
  -o-transition: color 0.2s ease-in-out 0s;
  transition: color 0.2s ease-in-out 0s;
  text-decoration: underline;
  color: #546e7a;
}
.reset-code-prompt__20D9 > .reset-code-btn__3e9F:hover,
.reset-code-prompt__20D9 > .reset-code-btn__3e9F:hover:not([disabled]):hover,
.reset-code-prompt__20D9 > .reset-code-btn__3e9F:focus:not([disabled]):hover {
  -webkit-transition: color 0.2s ease-in-out 0s;
  -o-transition: color 0.2s ease-in-out 0s;
  transition: color 0.2s ease-in-out 0s;
  color: #37474f;
}
.reset-code-prompt__20D9 > .reset-code-btn-warn__3gAN,
.reset-code-prompt__20D9 > .reset-code-btn-warn__3gAN:hover:not([disabled]),
.reset-code-prompt__20D9 > .reset-code-btn-warn__3gAN:focus:not([disabled]) {
  border: none;
  background: transparent;
  padding: 6px;
  line-height: 12px;
  height: 24px;
  -webkit-transition: color 0.2s ease-in-out 0s;
  -o-transition: color 0.2s ease-in-out 0s;
  transition: color 0.2s ease-in-out 0s;
  text-decoration: underline;
  color: #f9a825;
}
.reset-code-prompt__20D9 > .reset-code-btn-warn__3gAN:hover,
.reset-code-prompt__20D9 > .reset-code-btn-warn__3gAN:hover:not([disabled]):hover,
.reset-code-prompt__20D9 > .reset-code-btn-warn__3gAN:focus:not([disabled]):hover {
  -webkit-transition: color 0.2s ease-in-out 0s;
  -o-transition: color 0.2s ease-in-out 0s;
  transition: color 0.2s ease-in-out 0s;
  color: #f07c18;
}
.confirm-footer__QFiU {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.confirm-footer__QFiU .confirm-btn__2z99 {
  margin-left: 15px;
}
.error-container__3Mz_ {
  position: absolute;
  bottom: 0;
  left: 0;
  z-index: 4;
  width: 100%;
  padding: 10px;
}
.verify-link__Y-hS {
  color: #c62928;
}
.verify-link__Y-hS:hover,
.verify-link__Y-hS:focus {
  color: #c62928;
  text-decoration: underline;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.content__3fR6 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  min-height: 0;
  z-index: 0;
}
.content__3fR6 > div {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  min-height: 0;
}
.side-tools-wrapper__1TS9,
.editor-wrapper__1ru6 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.side-tools-wrapper__1TS9,
.resize-bar__2_sK {
  z-index: 1;
}
.editor-wrapper__1ru6 {
  z-index: 0;
  overflow-y: auto;
  position: relative;
}
.resize-bar__2_sK {
  background: -webkit-gradient(linear, left top, left bottom, color-stop(10%, #fafafa), color-stop(90%, white));
  background: -webkit-linear-gradient(top, #fafafa 10%, white 90%);
  background: -o-linear-gradient(top, #fafafa 10%, white 90%);
  background: linear-gradient(to bottom, #fafafa 10%, white 90%);
  color: #b0bec5;
}
.resize-bar__2_sK::before,
.resize-bar__2_sK::after,
.resize-bar__2_sK .arrow-indicator__2U1G {
  content: '';
  position: absolute;
  pointer-events: none;
}
.resize-bar__2_sK::after,
.resize-bar__2_sK .arrow-indicator__2U1G {
  top: 39.7%;
  left: 50%;
  -webkit-transform: translateX(-50%);
          transform: translateX(-50%);
  -webkit-transition: opacity 0.3s, -webkit-transform 0.3s;
  transition: opacity 0.3s, -webkit-transform 0.3s;
  -o-transition: opacity 0.3s, transform 0.3s;
  transition: opacity 0.3s, transform 0.3s;
  transition: opacity 0.3s, transform 0.3s, -webkit-transform 0.3s;
}
.resize-bar__2_sK .arrow-indicator__2U1G {
  opacity: 0;
  -webkit-transform: translateX(-50%) scaleX(1.3) scaleY(1.3);
          transform: translateX(-50%) scaleX(1.3) scaleY(1.3);
}
.resize-bar__2_sK .arrow-indicator__2U1G path {
  fill: currentColor;
}
.resize-bar__2_sK::after {
  opacity: 1;
  width: 2px;
  height: 2px;
  border-radius: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  background: currentColor;
  -webkit-box-shadow: 0 8px 0 currentColor, 0 16px 0 currentColor,
      0 24px 0 currentColor, 0 32px 0 currentColor, 0 40px 0 currentColor;
          box-shadow: 0 8px 0 currentColor, 0 16px 0 currentColor,
      0 24px 0 currentColor, 0 32px 0 currentColor, 0 40px 0 currentColor;
  -webkit-transition: background-color 0.3s, -webkit-box-shadow 0.3s;
  transition: background-color 0.3s, -webkit-box-shadow 0.3s;
  -o-transition: background-color 0.3s, box-shadow 0.3s;
  transition: background-color 0.3s, box-shadow 0.3s;
  transition: background-color 0.3s, box-shadow 0.3s, -webkit-box-shadow 0.3s;
}
.resize-bar__2_sK::before {
  top: 0;
  left: -1px;
  right: -1px;
  bottom: 0;
  background: #cfd8dc;
  opacity: 0;
  -webkit-transition: 0.3s opacity;
  -o-transition: 0.3s opacity;
  transition: 0.3s opacity;
}
.resize-bar__2_sK[data-is-active='true'] {
  color: white;
}
.resize-bar__2_sK[data-is-active='true']::before {
  opacity: 1;
}
.resize-bar__2_sK[data-is-active='true'] .arrow-indicator__2U1G {
  -webkit-transform: translateX(0) scaleX(1.3) scaleY(1);
          transform: translateX(0) scaleX(1.3) scaleY(1);
}
[data-is-collapsed='true'] + .resize-bar__2_sK .arrow-indicator__2U1G {
  opacity: 1;
}
[data-is-collapsed='true'] + .resize-bar__2_sK::after {
  opacity: 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.tab-pane__ncJk {
  border-right: 1px solid #eeeeee;
}
div.tab-header__20aW {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
div.tab-header__20aW svg {
  width: 12px;
  height: 16px;
}
div.tab-header__20aW .title__3f2k {
  margin-left: 5px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.link__QjTd {
  color: #607d8b;
}
.link__QjTd:hover,
.link__QjTd:focus {
  color: #455a64;
  text-decoration: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.detail__1Ye5 {
  color: #607d8b;
}
.detail__1Ye5:hover,
.detail__1Ye5:focus {
  color: #455a64;
  text-decoration: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.error__10k9 {
  color: #f54336;
}
.error__10k9 a {
  color: #90a4ae;
}
.error__10k9 a:focus {
  text-decoration: none;
}
.error__10k9 a:hover {
  color: #546e7a;
}
.container__2c3H > div {
  margin-bottom: 20px;
}
.container__2c3H > div:last-child {
  margin-bottom: 0;
}
.result__3g2i {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: baseline;
      -ms-flex-align: baseline;
          align-items: baseline;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
}
.result__3g2i .success__pbWH {
  color: #009688;
  margin-right: 20px;
  font-size: 16px;
}
.result__3g2i .error__10k9 {
  color: #d81b60;
  font-weight: 500;
  margin-right: 20px;
  font-size: 16px;
  line-height: 20px;
}
.result__3g2i .detail-link__3Xdl {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.error__qo2i {
  color: #f54336;
}
.error__qo2i a {
  color: #90a4ae;
}
.error__qo2i a:focus {
  text-decoration: none;
}
.error__qo2i a:hover {
  color: #546e7a;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.info__Xmk8 {
  color: #9e9e9e;
  margin-bottom: 0;
}
.footer__23E5 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.title__3-jc svg {
  color: #37474f;
  margin-right: 10px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.error__2OX_ {
  color: #f54336;
}
.error__2OX_ a {
  color: #90a4ae;
}
.error__2OX_ a:focus {
  text-decoration: none;
}
.error__2OX_ a:hover {
  color: #546e7a;
}
.container__3Hq1 {
  padding: 20px;
}
.finished-container__cjMh > div {
  margin-bottom: 10px;
}
.finished-container__cjMh > div:last-child {
  margin-bottom: 0;
}
.runtime-wrapper__3iB_ {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-orient: horizontal;
  -webkit-box-direction: normal;
      -ms-flex-direction: row;
          flex-direction: row;
  margin-bottom: 8px;
  color: #bdbdbd;
}
.runtime-wrapper__3iB_ .runtime-info__k1AW {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: baseline;
      -ms-flex-align: baseline;
          align-items: baseline;
}
.runtime-wrapper__3iB_ .finished__Zi5m {
  font-size: 16px;
  color: #388e3c;
  font-weight: 500;
  margin-right: 20px;
}
.runtime-wrapper__3iB_ .runtime__lWEn {
  font-size: 14px;
  font-weight: 500;
}
.runtime-wrapper__3iB_ .info-icon__3dGr {
  cursor: pointer;
}
.runtime-wrapper__3iB_ .info-icon__3dGr:hover {
  color: #263238;
}
.output__kmCk {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.output__kmCk .value__2NO9 {
  margin-right: 18px;
}
.expected__36Yv {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.interpret-error__3rXJ {
  color: #f54336;
  padding: 20px;
}
.interpret-error__3rXJ a {
  color: #90a4ae;
}
.interpret-error__3rXJ a:focus {
  text-decoration: none;
}
.interpret-error__3rXJ a:hover {
  color: #546e7a;
}
.placeholder__3V1O {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  color: #e0e0e0;
  height: 160px;
  font-size: 18px;
  font-weight: 500;
}
</style><style id="ace_editor.css">.ace_editor {position: relative;overflow: hidden;font: 12px/normal 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;direction: ltr;text-align: left;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);}.ace_scroller {position: absolute;overflow: hidden;top: 0;bottom: 0;background-color: inherit;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;cursor: text;}.ace_content {position: absolute;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;min-width: 100%;}.ace_dragging .ace_scroller:before{position: absolute;top: 0;left: 0;right: 0;bottom: 0;content: '';background: rgba(250, 250, 250, 0.01);z-index: 1000;}.ace_dragging.ace_dark .ace_scroller:before{background: rgba(0, 0, 0, 0.01);}.ace_selecting, .ace_selecting * {cursor: text !important;}.ace_gutter {position: absolute;overflow : hidden;width: auto;top: 0;bottom: 0;left: 0;cursor: default;z-index: 4;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;}.ace_gutter-active-line {position: absolute;left: 0;right: 0;}.ace_scroller.ace_scroll-left {box-shadow: 17px 0 16px -16px rgba(0, 0, 0, 0.4) inset;}.ace_gutter-cell {padding-left: 19px;padding-right: 6px;background-repeat: no-repeat;}.ace_gutter-cell.ace_error {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAABOFBMVEX/////////QRswFAb/Ui4wFAYwFAYwFAaWGAfDRymzOSH/PxswFAb/SiUwFAYwFAbUPRvjQiDllog5HhHdRybsTi3/Tyv9Tir+Syj/UC3////XurebMBIwFAb/RSHbPx/gUzfdwL3kzMivKBAwFAbbvbnhPx66NhowFAYwFAaZJg8wFAaxKBDZurf/RB6mMxb/SCMwFAYwFAbxQB3+RB4wFAb/Qhy4Oh+4QifbNRcwFAYwFAYwFAb/QRzdNhgwFAYwFAbav7v/Uy7oaE68MBK5LxLewr/r2NXewLswFAaxJw4wFAbkPRy2PyYwFAaxKhLm1tMwFAazPiQwFAaUGAb/QBrfOx3bvrv/VC/maE4wFAbRPBq6MRO8Qynew8Dp2tjfwb0wFAbx6eju5+by6uns4uH9/f36+vr/GkHjAAAAYnRSTlMAGt+64rnWu/bo8eAA4InH3+DwoN7j4eLi4xP99Nfg4+b+/u9B/eDs1MD1mO7+4PHg2MXa347g7vDizMLN4eG+Pv7i5evs/v79yu7S3/DV7/498Yv24eH+4ufQ3Ozu/v7+y13sRqwAAADLSURBVHjaZc/XDsFgGIBhtDrshlitmk2IrbHFqL2pvXf/+78DPokj7+Fz9qpU/9UXJIlhmPaTaQ6QPaz0mm+5gwkgovcV6GZzd5JtCQwgsxoHOvJO15kleRLAnMgHFIESUEPmawB9ngmelTtipwwfASilxOLyiV5UVUyVAfbG0cCPHig+GBkzAENHS0AstVF6bacZIOzgLmxsHbt2OecNgJC83JERmePUYq8ARGkJx6XtFsdddBQgZE2nPR6CICZhawjA4Fb/chv+399kfR+MMMDGOQAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: 2px center;}.ace_gutter-cell.ace_warning {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAmVBMVEX///8AAAD///8AAAAAAABPSzb/5sAAAAB/blH/73z/ulkAAAAAAAD85pkAAAAAAAACAgP/vGz/rkDerGbGrV7/pkQICAf////e0IsAAAD/oED/qTvhrnUAAAD/yHD/njcAAADuv2r/nz//oTj/p064oGf/zHAAAAA9Nir/tFIAAAD/tlTiuWf/tkIAAACynXEAAAAAAAAtIRW7zBpBAAAAM3RSTlMAABR1m7RXO8Ln31Z36zT+neXe5OzooRDfn+TZ4p3h2hTf4t3k3ucyrN1K5+Xaks52Sfs9CXgrAAAAjklEQVR42o3PbQ+CIBQFYEwboPhSYgoYunIqqLn6/z8uYdH8Vmdnu9vz4WwXgN/xTPRD2+sgOcZjsge/whXZgUaYYvT8QnuJaUrjrHUQreGczuEafQCO/SJTufTbroWsPgsllVhq3wJEk2jUSzX3CUEDJC84707djRc5MTAQxoLgupWRwW6UB5fS++NV8AbOZgnsC7BpEAAAAABJRU5ErkJggg==");background-position: 2px center;}.ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAAAAAA6mKC9AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAAJ0Uk5TAAB2k804AAAAPklEQVQY02NgIB68QuO3tiLznjAwpKTgNyDbMegwisCHZUETUZV0ZqOquBpXj2rtnpSJT1AEnnRmL2OgGgAAIKkRQap2htgAAAAASUVORK5CYII=");background-position: 2px center;}.ace_dark .ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAJFBMVEUAAAChoaGAgIAqKiq+vr6tra1ZWVmUlJSbm5s8PDxubm56enrdgzg3AAAAAXRSTlMAQObYZgAAAClJREFUeNpjYMAPdsMYHegyJZFQBlsUlMFVCWUYKkAZMxZAGdxlDMQBAG+TBP4B6RyJAAAAAElFTkSuQmCC");}.ace_scrollbar {position: absolute;right: 0;bottom: 0;z-index: 6;}.ace_scrollbar-inner {position: absolute;cursor: text;left: 0;top: 0;}.ace_scrollbar-v{overflow-x: hidden;overflow-y: scroll;top: 0;}.ace_scrollbar-h {overflow-x: scroll;overflow-y: hidden;left: 0;}.ace_print-margin {position: absolute;height: 100%;}.ace_text-input {position: absolute;z-index: 0;width: 0.5em;height: 1em;opacity: 0;background: transparent;-moz-appearance: none;appearance: none;border: none;resize: none;outline: none;overflow: hidden;font: inherit;padding: 0 1px;margin: 0 -1px;text-indent: -1em;-ms-user-select: text;-moz-user-select: text;-webkit-user-select: text;user-select: text;white-space: pre!important;}.ace_text-input.ace_composition {background: inherit;color: inherit;z-index: 1000;opacity: 1;text-indent: 0;}.ace_layer {z-index: 1;position: absolute;overflow: hidden;word-wrap: normal;white-space: pre;height: 100%;width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;pointer-events: none;}.ace_gutter-layer {position: relative;width: auto;text-align: right;pointer-events: auto;}.ace_text-layer {font: inherit !important;}.ace_cjk {display: inline-block;text-align: center;}.ace_cursor-layer {z-index: 4;}.ace_cursor {z-index: 4;position: absolute;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;border-left: 2px solid;transform: translatez(0);}.ace_multiselect .ace_cursor {border-left-width: 1px;}.ace_slim-cursors .ace_cursor {border-left-width: 1px;}.ace_overwrite-cursors .ace_cursor {border-left-width: 0;border-bottom: 1px solid;}.ace_hidden-cursors .ace_cursor {opacity: 0.2;}.ace_smooth-blinking .ace_cursor {-webkit-transition: opacity 0.18s;transition: opacity 0.18s;}.ace_marker-layer .ace_step, .ace_marker-layer .ace_stack {position: absolute;z-index: 3;}.ace_marker-layer .ace_selection {position: absolute;z-index: 5;}.ace_marker-layer .ace_bracket {position: absolute;z-index: 6;}.ace_marker-layer .ace_active-line {position: absolute;z-index: 2;}.ace_marker-layer .ace_selected-word {position: absolute;z-index: 4;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;}.ace_line .ace_fold {-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;display: inline-block;height: 11px;margin-top: -2px;vertical-align: middle;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACJJREFUeNpi+P//fxgTAwPDBxDxD078RSX+YeEyDFMCIMAAI3INmXiwf2YAAAAASUVORK5CYII=");background-repeat: no-repeat, repeat-x;background-position: center center, top left;color: transparent;border: 1px solid black;border-radius: 2px;cursor: pointer;pointer-events: auto;}.ace_dark .ace_fold {}.ace_fold:hover{background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACBJREFUeNpi+P//fz4TAwPDZxDxD5X4i5fLMEwJgAADAEPVDbjNw87ZAAAAAElFTkSuQmCC");}.ace_tooltip {background-color: #FFF;background-image: -webkit-linear-gradient(top, transparent, rgba(0, 0, 0, 0.1));background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.1));border: 1px solid gray;border-radius: 1px;box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);color: black;max-width: 100%;padding: 3px 4px;position: fixed;z-index: 999999;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;cursor: default;white-space: pre;word-wrap: break-word;line-height: normal;font-style: normal;font-weight: normal;letter-spacing: normal;pointer-events: none;}.ace_folding-enabled > .ace_gutter-cell {padding-right: 13px;}.ace_fold-widget {-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;margin: 0 -12px 0 1px;display: none;width: 11px;vertical-align: top;background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42mWKsQ0AMAzC8ixLlrzQjzmBiEjp0A6WwBCSPgKAXoLkqSot7nN3yMwR7pZ32NzpKkVoDBUxKAAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: center;border-radius: 3px;border: 1px solid transparent;cursor: pointer;}.ace_folding-enabled .ace_fold-widget {display: inline-block;   }.ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42m3HwQkAMAhD0YzsRchFKI7sAikeWkrxwScEB0nh5e7KTPWimZki4tYfVbX+MNl4pyZXejUO1QAAAABJRU5ErkJggg==");}.ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAGCAYAAAAG5SQMAAAAOUlEQVR42jXKwQkAMAgDwKwqKD4EwQ26sSOkVWjgIIHAzPiCgaqiqnJHZnKICBERHN194O5b9vbLuAVRL+l0YWnZAAAAAElFTkSuQmCCXA==");}.ace_fold-widget:hover {border: 1px solid rgba(0, 0, 0, 0.3);background-color: rgba(255, 255, 255, 0.2);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.7);}.ace_fold-widget:active {border: 1px solid rgba(0, 0, 0, 0.4);background-color: rgba(0, 0, 0, 0.05);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.8);}.ace_dark .ace_fold-widget {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHklEQVQIW2P4//8/AzoGEQ7oGCaLLAhWiSwB146BAQCSTPYocqT0AAAAAElFTkSuQmCC");}.ace_dark .ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAH0lEQVQIW2P4//8/AxQ7wNjIAjDMgC4AxjCVKBirIAAF0kz2rlhxpAAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAFCAYAAACAcVaiAAAAHElEQVQIW2P4//+/AxAzgDADlOOAznHAKgPWAwARji8UIDTfQQAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget:hover {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);background-color: rgba(255, 255, 255, 0.1);}.ace_dark .ace_fold-widget:active {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);}.ace_fold-widget.ace_invalid {background-color: #FFB4B4;border-color: #DE5555;}.ace_fade-fold-widgets .ace_fold-widget {-webkit-transition: opacity 0.4s ease 0.05s;transition: opacity 0.4s ease 0.05s;opacity: 0;}.ace_fade-fold-widgets:hover .ace_fold-widget {-webkit-transition: opacity 0.05s ease 0.05s;transition: opacity 0.05s ease 0.05s;opacity:1;}.ace_underline {text-decoration: underline;}.ace_bold {font-weight: bold;}.ace_nobold .ace_bold {font-weight: normal;}.ace_italic {font-style: italic;}.ace_error-marker {background-color: rgba(255, 0, 0,0.2);position: absolute;z-index: 9;}.ace_highlight-marker {background-color: rgba(255, 255, 0,0.2);position: absolute;z-index: 8;}.ace_br1 {border-top-left-radius    : 3px;}.ace_br2 {border-top-right-radius   : 3px;}.ace_br3 {border-top-left-radius    : 3px; border-top-right-radius:    3px;}.ace_br4 {border-bottom-right-radius: 3px;}.ace_br5 {border-top-left-radius    : 3px; border-bottom-right-radius: 3px;}.ace_br6 {border-top-right-radius   : 3px; border-bottom-right-radius: 3px;}.ace_br7 {border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px;}.ace_br8 {border-bottom-left-radius : 3px;}.ace_br9 {border-top-left-radius    : 3px; border-bottom-left-radius:  3px;}.ace_br10{border-top-right-radius   : 3px; border-bottom-left-radius:  3px;}.ace_br11{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-left-radius:  3px;}.ace_br12{border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br13{border-top-left-radius    : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br14{border-top-right-radius   : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br15{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px; border-bottom-left-radius: 3px;}.ace_text-input-ios {position: absolute !important;top: -100000px !important;left: -100000px !important;}
/*# sourceURL=ace/css/ace_editor.css */</style><style id="ace-tm">.ace-tm .ace_gutter {background: #f0f0f0;color: #333;}.ace-tm .ace_print-margin {width: 1px;background: #e8e8e8;}.ace-tm .ace_fold {background-color: #6B72E6;}.ace-tm {background-color: #FFFFFF;color: black;}.ace-tm .ace_cursor {color: black;}.ace-tm .ace_invisible {color: rgb(191, 191, 191);}.ace-tm .ace_storage,.ace-tm .ace_keyword {color: blue;}.ace-tm .ace_constant {color: rgb(197, 6, 11);}.ace-tm .ace_constant.ace_buildin {color: rgb(88, 72, 246);}.ace-tm .ace_constant.ace_language {color: rgb(88, 92, 246);}.ace-tm .ace_constant.ace_library {color: rgb(6, 150, 14);}.ace-tm .ace_invalid {background-color: rgba(255, 0, 0, 0.1);color: red;}.ace-tm .ace_support.ace_function {color: rgb(60, 76, 114);}.ace-tm .ace_support.ace_constant {color: rgb(6, 150, 14);}.ace-tm .ace_support.ace_type,.ace-tm .ace_support.ace_class {color: rgb(109, 121, 222);}.ace-tm .ace_keyword.ace_operator {color: rgb(104, 118, 135);}.ace-tm .ace_string {color: rgb(3, 106, 7);}.ace-tm .ace_comment {color: rgb(76, 136, 107);}.ace-tm .ace_comment.ace_doc {color: rgb(0, 102, 255);}.ace-tm .ace_comment.ace_doc.ace_tag {color: rgb(128, 159, 191);}.ace-tm .ace_constant.ace_numeric {color: rgb(0, 0, 205);}.ace-tm .ace_variable {color: rgb(49, 132, 149);}.ace-tm .ace_xml-pe {color: rgb(104, 104, 91);}.ace-tm .ace_entity.ace_name.ace_function {color: #0000A2;}.ace-tm .ace_heading {color: rgb(12, 7, 255);}.ace-tm .ace_list {color:rgb(185, 6, 144);}.ace-tm .ace_meta.ace_tag {color:rgb(0, 22, 142);}.ace-tm .ace_string.ace_regex {color: rgb(255, 0, 0)}.ace-tm .ace_marker-layer .ace_selection {background: rgb(181, 213, 255);}.ace-tm.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px white;}.ace-tm .ace_marker-layer .ace_step {background: rgb(252, 255, 0);}.ace-tm .ace_marker-layer .ace_stack {background: rgb(164, 229, 101);}.ace-tm .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid rgb(192, 192, 192);}.ace-tm .ace_marker-layer .ace_active-line {background: rgba(0, 0, 0, 0.07);}.ace-tm .ace_gutter-active-line {background-color : #dcdcdc;}.ace-tm .ace_marker-layer .ace_selected-word {background: rgb(250, 250, 255);border: 1px solid rgb(200, 200, 250);}.ace-tm .ace_indent-guide {background: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==") right repeat-y;}
/*# sourceURL=ace/css/ace-tm */</style><style>    .error_widget_wrapper {        background: inherit;        color: inherit;        border:none    }    .error_widget {        border-top: solid 2px;        border-bottom: solid 2px;        margin: 5px 0;        padding: 10px 40px;        white-space: pre-wrap;    }    .error_widget.ace_error, .error_widget_arrow.ace_error{        border-color: #ff5a5a    }    .error_widget.ace_warning, .error_widget_arrow.ace_warning{        border-color: #F1D817    }    .error_widget.ace_info, .error_widget_arrow.ace_info{        border-color: #5a5a5a    }    .error_widget.ace_ok, .error_widget_arrow.ace_ok{        border-color: #5aaa5a    }    .error_widget_arrow {        position: absolute;        border: solid 5px;        border-top-color: transparent!important;        border-right-color: transparent!important;        border-left-color: transparent!important;        top: -5px;    }</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.editor-container__QkHu {
  border: 1px solid #e0e0e0;
  padding: 7px 0 0 10px;
  width: 100%;
  height: 120px;
  border-radius: 3px;
  -webkit-transition: border-color 0.18s ease-in-out;
  -o-transition: border-color 0.18s ease-in-out;
  transition: border-color 0.18s ease-in-out;
}
.editor-container-focused__1GHB {
  border: 1px solid #37474f;
  -webkit-box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
          box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
}
.container__MmrB {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  margin: 20px;
}
.container__MmrB .testcase-editor__3Tbb {
  font-size: 12px;
  font-family: 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;
  width: 100%;
  line-height: 21px;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.viewer__2TRr {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  margin-top: -10px;
  margin-bottom: 10px;
}
.viewer__2TRr span {
  margin-right: 12px;
}
.ace_editor .ace_marker-layer .ace_bracket {
  display: none;
}
.ace_editor .ace_hidden-cursors .ace_cursor {
  display: none;
}
.ace_editor .ace_line {
  min-height: 21px;
}
.ace_editor .viewer-data-marker {
  position: absolute;
  background: #e1f5fe;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__2LvV {
  position: relative;
  padding: 0;
  width: 100%;
}
.wrapper__2LvV > div {
  width: 100%;
}
.close-icon__3nBt {
  position: absolute;
  font-size: 18px;
  right: 5px;
  top: 15px;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.error__2Ft1 {
  color: #f54336;
}
.error__2Ft1 a {
  color: #90a4ae;
}
.error__2Ft1 a:focus {
  text-decoration: none;
}
.error__2Ft1 a:hover {
  color: #546e7a;
}
.panel-wrapper__1fyZ {
  padding: 0;
  max-height: 300px;
  overflow-y: scroll;
  overflow-x: hidden;
}
.container__nthg > div {
  margin-bottom: 10px;
  color: #455a64;
}
.container__nthg > div:last-child {
  margin-bottom: 0;
}
.container__nthg .result__23wN {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: baseline;
      -ms-flex-align: baseline;
          align-items: baseline;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
}
.container__nthg .result__23wN .success__3Ai7 {
  color: #26a69a;
  font-weight: 500;
  margin-right: 20px;
  font-size: 16px;
}
.container__nthg .result__23wN .error__2Ft1 {
  color: #d81b60;
  font-weight: 500;
  margin-right: 20px;
  font-size: 16px;
  line-height: 20px;
}
.container__nthg .result__23wN .detail-link__2Deq {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
.info__2oQ9 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin-top: 20px;
  margin-bottom: 25px;
}
.info__2oQ9 .data__HC-i {
  color: #263238;
  font-size: 20px;
  line-height: 20px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.ac__35gz {
  color: #009688;
}
.ac__35gz:hover {
  color: #009688;
  text-decoration: underline;
}
.ac__35gz:focus,
.ac__35gz:visited,
.ac__35gz:active {
  text-decoration: none;
}
.pending__vcbU {
  color: #f07c18;
}
.pending__vcbU:hover {
  color: #f07c18;
  text-decoration: underline;
}
.pending__vcbU:focus,
.pending__vcbU:visited,
.pending__vcbU:active {
  text-decoration: none;
}
.error__B-Nx {
  color: #c62928;
}
.error__B-Nx:hover {
  color: #c62928;
  text-decoration: underline;
}
.error__B-Nx:focus,
.error__B-Nx:visited,
.error__B-Nx:active {
  text-decoration: none;
}
.table__1sPX {
  white-space: nowrap;
}
.time-column__1guG,
.status-column__3SUg {
  width: 30%;
}
.memory-column__1dxp,
.runtime-column__1ka_,
.lang-column__tR-8 {
  width: 20%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.skeleton-container__KKcW {
  overflow: hidden;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.result-container__33Nb {
  padding-bottom: 20px;
  margin-bottom: 20px;
  border-bottom: 1px solid #eeeeee;
}
.container__3BF- {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
}
.submissions__1ROo {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  padding: 20px;
  min-width: 540px;
}
.load-more__1kma {
  height: 60px;
  margin: 10px 0 13px;
}
.loading__2Rcb {
  height: 100%;
  width: 100%;
}
.addl-success-info__2ySC {
  margin-top: 20px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__1Diw {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.tool-item__2DCU .tool-button__2cBA[disabled] {
  pointer-events: none;
}
.tool-item__2DCU .tool-button__2cBA svg {
  width: 16px;
  height: 16px;
}
.tool-item__2DCU .tool-button__2cBA:focus {
  color: #b0bec5;
  background: transparent;
}
.tool-item__2DCU .tool-button__2cBA:hover {
  color: #263238;
  background: transparent;
}
.tool-item__2DCU .tool-button__2cBA,
.tool-item__2DCU .tool-button__2cBA:active {
  color: #b0bec5;
  background: transparent;
}
.loader-container__3W4S {
  max-width: 580px;
  width: 100%;
  height: 100%;
}
.disabled__1g2p {
  cursor: not-allowed;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.setting__26m5 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.setting__26m5:not(:first-child) {
  margin-top: 40px;
}
.setting-text__1pp9 {
  margin-right: 40px;
  width: 340px;
}
.setting-select-container__1Xq2 {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
.setting-select__1AuE {
  width: 100%;
}
.setting-title__1Oh8 {
  color: #212121;
}
.setting-description__20rb {
  color: #9e9e9e;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__YPDh {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  border-left: 1px solid #eeeeee;
}
.container__YPDh .react-codemirror2 {
  position: relative;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.container__YPDh .CodeMirror {
  position: absolute;
  height: 100%;
  width: 100%;
  line-height: normal;
  font-family: 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;
  padding: 0;
  border-radius: 0;
  border: 0;
}
.container__YPDh .CodeMirror .CodeMirror-code .cm-comment {
  background: transparent;
  border-radius: 0;
}
.container__YPDh .CodeMirror.cm-s-textmate .CodeMirror-code::-moz-selection,
.container__YPDh .CodeMirror.cm-s-github .CodeMirror-code::-moz-selection,
.container__YPDh .CodeMirror.cm-s-xcode .CodeMirror-code::-moz-selection,
.container__YPDh .CodeMirror.cm-s-eclipse .CodeMirror-code::-moz-selection,
.container__YPDh .CodeMirror.cm-s-light .CodeMirror-code::-moz-selection {
  background-color: rgba(158, 158, 158, 0.2);
}
.container__YPDh .CodeMirror.cm-s-textmate .CodeMirror-code::selection,
.container__YPDh .CodeMirror.cm-s-github .CodeMirror-code::selection,
.container__YPDh .CodeMirror.cm-s-xcode .CodeMirror-code::selection,
.container__YPDh .CodeMirror.cm-s-eclipse .CodeMirror-code::selection,
.container__YPDh .CodeMirror.cm-s-light .CodeMirror-code::selection {
  background-color: rgba(158, 158, 158, 0.2);
}
.container__YPDh .CodeMirror.cm-s-textmate .CodeMirror-code .cm-matchhighlight,
.container__YPDh .CodeMirror.cm-s-github .CodeMirror-code .cm-matchhighlight,
.container__YPDh .CodeMirror.cm-s-xcode .CodeMirror-code .cm-matchhighlight,
.container__YPDh .CodeMirror.cm-s-eclipse .CodeMirror-code .cm-matchhighlight,
.container__YPDh .CodeMirror.cm-s-light .CodeMirror-code .cm-matchhighlight {
  outline: 1px solid #757575;
}
.container__YPDh .CodeMirror.cm-s-monokai .CodeMirror-code::-moz-selection,
.container__YPDh .CodeMirror.cm-s-blackboard .CodeMirror-code::-moz-selection,
.container__YPDh .CodeMirror.cm-s-dark .CodeMirror-code::-moz-selection,
.container__YPDh .CodeMirror.cm-s-tomorrow-night-bright .CodeMirror-code::-moz-selection {
  background-color: rgba(224, 224, 224, 0.3);
}
.container__YPDh .CodeMirror.cm-s-monokai .CodeMirror-code::selection,
.container__YPDh .CodeMirror.cm-s-blackboard .CodeMirror-code::selection,
.container__YPDh .CodeMirror.cm-s-dark .CodeMirror-code::selection,
.container__YPDh .CodeMirror.cm-s-tomorrow-night-bright .CodeMirror-code::selection {
  background-color: rgba(224, 224, 224, 0.3);
}
.container__YPDh .CodeMirror.cm-s-monokai .CodeMirror-code .cm-matchhighlight,
.container__YPDh .CodeMirror.cm-s-blackboard .CodeMirror-code .cm-matchhighlight,
.container__YPDh .CodeMirror.cm-s-dark .CodeMirror-code .cm-matchhighlight,
.container__YPDh .CodeMirror.cm-s-tomorrow-night-bright .CodeMirror-code .cm-matchhighlight {
  outline: 1px solid #bdbdbd;
}
.container__YPDh .CodeMirror-lines {
  padding: 10px 0;
}
.container__YPDh .CodeMirror pre {
  padding: 0 10px;
}
.container__YPDh .CodeMirror-gutters {
  background: white;
  border-right-color: #eeeeee;
}
.container__YPDh .CodeMirror-linenumbers {
  width: 39px;
  color: #bdbdbd;
}
.container__YPDh .CodeMirror-foldgutter {
  width: 15px;
}
.container__YPDh.disabled__Ga30 {
  pointer-events: none;
}
.light-theme__2PA9 .CodeMirror-code__2Mgs::-moz-selection {
  background-color: rgba(158, 158, 158, 0.2);
}
.light-theme__2PA9 .CodeMirror-code__2Mgs::selection {
  background-color: rgba(158, 158, 158, 0.2);
}
.light-theme__2PA9 .CodeMirror-code__2Mgs .cm-matchhighlight__8ez2 {
  outline: 1px solid #757575;
}
.dark-theme__2IR2 .CodeMirror-code__2Mgs::-moz-selection {
  background-color: rgba(224, 224, 224, 0.3);
}
.dark-theme__2IR2 .CodeMirror-code__2Mgs::selection {
  background-color: rgba(224, 224, 224, 0.3);
}
.dark-theme__2IR2 .CodeMirror-code__2Mgs .cm-matchhighlight__8ez2 {
  outline: 1px solid #bdbdbd;
}
.error-line-highlight-dark__3PmJ {
  background-color: #880e4f;
}
.error-line-text-dark__J30w * {
  color: white !important;
}
.error-line-highlight-light__3al1 {
  background-color: #fce4ec;
}
.error-line-text-light__3Ahx * {
  color: black !important;
}
.error-line-gutter__1zz- {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  margin-top: 1px;
}
.error-line-icon__zHgh {
  padding: 0 1px;
  background-color: #ec407a;
  color: white;
  border-radius: 10px;
  font-size: 14px;
  cursor: pointer;
}
.error-line-tooltip-content-light__2pAw {
  color: #880e4f;
}
.error-line-tooltip-content-dark__oiYx {
  color: white;
}
.error-line-tooltip-overlay-light__3JE-.lc-popover * {
  background-color: white;
}
.error-line-tooltip-overlay-dark__3wYO.lc-popover * {
  background-color: #880e4f;
}
.error-line-tooltip-overlay-dark__3wYO.lc-popover .ant-popover-arrow {
  background-color: transparent;
  border-bottom-color: #880e4f;
}
.error-line-icon__zHgh:hover {
  background-color: #e2175b;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.shortcut__1GGr {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.shortcut__1GGr:not(:first-child) {
  margin-top: 20px;
}
.shortcut-description__23fr {
  width: 360px;
  margin-right: 30px;
}
.shortcut-keystrokes__3HcT {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.confirm-footer__1apg {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.confirm-footer__1apg .confirm-btn__2XK3 {
  margin-left: 15px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.wrapper__jNjv {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.tool-item__19hq .tool-button__3FOd[disabled] {
  pointer-events: none;
}
.tool-item__19hq .tool-button__3FOd svg {
  width: 16px;
  height: 16px;
}
.tool-item__19hq .tool-button__3FOd:focus {
  color: #b0bec5;
  background: transparent;
}
.tool-item__19hq .tool-button__3FOd:hover {
  color: #263238;
  background: transparent;
}
.tool-item__19hq .tool-button__3FOd,
.tool-item__19hq .tool-button__3FOd:active {
  color: #b0bec5;
  background: transparent;
}
.loader-container__3FwG {
  max-width: 580px;
  width: 100%;
  height: 100%;
}
.disabled__1Lf9 {
  cursor: not-allowed;
}
.container__2zYY {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  background: #fafafa;
  -webkit-box-shadow: inset 0 -1px #eeeeee;
          box-shadow: inset 0 -1px #eeeeee;
}
.container__2zYY[data-size='sm'] {
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-align: stretch;
      -ms-flex-align: stretch;
          align-items: stretch;
}
.container__2zYY[data-size='sm'] .select__2iyW {
  display: block;
  width: auto;
}
.container__2zYY[data-size='sm'] .btns__1OeZ {
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  margin-bottom: 5px;
  margin-top: 5px;
}
.container__2zYY[data-size='sm'] .btns__1OeZ > * {
  margin: 0 5px;
}
.container__2zYY[data-size='sm'] > div {
  margin: 9px 10px 0 0;
}
.select__2iyW {
  margin: 6px 15px 6px 0;
  min-width: 116px;
  width: auto;
  -webkit-transition: -webkit-transform 0.3s;
  transition: -webkit-transform 0.3s;
  -o-transition: transform 0.3s;
  transition: transform 0.3s;
  transition: transform 0.3s, -webkit-transform 0.3s;
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.select__2iyW > div {
  background: none;
}
.select__2iyW.lang-selector-sticky__ZVRf {
  -webkit-transform: translateX(10px);
          transform: translateX(10px);
}
.btns__1OeZ {
  -webkit-box-flex: 1;
      -ms-flex: 1 0 auto;
          flex: 1 0 auto;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.btns__1OeZ > * {
  margin: 0;
}
.btns__1OeZ > *:last-child {
  margin-right: 10px;
}
.lang-info-modal-footer__13h4 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.full-screen-tip__265J {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  max-width: 200px;
  line-height: 18px;
}
.full-screen-tip-btn__2reP {
  -ms-flex-item-align: end;
      align-self: flex-end;
  margin-top: 4px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.code-area__24hN,
.content__Ztw-,
.editor__DNsS {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.code-area__24hN {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  overflow-x: hidden;
  overflow-y: auto;
  z-index: 0;
}
.editor__DNsS {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
.content__Ztw- {
  -webkit-box-flex: 1;
      -ms-flex: 1 0 auto;
          flex: 1 0 auto;
  position: relative;
}
.result__1UhQ {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  border-left: 1px solid #eeeeee;
}
.reset-code-prompt__2QEE {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 12px;
  margin-right: 50px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.reset-code-prompt__2QEE > .reset-code-btn__3ADT,
.reset-code-prompt__2QEE > .reset-code-btn__3ADT:hover:not([disabled]),
.reset-code-prompt__2QEE > .reset-code-btn__3ADT:focus:not([disabled]) {
  border: none;
  background: transparent;
  padding: 6px;
  line-height: 12px;
  height: 24px;
  -webkit-transition: color 0.2s ease-in-out 0s;
  -o-transition: color 0.2s ease-in-out 0s;
  transition: color 0.2s ease-in-out 0s;
  text-decoration: underline;
  color: #546e7a;
}
.reset-code-prompt__2QEE > .reset-code-btn__3ADT:hover,
.reset-code-prompt__2QEE > .reset-code-btn__3ADT:hover:not([disabled]):hover,
.reset-code-prompt__2QEE > .reset-code-btn__3ADT:focus:not([disabled]):hover {
  -webkit-transition: color 0.2s ease-in-out 0s;
  -o-transition: color 0.2s ease-in-out 0s;
  transition: color 0.2s ease-in-out 0s;
  color: #37474f;
}
.reset-code-prompt__2QEE > .reset-code-btn-warn__1Dkd,
.reset-code-prompt__2QEE > .reset-code-btn-warn__1Dkd:hover:not([disabled]),
.reset-code-prompt__2QEE > .reset-code-btn-warn__1Dkd:focus:not([disabled]) {
  border: none;
  background: transparent;
  padding: 6px;
  line-height: 12px;
  height: 24px;
  -webkit-transition: color 0.2s ease-in-out 0s;
  -o-transition: color 0.2s ease-in-out 0s;
  transition: color 0.2s ease-in-out 0s;
  text-decoration: underline;
  color: #f9a825;
}
.reset-code-prompt__2QEE > .reset-code-btn-warn__1Dkd:hover,
.reset-code-prompt__2QEE > .reset-code-btn-warn__1Dkd:hover:not([disabled]):hover,
.reset-code-prompt__2QEE > .reset-code-btn-warn__1Dkd:focus:not([disabled]):hover {
  -webkit-transition: color 0.2s ease-in-out 0s;
  -o-transition: color 0.2s ease-in-out 0s;
  transition: color 0.2s ease-in-out 0s;
  color: #f07c18;
}
.confirm-footer__s-GW {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.confirm-footer__s-GW .confirm-btn__4zif {
  margin-left: 15px;
}
.error-container__1icO {
  position: absolute;
  bottom: 0;
  left: 0;
  z-index: 4;
  width: 100%;
  padding: 10px;
}
.verify-link__36GR {
  color: #c62928;
}
.verify-link__36GR:hover,
.verify-link__36GR:focus {
  color: #c62928;
  text-decoration: underline;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.note-btn__uLJR {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  width: 30px;
  height: 40px;
  background: #90a4ae;
  color: white;
  position: fixed;
  right: 0;
  top: 215px;
  z-index: 2;
  opacity: 0.15;
  border-radius: 3px 0 0 3px;
  cursor: pointer;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.note-btn__uLJR svg {
  width: 20px;
  height: 20px;
}
.note-btn__uLJR:hover {
  opacity: 0.6;
}
.note-btn-cn__2MZ9 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  width: 30px;
  height: 40px;
  background: #90a4ae;
  color: white;
  position: fixed;
  right: 0;
  top: 215px;
  z-index: 2;
  opacity: 0.15;
  border-radius: 3px 0 0 3px;
  cursor: pointer;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
  top: 275px;
}
.note-btn-cn__2MZ9 svg {
  width: 20px;
  height: 20px;
}
.note-btn-cn__2MZ9:hover {
  opacity: 0.6;
}
.notewrap__eHkN {
  position: relative;
}
.note__1Qo7 {
  width: 600px;
  top: 220px;
  right: 0;
  position: fixed;
  -webkit-transition: -webkit-transform ease-in-out 0.3s;
  transition: -webkit-transform ease-in-out 0.3s;
  -o-transition: transform ease-in-out 0.3s;
  transition: transform ease-in-out 0.3s;
  transition: transform ease-in-out 0.3s, -webkit-transform ease-in-out 0.3s;
  z-index: 5;
  -webkit-transform: translateX(100%);
          transform: translateX(100%);
}
.note__1Qo7 {
  /**
 * simplemde v1.11.2
 * Copyright Next Step Webs, Inc.
 * @link https://github.com/NextStepWebs/simplemde-markdown-editor
 * @license MIT
 */
}
.note__1Qo7 .CodeMirror {
  font-family: monospace;
  height: 300px;
  color: #000;
  direction: ltr;
}
.note__1Qo7 .CodeMirror-lines {
  padding: 4px 0;
}
.note__1Qo7 .CodeMirror pre {
  padding: 0 4px;
}
.note__1Qo7 .CodeMirror-gutter-filler,
.note__1Qo7 .CodeMirror-scrollbar-filler {
  background-color: #fff;
}
.note__1Qo7 .CodeMirror-gutters {
  border-right: 1px solid #ddd;
  background-color: #f7f7f7;
  white-space: nowrap;
}
.note__1Qo7 .CodeMirror-linenumber {
  padding: 0 3px 0 5px;
  min-width: 20px;
  text-align: right;
  color: #999;
  white-space: nowrap;
}
.note__1Qo7 .CodeMirror-guttermarker {
  color: #000;
}
.note__1Qo7 .CodeMirror-guttermarker-subtle {
  color: #999;
}
.note__1Qo7 .CodeMirror-cursor {
  border-left: 1px solid #000;
  border-right: none;
  width: 0;
}
.note__1Qo7 .CodeMirror div.CodeMirror-secondarycursor {
  border-left: 1px solid silver;
}
.note__1Qo7 .cm-fat-cursor .CodeMirror-cursor {
  width: auto;
  border: 0!important;
  background: #7e7;
}
.note__1Qo7 .cm-fat-cursor div.CodeMirror-cursors {
  z-index: 1;
}
.note__1Qo7 .cm-animate-fat-cursor {
  width: auto;
  border: 0;
  -webkit-animation: blink 1.06s steps(1) infinite;
  animation: blink 1.06s steps(1) infinite;
  background-color: #7e7;
}
@-webkit-keyframes blink__4e8t {
  50% {
    background-color: transparent;
  }
}
@keyframes blink__4e8t {
  50% {
    background-color: transparent;
  }
}
.note__1Qo7 .cm-tab {
  display: inline-block;
  text-decoration: inherit;
}
.note__1Qo7 .CodeMirror-rulers {
  position: absolute;
  left: 0;
  right: 0;
  top: -50px;
  bottom: -20px;
  overflow: hidden;
}
.note__1Qo7 .CodeMirror-ruler {
  border-left: 1px solid #ccc;
  top: 0;
  bottom: 0;
  position: absolute;
}
.note__1Qo7 .cm-s-default .cm-header {
  color: #00f;
}
.note__1Qo7 .cm-s-default .cm-quote {
  color: #090;
}
.note__1Qo7 .cm-negative {
  color: #d44;
}
.note__1Qo7 .cm-positive {
  color: #292;
}
.note__1Qo7 .cm-header,
.note__1Qo7 .cm-strong {
  font-weight: 700;
}
.note__1Qo7 .cm-em {
  font-style: italic;
}
.note__1Qo7 .cm-link {
  text-decoration: underline;
}
.note__1Qo7 .cm-strikethrough {
  text-decoration: line-through;
}
.note__1Qo7 .cm-s-default .cm-keyword {
  color: #708;
}
.note__1Qo7 .cm-s-default .cm-atom {
  color: #219;
}
.note__1Qo7 .cm-s-default .cm-number {
  color: #164;
}
.note__1Qo7 .cm-s-default .cm-def {
  color: #00f;
}
.note__1Qo7 .cm-s-default .cm-variable-2 {
  color: #05a;
}
.note__1Qo7 .cm-s-default .cm-type,
.note__1Qo7 .cm-s-default .cm-variable-3 {
  color: #085;
}
.note__1Qo7 .cm-s-default .cm-comment {
  color: #a50;
}
.note__1Qo7 .cm-s-default .cm-string {
  color: #a11;
}
.note__1Qo7 .cm-s-default .cm-string-2 {
  color: #f50;
}
.note__1Qo7 .cm-s-default .cm-meta {
  color: #555;
}
.note__1Qo7 .cm-s-default .cm-qualifier {
  color: #555;
}
.note__1Qo7 .cm-s-default .cm-builtin {
  color: #30a;
}
.note__1Qo7 .cm-s-default .cm-bracket {
  color: #997;
}
.note__1Qo7 .cm-s-default .cm-tag {
  color: #170;
}
.note__1Qo7 .cm-s-default .cm-attribute {
  color: #00c;
}
.note__1Qo7 .cm-s-default .cm-hr {
  color: #999;
}
.note__1Qo7 .cm-s-default .cm-link {
  color: #00c;
}
.note__1Qo7 .cm-s-default .cm-error {
  color: red;
}
.note__1Qo7 .cm-invalidchar {
  color: red;
}
.note__1Qo7 .CodeMirror-composing {
  border-bottom: 2px solid;
}
.note__1Qo7 div.CodeMirror span.CodeMirror-matchingbracket {
  color: #0f0;
}
.note__1Qo7 div.CodeMirror span.CodeMirror-nonmatchingbracket {
  color: #f22;
}
.note__1Qo7 .CodeMirror-matchingtag {
  background: rgba(255, 150, 0, 0.3);
}
.note__1Qo7 .CodeMirror-activeline-background {
  background: #e8f2ff;
}
.note__1Qo7 .CodeMirror {
  position: relative;
  overflow: hidden;
  background: #fff;
}
.note__1Qo7 .CodeMirror-scroll {
  overflow: scroll!important;
  margin-bottom: -30px;
  margin-right: -30px;
  padding-bottom: 30px;
  height: 100%;
  outline: 0;
  position: relative;
}
.note__1Qo7 .CodeMirror-sizer {
  position: relative;
  border-right: 30px solid transparent;
}
.note__1Qo7 .CodeMirror-gutter-filler,
.note__1Qo7 .CodeMirror-hscrollbar,
.note__1Qo7 .CodeMirror-scrollbar-filler,
.note__1Qo7 .CodeMirror-vscrollbar {
  position: absolute;
  z-index: 6;
  display: none;
}
.note__1Qo7 .CodeMirror-vscrollbar {
  right: 0;
  top: 0;
  overflow-x: hidden;
  overflow-y: scroll;
}
.note__1Qo7 .CodeMirror-hscrollbar {
  bottom: 0;
  left: 0;
  overflow-y: hidden;
  overflow-x: scroll;
}
.note__1Qo7 .CodeMirror-scrollbar-filler {
  right: 0;
  bottom: 0;
}
.note__1Qo7 .CodeMirror-gutter-filler {
  left: 0;
  bottom: 0;
}
.note__1Qo7 .CodeMirror-gutters {
  position: absolute;
  left: 0;
  top: 0;
  min-height: 100%;
  z-index: 3;
}
.note__1Qo7 .CodeMirror-gutter {
  white-space: normal;
  height: 100%;
  display: inline-block;
  vertical-align: top;
  margin-bottom: -30px;
}
.note__1Qo7 .CodeMirror-gutter-wrapper {
  position: absolute;
  z-index: 4;
  background: 0 0!important;
  border: none !important;
}
.note__1Qo7 .CodeMirror-gutter-background {
  position: absolute;
  top: 0;
  bottom: 0;
  z-index: 4;
}
.note__1Qo7 .CodeMirror-gutter-elt {
  position: absolute;
  cursor: default;
  z-index: 4;
}
.note__1Qo7 .CodeMirror-gutter-wrapper ::-moz-selection {
  background-color: transparent;
}
.note__1Qo7 .CodeMirror-gutter-wrapper ::selection {
  background-color: transparent;
}
.note__1Qo7 .CodeMirror-gutter-wrapper ::-moz-selection {
  background-color: transparent;
}
.note__1Qo7 .CodeMirror-lines {
  cursor: text;
  min-height: 1px;
}
.note__1Qo7 .CodeMirror pre {
  border-radius: 0;
  border-width: 0;
  background: 0 0;
  font-family: inherit;
  font-size: inherit;
  margin: 0;
  white-space: pre;
  word-wrap: normal;
  line-height: inherit;
  color: inherit;
  z-index: 2;
  position: relative;
  overflow: visible;
  -webkit-tap-highlight-color: transparent;
  -webkit-font-variant-ligatures: contextual;
  font-variant-ligatures: contextual;
}
.note__1Qo7 .CodeMirror-wrap pre {
  word-wrap: break-word;
  white-space: pre-wrap;
  word-break: normal;
}
.note__1Qo7 .CodeMirror-linebackground {
  position: absolute;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  z-index: 0;
}
.note__1Qo7 .CodeMirror-linewidget {
  position: relative;
  z-index: 2;
  overflow: auto;
}
.note__1Qo7 .CodeMirror-rtl pre {
  direction: rtl;
}
.note__1Qo7 .CodeMirror-code {
  outline: 0;
}
.note__1Qo7 .CodeMirror-gutter,
.note__1Qo7 .CodeMirror-gutters,
.note__1Qo7 .CodeMirror-linenumber,
.note__1Qo7 .CodeMirror-scroll,
.note__1Qo7 .CodeMirror-sizer {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
}
.note__1Qo7 .CodeMirror-measure {
  position: absolute;
  width: 100%;
  height: 0;
  overflow: hidden;
  visibility: hidden;
}
.note__1Qo7 .CodeMirror-cursor {
  position: absolute;
  pointer-events: none;
}
.note__1Qo7 .CodeMirror-measure pre {
  position: static;
}
.note__1Qo7 div.CodeMirror-cursors {
  visibility: hidden;
  position: relative;
  z-index: 3;
}
.note__1Qo7 div.CodeMirror-dragcursors {
  visibility: visible;
}
.note__1Qo7 .CodeMirror-focused div.CodeMirror-cursors {
  visibility: visible;
}
.note__1Qo7 .CodeMirror-selected {
  background: #d9d9d9;
}
.note__1Qo7 .CodeMirror-focused .CodeMirror-selected {
  background: #d7d4f0;
}
.note__1Qo7 .CodeMirror-crosshair {
  cursor: crosshair;
}
.note__1Qo7 .CodeMirror-line::-moz-selection,
.note__1Qo7 .CodeMirror-line > span::-moz-selection,
.note__1Qo7 .CodeMirror-line > span > span::-moz-selection {
  background: #d7d4f0;
}
.note__1Qo7 .CodeMirror-line::selection,
.note__1Qo7 .CodeMirror-line > span::selection,
.note__1Qo7 .CodeMirror-line > span > span::selection {
  background: #d7d4f0;
}
.note__1Qo7 .CodeMirror-line::-moz-selection,
.note__1Qo7 .CodeMirror-line > span::-moz-selection,
.note__1Qo7 .CodeMirror-line > span > span::-moz-selection {
  background: #d7d4f0;
}
.note__1Qo7 .cm-searching {
  background-color: #ffa;
  background-color: rgba(255, 255, 0, 0.4);
}
.note__1Qo7 .cm-force-border {
  padding-right: 0.1px;
}
@media print {
  .note__1Qo7 .CodeMirror div.CodeMirror-cursors {
    visibility: hidden;
  }
}
.note__1Qo7 .cm-tab-wrap-hack:after {
  content: '';
}
.note__1Qo7 span.CodeMirror-selectedtext {
  background: 0 0;
}
.note__1Qo7 .CodeMirror {
  height: auto;
  min-height: 300px;
  border: 1px solid #ddd;
  border-bottom-left-radius: 4px;
  border-bottom-right-radius: 4px;
  padding: 10px;
  font: inherit;
  z-index: 1;
}
.note__1Qo7 .CodeMirror-scroll {
  min-height: 300px;
}
.note__1Qo7 .CodeMirror-fullscreen {
  background: #fff;
  position: fixed!important;
  top: 50px;
  left: 0;
  right: 0;
  bottom: 0;
  height: auto;
  z-index: 9;
}
.note__1Qo7 .CodeMirror-sided {
  width: 50% !important;
}
.note__1Qo7 .editor-toolbar {
  position: relative;
  opacity: 0.6;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  -o-user-select: none;
  user-select: none;
  padding: 0 10px;
  border-top: 1px solid #bbb;
  border-left: 1px solid #bbb;
  border-right: 1px solid #bbb;
  border-top-left-radius: 4px;
  border-top-right-radius: 4px;
}
.note__1Qo7 .editor-toolbar:after,
.note__1Qo7 .editor-toolbar:before {
  display: block;
  content: ' ';
  height: 1px;
}
.note__1Qo7 .editor-toolbar:before {
  margin-bottom: 8px;
}
.note__1Qo7 .editor-toolbar:after {
  margin-top: 8px;
}
.note__1Qo7 .editor-toolbar:hover,
.note__1Qo7 .editor-wrapper input.title:focus,
.note__1Qo7 .editor-wrapper input.title:hover {
  opacity: 0.8;
}
.note__1Qo7 .editor-toolbar.fullscreen {
  width: 100%;
  height: 50px;
  overflow-x: auto;
  overflow-y: hidden;
  white-space: nowrap;
  padding-top: 10px;
  padding-bottom: 10px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  background: #fff;
  border: 0;
  position: fixed;
  top: 0;
  left: 0;
  opacity: 1;
  z-index: 9;
}
.note__1Qo7 .editor-toolbar.fullscreen::before {
  width: 20px;
  height: 50px;
  background: -webkit-gradient(linear, left top, right top, color-stop(0, #ffffff), color-stop(100%, rgba(255, 255, 255, 0)));
  background: -webkit-linear-gradient(left, #ffffff 0, rgba(255, 255, 255, 0) 100%);
  background: -o-linear-gradient(left, #ffffff 0, rgba(255, 255, 255, 0) 100%);
  background: -webkit-gradient(linear, left top, right top, color-stop(0, #ffffff), to(rgba(255, 255, 255, 0)));
  background: linear-gradient(to right, #ffffff 0, rgba(255, 255, 255, 0) 100%);
  position: fixed;
  top: 0;
  left: 0;
  margin: 0;
  padding: 0;
}
.note__1Qo7 .editor-toolbar.fullscreen::after {
  width: 20px;
  height: 50px;
  background: -webkit-gradient(linear, left top, right top, color-stop(0, rgba(255, 255, 255, 0)), color-stop(100%, #ffffff));
  background: -webkit-linear-gradient(left, rgba(255, 255, 255, 0) 0, #ffffff 100%);
  background: -o-linear-gradient(left, rgba(255, 255, 255, 0) 0, #ffffff 100%);
  background: -webkit-gradient(linear, left top, right top, color-stop(0, rgba(255, 255, 255, 0)), to(#ffffff));
  background: linear-gradient(to right, rgba(255, 255, 255, 0) 0, #ffffff 100%);
  position: fixed;
  top: 0;
  right: 0;
  margin: 0;
  padding: 0;
}
.note__1Qo7 .editor-toolbar a {
  display: inline-block;
  text-align: center;
  text-decoration: none!important;
  color: #2c3e50 !important;
  width: 30px;
  height: 30px;
  margin: 0;
  border: 1px solid transparent;
  border-radius: 3px;
  cursor: pointer;
}
.note__1Qo7 .editor-toolbar a.active,
.note__1Qo7 .editor-toolbar a:hover {
  background: #fcfcfc;
  border-color: #95a5a6;
}
.note__1Qo7 .editor-toolbar a:before {
  line-height: 30px;
}
.note__1Qo7 .editor-toolbar i.separator {
  display: inline-block;
  width: 0;
  border-left: 1px solid #d9d9d9;
  border-right: 1px solid #fff;
  color: transparent;
  text-indent: -10px;
  margin: 0 6px;
}
.note__1Qo7 .editor-toolbar a.fa-header-x:after {
  font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
  font-size: 65%;
  vertical-align: text-bottom;
  position: relative;
  top: 2px;
}
.note__1Qo7 .editor-toolbar a.fa-header-1:after {
  content: "1";
}
.note__1Qo7 .editor-toolbar a.fa-header-2:after {
  content: "2";
}
.note__1Qo7 .editor-toolbar a.fa-header-3:after {
  content: "3";
}
.note__1Qo7 .editor-toolbar a.fa-header-bigger:after {
  content: "\25B2";
}
.note__1Qo7 .editor-toolbar a.fa-header-smaller:after {
  content: "\25BC";
}
.note__1Qo7 .editor-toolbar.disabled-for-preview a:not(.no-disable) {
  pointer-events: none;
  background: #fff;
  border-color: transparent;
  text-shadow: inherit;
}
@media only screen and (max-width: 700px) {
  .note__1Qo7 .editor-toolbar a.no-mobile {
    display: none;
  }
}
.note__1Qo7 .editor-statusbar {
  padding: 8px 10px;
  font-size: 12px;
  color: #959694;
  text-align: right;
}
.note__1Qo7 .editor-statusbar span {
  display: inline-block;
  min-width: 4em;
  margin-left: 1em;
}
.note__1Qo7 .editor-statusbar .lines:before {
  content: 'lines: ';
}
.note__1Qo7 .editor-statusbar .words:before {
  content: 'words: ';
}
.note__1Qo7 .editor-statusbar .characters:before {
  content: 'characters: ';
}
.note__1Qo7 .editor-preview {
  padding: 10px;
  position: absolute;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  background: #fafafa;
  z-index: 7;
  overflow: auto;
  display: none;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
}
.note__1Qo7 .editor-preview-side {
  padding: 10px;
  position: fixed;
  bottom: 0;
  width: 50%;
  top: 50px;
  right: 0;
  background: #fafafa;
  z-index: 9;
  overflow: auto;
  display: none;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  border: 1px solid #ddd;
}
.note__1Qo7 .editor-preview-active-side {
  display: block;
}
.note__1Qo7 .editor-preview-active {
  display: block;
}
.note__1Qo7 .editor-preview-side > p,
.note__1Qo7 .editor-preview > p {
  margin-top: 0;
}
.note__1Qo7 .editor-preview pre,
.note__1Qo7 .editor-preview-side pre {
  background: #eee;
  margin-bottom: 10px;
}
.note__1Qo7 .editor-preview table td,
.note__1Qo7 .editor-preview table th,
.note__1Qo7 .editor-preview-side table td,
.note__1Qo7 .editor-preview-side table th {
  border: 1px solid #ddd;
  padding: 5px;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-tag {
  color: #63a35c;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-attribute {
  color: #795da3;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-string {
  color: #183691;
}
.note__1Qo7 .CodeMirror .CodeMirror-selected {
  background: #d9d9d9;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-header-1 {
  font-size: 200%;
  line-height: 200%;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-header-2 {
  font-size: 160%;
  line-height: 160%;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-header-3 {
  font-size: 125%;
  line-height: 125%;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-header-4 {
  font-size: 110%;
  line-height: 110%;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-comment {
  background: rgba(0, 0, 0, 0.05);
  border-radius: 2px;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-link {
  color: #7f8c8d;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-url {
  color: #aab2b3;
}
.note__1Qo7 .CodeMirror .CodeMirror-code .cm-strikethrough {
  text-decoration: line-through;
}
.note__1Qo7 .CodeMirror .CodeMirror-placeholder {
  opacity: 0.5;
}
.note__1Qo7 .CodeMirror-hints {
  position: absolute;
  z-index: 2147483647;
  overflow: hidden;
  list-style: none;
  margin: 0;
  padding: 2px;
  -webkit-box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.2);
  box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.2);
  border-radius: 3px;
  border: 1px solid silver;
  background: #fff;
  max-height: 20em;
  overflow-y: auto;
}
.note__1Qo7 .CodeMirror-hint {
  margin: 0;
  padding: 0 4px;
  border-radius: 2px;
  white-space: pre;
  color: #000;
  cursor: pointer;
}
.note__1Qo7 li.CodeMirror-hint-active {
  background: #08f;
  color: #fff;
}
.note__1Qo7 .CodeMirror .cm-spell-error:not(.cm-url):not(.cm-comment):not(.cm-tag):not(.cm-word) {
  background: rgba(255, 0, 0, 0.15);
}
.note__1Qo7[status='entered'],
.note__1Qo7[status='entering'] {
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.note__1Qo7 .editor-toolbar {
  background: white;
  opacity: 1;
  height: 45px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  border-top: 1px solid #eeeeee;
  border-left: 1px solid #eeeeee;
  border-right: 1px solid #eeeeee;
  border-top-left-radius: 3px;
  border-top-right-radius: 0;
}
.note__1Qo7 .editor-toolbar:hover {
  opacity: 1;
}
.note__1Qo7 .CodeMirror.cm-s-paper.CodeMirror-wrap {
  border-color: #eeeeee;
  border-bottom-left-radius: 3px;
  border-bottom-right-radius: 0;
  height: 355px;
  overflow: hidden;
}
.close__3tsT {
  cursor: pointer;
  position: absolute;
  top: 0;
  right: 0;
  height: 45px;
  width: 45px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  color: #90a4ae;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.close__3tsT:hover {
  color: #546e7a;
}
.savedmsg__FYRn {
  position: absolute;
  font-size: 12px;
  top: 0;
  right: 40px;
  height: 28px;
  width: 60px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  color: #546e7a;
  margin: 10px 0;
  background: #f7f9fa;
  border-radius: 3px;
  opacity: 0;
}
.savedmsg__FYRn[data-status='true'] {
  -webkit-animation-name: fadein__3bt5;
          animation-name: fadein__3bt5;
  -webkit-animation-duration: 2s;
          animation-duration: 2s;
}
@-webkit-keyframes fadein__3bt5 {
  0% {
    opacity: 0;
  }
  15% {
    opacity: 1;
  }
  85% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
@keyframes fadein__3bt5 {
  0% {
    opacity: 0;
  }
  15% {
    opacity: 1;
  }
  85% {
    opacity: 1;
  }
  100% {
    opacity: 0;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.center-fixed__IJxj {
  position: fixed;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  text-align: center;
}
.introduction__3iiG {
  position: fixed;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  color: white;
  max-width: 400px;
  padding-bottom: 100px;
  text-align: center;
}
.tada-emoji__3-iO {
  font-size: 60px;
}
.title__WK7f {
  font-size: 20px;
  margin-bottom: 20px;
}
.description__1qkD {
  margin: 20px 0 30px;
}
.actions__3Zl9 {
  margin-top: 30px;
}
.actions__3Zl9 > * {
  width: 110px;
  margin-left: 40px;
}
.actions__3Zl9 > *:first-child {
  margin-left: 0;
}
.skip__27xI {
  color: #78909c;
  border-color: #78909c;
}
.drag-demo__x8RC {
  position: fixed;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  text-align: center;
  color: white;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.sql-schema-wrapper__3VBi {
  display: block;
  margin-bottom: 15px;
}
.sql-schema-link__3cEg {
  color: #546e7a;
  -webkit-transition: 0.18s color ease-in-out;
  -o-transition: 0.18s color ease-in-out;
  transition: 0.18s color ease-in-out;
}
.sql-schema-link__3cEg:hover {
  color: #263238;
}
.sql-schema-link__3cEg:focus {
  text-decoration: none;
}
.sql-schema-modal__31hT {
  max-width: 600px;
}
.sql-schema-pre__2EP8 {
  margin-bottom: 0;
  max-height: 500px;
  white-space: nowrap;
  background-color: #f5f5f5;
  border-radius: 3px;
  padding: 20px;
}
.sql-schema-code__YMhK {
  white-space: nowrap;
  background: transparent;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.content__u3I1 {
  font-size: 14px;
  color: #263238;
}
.content__u3I1 hr {
  border: 1px solid #eceff1;
  background-color: #eceff1;
}
.content__u3I1 a {
  pointer-events: auto;
  color: #607d8b;
  text-decoration: none;
  padding-bottom: 1px;
  border-bottom: 1px solid transparent;
  -webkit-transition: border-bottom-color 0.3s;
  -o-transition: border-bottom-color 0.3s;
  transition: border-bottom-color 0.3s;
}
.content__u3I1 a:hover {
  border-bottom-color: #607d8b;
}
.content__u3I1 pre {
  background: #f7f9fa;
  padding: 10px 15px;
  color: #263238;
  line-height: 1.6;
  font-size: 13px;
  border-radius: 3px;
}
.content__u3I1 pre code {
  padding: 0;
  color: inherit;
  background-color: transparent;
  -moz-tab-size: 4;
    -o-tab-size: 4;
       tab-size: 4;
  font-family: 'SFMono-Regular', Consolas, 'Liberation Mono', Menlo, Courier, monospace;
}
.content__u3I1 code {
  color: #546e7a;
  background-color: #f7f9fa;
  padding: 2px 4px;
  font-size: 13px;
  border-radius: 3px;
  font-family: monospace;
}
.content__u3I1 table {
  margin-bottom: 16px;
}
.content__u3I1 table th,
.content__u3I1 table td {
  padding: 6px 12px;
  border: 1px solid #dddddd;
}
.content__u3I1 table tr {
  border-top: 1px solid #dddddd;
}
.content__u3I1 table tr:nth-child(2n) {
  background-color: #f7f9fa;
}
.content__u3I1 blockquote {
  padding-left: 15px;
  border-left: 5px solid #eceff1;
  color: #616161;
}
.content__u3I1 p {
  font-size: inherit;
}
.content__u3I1 pre {
  white-space: pre-wrap;
}
.content__u3I1 img {
  max-width: 100%;
  height: auto !important;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.header__2X5E {
  font-size: 13px;
}
.company-tag-wrapper__1rBy {
  margin-top: 10px;
}
.company-tag-wrapper__1rBy .company-tag__23z7 {
  margin-bottom: 10px;
  margin-right: 15px;
}
.company-tag-wrapper__1rBy .company-tag__23z7 .separator__2KJB {
  color: #cfd8dc;
  margin-left: 4px;
  margin-right: 4px;
}
.company-tag-wrapper__1rBy .company-tag__23z7 .auth-logo__4ZVb {
  width: 12px;
  height: 12px;
}
.time-period-button-group__2HTV .time-period-button__3neY {
  background: none;
  border: none;
  padding: 0;
  font: inherit;
  cursor: pointer;
  outline: inherit;
  margin-right: 15px;
  font-size: 12px;
  color: #90a4ae;
  line-height: 24px;
  -webkit-transition: 0.18s ease;
  -o-transition: 0.18s ease;
  transition: 0.18s ease;
}
.time-period-button-group__2HTV .time-period-button__3neY:hover {
  color: #263238;
  border-color: #263238;
}
.time-period-button-group__2HTV .time-period-button__3neY.selected__1jx3 {
  color: #263238;
}
.time-period-button-group__2HTV .time-period-button__3neY.disabled__3ucc {
  opacity: 0.65;
  cursor: not-allowed;
}
.show-more-wrapper__2jBC {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.show-more__2LD1 {
  width: 100px;
  height: 30px;
  border-radius: 3px;
  opacity: 0.9;
  border: 1px solid;
  border-color: #eceff1;
}
.show-more__2LD1:focus {
  border-color: #eceff1;
  background-color: white;
}
.subscribe-modal-body__oHAE {
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  color: #009688;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  text-align: center;
}
.subscribe-modal-body__oHAE img {
  width: 100%;
}
.subscribe-modal-body__oHAE p {
  margin: 20px 0 0;
}
.subscribe-modal-footer__3P0_ {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  padding: 5px 20px 30px;
}
.subscribe-modal-button__HLQO {
  height: 40px;
  width: 162px;
}
.lock-icon__1hmE,
.info-icon__2U30 {
  margin-left: 10px;
}
.lock-icon__1hmE {
  color: #78909c;
}
.lock-icon__1hmE:hover {
  color: #263238;
}
.info-icon__2U30 {
  color: #90a4ae;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.header__2RZv {
  font-size: 13px;
}
.mobile-panel__1psO {
  border-bottom: 1px solid #eeeeee;
}
.mobile-header__3fT- {
  background: #fafafa;
}
.topic-tag__1jni + .topic-tag__1jni {
  margin-left: 15px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.mobile-panel__17Gs {
  border-bottom: 1px solid #eeeeee;
}
.mobile-header__2NkE {
  background: #fafafa;
}
.header__qVrK {
  font-size: 13px;
}
.question__25Pw {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -ms-flex-item-align: center;
      align-self: center;
}
.question__25Pw + .question__25Pw {
  margin-top: 20px;
}
.difficulty__ES5S {
  color: #9e9e9e;
  width: 60px;
  text-align: end;
}
.title__1kvt {
  color: #424242;
  cursor: pointer;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
.title__1kvt:hover {
  color: #424242;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.header__f9p6 {
  font-size: 13px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.avatar__OVN5 {
  width: 26px;
  height: 26px;
  border-radius: 50%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__MdHF {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  height: 40px;
}
.container__MdHF .label__kWQk {
  font-size: 13px;
  line-height: 100%;
  color: #757575;
}
.container__MdHF .contributors__1MZK {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  z-index: 0;
}
.container__MdHF .contributors__1MZK > div {
  margin-right: 10px;
}
.container__MdHF .contributors__1MZK > div:last-child {
  margin-right: 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.header__28Cb {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  padding: 4px 0;
  border-bottom: 1px solid #eeeeee;
  opacity: 1;
  -webkit-transition: opacity 1.5s 1.5s;
  -o-transition: opacity 1.5s 1.5s;
  transition: opacity 1.5s 1.5s;
}
.header__28Cb > * {
  margin: 4px 8px 4px 0;
}
.header__28Cb[data-is-last-step='true'] {
  opacity: 0;
}
.title__3BS7 {
  margin-right: 20px;
  color: #757575;
  font-size: 13px;
  line-height: 28px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-left: 0;
}
.title__3BS7[data-size='sm'] {
  width: 100%;
}
.btn-wrapper__19Tg {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.btn-wrapper__19Tg :last-child {
  margin-right: 0;
}
.action-btn__DKeo {
  min-width: 40px;
}
.autocomplete-wrapper__2U8y {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  width: auto;
}
.autocomplete-wrapper__2U8y .ant-select-selection__placeholder {
  font-size: 12px;
}
.company-autocomplete__2cI9 {
  margin-right: 8px;
  border-radius: 3px;
  border-color: #cfd8dc;
  height: 28px;
}
.ant-select-auto-complete.ant-select .ant-input {
  height: 28px;
  font-size: 12px;
}
.ant-select-auto-complete.ant-select .ant-input:focus {
  color: #263238;
  border-color: #263238;
  outline: none !important;
  -webkit-box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
          box-shadow: 0 0 0 2px rgba(251, 192, 46, 0.4);
}
.company-drop-down__3pGa .ant-select-dropdown {
  -webkit-box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
}
.company-drop-down__3pGa .ant-select-dropdown-menu {
  border: none;
}
.company-drop-down__3pGa .ant-select-dropdown-menu :hover {
  background-color: #eceff1;
}
.company-drop-down__3pGa .ant-select-dropdown-menu-item-active {
  border: none;
  background-color: #eceff1;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.description__24sA {
  padding: 0 20px;
  overflow-x: hidden;
  overflow-y: auto;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
  -webkit-overflow-scrolling: touch;
}
.question-content__JfgR {
  margin: 1em 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.dia-container__T7JA {
  position: relative;
  margin-top: 30px;
  margin-bottom: 30px;
}
.controls-container__2krD {
  position: absolute;
  margin: 0 5px;
  top: 50%;
  bottom: 50%;
  right: 0;
  left: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: horizontal;
  -webkit-box-direction: normal;
      -ms-flex-direction: row;
          flex-direction: row;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.play-container__1ZB9 {
  width: 80px;
  height: 80px;
  background-color: rgba(0, 0, 0, 0.5);
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  border-radius: 50%;
}
.play-container__1ZB9 > .fa-play__PWqu {
  margin-left: 5px;
}
.play-container__1ZB9:hover {
  cursor: pointer;
}
.control-group__16z9 {
  color: #999999;
}
.control-group__16z9.toggle-play__3DqW {
  font-size: 22px;
}
.control-group__16z9:hover {
  cursor: pointer;
  color: white;
}
.diaporama__1x84 {
  position: relative;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.fa-step-forward__2yS4,
.fa-step-backward__yNrc {
  font-size: 15px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.dia-controls__1L3Y {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -ms-flex-pack: distribute;
      justify-content: space-around;
  text-align: center;
  height: 26px;
  background-color: gray;
  -webkit-box-orient: horizontal;
  -webkit-box-direction: normal;
      -ms-flex-direction: row;
          flex-direction: row;
  color: black;
}
.controls__1q0X {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  width: 100px;
}
.control-panel__zPwY {
  padding: 5px;
  background-color: black;
  height: 32px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -ms-flex-pack: distribute;
      justify-content: space-around;
  position: relative;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.frame-counter__1YA2 {
  position: absolute;
  right: 0;
  margin-right: 10px;
  font-size: 12px;
  color: #c8c8c8;
}
.initial-play__3FKu {
  font-size: 35px;
  color: #c8c8c8;
}
.initial-play-wrapper__1tcs {
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  position: absolute;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.dia-img__3-yE {
  width: 100%;
  height: 100%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.solution__1uRe {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  height: 100%;
}
.nav__1n5p {
  -webkit-font-smoothing: antialiased;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  border-bottom: 1px solid #eeeeee;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 42px;
          flex: 0 0 42px;
}
.nav__1n5p > a {
  padding: 0 20px;
  color: #b0bec5;
  -webkit-transition: 0.3s all;
  -o-transition: 0.3s all;
  transition: 0.3s all;
}
.nav__1n5p > a:hover {
  color: #546e7a;
}
.contentwrapper__2jML {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  position: relative;
  overflow-y: scroll;
  -webkit-overflow-scrolling: touch;
}
.frozen__E2gL iframe {
  pointer-events: none;
}
.rating-container__17_x {
  padding: 10px 20px 0;
}
.content__QRGW {
  padding: 0 20px 20px;
  position: absolute;
  width: 100%;
}
.content__QRGW iframe {
  margin: 20px 0;
}
.content__QRGW hr {
  height: 1px;
  padding: 0;
  margin: 10px 0;
  overflow: hidden;
  background: #e0e0e0;
  border: none;
}
.content__QRGW ul {
  margin-bottom: 20px;
}
.content__QRGW h1,
.content__QRGW h2,
.content__QRGW h3,
.content__QRGW h4 {
  margin: 20px 0 15px;
}
.content__QRGW img {
  max-width: 100%;
}
.content__QRGW table {
  width: 100%;
}
.content__QRGW table th[align='right'] {
  text-align: right;
}
.content__QRGW table th[align='center'] {
  text-align: center;
}
.content__QRGW table th,
.content__QRGW table td {
  padding: 6px 13px;
  border: 1px solid #e0e0e0;
}
.content__QRGW blockquote {
  border-radius: 3px;
  background-color: #fafafa;
  margin: 20px 0;
  padding: 15px;
  border-left: 3px solid #bdbdbd;
}
.content__QRGW blockquote p:last-child,
.content__QRGW blockquote ol:last-child,
.content__QRGW blockquote ul:last-child,
.content__QRGW blockquote dl:last-child {
  margin-bottom: 0;
}
.content__QRGW pre {
  background: #f7f9fa;
  padding: 10px 15px;
  color: #263238;
  line-height: 1.6;
  font-size: 13px;
  border-radius: 3px;
}
.content__QRGW pre code {
  padding: 0;
  color: inherit;
  background-color: transparent;
  -moz-tab-size: 4;
    -o-tab-size: 4;
       tab-size: 4;
  font-family: 'SFMono-Regular', Consolas, 'Liberation Mono', Menlo, Courier, monospace;
}
.content__QRGW code {
  color: #546e7a;
  background-color: #f7f9fa;
  padding: 2px 4px;
  font-size: 13px;
  border-radius: 3px;
  font-family: monospace;
}
.placeholder__2YDM {
  padding: 20px;
  margin-top: 130px;
  text-align: center;
  -webkit-font-smoothing: antialiased;
  color: #bdbdbd;
}
.placeholder__2YDM .placeholder-title__14mj {
  margin-bottom: 40px;
  color: #bdbdbd;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.discuss-markdown-container {
  line-height: 1.57;
  color: #424242;
}
.discuss-markdown-container hr {
  border: 1px solid #eceff1;
  background-color: #eceff1;
}
.discuss-markdown-container a {
  pointer-events: auto;
  color: #607d8b;
  text-decoration: none;
  padding-bottom: 1px;
  border-bottom: 1px solid transparent;
  -webkit-transition: border-bottom-color 0.3s;
  -o-transition: border-bottom-color 0.3s;
  transition: border-bottom-color 0.3s;
}
.discuss-markdown-container a:hover {
  border-bottom-color: #607d8b;
}
.discuss-markdown-container pre {
  background: #f7f9fa;
  padding: 10px 15px;
  color: #263238;
  line-height: 1.6;
  font-size: 13px;
  border-radius: 3px;
}
.discuss-markdown-container pre code {
  padding: 0;
  color: inherit;
  background-color: transparent;
  -moz-tab-size: 4;
    -o-tab-size: 4;
       tab-size: 4;
  font-family: 'SFMono-Regular', Consolas, 'Liberation Mono', Menlo, Courier, monospace;
}
.discuss-markdown-container code {
  color: #546e7a;
  background-color: #f7f9fa;
  padding: 2px 4px;
  font-size: 13px;
  border-radius: 3px;
  font-family: monospace;
}
.discuss-markdown-container table {
  margin-bottom: 16px;
}
.discuss-markdown-container table th,
.discuss-markdown-container table td {
  padding: 6px 12px;
  border: 1px solid #dddddd;
}
.discuss-markdown-container table tr {
  border-top: 1px solid #dddddd;
}
.discuss-markdown-container table tr:nth-child(2n) {
  background-color: #f7f9fa;
}
.discuss-markdown-container blockquote {
  padding-left: 15px;
  border-left: 5px solid #eceff1;
  color: #616161;
}
.discuss-markdown-container h1,
.discuss-markdown-container h2,
.discuss-markdown-container h3,
.discuss-markdown-container h4,
.discuss-markdown-container h5,
.discuss-markdown-container h6 {
  font-size: unset;
}
.discuss-markdown-container > p:last-child {
  margin-bottom: 0;
}
.discuss-markdown-container img {
  max-width: 100%;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__eXXf {
  position: relative;
}
.follower-layer__1PQ-,
.style-layer__1WJr,
.style-layer-container__27Gu {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  overflow: visible;
  pointer-events: none;
  color: transparent;
  word-break: break-word;
  white-space: pre-wrap;
}
.follower-layer__1PQ- {
  z-index: 2;
}
.follower-layer__1PQ- .cursor-position__2bFn {
  position: relative;
}
.follower-layer__1PQ- .follower-container__14eT {
  position: absolute;
  left: 0;
  top: 0;
  color: initial;
  pointer-events: auto;
  white-space: nowrap;
}
.style-layer-container__27Gu {
  overflow: hidden;
}
.style-layer-container__27Gu .style-layer__1WJr {
  z-index: 1;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.follower-container__25so {
  -webkit-box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 4px 16px 0 rgba(0, 0, 0, 0.08);
  border-radius: 3px;
  background: white;
  -webkit-transform: translateX(1em);
          transform: translateX(1em);
  overflow: hidden;
}
.mention-item__3SGl a {
  pointer-events: auto;
  color: #6f9aaf;
  text-decoration: none;
  padding-bottom: 1px;
  border-bottom: 1px solid transparent;
  -webkit-transition: border-bottom-color 0.3s;
  -o-transition: border-bottom-color 0.3s;
  transition: border-bottom-color 0.3s;
}
.mention-item__3SGl a:hover {
  border-bottom-color: #6f9aaf;
}
.mention-item__3SGl::before {
  content: ' ';
}
.mention-item__3SGl[data-hide-front-space='true']::before {
  content: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.item__1wdi {
  height: 40px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 0 15px;
  cursor: pointer;
}
.item__1wdi[data-is-selected='true'] {
  background: #eceff1;
}
.item__1wdi:not([data-is-selected='true']):hover {
  background: rgba(236, 239, 241, 0.5);
}
.id__E6h4 {
  color: #78909c;
}
.avatar__2CI5 {
  height: 28px;
  width: 28px;
  border-radius: 100%;
}
.id__E6h4,
.avatar__2CI5 {
  margin-right: 10px;
}
.title__n8_q,
.username__29AZ {
  font-size: 14px;
  color: #424242;
  max-width: 200px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: nowrap;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.comment__4GKl {
  border: 1px solid #cfd8dc;
  border-radius: 3px;
  margin-top: 5px;
}
.comment__4GKl[data-is-show='false'] {
  display: none;
}
.login-to-comment__3EcY {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  height: 70px;
  background: #fafafa;
  cursor: pointer;
}
.login-to-comment__3EcY h5 {
  margin: 0;
  color: #78909c;
}
.login-to-comment__3EcY svg {
  width: 20px;
  height: 20px;
  margin-left: 12px;
  color: #90a4ae;
}
.editor__2AvG {
  line-height: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.editor__2AvG .input-area__25Vz,
.editor__2AvG .preview-content__3J9i {
  margin: 5px 10px;
}
.editor__2AvG .text-area__1za6,
.editor__2AvG .preview-content__3J9i {
  padding: 0;
  border: none;
  resize: none;
  font-size: 14px;
  font-variant-numeric: tabular-nums;
  line-height: 1.57;
  min-height: 50px;
}
.editor__2AvG .text-area__1za6 {
  outline: none;
  width: 100%;
  max-height: 300px;
}
.editor__2AvG .button__13tk,
.editor__2AvG .button__13tk::before,
.editor__2AvG .button__13tk::after {
  border-radius: 0;
  border: none;
  -webkit-transition: opacity 0.3s;
  -o-transition: opacity 0.3s;
  transition: opacity 0.3s;
}
.editor__2AvG .button__13tk[data-is-hide='true'] {
  opacity: 0;
  pointer-events: none;
}
.editor__2AvG .action-area__2XIi {
  border-top: 1px solid #cfd8dc;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  overflow: hidden;
  border-radius: 0 0 2px 2px;
}
.editor__2AvG .action-area__2XIi .left-actions__3wPT {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.editor__2AvG .action-area__2XIi .preview__3Il- {
  border-right: 1px solid #cfd8dc;
}
.editor__2AvG .action-area__2XIi .cancel__3FWQ {
  border-left: 1px solid #cfd8dc;
}
.editor__2AvG .action-area__2XIi .anonymous-notification__31w- {
  margin-right: 15px;
  font-size: 12px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  color: #757575;
}
.verify-link__283u {
  color: #c62928;
  text-decoration: underline;
}
.verify-link__283u:hover {
  color: #b71c1c;
  text-decoration: underline;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__3bcS {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.avatar__7D9c {
  width: 30px;
  height: 30px;
  border-radius: 100%;
  display: inline-block;
  background-color: #f5f5f5;
}
.name__2jm2 {
  color: #424242;
  margin-left: 10px;
}
.admin__axwt {
  color: #90a4ae;
  margin-left: 10px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.admin__axwt svg {
  height: 14px;
  width: 14px;
  color: #b0bec5;
  margin-right: 3px;
}
.reputation___jPr {
  color: #90a4ae;
  margin-left: 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.reputation___jPr svg {
  width: 14px;
  height: 14px;
  color: #b0bec5;
  margin-right: 4px;
}
.user-info__2b-x {
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  line-height: 1;
  font-size: 12px;
}
.post-info__1K06 {
  color: #bdbdbd;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-left: 25px;
}
.post-info__1K06 > p {
  margin: 0;
  font-size: 12px;
}
.post-info__1K06 > p:not(:last-child) {
  margin-right: 10px;
}
.view-count__dBuq {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  text-align: right;
}
.link__Lpjq {
  color: #9e9e9e;
}
.link__Lpjq:hover {
  color: #424242;
}
.reputation-loader__2oz- {
  width: 25px;
  height: 14px;
}
.container__3Ldq {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.anonymous-avatar__2wS_ {
  border-radius: 50%;
  opacity: 0.7;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__3-ij {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.vote__3Zp9 {
  padding: 2px 7px;
  border-radius: 3px;
  font-size: 12px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  color: #607d8b;
  background: #f7f9fa;
  -webkit-transition: color 0.3s, background-color 0.3s;
  -o-transition: color 0.3s, background-color 0.3s;
  transition: color 0.3s, background-color 0.3s;
  cursor: pointer;
}
.vote__3Zp9 svg {
  width: 26px;
  height: 26px;
}
.count__I8pP {
  font-size: 12px;
  font-weight: bold;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.confirm-area__3UG1 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.confirm-area__3UG1 button {
  min-width: 80px;
}
.confirm-area__3UG1 button:not(:first-child) {
  margin-left: 18px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.global-clipboard-container {
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.comment__3raU {
  border-radius: 4px;
  margin-bottom: 10px;
}
.comment__3raU:last-child {
  margin-bottom: 0;
}
.comment__3raU [data-show-on-hover] {
  opacity: 0;
  pointer-events: none;
}
.comment__3raU:hover [data-show-on-hover] {
  opacity: 1;
  pointer-events: auto;
}
.comment__3raU .content__2Xc9 {
  padding-left: 40px;
  margin-top: 5px;
}
.comment__3raU[data-indentation-level='1'] {
  padding-left: 40px;
}
.comment__3raU[data-status='Deleted'] {
  opacity: 0.5;
}
.comment__3raU:first-of-type .line__S1gO {
  display: none;
}
.actions__32FD {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin-top: 5px;
}
.actions__32FD .action__1C-I {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  margin-left: 15px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  color: #78909c;
  -webkit-transition: color 0.3s, opacity 0.3s;
  -o-transition: color 0.3s, opacity 0.3s;
  transition: color 0.3s, opacity 0.3s;
  cursor: pointer;
  font-size: 12px;
  line-height: 1;
}
.actions__32FD .action__1C-I svg {
  width: 18px;
  height: 18px;
  margin-right: 5px;
  color: #546e7a;
}
.actions__32FD .action__1C-I:hover,
.actions__32FD .action__1C-I:hover svg {
  color: #263238;
}
.markdown-content-area__33i4 {
  position: relative;
  overflow: hidden;
}
.markdown-content-area__33i4 .read-more__3UuG {
  position: absolute;
  height: 100%;
  width: 100%;
  background: -webkit-gradient(linear, left top, left bottom, from(rgba(255, 255, 255, 0)), to(#ffffff));
  background: -webkit-linear-gradient(rgba(255, 255, 255, 0), #ffffff);
  background: -o-linear-gradient(rgba(255, 255, 255, 0), #ffffff);
  background: linear-gradient(rgba(255, 255, 255, 0), #ffffff);
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: end;
      -ms-flex-align: end;
          align-items: flex-end;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  cursor: pointer;
  opacity: 0;
  pointer-events: none;
  font-size: 12px;
  color: #546e7a;
  -webkit-transition: color 0.3s;
  -o-transition: color 0.3s;
  transition: color 0.3s;
}
.markdown-content-area__33i4 .read-more__3UuG:hover {
  color: #37474f;
}
[data-is-show-read-more='true'] [data-is-beyond-limit-size='true'] .read-more__3UuG {
  opacity: 1;
  pointer-events: auto;
}
.line__S1gO {
  border: none;
  border-bottom: 1px solid #eeeeee;
  margin: 0 0 10px;
}
.vote__1Qs- {
  color: #cfd8dc;
  background: transparent;
  padding: 0 7px;
}
.vote__1Qs-:not([data-is-voted='true']):hover,
.vote__1Qs-:not([data-is-voted='true']):hover svg {
  color: rgba(69, 90, 100, 0.4);
}
.vote__1Qs-[data-is-voted='true'] {
  color: #455a64;
}
.count__7rrc {
  color: #78909c;
}
.new-comment__Sl3w {
  -webkit-animation: comment-highlight__2UYd 0.5s;
          animation: comment-highlight__2UYd 0.5s;
}
.optimistic-comment__3MbJ {
  background-color: #f7f9fa;
}
.highlighted-comment__3B3k {
  background-color: #f7f9fa;
  -webkit-animation: comment-highlight__2UYd 0.5s ease-in-out 1.5s forwards;
          animation: comment-highlight__2UYd 0.5s ease-in-out 1.5s forwards;
}
@-webkit-keyframes comment-highlight__2UYd {
  0% {
    background-color: #f7f9fa;
  }
  100% {
    background-color: transparent;
  }
}
@keyframes comment-highlight__2UYd {
  0% {
    background-color: #f7f9fa;
  }
  100% {
    background-color: transparent;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.report-modal__1hA9 {
  padding-top: 0 !important;
}
.report-item__2-kP {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  height: 44px;
  color: #607d8b;
  -webkit-box-shadow: 0 -1px 0 0 #eeeeee;
          box-shadow: 0 -1px 0 0 #eeeeee;
  cursor: pointer;
}
.report-item__2-kP svg {
  width: 18px;
  height: 18px;
  opacity: 0;
}
.report-item__2-kP[data-is-checked='true'] {
  color: #263238;
}
.report-item__2-kP[data-is-checked='true'] svg {
  opacity: 1;
}
.report-text-area__2X2Y {
  width: 480px;
}
.modal-footer__1PL5 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.button__3z1F {
  min-width: 80px;
  margin-left: 20px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.loading__2Nmk {
  height: 99px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.comments-list__vX16 {
  margin-top: 12px;
  position: relative;
}
.comments-list-loading__2Dus {
  min-height: 200px;
}
.comments-container__tcjS {
  padding: 0 20px;
}
.loading-cover__3hdh {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  padding: 80px;
  background: white;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  z-index: 1;
  -webkit-transition: 0.18s opacity ease-in-out;
  -o-transition: 0.18s opacity ease-in-out;
  transition: 0.18s opacity ease-in-out;
  opacity: 0;
}
.loading-cover__3hdh[data-status='entering'],
.loading-cover__3hdh[data-status='entered'] {
  opacity: 1;
}
.loading-cover__3hdh[data-status='exiting'] {
  opacity: 0;
}
.loading-cover__3hdh[data-status='exited'] {
  opacity: 0;
  display: none;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__3XxC {
  margin: 15px 0;
  min-width: 750px;
}
.header___QdN {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-bottom: 20px;
  background: #fafafa;
  border-style: solid;
  border-color: #eeeeee;
  border-width: 1px 0;
  padding: 0 20px;
}
.header___QdN .comment-count__28iT {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  margin: 0;
  cursor: default;
  font-weight: 500;
  font-size: 12px;
}
.header___QdN .sorts__3Wh1 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  line-height: 40px;
  color: #cfd8dc;
}
.header___QdN .sorts__3Wh1 > div {
  margin-left: 25px;
  cursor: pointer;
}
.header___QdN .sorts__3Wh1 > div[data-is-active='true'] {
  color: #546e7a;
}
.pagination__1L7A .ant-pagination-item,
.pagination__1L7A .ant-pagination-item-link,
.pagination__1L7A .ant-pagination-prev,
.pagination__1L7A .ant-pagination-next,
.pagination__1L7A .ant-pagination-item-link::after {
  width: 24px;
  height: 24px;
  min-width: 24px;
  line-height: 24px;
}
.pagination__1L7A .ant-pagination-item,
.pagination__1L7A .ant-pagination-prev,
.pagination__1L7A .ant-pagination-next {
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.pagination__1L7A .ant-pagination-item a,
.pagination__1L7A .ant-pagination-prev a,
.pagination__1L7A .ant-pagination-next a {
  margin: 0;
}
.pagination-container__px42 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  margin: 0 auto;
  padding: 15px 0 30px;
}
.hidden-pagination-container__5I8a {
  margin: 0;
}
.chat-icon__3usv {
  font-size: 16px;
  margin-right: 7px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.icon-wrapper__2qcB {
  color: #cfd8dc;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  height: 30px;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.icon-wrapper__2qcB svg {
  width: 18px;
  height: 18px;
}
.icon-wrapper__2qcB > div {
  margin-right: 20px;
  cursor: pointer;
}
.icon-wrapper__2qcB > [data-active='true'] {
  color: #78909c;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
body.topic-editor .question-detail-container {
  padding-bottom: calc(50vh - 80px);
}
.visible-xss {
  display: none;
}
@media (max-width: 480px) {
  .visible-xss {
    display: unset;
  }
}
.hidden-xss {
  display: unset;
}
@media (max-width: 480px) {
  .hidden-xss {
    display: none;
  }
}
.topic-editor-base {
  /**
 * simplemde v1.11.2
 * Copyright Next Step Webs, Inc.
 * @link https://github.com/NextStepWebs/simplemde-markdown-editor
 * @license MIT
 */
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.topic-editor-base .CodeMirror {
  font-family: monospace;
  height: 300px;
  color: #000;
  direction: ltr;
}
.topic-editor-base .CodeMirror-lines {
  padding: 4px 0;
}
.topic-editor-base .CodeMirror pre {
  padding: 0 4px;
}
.topic-editor-base .CodeMirror-gutter-filler,
.topic-editor-base .CodeMirror-scrollbar-filler {
  background-color: #fff;
}
.topic-editor-base .CodeMirror-gutters {
  border-right: 1px solid #ddd;
  background-color: #f7f7f7;
  white-space: nowrap;
}
.topic-editor-base .CodeMirror-linenumber {
  padding: 0 3px 0 5px;
  min-width: 20px;
  text-align: right;
  color: #999;
  white-space: nowrap;
}
.topic-editor-base .CodeMirror-guttermarker {
  color: #000;
}
.topic-editor-base .CodeMirror-guttermarker-subtle {
  color: #999;
}
.topic-editor-base .CodeMirror-cursor {
  border-left: 1px solid #000;
  border-right: none;
  width: 0;
}
.topic-editor-base .CodeMirror div.CodeMirror-secondarycursor {
  border-left: 1px solid silver;
}
.topic-editor-base .cm-fat-cursor .CodeMirror-cursor {
  width: auto;
  border: 0!important;
  background: #7e7;
}
.topic-editor-base .cm-fat-cursor div.CodeMirror-cursors {
  z-index: 1;
}
.topic-editor-base .cm-animate-fat-cursor {
  width: auto;
  border: 0;
  -webkit-animation: blink 1.06s steps(1) infinite;
  animation: blink 1.06s steps(1) infinite;
  background-color: #7e7;
}
@-webkit-keyframes blink {
  50% {
    background-color: transparent;
  }
}
@keyframes blink {
  50% {
    background-color: transparent;
  }
}
.topic-editor-base .cm-tab {
  display: inline-block;
  text-decoration: inherit;
}
.topic-editor-base .CodeMirror-rulers {
  position: absolute;
  left: 0;
  right: 0;
  top: -50px;
  bottom: -20px;
  overflow: hidden;
}
.topic-editor-base .CodeMirror-ruler {
  border-left: 1px solid #ccc;
  top: 0;
  bottom: 0;
  position: absolute;
}
.topic-editor-base .cm-s-default .cm-header {
  color: #00f;
}
.topic-editor-base .cm-s-default .cm-quote {
  color: #090;
}
.topic-editor-base .cm-negative {
  color: #d44;
}
.topic-editor-base .cm-positive {
  color: #292;
}
.topic-editor-base .cm-header,
.topic-editor-base .cm-strong {
  font-weight: 700;
}
.topic-editor-base .cm-em {
  font-style: italic;
}
.topic-editor-base .cm-link {
  text-decoration: underline;
}
.topic-editor-base .cm-strikethrough {
  text-decoration: line-through;
}
.topic-editor-base .cm-s-default .cm-keyword {
  color: #708;
}
.topic-editor-base .cm-s-default .cm-atom {
  color: #219;
}
.topic-editor-base .cm-s-default .cm-number {
  color: #164;
}
.topic-editor-base .cm-s-default .cm-def {
  color: #00f;
}
.topic-editor-base .cm-s-default .cm-variable-2 {
  color: #05a;
}
.topic-editor-base .cm-s-default .cm-type,
.topic-editor-base .cm-s-default .cm-variable-3 {
  color: #085;
}
.topic-editor-base .cm-s-default .cm-comment {
  color: #a50;
}
.topic-editor-base .cm-s-default .cm-string {
  color: #a11;
}
.topic-editor-base .cm-s-default .cm-string-2 {
  color: #f50;
}
.topic-editor-base .cm-s-default .cm-meta {
  color: #555;
}
.topic-editor-base .cm-s-default .cm-qualifier {
  color: #555;
}
.topic-editor-base .cm-s-default .cm-builtin {
  color: #30a;
}
.topic-editor-base .cm-s-default .cm-bracket {
  color: #997;
}
.topic-editor-base .cm-s-default .cm-tag {
  color: #170;
}
.topic-editor-base .cm-s-default .cm-attribute {
  color: #00c;
}
.topic-editor-base .cm-s-default .cm-hr {
  color: #999;
}
.topic-editor-base .cm-s-default .cm-link {
  color: #00c;
}
.topic-editor-base .cm-s-default .cm-error {
  color: red;
}
.topic-editor-base .cm-invalidchar {
  color: red;
}
.topic-editor-base .CodeMirror-composing {
  border-bottom: 2px solid;
}
.topic-editor-base div.CodeMirror span.CodeMirror-matchingbracket {
  color: #0f0;
}
.topic-editor-base div.CodeMirror span.CodeMirror-nonmatchingbracket {
  color: #f22;
}
.topic-editor-base .CodeMirror-matchingtag {
  background: rgba(255, 150, 0, 0.3);
}
.topic-editor-base .CodeMirror-activeline-background {
  background: #e8f2ff;
}
.topic-editor-base .CodeMirror {
  position: relative;
  overflow: hidden;
  background: #fff;
}
.topic-editor-base .CodeMirror-scroll {
  overflow: scroll!important;
  margin-bottom: -30px;
  margin-right: -30px;
  padding-bottom: 30px;
  height: 100%;
  outline: 0;
  position: relative;
}
.topic-editor-base .CodeMirror-sizer {
  position: relative;
  border-right: 30px solid transparent;
}
.topic-editor-base .CodeMirror-gutter-filler,
.topic-editor-base .CodeMirror-hscrollbar,
.topic-editor-base .CodeMirror-scrollbar-filler,
.topic-editor-base .CodeMirror-vscrollbar {
  position: absolute;
  z-index: 6;
  display: none;
}
.topic-editor-base .CodeMirror-vscrollbar {
  right: 0;
  top: 0;
  overflow-x: hidden;
  overflow-y: scroll;
}
.topic-editor-base .CodeMirror-hscrollbar {
  bottom: 0;
  left: 0;
  overflow-y: hidden;
  overflow-x: scroll;
}
.topic-editor-base .CodeMirror-scrollbar-filler {
  right: 0;
  bottom: 0;
}
.topic-editor-base .CodeMirror-gutter-filler {
  left: 0;
  bottom: 0;
}
.topic-editor-base .CodeMirror-gutters {
  position: absolute;
  left: 0;
  top: 0;
  min-height: 100%;
  z-index: 3;
}
.topic-editor-base .CodeMirror-gutter {
  white-space: normal;
  height: 100%;
  display: inline-block;
  vertical-align: top;
  margin-bottom: -30px;
}
.topic-editor-base .CodeMirror-gutter-wrapper {
  position: absolute;
  z-index: 4;
  background: 0 0!important;
  border: none !important;
}
.topic-editor-base .CodeMirror-gutter-background {
  position: absolute;
  top: 0;
  bottom: 0;
  z-index: 4;
}
.topic-editor-base .CodeMirror-gutter-elt {
  position: absolute;
  cursor: default;
  z-index: 4;
}
.topic-editor-base .CodeMirror-gutter-wrapper ::-moz-selection {
  background-color: transparent;
}
.topic-editor-base .CodeMirror-gutter-wrapper ::selection {
  background-color: transparent;
}
.topic-editor-base .CodeMirror-gutter-wrapper ::-moz-selection {
  background-color: transparent;
}
.topic-editor-base .CodeMirror-lines {
  cursor: text;
  min-height: 1px;
}
.topic-editor-base .CodeMirror pre {
  border-radius: 0;
  border-width: 0;
  background: 0 0;
  font-family: inherit;
  font-size: inherit;
  margin: 0;
  white-space: pre;
  word-wrap: normal;
  line-height: inherit;
  color: inherit;
  z-index: 2;
  position: relative;
  overflow: visible;
  -webkit-tap-highlight-color: transparent;
  -webkit-font-variant-ligatures: contextual;
  font-variant-ligatures: contextual;
}
.topic-editor-base .CodeMirror-wrap pre {
  word-wrap: break-word;
  white-space: pre-wrap;
  word-break: normal;
}
.topic-editor-base .CodeMirror-linebackground {
  position: absolute;
  left: 0;
  right: 0;
  top: 0;
  bottom: 0;
  z-index: 0;
}
.topic-editor-base .CodeMirror-linewidget {
  position: relative;
  z-index: 2;
  overflow: auto;
}
.topic-editor-base .CodeMirror-rtl pre {
  direction: rtl;
}
.topic-editor-base .CodeMirror-code {
  outline: 0;
}
.topic-editor-base .CodeMirror-gutter,
.topic-editor-base .CodeMirror-gutters,
.topic-editor-base .CodeMirror-linenumber,
.topic-editor-base .CodeMirror-scroll,
.topic-editor-base .CodeMirror-sizer {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
}
.topic-editor-base .CodeMirror-measure {
  position: absolute;
  width: 100%;
  height: 0;
  overflow: hidden;
  visibility: hidden;
}
.topic-editor-base .CodeMirror-cursor {
  position: absolute;
  pointer-events: none;
}
.topic-editor-base .CodeMirror-measure pre {
  position: static;
}
.topic-editor-base div.CodeMirror-cursors {
  visibility: hidden;
  position: relative;
  z-index: 3;
}
.topic-editor-base div.CodeMirror-dragcursors {
  visibility: visible;
}
.topic-editor-base .CodeMirror-focused div.CodeMirror-cursors {
  visibility: visible;
}
.topic-editor-base .CodeMirror-selected {
  background: #d9d9d9;
}
.topic-editor-base .CodeMirror-focused .CodeMirror-selected {
  background: #d7d4f0;
}
.topic-editor-base .CodeMirror-crosshair {
  cursor: crosshair;
}
.topic-editor-base .CodeMirror-line::-moz-selection,
.topic-editor-base .CodeMirror-line > span::-moz-selection,
.topic-editor-base .CodeMirror-line > span > span::-moz-selection {
  background: #d7d4f0;
}
.topic-editor-base .CodeMirror-line::selection,
.topic-editor-base .CodeMirror-line > span::selection,
.topic-editor-base .CodeMirror-line > span > span::selection {
  background: #d7d4f0;
}
.topic-editor-base .CodeMirror-line::-moz-selection,
.topic-editor-base .CodeMirror-line > span::-moz-selection,
.topic-editor-base .CodeMirror-line > span > span::-moz-selection {
  background: #d7d4f0;
}
.topic-editor-base .cm-searching {
  background-color: #ffa;
  background-color: rgba(255, 255, 0, 0.4);
}
.topic-editor-base .cm-force-border {
  padding-right: 0.1px;
}
@media print {
  .topic-editor-base .CodeMirror div.CodeMirror-cursors {
    visibility: hidden;
  }
}
.topic-editor-base .cm-tab-wrap-hack:after {
  content: '';
}
.topic-editor-base span.CodeMirror-selectedtext {
  background: 0 0;
}
.topic-editor-base .CodeMirror {
  height: auto;
  min-height: 300px;
  border: 1px solid #ddd;
  border-bottom-left-radius: 4px;
  border-bottom-right-radius: 4px;
  padding: 10px;
  font: inherit;
  z-index: 1;
}
.topic-editor-base .CodeMirror-scroll {
  min-height: 300px;
}
.topic-editor-base .CodeMirror-fullscreen {
  background: #fff;
  position: fixed!important;
  top: 50px;
  left: 0;
  right: 0;
  bottom: 0;
  height: auto;
  z-index: 9;
}
.topic-editor-base .CodeMirror-sided {
  width: 50% !important;
}
.topic-editor-base .editor-toolbar {
  position: relative;
  opacity: 0.6;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  -o-user-select: none;
  user-select: none;
  padding: 0 10px;
  border-top: 1px solid #bbb;
  border-left: 1px solid #bbb;
  border-right: 1px solid #bbb;
  border-top-left-radius: 4px;
  border-top-right-radius: 4px;
}
.topic-editor-base .editor-toolbar:after,
.topic-editor-base .editor-toolbar:before {
  display: block;
  content: ' ';
  height: 1px;
}
.topic-editor-base .editor-toolbar:before {
  margin-bottom: 8px;
}
.topic-editor-base .editor-toolbar:after {
  margin-top: 8px;
}
.topic-editor-base .editor-toolbar:hover,
.topic-editor-base .editor-wrapper input.title:focus,
.topic-editor-base .editor-wrapper input.title:hover {
  opacity: 0.8;
}
.topic-editor-base .editor-toolbar.fullscreen {
  width: 100%;
  height: 50px;
  overflow-x: auto;
  overflow-y: hidden;
  white-space: nowrap;
  padding-top: 10px;
  padding-bottom: 10px;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  background: #fff;
  border: 0;
  position: fixed;
  top: 0;
  left: 0;
  opacity: 1;
  z-index: 9;
}
.topic-editor-base .editor-toolbar.fullscreen::before {
  width: 20px;
  height: 50px;
  background: -webkit-gradient(linear, left top, right top, color-stop(0, #ffffff), color-stop(100%, rgba(255, 255, 255, 0)));
  background: -webkit-linear-gradient(left, #ffffff 0, rgba(255, 255, 255, 0) 100%);
  background: -o-linear-gradient(left, #ffffff 0, rgba(255, 255, 255, 0) 100%);
  background: -webkit-gradient(linear, left top, right top, color-stop(0, #ffffff), to(rgba(255, 255, 255, 0)));
  background: linear-gradient(to right, #ffffff 0, rgba(255, 255, 255, 0) 100%);
  position: fixed;
  top: 0;
  left: 0;
  margin: 0;
  padding: 0;
}
.topic-editor-base .editor-toolbar.fullscreen::after {
  width: 20px;
  height: 50px;
  background: -webkit-gradient(linear, left top, right top, color-stop(0, rgba(255, 255, 255, 0)), color-stop(100%, #ffffff));
  background: -webkit-linear-gradient(left, rgba(255, 255, 255, 0) 0, #ffffff 100%);
  background: -o-linear-gradient(left, rgba(255, 255, 255, 0) 0, #ffffff 100%);
  background: -webkit-gradient(linear, left top, right top, color-stop(0, rgba(255, 255, 255, 0)), to(#ffffff));
  background: linear-gradient(to right, rgba(255, 255, 255, 0) 0, #ffffff 100%);
  position: fixed;
  top: 0;
  right: 0;
  margin: 0;
  padding: 0;
}
.topic-editor-base .editor-toolbar a {
  display: inline-block;
  text-align: center;
  text-decoration: none!important;
  color: #2c3e50 !important;
  width: 30px;
  height: 30px;
  margin: 0;
  border: 1px solid transparent;
  border-radius: 3px;
  cursor: pointer;
}
.topic-editor-base .editor-toolbar a.active,
.topic-editor-base .editor-toolbar a:hover {
  background: #fcfcfc;
  border-color: #95a5a6;
}
.topic-editor-base .editor-toolbar a:before {
  line-height: 30px;
}
.topic-editor-base .editor-toolbar i.separator {
  display: inline-block;
  width: 0;
  border-left: 1px solid #d9d9d9;
  border-right: 1px solid #fff;
  color: transparent;
  text-indent: -10px;
  margin: 0 6px;
}
.topic-editor-base .editor-toolbar a.fa-header-x:after {
  font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
  font-size: 65%;
  vertical-align: text-bottom;
  position: relative;
  top: 2px;
}
.topic-editor-base .editor-toolbar a.fa-header-1:after {
  content: "1";
}
.topic-editor-base .editor-toolbar a.fa-header-2:after {
  content: "2";
}
.topic-editor-base .editor-toolbar a.fa-header-3:after {
  content: "3";
}
.topic-editor-base .editor-toolbar a.fa-header-bigger:after {
  content: "\25B2";
}
.topic-editor-base .editor-toolbar a.fa-header-smaller:after {
  content: "\25BC";
}
.topic-editor-base .editor-toolbar.disabled-for-preview a:not(.no-disable) {
  pointer-events: none;
  background: #fff;
  border-color: transparent;
  text-shadow: inherit;
}
@media only screen and (max-width: 700px) {
  .topic-editor-base .editor-toolbar a.no-mobile {
    display: none;
  }
}
.topic-editor-base .editor-statusbar {
  padding: 8px 10px;
  font-size: 12px;
  color: #959694;
  text-align: right;
}
.topic-editor-base .editor-statusbar span {
  display: inline-block;
  min-width: 4em;
  margin-left: 1em;
}
.topic-editor-base .editor-statusbar .lines:before {
  content: 'lines: ';
}
.topic-editor-base .editor-statusbar .words:before {
  content: 'words: ';
}
.topic-editor-base .editor-statusbar .characters:before {
  content: 'characters: ';
}
.topic-editor-base .editor-preview {
  padding: 10px;
  position: absolute;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  background: #fafafa;
  z-index: 7;
  overflow: auto;
  display: none;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
}
.topic-editor-base .editor-preview-side {
  padding: 10px;
  position: fixed;
  bottom: 0;
  width: 50%;
  top: 50px;
  right: 0;
  background: #fafafa;
  z-index: 9;
  overflow: auto;
  display: none;
  -webkit-box-sizing: border-box;
          box-sizing: border-box;
  border: 1px solid #ddd;
}
.topic-editor-base .editor-preview-active-side {
  display: block;
}
.topic-editor-base .editor-preview-active {
  display: block;
}
.topic-editor-base .editor-preview-side > p,
.topic-editor-base .editor-preview > p {
  margin-top: 0;
}
.topic-editor-base .editor-preview pre,
.topic-editor-base .editor-preview-side pre {
  background: #eee;
  margin-bottom: 10px;
}
.topic-editor-base .editor-preview table td,
.topic-editor-base .editor-preview table th,
.topic-editor-base .editor-preview-side table td,
.topic-editor-base .editor-preview-side table th {
  border: 1px solid #ddd;
  padding: 5px;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-tag {
  color: #63a35c;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-attribute {
  color: #795da3;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-string {
  color: #183691;
}
.topic-editor-base .CodeMirror .CodeMirror-selected {
  background: #d9d9d9;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-header-1 {
  font-size: 200%;
  line-height: 200%;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-header-2 {
  font-size: 160%;
  line-height: 160%;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-header-3 {
  font-size: 125%;
  line-height: 125%;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-header-4 {
  font-size: 110%;
  line-height: 110%;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-comment {
  background: rgba(0, 0, 0, 0.05);
  border-radius: 2px;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-link {
  color: #7f8c8d;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-url {
  color: #aab2b3;
}
.topic-editor-base .CodeMirror .CodeMirror-code .cm-strikethrough {
  text-decoration: line-through;
}
.topic-editor-base .CodeMirror .CodeMirror-placeholder {
  opacity: 0.5;
}
.topic-editor-base .CodeMirror-hints {
  position: absolute;
  z-index: 2147483647;
  overflow: hidden;
  list-style: none;
  margin: 0;
  padding: 2px;
  -webkit-box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.2);
  box-shadow: 2px 3px 5px rgba(0, 0, 0, 0.2);
  border-radius: 3px;
  border: 1px solid silver;
  background: #fff;
  max-height: 20em;
  overflow-y: auto;
}
.topic-editor-base .CodeMirror-hint {
  margin: 0;
  padding: 0 4px;
  border-radius: 2px;
  white-space: pre;
  color: #000;
  cursor: pointer;
}
.topic-editor-base li.CodeMirror-hint-active {
  background: #08f;
  color: #fff;
}
.topic-editor-base .CodeMirror .cm-spell-error:not(.cm-url):not(.cm-comment):not(.cm-tag):not(.cm-word) {
  background: rgba(255, 0, 0, 0.15);
}
.topic-editor-base .editor-content {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  margin-bottom: 10px;
  min-height: 0;
}
.topic-editor-base .editor-content .content-input {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  width: 100%;
  margin-bottom: 10px;
  min-height: 0;
}
.topic-editor-base .editor-content .content-input > :first-child {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  height: 100%;
}
.topic-editor-base .editor-content .content-input .editor-toolbar {
  border: 1px solid #cfd8dc;
  max-height: 50px;
  opacity: 1;
}
.topic-editor-base .editor-content .content-input .editor-toolbar > a,
.topic-editor-base .editor-content .content-input .editor-toolbar > span {
  opacity: 0.6;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  position: relative;
  height: 100%;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview-container {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
  height: 100%;
  min-width: 0;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview-container.preview-container-invisible[data-status='exiting'] {
  position: absolute;
  width: 50%;
  top: 0;
  right: 0;
  z-index: 2;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview-container[data-status='exited'] {
  display: none;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview {
  -webkit-transition: 0.2s opacity;
  -o-transition: 0.2s opacity;
  transition: 0.2s opacity;
  background-color: white;
  border-bottom-right-radius: 4px;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  border-width: 0 1px 1px 0;
  border-style: solid;
  border-color: #cfd8dc;
  padding: 10px;
  height: 100%;
  opacity: 1;
  overflow: scroll;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview.preview-placeholder {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview.preview-placeholder .preview-placeholder-text {
  font-weight: bold;
  font-size: 36px;
  color: #eceff1;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview.preview-full {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 2;
  border-left-width: 1px;
  border-bottom-left-radius: 4px;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview[data-status='exiting'] {
  opacity: 0;
  border-left-width: 1px;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview[data-status='exited'] {
  opacity: 0;
  display: none;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview[data-status='entering'] {
  opacity: 0;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview.no-transition {
  -webkit-transition: none;
  -o-transition: none;
  transition: none;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview hr {
  border: 1px solid #eceff1;
  background-color: #eceff1;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview a {
  pointer-events: auto;
  color: #607d8b;
  text-decoration: none;
  padding-bottom: 1px;
  border-bottom: 1px solid transparent;
  -webkit-transition: border-bottom-color 0.3s;
  -o-transition: border-bottom-color 0.3s;
  transition: border-bottom-color 0.3s;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview a:hover {
  border-bottom-color: #607d8b;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview pre {
  background: #f7f9fa;
  padding: 10px 15px;
  color: #263238;
  line-height: 1.6;
  font-size: 13px;
  border-radius: 3px;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview pre code {
  padding: 0;
  color: inherit;
  background-color: transparent;
  -moz-tab-size: 4;
    -o-tab-size: 4;
       tab-size: 4;
  font-family: 'SFMono-Regular', Consolas, 'Liberation Mono', Menlo, Courier, monospace;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview code {
  color: #546e7a;
  background-color: #f7f9fa;
  padding: 2px 4px;
  font-size: 13px;
  border-radius: 3px;
  font-family: monospace;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table {
  margin-bottom: 16px;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table th,
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table td {
  padding: 6px 12px;
  border: 1px solid #dddddd;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table tr {
  border-top: 1px solid #dddddd;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview table tr:nth-child(2n) {
  background-color: #f7f9fa;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .preview blockquote {
  padding-left: 15px;
  border-left: 5px solid #eceff1;
  color: #616161;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .code-mirror-wrapper {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
}
.topic-editor-base .editor-content .content-input .editor-preview-wrapper .code-mirror-wrapper .CodeMirror {
  border-top-width: 0;
  border-bottom-right-radius: 0;
  height: 100%;
}
.topic-editor-base .editor-content .content-input .error-icon {
  display: none;
}
.topic-editor-base .editor-content .content-input[data-error='true'] .error-icon {
  position: absolute;
  display: block;
  top: 8px;
  right: 8px;
  color: #d05451;
}
.topic-editor-base .editor-content .content-input .CodeMirror {
  min-height: 100px;
}
.topic-editor-base .editor-content .content-input .CodeMirror-scroll {
  padding-bottom: 0 !important;
  min-height: 100px !important;
}
.topic-editor-base .editor-content .content-input .content-preview {
  height: 100%;
  margin-left: 10px;
  overflow: auto;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.topic-editor-base .editor-content .content-input .editor-wrapper {
  height: 100%;
}
.topic-editor-base .editor-content .Select-menu-outer {
  position: absolute !important;
  top: auto !important;
  bottom: calc(100% - 1px) !important;
  border-bottom-left-radius: 0 !important;
  border-bottom-right-radius: 0 !important;
  border-top-left-radius: 5px !important;
  border-top-right-radius: 5px !important;
}
.topic-editor-base .editor-content .is-open .Select-control {
  border-top-right-radius: 0 !important;
  border-top-left-radius: 0 !important;
  border-bottom-right-radius: 5px !important;
  border-bottom-left-radius: 5px !important;
}
.topic-editor-base .editor-header {
  margin-top: 47px;
  margin-bottom: 15px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.topic-editor-base .editor-header button.btn {
  border-radius: 5px;
  margin-left: 10px;
  -webkit-box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
  -webkit-transition: -webkit-box-shadow 0.4s;
  transition: -webkit-box-shadow 0.4s;
  -o-transition: box-shadow 0.4s;
  transition: box-shadow 0.4s;
  transition: box-shadow 0.4s, -webkit-box-shadow 0.4s;
}
.topic-editor-base .editor-header button.btn:hover {
  -webkit-box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
}
.topic-editor-base .editor-header .editor-header-tool {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
@media (max-width: 767px) {
  .topic-editor-base .editor-header .editor-header-tool {
    -webkit-box-pack: justify;
        -ms-flex-pack: justify;
            justify-content: space-between;
    margin-bottom: 10px;
  }
}
@media (max-width: 480px) {
  .topic-editor-base .editor-header button.btn {
    width: 34px;
    height: 34px;
    text-align: center;
    padding: 6px 0;
  }
}
.topic-editor-base .editor-header-with-category {
  margin-top: 47px;
  margin-bottom: 15px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.topic-editor-base .editor-header-with-category button.btn {
  border-radius: 5px;
  margin-left: 10px;
  -webkit-box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
          box-shadow: 0 5px 15px 0 rgba(0, 0, 0, 0.08);
  -webkit-transition: -webkit-box-shadow 0.4s;
  transition: -webkit-box-shadow 0.4s;
  -o-transition: box-shadow 0.4s;
  transition: box-shadow 0.4s;
  transition: box-shadow 0.4s, -webkit-box-shadow 0.4s;
}
.topic-editor-base .editor-header-with-category button.btn:hover {
  -webkit-box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
          box-shadow: 0 15px 30px 0 rgba(0, 0, 0, 0.15);
}
.topic-editor-base .editor-header-with-category .editor-header-tool {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
@media (max-width: 767px) {
  .topic-editor-base .editor-header-with-category .editor-header-tool {
    -webkit-box-pack: justify;
        -ms-flex-pack: justify;
            justify-content: space-between;
    margin-bottom: 10px;
  }
}
@media (max-width: 480px) {
  .topic-editor-base .editor-header-with-category button.btn {
    width: 34px;
    height: 34px;
    text-align: center;
    padding: 6px 0;
  }
}
@media (max-width: 767px) {
  .topic-editor-base .editor-header-with-category {
    -webkit-box-orient: vertical;
    -webkit-box-direction: reverse;
        -ms-flex-direction: column-reverse;
            flex-direction: column-reverse;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.title-input__2sXm {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
}
.cancel-button__3_JS {
  margin-right: 20px;
}
.editor-header__3sIw {
  margin: 20px 0 15px 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.editor-content__zQ7F {
  margin: auto 10px;
}
.fullscreen-btn__15Dq {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-right: 20px;
  background-color: white;
  border: 1px solid #eeeeee;
  width: 61px;
  height: 30px;
  margin-top: -30px;
  border-bottom: 0;
  text-align: center;
  cursor: pointer;
  border-radius: 3px 3px 0 0;
}
.fullscreen-btn-icon__dsd- {
  width: 24px;
  height: 24px;
  color: #e0e0e0;
}
.header-right__2UzF {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.discard-wrapper__3-6x {
  width: 580px;
  height: 38px;
  background-color: #fffde7;
  border-radius: 3px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  border: 1px solid #fdd835;
  color: #f07c18;
  font-size: 12px;
  position: absolute;
  bottom: 30px;
  left: 30px;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  z-index: 1;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.discard-content__22nH {
  margin-left: 13px;
}
.discard-close-icon__16Sh {
  color: #fdd835;
  width: 18px;
  height: 18px;
  cursor: pointer;
  margin-right: 10px;
}
.discard__143G {
  border-bottom: 1px solid #f07c18;
  cursor: pointer;
  margin-left: 20px;
}
.confirm-footer__3l4v {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.confirm-footer__3l4v .confirm-btn__2StO {
  margin-left: 15px;
}
.toggle-anonymous__1TS4 {
  margin-right: 20px;
}
.editor-header-left__RLbD {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 0;
      -ms-flex: 0 1 500px;
          flex: 0 1 500px;
}
.editor-header-tool__2QB- {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  margin-left: 10px;
}
.anonymous-label-short__1kI9 {
  display: none;
}
@media (max-width: 767px) {
  .anonymous-label-long__6jo8 {
    display: none;
  }
  .anonymous-label-short__1kI9 {
    display: inline;
  }
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.border-wrapper__A-w9 {
  border-bottom: 1px solid #eeeeee;
}
.header__a1sK {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 10px 20px 10px 0;
  color: #78909c;
}
.subheader__3zA6 {
  background: #fafafa;
  padding: 0 20px;
  height: 40px;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.subheader-left__2TSJ {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
}
.search-input__y6fj {
  width: 225px;
}
.title__27Kb {
  font-size: 18px;
  margin-left: 10px;
  color: #212121;
  font-weight: 500;
}
.description__2etM {
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: pre;
  margin-left: 10px;
}
a.link__oF2O {
  color: #212121;
  margin-right: auto;
}
a.link__oF2O:hover,
a.link__oF2O:focus {
  color: #212121;
  text-decoration: none;
}
.title-spaced__1y5v {
  padding-left: 20px;
}
.title-wrapper__w1FU {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  margin-left: -10px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.back-link__3028 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  font-size: 14px;
  color: #78909c;
  cursor: pointer;
  -webkit-transition: color 0.3s;
  -o-transition: color 0.3s;
  transition: color 0.3s;
}
.back-link__3028:hover,
.back-link__3028:hover svg {
  color: #263238;
}
.back-link__3028:focus,
.back-link__3028:visited {
  text-decoration: none;
}
.back-link__3028 svg {
  margin-top: 1px;
  width: 18px;
  height: 18px;
}
.back__2_XS {
  padding: 13px 16px 13px 16px;
}
.right-border__2-Gs {
  margin-right: 16px;
  position: relative;
}
.right-border__2-Gs::after {
  content: '';
  height: 40%;
  width: 1px;
  background: #eeeeee;
  position: absolute;
  top: 50%;
  right: 0;
  -webkit-transform: translateY(-50%);
          transform: translateY(-50%);
  display: block;
  z-index: 1;
  opacity: 1;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.topic-item-wrap__2FSZ {
  border-bottom: 1px solid #eeeeee;
}
.topic-item-wrap__2FSZ .topic-item__1Asc {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  height: 80px;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: start;
      -ms-flex-pack: start;
          justify-content: flex-start;
  -webkit-transition: background-color 500ms linear;
  -o-transition: background-color 500ms linear;
  transition: background-color 500ms linear;
}
.topic-item-wrap__2FSZ .topic-item__1Asc.last-visited-topic-entering__Mu5O {
  background-color: #eceff1;
}
.topic-item-wrap__2FSZ .topic-item__1Asc.post-deleted__N3V3 {
  opacity: 0.4;
}
.item-header__2w29 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-bottom: 4px;
}
.title-link__1ay5 {
  min-width: 0;
}
.title-container__1c9x {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin-bottom: 4px;
}
.topic-title__3LYM {
  color: #212121;
  font-size: 16px;
  cursor: pointer;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: pre;
}
.pinned-icon__1ZAy {
  color: black;
  font-size: 18px;
  margin-right: 5px;
}
.topic-title-wrapper__27Nt {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  min-width: 0;
}
.avatar__2epM {
  width: 40px;
  height: 40px;
  border-radius: 50%;
  margin-left: 15px;
  margin-right: 20px;
}
.icon__3CsQ {
  color: #e0e0e0;
  width: 18px;
  height: 18px;
  margin-right: 7px;
}
.no__1erK {
  color: #455a64;
  width: 70px;
}
.topic-info__tdz0 {
  color: #9e9e9e;
  font-size: 12px;
}
.icon-wrapper__3uKf {
  margin-left: 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.wrapper__Fm3q {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.post-status__32oe {
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  cursor: pointer;
  font-size: 12px;
}
.tooltip__1mUq {
  display: -webkit-inline-box;
  display: -ms-inline-flexbox;
  display: inline-flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.divider__DpvO {
  padding: 0 3px;
}
.status-icon__36TF {
  margin-right: 3px;
}
.anonymous-avatar__1Xqe {
  opacity: 0.7;
  border-radius: 50%;
}
.tags-container__Slnd {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin-left: 5px;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
}
.extra-tags-container__3tQ0 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.tag__2FfF {
  background-color: #fafafa;
  border: 1px solid rgba(0, 0, 0, 0.05);
  border-radius: 3px;
  color: #37474f;
  font-size: 12px;
  padding: 3px 5px;
  margin: 0 3px;
  white-space: nowrap;
}
.leetcoin-icon__36HA {
  margin-left: 5px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.loading-wrapper__1pmE {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  z-index: 1;
  background: white;
  -webkit-transition: 0.18s opacity ease-in-out;
  -o-transition: 0.18s opacity ease-in-out;
  transition: 0.18s opacity ease-in-out;
  padding: 100px;
}
.loading-wrapper__1pmE[data-status='entering'],
.loading-wrapper__1pmE[data-status='entered'] {
  opacity: 1;
}
.loading-wrapper__1pmE[data-status='exiting'] {
  opacity: 0;
}
.loading-wrapper__1pmE[data-status='exited'] {
  opacity: 0;
  display: none;
}
.pagination-wrapper__2Pmg {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin: 20px 0;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.topic-list-content__3Win {
  position: relative;
}
.desktop-placeholder__1Wdn {
  margin-bottom: 130px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__3ov- {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-shadow: inset 0 -1px 0 0 #eeeeee;
          box-shadow: inset 0 -1px 0 0 #eeeeee;
  overflow: hidden;
  height: 50px;
}
.title__zfP5 {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  margin: 0;
  min-width: 0;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: pre;
}
.actions__1sP6 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  margin: 0 20px 0 5px;
}
.actions__1sP6 svg {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  padding: 11px;
  margin-left: 10px;
  width: 18px;
  height: 18px;
  color: #546e7a;
  -webkit-transition: color 0.3s;
  -o-transition: color 0.3s;
  transition: color 0.3s;
  cursor: pointer;
}
.actions__1sP6 svg:hover,
.actions__1sP6 svg:hover svg {
  color: #263238;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__3r81 {
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.vote__3btZ:not([data-is-voted='true']):hover,
.vote__3btZ:not([data-is-voted='true']):hover svg {
  color: #263238;
}
.vote__3btZ[data-is-voted='true'] {
  background: #90a4ae;
  color: white;
}
.count__GRlR {
  line-height: 40px;
  color: #78909c;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__K-8V {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  margin-top: 10px;
  padding: 0 20px;
}
.action-area__3aY4 {
  margin-right: 20px;
}
.content-area__2vnF {
  margin-top: 10px;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  overflow: hidden;
}
.post-area__3YJL {
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  max-width: 100%;
  min-width: 0;
}
.tag-list-container__2cDj {
  margin-top: 20px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.main__11QT {
  position: relative;
}
.loading__1ICj,
.error__3kzJ {
  height: 400px;
  width: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
}
.error__3kzJ {
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.cont__FQzg {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.desc__3NDJ {
  color: #9e9e9e;
  font-size: 12px;
  margin: 0 0 0 10px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.loading__1dyL {
  width: 100%;
  height: 100%;
}
</style><style type="text/css">@font-face{font-family:KaTeX_AMS;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_AMS-Regular.1ba8a24a3.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_AMS-Regular.6e83a9fb8.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_AMS-Regular.ca857b159.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Caligraphic;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Caligraphic-Bold.9e74aa81a.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Caligraphic-Bold.c09854387.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Caligraphic-Bold.2c8faa1b5.ttf) format("truetype");font-weight:700;font-style:normal}@font-face{font-family:KaTeX_Caligraphic;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Caligraphic-Regular.31f25d65c.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Caligraphic-Regular.35974d127.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Caligraphic-Regular.52a6a1658.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Fraktur;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Fraktur-Bold.71620e6ae.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Fraktur-Bold.34c036572.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Fraktur-Bold.34c1d184d.ttf) format("truetype");font-weight:700;font-style:normal}@font-face{font-family:KaTeX_Fraktur;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Fraktur-Regular.bae342e85.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Fraktur-Regular.b48160eab.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Fraktur-Regular.f6780ff59.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Main;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Bold.b5549071a.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Bold.6a7548451.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Bold.9e6295711.ttf) format("truetype");font-weight:700;font-style:normal}@font-face{font-family:KaTeX_Main;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-BoldItalic.2cefb96e2.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-BoldItalic.ff75463a7.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-BoldItalic.3df52c586.ttf) format("truetype");font-weight:700;font-style:italic}@font-face{font-family:KaTeX_Main;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Italic.d9153c94a.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Italic.d2f17a9e3.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Italic.9485af58d.ttf) format("truetype");font-weight:400;font-style:italic}@font-face{font-family:KaTeX_Main;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Regular.ddb93dd10.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Regular.28a2d0a50.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Main-Regular.bce47876e.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Math;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Math-BoldItalic.8c96bb550.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Math-BoldItalic.b4a5e15f6.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Math-BoldItalic.91370c15e.ttf) format("truetype");font-weight:700;font-style:italic}@font-face{font-family:KaTeX_Math;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Math-Italic.efef72b8e.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Math-Italic.2342417fb.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Math-Italic.f47a61c85.ttf) format("truetype");font-weight:400;font-style:italic}@font-face{font-family:"KaTeX_SansSerif";src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Bold.b2acfbf0b.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Bold.5d4480bd2.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Bold.000b9ed03.ttf) format("truetype");font-weight:700;font-style:normal}@font-face{font-family:"KaTeX_SansSerif";src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Italic.255f1668b.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Italic.d5333e23e.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Italic.40d559e30.ttf) format("truetype");font-weight:400;font-style:italic}@font-face{font-family:"KaTeX_SansSerif";src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Regular.8de2dee18.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Regular.a8506f1b1.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_SansSerif-Regular.7ba33ebb5.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Script;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Script-Regular.4b4feb459.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Script-Regular.46b2d8cfe.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Script-Regular.b3881ceea.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Size1;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size1-Regular.1e11788cc.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size1-Regular.4f07fe622.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size1-Regular.686db35f8.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Size2;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size2-Regular.df807e937.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size2-Regular.50bcc9e86.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size2-Regular.3f883bff6.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Size3;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size3-Regular.b583d1f12.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size3-Regular.4f2160f04.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size3-Regular.2f811a580.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Size4;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size4-Regular.104294e4c.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size4-Regular.f9b5a33d9.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Size4-Regular.4c04d946e.ttf) format("truetype");font-weight:400;font-style:normal}@font-face{font-family:KaTeX_Typewriter;src:url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Typewriter-Regular.cabbcf159.woff2) format("woff2"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Typewriter-Regular.e52da4424.woff) format("woff"),url(https://assets.leetcode.com/static_assets/public/webpack_bundles/font/KaTeX_Typewriter-Regular.a5ed4d0a3.ttf) format("truetype");font-weight:400;font-style:normal}.katex{font:normal 1.21em KaTeX_Main,Times New Roman,serif;line-height:1.2;text-indent:0;text-rendering:auto}.katex *{-ms-high-contrast-adjust:none!important}.katex .katex-mathml{position:absolute;clip:rect(1px,1px,1px,1px);padding:0;border:0;height:1px;width:1px;overflow:hidden}.katex .katex-html>.newline{display:block}.katex .base{position:relative;white-space:nowrap;width:-webkit-min-content;width:-moz-min-content;width:min-content}.katex .base,.katex .strut{display:inline-block}.katex .textbf{font-weight:700}.katex .textit{font-style:italic}.katex .textrm{font-family:KaTeX_Main}.katex .textsf{font-family:KaTeX_SansSerif}.katex .texttt{font-family:KaTeX_Typewriter}.katex .mathdefault{font-family:KaTeX_Math;font-style:italic}.katex .mathit{font-family:KaTeX_Main;font-style:italic}.katex .mathrm{font-style:normal}.katex .mathbf{font-family:KaTeX_Main;font-weight:700}.katex .boldsymbol{font-family:KaTeX_Math;font-weight:700;font-style:italic}.katex .amsrm,.katex .mathbb,.katex .textbb{font-family:KaTeX_AMS}.katex .mathcal{font-family:KaTeX_Caligraphic}.katex .mathfrak,.katex .textfrak{font-family:KaTeX_Fraktur}.katex .mathtt{font-family:KaTeX_Typewriter}.katex .mathscr,.katex .textscr{font-family:KaTeX_Script}.katex .mathsf,.katex .textsf{font-family:KaTeX_SansSerif}.katex .mathboldsf,.katex .textboldsf{font-family:KaTeX_SansSerif;font-weight:700}.katex .mathitsf,.katex .textitsf{font-family:KaTeX_SansSerif;font-style:italic}.katex .mainrm{font-family:KaTeX_Main;font-style:normal}.katex .vlist-t{display:inline-table;table-layout:fixed}.katex .vlist-r{display:table-row}.katex .vlist{display:table-cell;vertical-align:bottom;position:relative}.katex .vlist>span{display:block;height:0;position:relative}.katex .vlist>span>span{display:inline-block}.katex .vlist>span>.pstrut{overflow:hidden;width:0}.katex .vlist-t2{margin-right:-2px}.katex .vlist-s{display:table-cell;vertical-align:bottom;font-size:1px;width:2px;min-width:2px}.katex .msupsub{text-align:left}.katex .mfrac>span>span{text-align:center}.katex .mfrac .frac-line{display:inline-block;width:100%;border-bottom-style:solid}.katex .hdashline,.katex .hline,.katex .mfrac .frac-line,.katex .overline .overline-line,.katex .rule,.katex .underline .underline-line{min-height:1px}.katex .mspace{display:inline-block}.katex .clap,.katex .llap,.katex .rlap{width:0;position:relative}.katex .clap>.inner,.katex .llap>.inner,.katex .rlap>.inner{position:absolute}.katex .clap>.fix,.katex .llap>.fix,.katex .rlap>.fix{display:inline-block}.katex .llap>.inner{right:0}.katex .clap>.inner,.katex .rlap>.inner{left:0}.katex .clap>.inner>span{margin-left:-50%;margin-right:50%}.katex .rule{display:inline-block;border:0 solid;position:relative}.katex .hline,.katex .overline .overline-line,.katex .underline .underline-line{display:inline-block;width:100%;border-bottom-style:solid}.katex .hdashline{display:inline-block;width:100%;border-bottom-style:dashed}.katex .sqrt>.root{margin-left:.27777778em;margin-right:-.55555556em}.katex .fontsize-ensurer,.katex .sizing{display:inline-block}.katex .fontsize-ensurer.reset-size1.size1,.katex .sizing.reset-size1.size1{font-size:1em}.katex .fontsize-ensurer.reset-size1.size2,.katex .sizing.reset-size1.size2{font-size:1.2em}.katex .fontsize-ensurer.reset-size1.size3,.katex .sizing.reset-size1.size3{font-size:1.4em}.katex .fontsize-ensurer.reset-size1.size4,.katex .sizing.reset-size1.size4{font-size:1.6em}.katex .fontsize-ensurer.reset-size1.size5,.katex .sizing.reset-size1.size5{font-size:1.8em}.katex .fontsize-ensurer.reset-size1.size6,.katex .sizing.reset-size1.size6{font-size:2em}.katex .fontsize-ensurer.reset-size1.size7,.katex .sizing.reset-size1.size7{font-size:2.4em}.katex .fontsize-ensurer.reset-size1.size8,.katex .sizing.reset-size1.size8{font-size:2.88em}.katex .fontsize-ensurer.reset-size1.size9,.katex .sizing.reset-size1.size9{font-size:3.456em}.katex .fontsize-ensurer.reset-size1.size10,.katex .sizing.reset-size1.size10{font-size:4.148em}.katex .fontsize-ensurer.reset-size1.size11,.katex .sizing.reset-size1.size11{font-size:4.976em}.katex .fontsize-ensurer.reset-size2.size1,.katex .sizing.reset-size2.size1{font-size:.83333333em}.katex .fontsize-ensurer.reset-size2.size2,.katex .sizing.reset-size2.size2{font-size:1em}.katex .fontsize-ensurer.reset-size2.size3,.katex .sizing.reset-size2.size3{font-size:1.16666667em}.katex .fontsize-ensurer.reset-size2.size4,.katex .sizing.reset-size2.size4{font-size:1.33333333em}.katex .fontsize-ensurer.reset-size2.size5,.katex .sizing.reset-size2.size5{font-size:1.5em}.katex .fontsize-ensurer.reset-size2.size6,.katex .sizing.reset-size2.size6{font-size:1.66666667em}.katex .fontsize-ensurer.reset-size2.size7,.katex .sizing.reset-size2.size7{font-size:2em}.katex .fontsize-ensurer.reset-size2.size8,.katex .sizing.reset-size2.size8{font-size:2.4em}.katex .fontsize-ensurer.reset-size2.size9,.katex .sizing.reset-size2.size9{font-size:2.88em}.katex .fontsize-ensurer.reset-size2.size10,.katex .sizing.reset-size2.size10{font-size:3.45666667em}.katex .fontsize-ensurer.reset-size2.size11,.katex .sizing.reset-size2.size11{font-size:4.14666667em}.katex .fontsize-ensurer.reset-size3.size1,.katex .sizing.reset-size3.size1{font-size:.71428571em}.katex .fontsize-ensurer.reset-size3.size2,.katex .sizing.reset-size3.size2{font-size:.85714286em}.katex .fontsize-ensurer.reset-size3.size3,.katex .sizing.reset-size3.size3{font-size:1em}.katex .fontsize-ensurer.reset-size3.size4,.katex .sizing.reset-size3.size4{font-size:1.14285714em}.katex .fontsize-ensurer.reset-size3.size5,.katex .sizing.reset-size3.size5{font-size:1.28571429em}.katex .fontsize-ensurer.reset-size3.size6,.katex .sizing.reset-size3.size6{font-size:1.42857143em}.katex .fontsize-ensurer.reset-size3.size7,.katex .sizing.reset-size3.size7{font-size:1.71428571em}.katex .fontsize-ensurer.reset-size3.size8,.katex .sizing.reset-size3.size8{font-size:2.05714286em}.katex .fontsize-ensurer.reset-size3.size9,.katex .sizing.reset-size3.size9{font-size:2.46857143em}.katex .fontsize-ensurer.reset-size3.size10,.katex .sizing.reset-size3.size10{font-size:2.96285714em}.katex .fontsize-ensurer.reset-size3.size11,.katex .sizing.reset-size3.size11{font-size:3.55428571em}.katex .fontsize-ensurer.reset-size4.size1,.katex .sizing.reset-size4.size1{font-size:.625em}.katex .fontsize-ensurer.reset-size4.size2,.katex .sizing.reset-size4.size2{font-size:.75em}.katex .fontsize-ensurer.reset-size4.size3,.katex .sizing.reset-size4.size3{font-size:.875em}.katex .fontsize-ensurer.reset-size4.size4,.katex .sizing.reset-size4.size4{font-size:1em}.katex .fontsize-ensurer.reset-size4.size5,.katex .sizing.reset-size4.size5{font-size:1.125em}.katex .fontsize-ensurer.reset-size4.size6,.katex .sizing.reset-size4.size6{font-size:1.25em}.katex .fontsize-ensurer.reset-size4.size7,.katex .sizing.reset-size4.size7{font-size:1.5em}.katex .fontsize-ensurer.reset-size4.size8,.katex .sizing.reset-size4.size8{font-size:1.8em}.katex .fontsize-ensurer.reset-size4.size9,.katex .sizing.reset-size4.size9{font-size:2.16em}.katex .fontsize-ensurer.reset-size4.size10,.katex .sizing.reset-size4.size10{font-size:2.5925em}.katex .fontsize-ensurer.reset-size4.size11,.katex .sizing.reset-size4.size11{font-size:3.11em}.katex .fontsize-ensurer.reset-size5.size1,.katex .sizing.reset-size5.size1{font-size:.55555556em}.katex .fontsize-ensurer.reset-size5.size2,.katex .sizing.reset-size5.size2{font-size:.66666667em}.katex .fontsize-ensurer.reset-size5.size3,.katex .sizing.reset-size5.size3{font-size:.77777778em}.katex .fontsize-ensurer.reset-size5.size4,.katex .sizing.reset-size5.size4{font-size:.88888889em}.katex .fontsize-ensurer.reset-size5.size5,.katex .sizing.reset-size5.size5{font-size:1em}.katex .fontsize-ensurer.reset-size5.size6,.katex .sizing.reset-size5.size6{font-size:1.11111111em}.katex .fontsize-ensurer.reset-size5.size7,.katex .sizing.reset-size5.size7{font-size:1.33333333em}.katex .fontsize-ensurer.reset-size5.size8,.katex .sizing.reset-size5.size8{font-size:1.6em}.katex .fontsize-ensurer.reset-size5.size9,.katex .sizing.reset-size5.size9{font-size:1.92em}.katex .fontsize-ensurer.reset-size5.size10,.katex .sizing.reset-size5.size10{font-size:2.30444444em}.katex .fontsize-ensurer.reset-size5.size11,.katex .sizing.reset-size5.size11{font-size:2.76444444em}.katex .fontsize-ensurer.reset-size6.size1,.katex .sizing.reset-size6.size1{font-size:.5em}.katex .fontsize-ensurer.reset-size6.size2,.katex .sizing.reset-size6.size2{font-size:.6em}.katex .fontsize-ensurer.reset-size6.size3,.katex .sizing.reset-size6.size3{font-size:.7em}.katex .fontsize-ensurer.reset-size6.size4,.katex .sizing.reset-size6.size4{font-size:.8em}.katex .fontsize-ensurer.reset-size6.size5,.katex .sizing.reset-size6.size5{font-size:.9em}.katex .fontsize-ensurer.reset-size6.size6,.katex .sizing.reset-size6.size6{font-size:1em}.katex .fontsize-ensurer.reset-size6.size7,.katex .sizing.reset-size6.size7{font-size:1.2em}.katex .fontsize-ensurer.reset-size6.size8,.katex .sizing.reset-size6.size8{font-size:1.44em}.katex .fontsize-ensurer.reset-size6.size9,.katex .sizing.reset-size6.size9{font-size:1.728em}.katex .fontsize-ensurer.reset-size6.size10,.katex .sizing.reset-size6.size10{font-size:2.074em}.katex .fontsize-ensurer.reset-size6.size11,.katex .sizing.reset-size6.size11{font-size:2.488em}.katex .fontsize-ensurer.reset-size7.size1,.katex .sizing.reset-size7.size1{font-size:.41666667em}.katex .fontsize-ensurer.reset-size7.size2,.katex .sizing.reset-size7.size2{font-size:.5em}.katex .fontsize-ensurer.reset-size7.size3,.katex .sizing.reset-size7.size3{font-size:.58333333em}.katex .fontsize-ensurer.reset-size7.size4,.katex .sizing.reset-size7.size4{font-size:.66666667em}.katex .fontsize-ensurer.reset-size7.size5,.katex .sizing.reset-size7.size5{font-size:.75em}.katex .fontsize-ensurer.reset-size7.size6,.katex .sizing.reset-size7.size6{font-size:.83333333em}.katex .fontsize-ensurer.reset-size7.size7,.katex .sizing.reset-size7.size7{font-size:1em}.katex .fontsize-ensurer.reset-size7.size8,.katex .sizing.reset-size7.size8{font-size:1.2em}.katex .fontsize-ensurer.reset-size7.size9,.katex .sizing.reset-size7.size9{font-size:1.44em}.katex .fontsize-ensurer.reset-size7.size10,.katex .sizing.reset-size7.size10{font-size:1.72833333em}.katex .fontsize-ensurer.reset-size7.size11,.katex .sizing.reset-size7.size11{font-size:2.07333333em}.katex .fontsize-ensurer.reset-size8.size1,.katex .sizing.reset-size8.size1{font-size:.34722222em}.katex .fontsize-ensurer.reset-size8.size2,.katex .sizing.reset-size8.size2{font-size:.41666667em}.katex .fontsize-ensurer.reset-size8.size3,.katex .sizing.reset-size8.size3{font-size:.48611111em}.katex .fontsize-ensurer.reset-size8.size4,.katex .sizing.reset-size8.size4{font-size:.55555556em}.katex .fontsize-ensurer.reset-size8.size5,.katex .sizing.reset-size8.size5{font-size:.625em}.katex .fontsize-ensurer.reset-size8.size6,.katex .sizing.reset-size8.size6{font-size:.69444444em}.katex .fontsize-ensurer.reset-size8.size7,.katex .sizing.reset-size8.size7{font-size:.83333333em}.katex .fontsize-ensurer.reset-size8.size8,.katex .sizing.reset-size8.size8{font-size:1em}.katex .fontsize-ensurer.reset-size8.size9,.katex .sizing.reset-size8.size9{font-size:1.2em}.katex .fontsize-ensurer.reset-size8.size10,.katex .sizing.reset-size8.size10{font-size:1.44027778em}.katex .fontsize-ensurer.reset-size8.size11,.katex .sizing.reset-size8.size11{font-size:1.72777778em}.katex .fontsize-ensurer.reset-size9.size1,.katex .sizing.reset-size9.size1{font-size:.28935185em}.katex .fontsize-ensurer.reset-size9.size2,.katex .sizing.reset-size9.size2{font-size:.34722222em}.katex .fontsize-ensurer.reset-size9.size3,.katex .sizing.reset-size9.size3{font-size:.40509259em}.katex .fontsize-ensurer.reset-size9.size4,.katex .sizing.reset-size9.size4{font-size:.46296296em}.katex .fontsize-ensurer.reset-size9.size5,.katex .sizing.reset-size9.size5{font-size:.52083333em}.katex .fontsize-ensurer.reset-size9.size6,.katex .sizing.reset-size9.size6{font-size:.5787037em}.katex .fontsize-ensurer.reset-size9.size7,.katex .sizing.reset-size9.size7{font-size:.69444444em}.katex .fontsize-ensurer.reset-size9.size8,.katex .sizing.reset-size9.size8{font-size:.83333333em}.katex .fontsize-ensurer.reset-size9.size9,.katex .sizing.reset-size9.size9{font-size:1em}.katex .fontsize-ensurer.reset-size9.size10,.katex .sizing.reset-size9.size10{font-size:1.20023148em}.katex .fontsize-ensurer.reset-size9.size11,.katex .sizing.reset-size9.size11{font-size:1.43981481em}.katex .fontsize-ensurer.reset-size10.size1,.katex .sizing.reset-size10.size1{font-size:.24108004em}.katex .fontsize-ensurer.reset-size10.size2,.katex .sizing.reset-size10.size2{font-size:.28929605em}.katex .fontsize-ensurer.reset-size10.size3,.katex .sizing.reset-size10.size3{font-size:.33751205em}.katex .fontsize-ensurer.reset-size10.size4,.katex .sizing.reset-size10.size4{font-size:.38572806em}.katex .fontsize-ensurer.reset-size10.size5,.katex .sizing.reset-size10.size5{font-size:.43394407em}.katex .fontsize-ensurer.reset-size10.size6,.katex .sizing.reset-size10.size6{font-size:.48216008em}.katex .fontsize-ensurer.reset-size10.size7,.katex .sizing.reset-size10.size7{font-size:.57859209em}.katex .fontsize-ensurer.reset-size10.size8,.katex .sizing.reset-size10.size8{font-size:.69431051em}.katex .fontsize-ensurer.reset-size10.size9,.katex .sizing.reset-size10.size9{font-size:.83317261em}.katex .fontsize-ensurer.reset-size10.size10,.katex .sizing.reset-size10.size10{font-size:1em}.katex .fontsize-ensurer.reset-size10.size11,.katex .sizing.reset-size10.size11{font-size:1.19961427em}.katex .fontsize-ensurer.reset-size11.size1,.katex .sizing.reset-size11.size1{font-size:.20096463em}.katex .fontsize-ensurer.reset-size11.size2,.katex .sizing.reset-size11.size2{font-size:.24115756em}.katex .fontsize-ensurer.reset-size11.size3,.katex .sizing.reset-size11.size3{font-size:.28135048em}.katex .fontsize-ensurer.reset-size11.size4,.katex .sizing.reset-size11.size4{font-size:.32154341em}.katex .fontsize-ensurer.reset-size11.size5,.katex .sizing.reset-size11.size5{font-size:.36173633em}.katex .fontsize-ensurer.reset-size11.size6,.katex .sizing.reset-size11.size6{font-size:.40192926em}.katex .fontsize-ensurer.reset-size11.size7,.katex .sizing.reset-size11.size7{font-size:.48231511em}.katex .fontsize-ensurer.reset-size11.size8,.katex .sizing.reset-size11.size8{font-size:.57877814em}.katex .fontsize-ensurer.reset-size11.size9,.katex .sizing.reset-size11.size9{font-size:.69453376em}.katex .fontsize-ensurer.reset-size11.size10,.katex .sizing.reset-size11.size10{font-size:.83360129em}.katex .fontsize-ensurer.reset-size11.size11,.katex .sizing.reset-size11.size11{font-size:1em}.katex .delimsizing.size1{font-family:KaTeX_Size1}.katex .delimsizing.size2{font-family:KaTeX_Size2}.katex .delimsizing.size3{font-family:KaTeX_Size3}.katex .delimsizing.size4{font-family:KaTeX_Size4}.katex .delimsizing.mult .delim-size1>span{font-family:KaTeX_Size1}.katex .delimsizing.mult .delim-size4>span{font-family:KaTeX_Size4}.katex .nulldelimiter{display:inline-block;width:.12em}.katex .delimcenter,.katex .op-symbol{position:relative}.katex .op-symbol.small-op{font-family:KaTeX_Size1}.katex .op-symbol.large-op{font-family:KaTeX_Size2}.katex .op-limits>.vlist-t{text-align:center}.katex .accent>.vlist-t{text-align:center}.katex .accent .accent-body{position:relative}.katex .accent .accent-body:not(.accent-full){width:0}.katex .overlay{display:block}.katex .mtable .vertical-separator{display:inline-block;margin:0 -.025em;border-right:.05em solid;min-width:1px}.katex .mtable .vs-dashed{border-right:.05em dashed}.katex .mtable .arraycolsep{display:inline-block}.katex .mtable .col-align-c>.vlist-t{text-align:center}.katex .mtable .col-align-l>.vlist-t{text-align:left}.katex .mtable .col-align-r>.vlist-t{text-align:right}.katex .svg-align{text-align:left}.katex svg{display:block;position:absolute;width:100%;height:inherit;fill:currentColor;stroke:currentColor;fill-rule:nonzero;fill-opacity:1;stroke-width:1;stroke-linecap:butt;stroke-linejoin:miter;stroke-miterlimit:4;stroke-dasharray:none;stroke-dashoffset:0;stroke-opacity:1}.katex svg path{stroke:none}.katex .stretchy{width:100%;display:block;position:relative;overflow:hidden}.katex .stretchy:after,.katex .stretchy:before{content:""}.katex .hide-tail{width:100%;position:relative;overflow:hidden}.katex .halfarrow-left{position:absolute;left:0;width:50.2%;overflow:hidden}.katex .halfarrow-right{position:absolute;right:0;width:50.2%;overflow:hidden}.katex .brace-left{position:absolute;left:0;width:25.1%;overflow:hidden}.katex .brace-center{position:absolute;left:25%;width:50%;overflow:hidden}.katex .brace-right{position:absolute;right:0;width:25.1%;overflow:hidden}.katex .x-arrow-pad{padding:0 .5em}.katex .mover,.katex .munder,.katex .x-arrow{text-align:center}.katex .boxpad{padding:0 .3em}.katex .fbox,.katex .fcolorbox{-webkit-box-sizing:border-box;box-sizing:border-box;border:.04em solid}.katex .cancel-pad{padding:0 .2em}.katex .cancel-lap{margin-left:-.2em;margin-right:-.2em}.katex .sout{border-bottom-style:solid;border-bottom-width:.08em}.katex-display{display:block;margin:1em 0;text-align:center}.katex-display>.katex{display:block;text-align:center;white-space:nowrap}.katex-display>.katex>.katex-html{display:block;position:relative}.katex-display>.katex>.katex-html>.tag{position:absolute;right:0}.katex-display.leqno>.katex>.katex-html>.tag{left:0;right:auto}.katex-display.fleqn>.katex{text-align:left}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.share__1rbD {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.share__1rbD .desc__3vzG {
  margin-right: 20px;
}
.next-challenge__A4ZV {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  width: 100%;
  max-width: 500px;
  -ms-flex-wrap: wrap;
      flex-wrap: wrap;
  margin: 10px 0;
}
.next-challenge__A4ZV > .next-challenge-btn__L_19 {
  line-height: 28px;
  border-radius: 16px;
  margin: 5px 10px 0 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  padding: 0 12px;
  height: 28px;
  cursor: pointer;
  -webkit-transition: all 0.2s ease-in-out 0s;
  -o-transition: all 0.2s ease-in-out 0s;
  transition: all 0.2s ease-in-out 0s;
  -webkit-transition-property: color, border-color;
  -o-transition-property: color, border-color;
  transition-property: color, border-color;
  border: 1px solid transparent;
  background-color: #fafafa;
}
.next-challenge__A4ZV > .H__3Dxi {
  background-color: #fce4ec;
  border-color: #c51162;
  color: #c51162;
}
.next-challenge__A4ZV > .H__3Dxi:hover {
  -webkit-transition: all 0.2s ease-in-out 0s;
  -o-transition: all 0.2s ease-in-out 0s;
  transition: all 0.2s ease-in-out 0s;
  -webkit-transition-property: color, border-color;
  -o-transition-property: color, border-color;
  transition-property: color, border-color;
  color: #ff4081;
  border-color: #ff4081;
}
.next-challenge__A4ZV > .M__1OuS {
  background-color: #fff3e0;
  border-color: #ffa726;
  color: #ffa726;
}
.next-challenge__A4ZV > .M__1OuS:hover {
  -webkit-transition: all 0.2s ease-in-out 0s;
  -o-transition: all 0.2s ease-in-out 0s;
  transition: all 0.2s ease-in-out 0s;
  -webkit-transition-property: color, border-color;
  -o-transition-property: color, border-color;
  transition-property: color, border-color;
  color: #f57c00;
  border-color: #f57c00;
}
.next-challenge__A4ZV > .E__2cGj {
  background-color: #e8f5e9;
  border-color: #66bb6a;
  color: #66bb6a;
}
.next-challenge__A4ZV > .E__2cGj:hover {
  -webkit-transition: all 0.2s ease-in-out 0s;
  -o-transition: all 0.2s ease-in-out 0s;
  transition: all 0.2s ease-in-out 0s;
  -webkit-transition-property: color, border-color;
  -o-transition-property: color, border-color;
  transition-property: color, border-color;
  color: #388e3c;
  border-color: #388e3c;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__1v52 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  width: 100%;
}
.content-container__1imC {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
}
.topic-list-container__1K70 {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  min-width: 0;
}
.tags-container__3gl_ {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  margin-left: 10px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.root__3BAc {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  width: 100%;
}
.topic-container__1JMG {
  background: white;
  margin-bottom: 40px;
  -webkit-box-shadow: 0 1px 2px 0 rgba(0, 0, 0, 0.1);
          box-shadow: 0 1px 2px 0 rgba(0, 0, 0, 0.1);
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.content__1Nro {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  z-index: 0;
  overflow-y: auto;
  background-color: #f5f5f5;
}
.content__1Nro > div {
  -webkit-box-flex: 1;
      -ms-flex: 1 1 auto;
          flex: 1 1 auto;
  max-width: 1240px;
  margin: 0 auto;
}
.tabs-container__3vqg {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
}
div.tabs__3_dW {
  display: inline;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.description__2Xi7 {
  padding: 10px 15px;
  line-height: 25px;
  color: #212121;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__3Uou {
  width: 100%;
  margin-bottom: 10px;
}
.icon__2uP7 {
  width: 18px;
  height: 18px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.header__1bbT {
  width: 100%;
  padding: 5px;
  background-color: white;
  margin-bottom: 10px;
  border-bottom: 1px solid #eeeeee;
}
.title__nrvJ {
  color: #212121;
  margin: 15px 15px 0 15px;
  line-height: 30px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.bottom__2qo6 {
  margin: 10px 5px 10px 15px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.label__2Hzu {
  color: #78909c;
}
.easy__2VcQ {
  margin-left: 10px;
  color: #009688;
}
.medium__11wy {
  margin-left: 10px;
  color: #f07c18;
}
.hard__3wkA {
  margin-left: 10px;
  color: #c62928;
}
.translate-button__1FmQ {
  width: 80px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  border: none;
  margin-right: 10px;
  color: white;
  background-color: #90a4ae;
}
.share-button__1m2w {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  border: none;
  width: 80px;
  background-color: #f7f9fa;
}
.share-panel-wrapper__u2bk {
  position: fixed;
  top: 0;
  right: 0;
  left: 0;
  bottom: 0;
  z-index: 1;
  pointer-events: none;
}
.no__3gUK {
  margin-right: 10px;
}
.buttons-wrapper__2rkj {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.toolbar__MsoK {
  -webkit-box-sizing: content-box;
          box-sizing: content-box;
  height: 50px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  background-color: #f7f9fa;
  border-top: 1px solid #eeeeee;
  z-index: 50;
  padding-bottom: 0px;
  padding-bottom: env(safe-area-inset-bottom);
  padding-left: 0px;
  padding-left: env(safe-area-inset-left);
  padding-right: 0px;
  padding-right: env(safe-area-inset-right);
}
@supports (padding-bottom: max(0px)) {
  .toolbar__MsoK {
    padding-bottom: max( 0px , env(safe-area-inset-bottom));
  }
}
@supports (padding-left: max(0px)) {
  .toolbar__MsoK {
    padding-left: max( 0px , env(safe-area-inset-left));
  }
}
@supports (padding-right: max(0px)) {
  .toolbar__MsoK {
    padding-right: max( 0px , env(safe-area-inset-right));
  }
}
.toolbar-item__1NU_ {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 1;
      -ms-flex: 1;
          flex: 1;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  color: #78909c;
}
.icon__2EzA {
  width: 18px;
  height: 18px;
}
.no__27Jr {
  margin-left: 5px;
}
.favorite-slideup-content__19Gd {
  padding: 15px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
body {
  overflow: hidden;
}
@media (max-width: 896px) {
  body {
    overflow: auto;
  }
}
.layout__3fIJ {
  position: relative;
  z-index: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  height: 100%;
  width: 100%;
  min-width: 896px;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  overflow: hidden;
  -webkit-font-smoothing: antialiased;
}
.header__3STC,
.header-cn__3MqR {
  margin-top: 0;
  -webkit-transition: margin-top 0.3s ease-in-out;
  -o-transition: margin-top 0.3s ease-in-out;
  transition: margin-top 0.3s ease-in-out;
  background: white;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
}
.header__3STC[data-status='exited'],
.header-cn__3MqR[data-status='exited'] {
  display: none;
}
.header__3STC[data-is-loading='true'],
.header-cn__3MqR[data-is-loading='true'] {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.header__3STC[data-status='exiting'],
.header__3STC[data-status='entering'] {
  margin-top: -44px;
}
.header-cn__3MqR {
  z-index: 1;
  -webkit-box-shadow: 0 1px 20px rgba(0, 0, 0, 0.1), 0 1px 0 #eeeeee, 0 1px 5px rgba(0, 0, 0, 0.08);
          box-shadow: 0 1px 20px rgba(0, 0, 0, 0.1), 0 1px 0 #eeeeee, 0 1px 5px rgba(0, 0, 0, 0.08);
}
.header-cn__3MqR[data-status='exiting'],
.header-cn__3MqR[data-status='entering'] {
  margin-top: -110px;
}
.main__2_tD {
  position: relative;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
  z-index: 0;
  min-height: 0;
}
.main__2_tD .loading__1XBq {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  background: white;
  z-index: 1;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.container__2YXc {
  position: relative;
  background-color: #f5f5f5;
  height: 100%;
  z-index: 0;
}
.container__2YXc::before {
  content: ' ';
  display: block;
  height: 46px;
}
.container__2YXc::after {
  content: ' ';
  display: block;
  height: 50px;
}
.container__2YXc .scroll-view__BGH0 {
  width: 100%;
  height: calc(100% - 46px - 50px);
  overflow-x: hidden;
  overflow-y: auto;
  padding-top: 0px;
  padding-top: env(safe-area-inset-top);
  padding-right: 0px;
  padding-right: env(safe-area-inset-right);
  padding-bottom: 0px;
  padding-bottom: env(safe-area-inset-bottom);
  padding-left: 0px;
  padding-left: env(safe-area-inset-left);
}
@supports (padding-top: max(0px)) {
  .container__2YXc .scroll-view__BGH0 {
    padding-top: max( 0px , env(safe-area-inset-top));
  }
}
@supports (padding-right: max(0px)) {
  .container__2YXc .scroll-view__BGH0 {
    padding-right: max( 0px , env(safe-area-inset-right));
  }
}
@supports (padding-bottom: max(0px)) {
  .container__2YXc .scroll-view__BGH0 {
    padding-bottom: max( 0px , env(safe-area-inset-bottom));
  }
}
@supports (padding-left: max(0px)) {
  .container__2YXc .scroll-view__BGH0 {
    padding-left: max( 0px , env(safe-area-inset-left));
  }
}
.toolbar__2bet {
  position: fixed;
  bottom: 0;
  width: 100vw;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.description__2XDb {
  padding: 20px 20px 0;
  overflow-x: hidden;
  overflow-y: auto;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
  -webkit-overflow-scrolling: touch;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.next-question-btn__vlPY {
  margin-top: 20px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.question-fast-picker-wrapper__39zK {
  width: 100%;
  border-top: 1px solid #eeeeee;
  background: #ffffff;
  font-size: 13px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.question-fast-picker-wrapper__39zK[data-is-over-edged='false'] .picker-pagination-handlers__3448 > button:first-child {
  padding-left: 8px;
}
.question-fast-picker-wrapper__39zK[data-is-over-edged='false'] .picker-pagination-handlers__3448 > button:last-child {
  padding-right: 8px;
}
.question-fast-picker-wrapper__39zK[data-is-over-edged='true'] .question-fast-picker__3NQb {
  padding: 10px 0 10px 20px;
}
.question-fast-picker-wrapper__39zK[data-is-over-edged='true'] .question-fast-picker__3NQb button svg {
  margin: 0;
}
.question-fast-picker-wrapper__39zK[data-is-over-edged='true'] .space-filler__3Pj9 {
  -ms-flex-preferred-size: 15px;
      flex-basis: 15px;
}
.question-fast-picker-wrapper__39zK[data-is-over-edged='true'] .handler-text__1zJ5 {
  display: none;
}
.question-fast-picker__3NQb {
  width: 100%;
  padding: 10px 0 10px 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
}
.picker-menu-handler__2vpG {
  min-width: 0;
  max-width: 115px;
  overflow: hidden;
  -o-text-overflow: ellipsis;
     text-overflow: ellipsis;
  white-space: pre;
}
.picker-menu-handler__2vpG svg {
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
}
.picker-handlers__gZEF {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
  min-width: 0;
  -webkit-transition: -webkit-transform 0.3s;
  transition: -webkit-transform 0.3s;
  -o-transition: transform 0.3s;
  transition: transform 0.3s;
  transition: transform 0.3s, -webkit-transform 0.3s;
  -webkit-transform: translateX(0);
          transform: translateX(0);
}
.picker-handlers__gZEF[data-is-resizer-bar-active='true'] {
  -webkit-transform: translateX(-10px);
          transform: translateX(-10px);
}
.shuffle-handler__2qow {
  white-space: nowrap;
}
.space-filler__3Pj9 {
  -ms-flex-preferred-size: 40px;
      flex-basis: 40px;
  -ms-flex-negative: 1;
      flex-shrink: 1;
  min-width: 15px;
}
.picker-pagination-handlers__3448 {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  margin-left: auto;
}
.pagination-screen__3Yiy {
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
  width: 80px;
  text-align: center;
  -ms-flex-item-align: center;
      align-self: center;
}
.problem-tooltip__3dA- {
  white-space: nowrap;
  font-size: 13px;
}
.handler-text__1zJ5 {
  white-space: nowrap;
}
.handler-text__1zJ5,
.shuffle-icon__2xDH {
  color: #455a64;
}
.handler-icon__272o {
  color: #607d8b;
}
.page-select__1LgN {
  margin: 5px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.main__3JUA {
  position: relative;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1 1 0px;
          flex: 1 1 0;
  z-index: 0;
  min-height: 0;
}
.main__3JUA .loading__1jcq {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  background: white;
  z-index: 1;
}
.header__2ivW {
  margin-top: 0;
  -webkit-transition: margin-top 0.3s ease-in-out;
  -o-transition: margin-top 0.3s ease-in-out;
  transition: margin-top 0.3s ease-in-out;
  background: white;
  -webkit-box-flex: 0;
      -ms-flex: 0 0 auto;
          flex: 0 0 auto;
  height: 44px;
  border-bottom: 1px solid #eeeeee;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: justify;
      -ms-flex-pack: justify;
          justify-content: space-between;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.header__2ivW[data-status='exited'] {
  display: none;
}
.header__2ivW[data-is-loading='true'] {
  -webkit-box-shadow: none;
          box-shadow: none;
}
.header__2ivW[data-status='exiting'],
.header__2ivW[data-status='entering'] {
  margin-top: -44px;
}
.header__2ivW .question-select-button__21ly {
  margin-left: 14px;
  -webkit-box-shadow: none;
          box-shadow: none;
  border: 0;
}
.header__2ivW .question-select-button__21ly:not(:disabled) {
  color: #263238;
  opacity: 0.6;
  background-color: #eceff1;
  border: 0;
}
.header__2ivW .question-select-button__21ly:not(:disabled).active__gSC2 {
  color: #37474f;
  opacity: 1;
}
.header__2ivW .question-select-button__21ly:not(:disabled).accepted__OX44 {
  background-color: #4caf50;
  color: white;
}
.header__2ivW .question-select-button__21ly:not(:disabled).accepted__OX44:hover {
  background-color: #43a047;
  color: white;
  border: 0;
}
.header__2ivW .question-select-button__21ly:not(:disabled):hover {
  color: #263238;
  background-color: #eceff1;
  opacity: 1;
  border: 0;
}
.header-center__WE5g {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.logo__3n_5 {
  height: 20px;
}
.header-left__3KIj {
  margin-left: 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
}
.header-right__2FA- {
  margin-right: 20px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: end;
      -ms-flex-pack: end;
          justify-content: flex-end;
}
.header-left__3KIj,
.header-right__2FA- {
  width: 200px;
}
.title-text__2A4Y {
  margin-left: 10px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
body {
  overflow: hidden;
}
@media (max-width: 896px) {
  body {
    overflow: auto;
  }
}
.layout__3WR3 {
  position: relative;
  z-index: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  height: 100%;
  width: 100%;
  min-width: 896px;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-font-smoothing: antialiased;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
body {
  overflow: hidden;
}
@media (max-width: 896px) {
  body {
    overflow: auto;
  }
}
.layout__2UoK {
  position: relative;
  z-index: 0;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  height: 100%;
  width: 100%;
  min-width: 896px;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-font-smoothing: antialiased;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.topic-container__3Kpd {
  background: white;
  -webkit-box-shadow: 0 1px 2px 0 rgba(0, 0, 0, 0.1);
          box-shadow: 0 1px 2px 0 rgba(0, 0, 0, 0.1);
  border-radius: 3px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.sign-in-page__3DVK {
  height: 100%;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  min-width: 896px;
}
.sign-in-page__3DVK .sign-in-wrapper__2SAX {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-box-flex: 1;
      -ms-flex: 1 0 auto;
          flex: 1 0 auto;
  background-image: -webkit-radial-gradient(50% 135%, closest-side, #ffffff 50%, #eceff1 100%);
  background-image: -o-radial-gradient(50% 135%, closest-side, #ffffff 50%, #eceff1 100%);
  background-image: radial-gradient(closest-side at 50% 135%, #ffffff 50%, #eceff1 100%);
}
.sign-in-page__3DVK .sign-in-section__29XP {
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
  width: 100%;
  min-height: 600px;
  -webkit-box-orient: vertical;
  -webkit-box-direction: normal;
      -ms-flex-direction: column;
          flex-direction: column;
}
.sign-in-page__3DVK .sign-in-section__29XP .placeholder-top__DpKc {
  -webkit-box-flex: 0.618;
      -ms-flex-positive: 0.618;
          flex-grow: 0.618;
}
.sign-in-page__3DVK .sign-in-section__29XP .placeholder-bottom__2SYS {
  -webkit-box-flex: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
}
.sign-in-page__3DVK .sign-in-section__29XP .sign-in-box__1t5d {
  width: 400px;
  background: white;
  padding: 40px 0 33px 0;
  border-radius: 3px;
  -webkit-box-shadow: 0 4px 20px rgba(0, 0, 0, 0.04);
          box-shadow: 0 4px 20px rgba(0, 0, 0, 0.04);
  border: 1px solid #eeeeee;
  margin: 0 auto;
}
.navbar__Srlh {
  -ms-flex-negative: 0;
      flex-shrink: 0;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.sign-in-container__3hqS {
  padding: 66px 15px;
}
</style><style type="text/css">/**
 * No mixins for output here.
 * If you want to expose some mixins,
 * define them to `legacy/common/styles/atomic`
 */
/* stylelint-disable */
.not-found-wrapper__YJVK {
  width: 100%;
  margin-top: 140px;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-pack: center;
      -ms-flex-pack: center;
          justify-content: center;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
}
.not-found-wrapper__YJVK img,
.not-found-wrapper__YJVK .text__21cZ {
  width: 300px;
}
@media (max-width: 400px) {
  .not-found-wrapper__YJVK img,
  .not-found-wrapper__YJVK .text__21cZ {
    width: 100%;
  }
}
.not-found-wrapper__YJVK img {
  padding: 0 15px;
}
.not-found-wrapper__YJVK .text__21cZ {
  padding: 0 15px 0 30px;
}
.not-found-wrapper__YJVK .text__21cZ h3 {
  font-size: 30px;
  font-weight: 500;
}
.not-found-wrapper__YJVK .text__21cZ .redirect-btn__11fp {
  padding: 6px 12px;
  margin-top: 25px;
}
@media (max-width: 992px) {
  .not-found-wrapper__YJVK {
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
        -ms-flex-direction: column;
            flex-direction: column;
    margin-top: 40px;
  }
}
</style><style data-emotion="css"></style><style id="erd_scroll_detection_scrollbar_style">/* Created by the element-resize-detector library. */
.erd_scroll_detection_container > div::-webkit-scrollbar { display: none; }

.erd_scroll_detection_container_animation_active { -webkit-animation-duration: 0.1s; animation-duration: 0.1s; -webkit-animation-name: erd_scroll_detection_container_animation; animation-name: erd_scroll_detection_container_animation; }
@-webkit-keyframes erd_scroll_detection_container_animation { 0% { opacity: 1; } 50% { opacity: 0; } 100% { opacity: 1; } }
@keyframes erd_scroll_detection_container_animation { 0% { opacity: 1; } 50% { opacity: 0; } 100% { opacity: 1; } }</style><link rel="stylesheet" href="./104-Maximum-Depth-of-Binary-Tree_files/font-awesome.min.css"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-notification-16x16.png" sizes="16x16" data-react-helmet="true"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-notification-32x32.png" sizes="32x32" data-react-helmet="true"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-notification-96x96.png" sizes="96x96" data-react-helmet="true"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-notification-160x160.png" sizes="160x160" data-react-helmet="true"><link rel="icon" type="image/png" href="https://leetcode.com/favicon-notification-192x192.png" sizes="192x192" data-react-helmet="true"><style id="ace-github">.ace-github .ace_gutter {background: #e8e8e8;color: #AAA;}.ace-github  {background: #fff;color: #000;}.ace-github .ace_keyword {font-weight: bold;}.ace-github .ace_string {color: #D14;}.ace-github .ace_variable.ace_class {color: teal;}.ace-github .ace_constant.ace_numeric {color: #099;}.ace-github .ace_constant.ace_buildin {color: #0086B3;}.ace-github .ace_support.ace_function {color: #0086B3;}.ace-github .ace_comment {color: #998;font-style: italic;}.ace-github .ace_variable.ace_language  {color: #0086B3;}.ace-github .ace_paren {font-weight: bold;}.ace-github .ace_boolean {font-weight: bold;}.ace-github .ace_string.ace_regexp {color: #009926;font-weight: normal;}.ace-github .ace_variable.ace_instance {color: teal;}.ace-github .ace_constant.ace_language {font-weight: bold;}.ace-github .ace_cursor {color: black;}.ace-github.ace_focus .ace_marker-layer .ace_active-line {background: rgb(255, 255, 204);}.ace-github .ace_marker-layer .ace_active-line {background: rgb(245, 245, 245);}.ace-github .ace_marker-layer .ace_selection {background: rgb(181, 213, 255);}.ace-github.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px white;}.ace-github.ace_nobold .ace_line > span {font-weight: normal !important;}.ace-github .ace_marker-layer .ace_step {background: rgb(252, 255, 0);}.ace-github .ace_marker-layer .ace_stack {background: rgb(164, 229, 101);}.ace-github .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid rgb(192, 192, 192);}.ace-github .ace_gutter-active-line {background-color : rgba(0, 0, 0, 0.07);}.ace-github .ace_marker-layer .ace_selected-word {background: rgb(250, 250, 255);border: 1px solid rgb(200, 200, 250);}.ace-github .ace_invisible {color: #BFBFBF}.ace-github .ace_print-margin {width: 1px;background: #e8e8e8;}.ace-github .ace_indent-guide {background: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==") right repeat-y;}
/*# sourceURL=ace/css/ace-github */</style></head>
  <body style="">
    




<div id="app"><div class="layout__3fIJ"><div class="header__3STC" data-status="entered" data-is-loading="false"><div class="navbar__1Bue"><div class="navbar-container__2Y7K"><div class="navbar-left-container__3-qz"><div class="nav-item-container__16kF"><a href="https://leetcode.com/" class="nav-item__5BvG"><img class="logo__3xn0" src="./104-Maximum-Depth-of-Binary-Tree_files/logo-dark.e99485d9b.svg" alt="logo"></a></div><div class="nav-item-container__16kF"><a href="https://leetcode.com/explore/" class="nav-item__5BvG">Explore</a></div><div class="nav-item-container__16kF"><a href="https://leetcode.com/problemset/all/" class="nav-item__5BvG">Problems</a></div><div class="nav-item-container__16kF"><span class="nav-item__5BvG"><div class="nav-item-badge__6q2S">New</div><a class="nav-item__5BvG" href="https://leetcode.com/interview/">Mock</a></span></div><div class="nav-item-container__16kF"><a href="https://leetcode.com/contest/" class="nav-item__5BvG">Contest</a></div><div class="nav-item-container__16kF"><a href="https://leetcode.com/articles/" class="nav-item__5BvG">Articles</a></div><div class="nav-item-container__16kF"><a href="https://leetcode.com/discuss/" target="_self" class="nav-item__5BvG">Discuss</a></div><div class="nav-item-container__16kF"><span class="nav-item__5BvG"><span class="bright-nav-link__IFNb"><a class="ant-dropdown-link ant-dropdown-trigger"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 store-icon__2GQ5"><path fill-rule="evenodd" d="M4 4h16v2H4V4zm10 14h4v2h-4v-2zM4 7h16l1 5v2h-1v6h-2v-6h-4v6H4v-6H3v-2l1-5zm2 7v4h6v-4H6zm12.96-2l-.6-3H5.64l-.6 3h13.92z"></path></svg>Store</a></span></span></div></div><div class="navbar-right-container__COIx" id="navbar-right-container"><div class="nav-item-container__16kF"></div><div class="nav-item-container__16kF"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 new-playground-icon__k2eV nav-icon__T80b"><path fill-rule="evenodd" d="M21 5H3v14h9v2H1V3h22v7h-2V5zm-3 11v-3h2v3h3v2h-3v3h-2v-3h-3v-2h3zM6 8l7 4.001L6 16v-2.303l2.969-1.696L6 10.303V8z"></path></svg></div><div class="nav-item-container__16kF"><div class="notification-btn-container__23CT"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 notification-icon__2f_U nav-icon__T80b"><path fill-rule="evenodd" d="M18 16v-5c0-3.07-1.64-5.64-4.5-6.32V4c0-.83-.67-1.5-1.5-1.5s-1.5.67-1.5 1.5v.68C7.63 5.36 6 7.92 6 11v5l-2 2v1h16v-1l-2-2zm-6 6c1.1 0 2-.9 2-2h-4a2 2 0 0 0 2 2z"></path></svg><div class="notification-ctr__eDQh notification-ctr__LtQ4">3</div></div></div><div class="nav-item-container__16kF" data-tour-index="6"><a class="ant-dropdown-link ant-dropdown-trigger"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 account-icon__3u4B nav-icon__T80b"><path fill-rule="evenodd" d="M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 3c1.66 0 3 1.34 3 3s-1.34 3-3 3-3-1.34-3-3 1.34-3 3-3zm0 14.2a7.2 7.2 0 0 1-6-3.22c.03-1.99 4-3.08 6-3.08 1.99 0 5.97 1.09 6 3.08a7.2 7.2 0 0 1-6 3.22z"></path></svg></a></div></div></div></div></div><div class="main__2_tD"><div class="content__3fR6"><div class="container__3dQk"><div class="side-tools-wrapper__1TS9" context="[object Object]" data-id="0" data-is-collapsed="false" style="overflow: hidden; flex: 0 0 663.611px;"><div class="css-1100co3-Container e5i1odf0"><div class="css-9z7f7i-Container e5i1odf0" style="position: relative;"><div class="css-jtoecv" data-header-size="normal"><div class=" css-11zaw7c-TabView e5i1odf0" id="question-detail-main-tabs"><div type="default" width="100%" class="css-5wdlwo-TabViewHeader e5i1odf1"><div class="css-1lexzqe-TabHeaderContainer e5i1odf2"><div data-key="description" data-disabled="false" type="default" class="css-19j86kk-TabHeader e5i1odf4"><a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/"><div type="default" class="css-1uwsqgo-TabHeaderRow e5i1odf3"><span><div class="tab-header__20aW"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V6h16v12zM6 10h2v2H6v-2zm0 4h8v2H6v-2zm10 0h2v2h-2v-2zm-6-4h8v2h-8v-2z"></path></svg><span class="title__3f2k">Description</span></div></span></div></a></div><div data-key="solution" data-disabled="false" type="default" class="css-1lelwtv-TabHeader e5i1odf4"><a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/solution/"><div type="default" class="css-1uwsqgo-TabHeaderRow e5i1odf3"><span><div class="tab-header__20aW"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M5.016 17.995c0 .282.093.517.28.705.188.187.423.297.704.328h12a1.14 1.14 0 0 0 .703-.328.902.902 0 0 0 .281-.658c0-.25-.062-.454-.187-.61l-5.813-9.094V3.972h-1.968v4.366l-5.813 9.094a.875.875 0 0 0-.187.563zM6 21c-.844 0-1.547-.282-2.11-.845-.562-.563-.859-1.283-.89-2.16 0-.594.172-1.126.516-1.596L9 7.822V5.99a.953.953 0 0 1-.703-.282.956.956 0 0 1-.281-.704V3.972c0-.564.187-1.033.562-1.409C8.953 2.188 9.422 2 9.984 2h4.032c.562 0 1.03.188 1.406.563.375.376.562.845.562 1.409v1.033a.956.956 0 0 1-.28.704.953.953 0 0 1-.704.282v1.83l5.484 8.578c.344.47.516 1.002.516 1.596-.031.877-.328 1.597-.89 2.16-.563.563-1.266.845-2.11.845H6z"></path></svg><span class="title__3f2k">Solution</span></div></span></div></a></div><div data-key="submissions" data-disabled="false" type="default" class="css-1lelwtv-TabHeader e5i1odf4"><a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/"><div type="default" class="css-1uwsqgo-TabHeaderRow e5i1odf3"><span><div class="tab-header__20aW"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path d="M11.99 2C17.52 2 22 6.48 22 12s-4.48 10-10.01 10C6.47 22 2 17.52 2 12S6.47 2 11.99 2zM12 20c4.42 0 8-3.58 8-8s-3.58-8-8-8-8 3.58-8 8 3.58 8 8 8zm.5-13v5.25l4.5 2.67-.75 1.23L11 13V7z"></path></svg><span class="title__3f2k">Submissions</span></div></span></div></a></div><div data-key="discuss" data-disabled="false" type="default" class="css-1lelwtv-TabHeader e5i1odf4"><a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/discuss/"><div type="default" class="css-1uwsqgo-TabHeaderRow e5i1odf3"><span><div class="tab-header__20aW"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M8.995 22a.955.955 0 0 1-.704-.282.955.955 0 0 1-.282-.704V18.01H3.972c-.564 0-1.033-.195-1.409-.586A1.99 1.99 0 0 1 2 15.99V3.97c0-.563.188-1.032.563-1.408C2.94 2.188 3.408 2 3.972 2h16.056c.564 0 1.033.188 1.409.563.375.376.563.845.563 1.409V15.99a1.99 1.99 0 0 1-.563 1.432c-.376.39-.845.586-1.409.586h-6.103l-3.709 3.71c-.22.187-.454.281-.704.281h-.517zm.986-6.01v3.1l3.099-3.1h6.948V3.973H3.972V15.99h6.01zm-3.99-9.013h12.018v2.018H5.991V6.977zm0 4.037h9.014v1.972H5.99v-1.972z"></path></svg><span class="title__3f2k">Discuss (894)</span></div></span></div></a></div></div></div><div data-key="description-content" class="tab-pane__ncJk css-xailxq-TabContent e5i1odf5"><div class="description__24sA"><div class="css-101rr4k"><div id="question-title" class="css-v3d350">104. Maximum Depth of Binary Tree</div><div class="css-10o4wqw"><div diff="easy" class="css-14oi08n">Easy</div><button class="btn__r7r7 css-1rdgofi"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M7 19v-8H4v8h3zM7 9c0-.55.22-1.05.58-1.41L14.17 1l1.06 1.05c.27.27.44.65.44 1.06l-.03.32L14.69 8H21c1.1 0 2 .9 2 2v2c0 .26-.05.5-.14.73l-3.02 7.05C19.54 20.5 18.83 21 18 21H4a2 2 0 0 1-2-2v-8a2 2 0 0 1 2-2h3zm2 0v10h9l3-7v-2h-9l1.34-5.34L9 9z"></path></svg><span>1280</span></button><button class="btn__r7r7 css-1rdgofi"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M17 3v12c0 .55-.22 1.05-.58 1.41L9.83 23l-1.06-1.05c-.27-.27-.44-.65-.44-1.06l.03-.32.95-4.57H3c-1.1 0-2-.9-2-2v-2c0-.26.05-.5.14-.73l3.02-7.05C4.46 3.5 5.17 3 6 3h11zm-2 12V5H6l-3 7v2h9l-1.34 5.34L15 15zm2-2h3V5h-3V3h3a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2h-3v-2z"></path></svg><span>49</span></button><button class="btn__r7r7 css-1rdgofi"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M16.5 3c-1.74 0-3.41.81-4.5 2.09C10.91 3.81 9.24 3 7.5 3 4.42 3 2 5.42 2 8.5c0 3.78 3.4 6.86 8.55 11.54L12 21.35l1.45-1.32C18.6 15.36 22 12.28 22 8.5 22 5.42 19.58 3 16.5 3zm-4.4 15.55l-.1.1-.1-.1C7.14 14.24 4 11.39 4 8.5 4 6.5 5.5 5 7.5 5c1.54 0 3.04.99 3.57 2.36h1.87C13.46 5.99 14.96 5 16.5 5c2 0 3.5 1.5 3.5 3.5 0 2.89-3.14 5.74-7.9 10.05z"></path></svg><span>Favorite</span></button><button class="btn__r7r7 css-1rdgofi"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M17 5V2l5 5h-9a2 2 0 0 0-2 2v8H9V9a4 4 0 0 1 4-4h4zm3 14V9h2v10a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h3v2H4v14h16z"></path></svg><span>Share</span></button></div></div><div class="content__u3I1 question-content__JfgR"><div><p>Given a binary tree, find its maximum depth.</p>

<p>The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.</p>

<p><strong>Note:</strong>&nbsp;A leaf is a node with no children.</p>

<p><strong>Example:</strong></p>

<p>Given binary tree <code>[3,9,20,null,null,15,7]</code>,</p>

<pre>    3
   / \
  9  20
    /  \
   15   7</pre>

<p>return its depth = 3.</p>
</div></div><div style="position: relative;"><div class="css-12aggky"><div class="css-oqu510"><div class="css-y3si18">Accepted</div><div class="css-jkjiwi">501,609</div></div><div class="css-oqu510"><div class="css-y3si18">Submissions</div><div class="css-jkjiwi">831,057</div></div></div><div class="erd_scroll_detection_container erd_scroll_detection_container_animation_active" style="visibility: hidden; display: inline; width: 0px; height: 0px; z-index: -1; overflow: hidden; margin: 0px; padding: 0px;"><div dir="ltr" class="erd_scroll_detection_container" style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; width: 100%; height: 100%; left: 0px; top: 0px;"><div class="erd_scroll_detection_container" style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; left: -11px; top: -11px; right: -10px; bottom: -10px;"><div style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;"><div style="position: absolute; left: 0px; top: 0px; width: 653px; height: 72px;"></div></div><div style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;"><div style="position: absolute; width: 200%; height: 200%;"></div></div></div></div></div></div><div class="header__28Cb"><div class="title__3BS7" data-size="md">Seen this question in a real interview before?</div><div class="btn-wrapper__19Tg"><button class="btn__1eiM btn-xs__2rgD btn-info__3x1M action-btn__DKeo" data-no-border="false"><div class="btn-content-container__214G"><span class="btn-content__lOBM">Yes</span></div></button></div><div class="btn-wrapper__19Tg"><button class="btn__1eiM btn-xs__2rgD btn-info__3x1M action-btn__DKeo" data-no-border="false"><div class="btn-content-container__214G"><span class="btn-content__lOBM">No</span></div></button></div></div><div class="container__MdHF"><div class="label__kWQk">Contributor</div><div class="contributors__1MZK"><div><a id="0" target="_blank"><img class="avatar__OVN5" src="./104-Maximum-Depth-of-Binary-Tree_files/LeetCode_avatar.png" alt="LeetCode"></a></div></div></div><div class="css-isal7m"><div class="css-1819af6-baseHeaderStyle e5i1odf0"><div class="css-1jqueqk"><div class="header__2X5E">Companies<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 info-icon__2U30"><path fill-rule="evenodd" d="M13.91 3.5c.436.031.795.187 1.075.468.28.28.421.63.421 1.052 0 .42-.14.771-.42 1.052-.281.28-.64.42-1.076.42-.437 0-.795-.14-1.076-.42-.28-.28-.42-.631-.42-1.052 0-.421.14-.772.42-1.052.28-.281.64-.437 1.076-.468zm-.374 4.77c.56 0 .85.233.865.7.015.468-.024.874-.117 1.217l-1.17 4.395c-.404 1.465-.576 2.385-.514 2.759.125.25.398.25.819 0 .42-.25.818-.5 1.192-.748l.047-.047c.062 0 .125.03.187.093l.187.328c.031.062 0 .124-.094.187L12.6 18.79c-.405.28-.966.507-1.683.678-.717.172-1.029-.35-.935-1.566.561-2.681 1.036-4.684 1.426-6.009.39-1.325.101-1.675-.865-1.052l-1.075.702c-.094.062-.156.085-.187.07-.032-.016-.078-.102-.14-.257L9 11.122c0-.031.047-.094.14-.187.094-.094.678-.522 1.754-1.286 1.075-.764 1.956-1.224 2.642-1.38z"></path></svg></div></div><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 css-1ehpd12"><path fill-rule="evenodd" d="M16.59 8.59L12 13.17 7.41 8.59 6 10l6 6 6-6z"></path></svg></div><div class="css-1hky5w4"><span class="time-period-button-group__2HTV"><button class="time-period-button__3neY selected__1jx3">0 ~ 6 months</button><button class="time-period-button__3neY">6 months ~ 1 year</button><button class="time-period-button__3neY">1 year ~ 2 years</button></span><div class="company-tag-wrapper__1rBy"><a href="https://leetcode.com/company/amazon"><button class="btn__1eiM btn-xs__2rgD tag-btn__3shi company-tag__23z7" data-no-border="false"><div class="btn-content-container__214G"><span class="btn-content__lOBM">Amazon</span><span class="separator__2KJB">|</span><span>6</span></div></button></a><a href="https://leetcode.com/company/linkedin"><button class="btn__1eiM btn-xs__2rgD tag-btn__3shi company-tag__23z7" data-no-border="false"><div class="btn-content-container__214G"><span class="btn-content__lOBM">LinkedIn</span><span class="separator__2KJB">|</span><span>6</span></div></button></a><a href="https://leetcode.com/company/apple"><button class="btn__1eiM btn-xs__2rgD tag-btn__3shi company-tag__23z7" data-no-border="false"><div class="btn-content-container__214G"><span class="btn-content__lOBM">Apple</span><span class="separator__2KJB">|</span><span>4</span></div></button></a><a href="https://leetcode.com/company/yahoo"><button class="btn__1eiM btn-xs__2rgD tag-btn__3shi company-tag__23z7" data-no-border="false"><div class="btn-content-container__214G"><span class="btn-content__lOBM">Yahoo</span><span class="separator__2KJB">|</span><span>3</span></div></button></a><a href="https://leetcode.com/company/google"><button class="btn__1eiM btn-xs__2rgD tag-btn__3shi company-tag__23z7" data-no-border="false"><div class="btn-content-container__214G"><span class="btn-content__lOBM">Google</span><span class="separator__2KJB">|</span><span>3</span></div></button></a></div></div></div><div class="css-isal7m"><div class="css-1819af6-baseHeaderStyle e5i1odf0"><div class="css-1jqueqk"><div class="header__2RZv">Related Topics</div></div><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 css-1ehpd12"><path fill-rule="evenodd" d="M16.59 8.59L12 13.17 7.41 8.59 6 10l6 6 6-6z"></path></svg></div><div class="css-1hky5w4"><a class="topic-tag__1jni" href="https://leetcode.com/tag/tree/"><span data-size="xs" class="tag__2PqS">Tree</span></a><a class="topic-tag__1jni" href="https://leetcode.com/tag/depth-first-search/"><span data-size="xs" class="tag__2PqS">Depth-first Search</span></a></div></div><div class="css-isal7m"><div class="css-1819af6-baseHeaderStyle e5i1odf0"><div class="css-1jqueqk"><div class="header__qVrK">Similar Questions</div></div><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 css-1ehpd12"><path fill-rule="evenodd" d="M16.59 8.59L12 13.17 7.41 8.59 6 10l6 6 6-6z"></path></svg></div><div class="css-1hky5w4"><div class="question__25Pw"><a class="title__1kvt" href="https://leetcode.com/problems/balanced-binary-tree/">Balanced Binary Tree</a><div class="difficulty__ES5S">Easy</div></div><div class="question__25Pw"><a class="title__1kvt" href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">Minimum Depth of Binary Tree</a><div class="difficulty__ES5S">Easy</div></div><div class="question__25Pw"><a class="title__1kvt" href="https://leetcode.com/problems/maximum-depth-of-n-ary-tree/">Maximum Depth of N-ary Tree</a><div class="difficulty__ES5S">Easy</div></div></div></div></div></div><div data-key="solution-content" class="tab-pane__ncJk css-a7z1n1-TabContent e5i1odf5"></div><div data-key="submissions-content" class="tab-pane__ncJk css-a7z1n1-TabContent e5i1odf5"><div class="container__36Fw container__3BF-"><div class="submissions__1ROo"><div class="result-container__33Nb"><div class="container__nthg"><div class="result__23wN"><div class="success__3Ai7">Success</div><a class="detail__1Ye5" href="https://leetcode.com/submissions/detail/229625441/" target="_blank">Details <svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg></a></div><div class="info__2oQ9"><span>Runtime:&nbsp;<span class="data__HC-i">3 ms</span><span>, faster than <span class="data__HC-i">11.53%</span> of Java online submissions for Maximum Depth of Binary Tree.</span></span></div><div class="info__2oQ9"><span>Memory Usage:&nbsp;<span class="data__HC-i">38.8 MB</span><span>, less than <span class="data__HC-i">86.13%</span> of Java online submissions for Maximum Depth of Binary Tree.</span></span></div></div><div class="addl-success-info__2ySC"><div>Next challenges: </div><div class="next-challenge__A4ZV"><a href="https://leetcode.com/problems/balanced-binary-tree/" class="next-challenge-btn__L_19 E__2cGj" data-question-title-slug="balanced-binary-tree">Balanced Binary Tree</a><a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/" class="next-challenge-btn__L_19 E__2cGj" data-question-title-slug="minimum-depth-of-binary-tree">Minimum Depth of Binary Tree</a><a href="https://leetcode.com/problems/maximum-depth-of-n-ary-tree/" class="next-challenge-btn__L_19 E__2cGj" data-question-title-slug="maximum-depth-of-n-ary-tree">Maximum Depth of N-ary Tree</a></div><div class="share__1rbD"><div class="desc__3vzG">Show off your acceptance:</div><div><div><div class="icon-area__oZoj"><div class="root__2fED" data-icon="facebook"><a href="https://www.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fleetcode.com%2Fproblems%2Fmaximum-depth-of-binary-tree%2F" target="_blank" class="icon__1sW1" data-region="normal"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M12 22c5.523 0 10-4.477 10-10S17.523 2 12 2 2 6.477 2 12s4.477 10 10 10zm2.52-14.923v1.686h-1.004c-.366 0-.613.077-.74.23-.128.153-.192.383-.192.69v1.207h1.871l-.249 1.891h-1.622v4.849h-1.955V12.78H9v-1.89h1.629V9.497c0-.792.221-1.407.664-1.843.443-.437 1.033-.655 1.77-.655.626 0 1.111.026 1.456.077z"></path></svg></a></div><div class="root__2fED" data-icon="twitter"><a href="https://twitter.com/intent/tweet?text=%20Maximum%20Depth%20of%20Binary%20Tree%20-%20LeetCode&amp;url=https%3A%2F%2Fleetcode.com%2Fproblems%2Fmaximum-depth-of-binary-tree%2F" target="_blank" class="icon__1sW1" data-region="normal"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M12 22c5.523 0 10-4.477 10-10S17.523 2 12 2 2 6.477 2 12s4.477 10 10 10zm5.84-12.956a4.64 4.64 0 0 1-1.114 1.15 6.304 6.304 0 0 1-.254 2.074 6.468 6.468 0 0 1-.795 1.708 6.71 6.71 0 0 1-1.269 1.448c-.49.42-1.082.755-1.775 1.005a6.493 6.493 0 0 1-2.221.375A6.17 6.17 0 0 1 7 15.806c.16.019.339.028.536.028a4.35 4.35 0 0 0 2.759-.95A2.17 2.17 0 0 1 9 14.442a2.17 2.17 0 0 1-.784-1.097c.151.023.291.034.42.034.197 0 .392-.025.584-.076a2.187 2.187 0 0 1-1.275-.767 2.146 2.146 0 0 1-.506-1.413v-.027a2.2 2.2 0 0 0 1.005.282 2.216 2.216 0 0 1-.99-1.85c0-.404.1-.778.302-1.121a6.292 6.292 0 0 0 2.026 1.64c.796.41 1.648.639 2.555.684a2.488 2.488 0 0 1-.054-.509c0-.614.216-1.138.65-1.571.433-.433.957-.65 1.571-.65.642 0 1.184.234 1.624.702.5-.097.97-.275 1.41-.536a2.16 2.16 0 0 1-.976 1.224 4.41 4.41 0 0 0 1.28-.344l-.002-.002z"></path></svg></a></div><div class="root__2fED" data-icon="google-plus"><a href="https://plus.google.com/share?url=https%3A%2F%2Fleetcode.com%2Fproblems%2Fmaximum-depth-of-binary-tree%2F" target="_blank" class="icon__1sW1" data-region="normal"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M12 22c5.523 0 10-4.477 10-10S17.523 2 12 2 2 6.477 2 12s4.477 10 10 10zm6.804-11.007v1.07h-1.487v1.487h-1.06v-1.486H14.77v-1.07h1.487V9.516h1.06v1.476h1.487zm-9.375 4.973a4.233 4.233 0 1 1 2.888-7.328L11.07 9.867a2.557 2.557 0 0 0-1.715-.657c-1.353 0-2.389 1.12-2.389 2.567 0 1.555 1.323 2.537 2.389 2.537a2.582 2.582 0 0 0 2.43-1.722H9.463v-1.688h4.032v1.688c-.257 1.99-1.883 3.374-4.066 3.374z"></path></svg></a></div><div class="root__2fED" data-icon="linkedin-c"><a href="http://www.linkedin.com/shareArticle?url=https%3A%2F%2Fleetcode.com%2Fproblems%2Fmaximum-depth-of-binary-tree%2F&amp;title=%20Maximum%20Depth%20of%20Binary%20Tree%20-%20LeetCode&amp;summary=I%20just%20solved%20Maximum%20Depth%20of%20Binary%20Tree%20on%20LeetCode.%20My%20Java%20solution%20%20%20%20%20%20finished%20in%203%20ms%2C%20beating%2011.53%25%20%20%20%20%20%20of%20all%20other%20Java%20submissions.%20Can%20you%20beat%20it%3F&amp;mini=true&amp;ro=true&amp;armin=armin" target="_blank" class="icon__1sW1" data-region="normal"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M12 22c5.523 0 10-4.477 10-10S17.523 2 12 2 2 6.477 2 12s4.477 10 10 10zm-2.472-5.611H7.55V9.467h1.978v6.922zm-.99-7.911a.989.989 0 1 1 0-1.978.989.989 0 0 1 0 1.978zm7.912 7.91h-1.978v-3.955a.989.989 0 1 0-1.978 0v3.956h-1.977V9.467h1.977v1.227c.408-.56 1.032-1.227 1.731-1.227 1.229 0 2.225 1.107 2.225 2.472v4.45z"></path></svg></a></div></div></div></div></div></div></div><div><div class="ant-table-wrapper table__1sPX"><div class="ant-spin-nested-loading"><div class="ant-spin-container"><div class="ant-table ant-table-default ant-table-scroll-position-left"><div class="ant-table-content"><div class="ant-table-body"><table class=""><colgroup><col><col><col><col><col></colgroup><thead class="ant-table-thead"><tr><th class="time-column__1guG"><div>Time Submitted</div></th><th class="status-column__3SUg"><div>Status</div></th><th class="runtime-column__1ka_"><div>Runtime</div></th><th class="memory-column__1dxp"><div>Memory</div></th><th class="lang-column__tR-8"><div>Language</div></th></tr></thead><tbody class="ant-table-tbody"><tr class="ant-table-row ant-table-row-level-0" data-row-key="229625441"><td class="time-column__1guG"><span class="ant-table-row-indent indent-level-0" style="padding-left: 0px;"></span>a few seconds ago</td><td class="status-column__3SUg"><a href="https://leetcode.com/submissions/detail/229625441/" target="_blank" class="ac__35gz" data-submission-id="229625441">Accepted</a></td><td class="runtime-column__1ka_">3 ms</td><td class="memory-column__1dxp">38.8 MB</td><td class="lang-column__tR-8">java</td></tr><tr class="ant-table-row ant-table-row-level-0" data-row-key="229613557"><td class="time-column__1guG"><span class="ant-table-row-indent indent-level-0" style="padding-left: 0px;"></span>2 hours ago</td><td class="status-column__3SUg"><a href="https://leetcode.com/submissions/detail/229613557/" target="_blank" class="ac__35gz" data-submission-id="229613557">Accepted</a></td><td class="runtime-column__1ka_">1 ms</td><td class="memory-column__1dxp">38.2 MB</td><td class="lang-column__tR-8">java</td></tr><tr class="ant-table-row ant-table-row-level-0" data-row-key="229606074"><td class="time-column__1guG"><span class="ant-table-row-indent indent-level-0" style="padding-left: 0px;"></span>3 hours ago</td><td class="status-column__3SUg"><a href="https://leetcode.com/submissions/detail/229606074/" target="_blank" class="ac__35gz" data-submission-id="229606074">Accepted</a></td><td class="runtime-column__1ka_">0 ms</td><td class="memory-column__1dxp">36.3 MB</td><td class="lang-column__tR-8">java</td></tr><tr class="ant-table-row ant-table-row-level-0" data-row-key="219315869"><td class="time-column__1guG"><span class="ant-table-row-indent indent-level-0" style="padding-left: 0px;"></span>2 months ago</td><td class="status-column__3SUg"><a href="https://leetcode.com/submissions/detail/219315869/" target="_blank" class="ac__35gz" data-submission-id="219315869">Accepted</a></td><td class="runtime-column__1ka_">0 ms</td><td class="memory-column__1dxp">40.1 MB</td><td class="lang-column__tR-8">java</td></tr><tr class="ant-table-row ant-table-row-level-0" data-row-key="218710784"><td class="time-column__1guG"><span class="ant-table-row-indent indent-level-0" style="padding-left: 0px;"></span>2 months ago</td><td class="status-column__3SUg"><a href="https://leetcode.com/submissions/detail/218710784/" target="_blank" class="ac__35gz" data-submission-id="218710784">Accepted</a></td><td class="runtime-column__1ka_">0 ms</td><td class="memory-column__1dxp">39.9 MB</td><td class="lang-column__tR-8">java</td></tr></tbody></table></div></div></div></div></div></div></div></div></div></div><div data-key="discuss-content" class="tab-pane__ncJk css-a7z1n1-TabContent e5i1odf5"></div></div></div><div class="erd_scroll_detection_container erd_scroll_detection_container_animation_active" style="visibility: hidden; display: inline; width: 0px; height: 0px; z-index: -1; overflow: hidden; margin: 0px; padding: 0px;"><div dir="ltr" class="erd_scroll_detection_container" style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; width: 100%; height: 100%; left: 0px; top: 0px;"><div class="erd_scroll_detection_container" style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; left: -11px; top: -11px; right: -10px; bottom: -10px;"><div style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;"><div style="position: absolute; left: 0px; top: 0px; width: 694px; height: 932px;"></div></div><div style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;"><div style="position: absolute; width: 200%; height: 200%;"></div></div></div></div></div></div><div><div class="question-fast-picker-wrapper__2Y97"><div class="question-fast-picker__3VcA"><button id="question-picker-btn" class="picker-menu-handler__34CD css-tj8r5s-default-sm" data-tour-index="2" type="default"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M7 19h14v-2H7v2zm0-6h14v-2H7v2zm0-8v2h14V5H7zM3 5h2v2H3V5zm0 6h2v2H3v-2zm0 6h2v2H3v-2z"></path></svg><span class="handler-text__1hMU">Problems</span></button><div class="picker-handlers__2fqm" data-is-resizer-bar-active="false"><div class="space-filler__1toa"></div><button class="shuffle-handler__3Gzu css-tj8r5s-default-sm" type="default"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 shuffle-icon__dV27"><path fill-rule="evenodd" d="M10.59 9.17L5.41 4 4 5.41l5.17 5.17 1.42-1.41zM14.5 4l2.04 2.04L4 18.59 5.41 20 17.96 7.46 20 9.5V4h-5.5zm.33 9.41l-1.41 1.41 3.13 3.13L14.5 20H20v-5.5l-2.04 2.04-3.13-3.13z"></path></svg><span class="handler-text__1hMU">Pick One</span></button><div class="space-filler__1toa"></div><div class="picker-pagination-handlers__1MLX"><button id="prev-question-btn" type="default" data-tour-index="4" class="css-tj8r5s-default-sm"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 handler-icon__26i5"><path fill-rule="evenodd" d="M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12z"></path></svg><span class="handler-text__1hMU">Prev</span></button><div class="pagination-screen__12p7"><span>104/1041</span></div><button id="next-question-btn" type="default" data-tour-index="5" class="css-tj8r5s-default-sm"><span class="handler-text__1hMU">Next</span><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 handler-icon__26i5"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg></button></div></div></div></div></div></div></div><div data-is-active="false" context="[object Object]" class="resize-bar__2_sK container__RpjS" data-is-vertical="false" data-id="1" style="width: 10px;"><svg width="4" height="27" xmlns="http://www.w3.org/2000/svg" class="arrow-indicator__2U1G"><path d="M3.248 13.401c.012.06.013.123.002.186L.992 26.389a.5.5 0 1 1-.984-.173l2.257-12.803a.51.51 0 0 1 .002-.012.51.51 0 0 1-.002-.012L.008.587A.5.5 0 1 1 .992.413L3.25 13.216a.499.499 0 0 1-.002.185z" fill="#B0BEC5"></path></svg><div class="interactive-area__2Gbf" style="padding: 0px 5px;"></div></div><div class="editor-wrapper__1ru6" context="[object Object]" data-id="2" data-is-collapsed="false" style="overflow: hidden; flex: 1 0 0px;"><div id="code-area" class="code-area__24hN"><div class="content__Ztw-"><div class="wrapper__1Diw editor__DNsS"><div class="container__2zYY" data-size="lg" style="position: relative;"><div class="select__2iyW select-container__2w2b"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 icon__3D2N icon-xs__ys7E icon-light__GZvS"><path fill-rule="evenodd" d="M13.91 3.5c.436.031.795.187 1.075.468.28.28.421.63.421 1.052 0 .42-.14.771-.42 1.052-.281.28-.64.42-1.076.42-.437 0-.795-.14-1.076-.42-.28-.28-.42-.631-.42-1.052 0-.421.14-.772.42-1.052.28-.281.64-.437 1.076-.468zm-.374 4.77c.56 0 .85.233.865.7.015.468-.024.874-.117 1.217l-1.17 4.395c-.404 1.465-.576 2.385-.514 2.759.125.25.398.25.819 0 .42-.25.818-.5 1.192-.748l.047-.047c.062 0 .125.03.187.093l.187.328c.031.062 0 .124-.094.187L12.6 18.79c-.405.28-.966.507-1.683.678-.717.172-1.029-.35-.935-1.566.561-2.681 1.036-4.684 1.426-6.009.39-1.325.101-1.675-.865-1.052l-1.075.702c-.094.062-.156.085-.187.07-.032-.016-.078-.102-.14-.257L9 11.122c0-.031.047-.094.14-.187.094-.094.678-.522 1.754-1.286 1.075-.764 1.956-1.224 2.642-1.38z"></path></svg><div id="lang-select" class="select__2rIJ select-xs__T1oT ant-select-light ant-select-xs undefined with-icon ant-select-selected ant-select ant-select-enabled"><div class="ant-select-selection
            ant-select-selection--single" role="combobox" aria-autocomplete="list" aria-haspopup="true" aria-controls="d457f38e-3dfd-4503-b58c-827eccd7a20e" aria-expanded="false" tabindex="0"><div class="ant-select-selection__rendered"><div unselectable="on" class="ant-select-selection__placeholder" style="display: none; user-select: none;">Select...</div><div class="ant-select-selection-selected-value" title="Java" style="display: block; opacity: 1;">Java</div></div><span class="ant-select-arrow" unselectable="on" style="user-select: none;"><i aria-label="icon: down" class="anticon anticon-down ant-select-arrow-icon"><svg viewBox="64 64 896 896" class="" data-icon="down" width="1em" height="1em" fill="currentColor" aria-hidden="true"><path d="M884 256h-75c-5.1 0-9.9 2.5-12.9 6.6L512 654.2 227.9 262.6c-3-4.1-7.8-6.6-12.9-6.6h-75c-6.5 0-10.3 7.4-6.5 12.7l352.6 486.1c12.8 17.6 39 17.6 51.7 0l352.6-486.1c3.9-5.3.1-12.7-6.4-12.7z"></path></svg></i></span></div></div></div><div class="btns__1OeZ"><div class="tool-item__2DCU"><button class="btn__1eiM btn-sm__Woog btn-ghost__1PBo tool-button__2cBA" data-no-border="true" icon="information"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M13.91 3.5c.436.031.795.187 1.075.468.28.28.421.63.421 1.052 0 .42-.14.771-.42 1.052-.281.28-.64.42-1.076.42-.437 0-.795-.14-1.076-.42-.28-.28-.42-.631-.42-1.052 0-.421.14-.772.42-1.052.28-.281.64-.437 1.076-.468zm-.374 4.77c.56 0 .85.233.865.7.015.468-.024.874-.117 1.217l-1.17 4.395c-.404 1.465-.576 2.385-.514 2.759.125.25.398.25.819 0 .42-.25.818-.5 1.192-.748l.047-.047c.062 0 .125.03.187.093l.187.328c.031.062 0 .124-.094.187L12.6 18.79c-.405.28-.966.507-1.683.678-.717.172-1.029-.35-.935-1.566.561-2.681 1.036-4.684 1.426-6.009.39-1.325.101-1.675-.865-1.052l-1.075.702c-.094.062-.156.085-.187.07-.032-.016-.078-.102-.14-.257L9 11.122c0-.031.047-.094.14-.187.094-.094.678-.522 1.754-1.286 1.075-.764 1.956-1.224 2.642-1.38z"></path></svg></div></button></div><div class="tool-item__2DCU"><button class="btn__1eiM btn-sm__Woog btn-ghost__1PBo tool-button__2cBA" data-no-border="true" icon="code"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M9.984 3v2.016H8.016v4.968a2.17 2.17 0 0 1-.61 1.43C7.031 11.804 6.563 12 6 12c.563 0 1.031.195 1.406.586.375.39.578.867.61 1.43v4.968h1.968V21H8.016c-.563 0-1.04-.195-1.43-.586A1.945 1.945 0 0 1 6 18.984V15c0-.563-.195-1.031-.586-1.406a2.17 2.17 0 0 0-1.43-.61H3v-1.968h.984a2.17 2.17 0 0 0 1.43-.61C5.804 10.031 6 9.563 6 9V5.016c0-.563.195-1.04.586-1.43.39-.39.867-.586 1.43-.586h1.968zm6 0c.563 0 1.04.195 1.43.586.39.39.586.867.586 1.43V9c0 .563.195 1.031.586 1.406.39.375.867.578 1.43.61H21v1.968h-.984a2.17 2.17 0 0 0-1.43.61c-.39.375-.586.843-.586 1.406v3.984c0 .563-.195 1.04-.586 1.43-.39.39-.867.586-1.43.586h-1.968v-2.016h1.968v-4.968a2.17 2.17 0 0 1 .61-1.43c.375-.39.843-.586 1.406-.586-.563 0-1.031-.195-1.406-.586a2.17 2.17 0 0 1-.61-1.43V5.016h-1.968V3h1.968z"></path></svg></div></button></div><div class="tool-item__2DCU"><button class="btn__1eiM btn-sm__Woog btn-ghost__1PBo tool-button__2cBA" data-no-border="true" icon="return"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M14 8H3l7-5v3h4a7 7 0 0 1 0 14h-4a7 7 0 0 1-7-7v-1h2v1a5 5 0 0 0 5 5h4a5 5 0 0 0 0-10z"></path></svg></div></button></div><div><form target="_blank" method="POST" action="https://leetcode.com/playground/new/empty" style="display: none;"><input name="csrfmiddlewaretoken" type="hidden" value="5AdwdfxxtqgJ2NFkI3heevGQVQwTlNhAZhAjaHJ1BCrCtKpIJpIwwRbuXRehCjIK"><input name="code" type="hidden" value="/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
Recursion
*/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);
    }
}


/*
BFS
*/

class Solution {
    public int maxDepth(TreeNode root) {
        Queue&lt;TreeNode&gt; q = new LinkedList&lt;&gt;();
        if (root == null) return 0;
        int depth = 0;
        q.add(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i &lt; levelSize; i++) {
                TreeNode currNode = q.remove();
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            depth++;
        }
        return depth;
    }
}

/*
DFS
*/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Stack&lt;TreeNode&gt; stack = new Stack&lt;&gt;();
        Stack&lt;Integer&gt; heights = new Stack&lt;&gt;();
        stack.push(root);
        heights.push(1);
        int max = 0;
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            int currHeight = heights.pop();
            max = Math.max(max, currHeight);
            if (current.right != null) {
                stack.push(current.right);
                heights.push(currHeight+1);
            }
            if (current.left != null) {
                stack.push(current.left);
                heights.push(currHeight+1);
            }
        }
        return max;
    }
}"><input name="question" type="hidden" value="104"><input name="testcase" type="hidden" value="[3,9,20,null,null,15,7]"><input name="lang" type="hidden" value="java"><input name="from_submission_result" type="hidden" value=""></form><div class="tool-item__2DCU"><button class="btn__1eiM btn-sm__Woog btn-ghost__1PBo tool-button__2cBA" data-no-border="true" icon="debug"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M4 17.594L8.64 13 4 8.406 5.406 7l6 6-6 6L4 17.594zM11 18h9v2h-9v-2z"></path></svg></div></button></div></div><div class="tool-item__2DCU"><button class="btn__1eiM btn-sm__Woog btn-ghost__1PBo tool-button__2cBA" data-no-border="true" icon="settings"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M14.895 2c-.69.734-1.724 1.212-2.896 1.212-1.17 0-2.203-.478-2.894-1.212-.279.084-3.866 2.176-4.146 2.449.275.975.163 2.124-.42 3.157-.586 1.033-1.505 1.706-2.472 1.949-.09.383-.09 4.507 0 4.89.967.243 1.887.916 2.471 1.949.585 1.033.697 2.182.42 3.157.28.273 3.868 2.365 4.146 2.449.69-.734 1.725-1.212 2.895-1.212 1.172 0 2.206.478 2.897 1.212.278-.084 3.864-2.176 4.145-2.449-.276-.975-.164-2.124.42-3.157.585-1.033 1.505-1.706 2.472-1.949.09-.383.09-4.507 0-4.89-.967-.243-1.886-.916-2.471-1.949-.584-1.033-.696-2.182-.42-3.157-.28-.273-3.868-2.365-4.147-2.449m.195 2.39c.556.318 1.23.714 1.765 1.038a6.275 6.275 0 0 0 .817 3.147 6.215 6.215 0 0 0 2.276 2.314c.01.679.01 1.543 0 2.222a6.208 6.208 0 0 0-2.276 2.314 6.277 6.277 0 0 0-.818 3.148c-.535.323-1.207.718-1.763 1.037a6.175 6.175 0 0 0-3.092-.822c-1.103 0-2.172.29-3.09.822a91.762 91.762 0 0 1-1.763-1.037 6.277 6.277 0 0 0-.818-3.148 6.215 6.215 0 0 0-2.276-2.314 80.47 80.47 0 0 1 0-2.222 6.213 6.213 0 0 0 2.275-2.314c.552-.975.83-2.069.818-3.147.536-.324 1.209-.72 1.764-1.038a6.184 6.184 0 0 0 3.09.822 6.178 6.178 0 0 0 3.09-.822M12 14a2 2 0 1 0 0-4 2 2 0 0 0 0 4z"></path></svg></div></button></div><div><div class="tool-item__2DCU"><button class="btn__1eiM btn-sm__Woog btn-ghost__1PBo tool-button__2cBA" data-no-border="true" icon="fullscreen"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M6 15H4v5h5v-2H6v-3zM4 9h2V6h3V4H4v5zm14 9h-3v2h5v-5h-2v3zM15 4v2h3v3h2V4h-5z"></path></svg></div></button></div></div></div><div class="erd_scroll_detection_container erd_scroll_detection_container_animation_active" style="visibility: hidden; display: inline; width: 0px; height: 0px; z-index: -1; overflow: hidden; margin: 0px; padding: 0px;"><div dir="ltr" class="erd_scroll_detection_container" style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; width: 100%; height: 100%; left: 0px; top: 0px;"><div class="erd_scroll_detection_container" style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; left: -11px; top: -11px; right: -10px; bottom: -10px;"><div style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;"><div style="position: absolute; left: 0px; top: 0px; width: 1491px; height: 71px;"></div></div><div style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;"><div style="position: absolute; width: 200%; height: 200%;"></div></div></div></div></div></div><div class="container__YPDh" style="font-size: 13px;"><div class="react-codemirror2"><div class="CodeMirror cm-s-eclipse CodeMirror-wrap"><div style="overflow: hidden; position: relative; width: 3px; height: 0px; top: 579px; left: 73.125px;"><textarea autocorrect="off" autocapitalize="off" spellcheck="false" style="position: absolute; bottom: -1em; padding: 0px; width: 1000px; height: 1em; outline: none;" tabindex="0"></textarea></div><div class="CodeMirror-vscrollbar" tabindex="-1" cm-not-content="true" style="display: block; bottom: 0px;"><div style="min-width: 1px; height: 1187px;"></div></div><div class="CodeMirror-hscrollbar" tabindex="-1" cm-not-content="true"><div style="height: 100%; min-height: 1px; width: 0px;"></div></div><div class="CodeMirror-scrollbar-filler" cm-not-content="true"></div><div class="CodeMirror-gutter-filler" cm-not-content="true"></div><div class="CodeMirror-scroll" tabindex="-1" draggable="false"><div class="CodeMirror-sizer" style="margin-left: 56px; margin-bottom: -10px; border-right-width: 20px; min-height: 1187px; padding-right: 10px; padding-bottom: 0px;"><div style="position: relative; top: 342.32px;"><div class="CodeMirror-lines" role="presentation"><div role="presentation" style="position: relative; outline: none;"><div class="CodeMirror-measure"><pre>x</pre></div><div class="CodeMirror-measure"></div><div style="position: relative; z-index: 1;"><div class="CodeMirror-selected" style="position: absolute; left: 10px; top: 0px; width: 1373px;"></div><div class="CodeMirror-selected" style="position: absolute; left: 10px; top: 809px; width: 7.13538px; height: 16px;"></div><div class="CodeMirror-selected" style="position: absolute; left: 10px; top: 0px; width: 1373px; height: 809px;"></div></div><div class="CodeMirror-cursors" style=""></div><div class="CodeMirror-code" role="presentation" style=""><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">23</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-comment">BFS</span></span></pre></div><div style="position: relative;" class=""><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">24</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-comment">*/</span></span></pre></div><div style="position: relative;" class=""><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">25</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">26</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-keyword">class</span> <span class="cm-def">Solution</span> {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">27</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-type">int</span> <span class="cm-variable">maxDepth</span>(<span class="cm-variable">TreeNode</span> <span class="cm-variable">root</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">28</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">Queue</span><span class="cm-operator">&lt;</span><span class="cm-variable">TreeNode</span><span class="cm-operator">&gt;</span> <span class="cm-variable">q</span> <span class="cm-operator">=</span> <span class="cm-keyword">new</span> <span class="cm-variable">LinkedList</span><span class="cm-operator">&lt;&gt;</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">29</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">if</span> (<span class="cm-variable">root</span> <span class="cm-operator">==</span> <span class="cm-atom">null</span>) <span class="cm-keyword">return</span> <span class="cm-number">0</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">30</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-type">int</span> <span class="cm-variable">depth</span> <span class="cm-operator">=</span> <span class="cm-number">0</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">31</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">q</span>.<span class="cm-variable">add</span>(<span class="cm-variable">root</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">32</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">while</span> (<span class="cm-operator">!</span><span class="cm-variable">q</span>.<span class="cm-variable">isEmpty</span>()) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">33</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-type">int</span> <span class="cm-variable">levelSize</span> <span class="cm-operator">=</span> <span class="cm-variable">q</span>.<span class="cm-variable">size</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">34</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">for</span> (<span class="cm-type">int</span> <span class="cm-variable">i</span> <span class="cm-operator">=</span> <span class="cm-number">0</span>; <span class="cm-variable">i</span> <span class="cm-operator">&lt;</span> <span class="cm-variable">levelSize</span>; <span class="cm-variable">i</span><span class="cm-operator">++</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">35</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">TreeNode</span> <span class="cm-variable">currNode</span> <span class="cm-operator">=</span> <span class="cm-variable">q</span>.<span class="cm-variable">remove</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">36</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">if</span> (<span class="cm-variable">currNode</span>.<span class="cm-variable">left</span> <span class="cm-operator">!=</span> <span class="cm-atom">null</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">37</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">q</span>.<span class="cm-variable">add</span>(<span class="cm-variable">currNode</span>.<span class="cm-variable">left</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">38</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">39</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">if</span> (<span class="cm-variable">currNode</span>.<span class="cm-variable">right</span> <span class="cm-operator">!=</span> <span class="cm-atom">null</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">40</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">q</span>.<span class="cm-variable">add</span>(<span class="cm-variable">currNode</span>.<span class="cm-variable">right</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">41</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">42</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">43</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">depth</span><span class="cm-operator">++</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">44</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">45</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">return</span> <span class="cm-variable">depth</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">46</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;" class=""><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">47</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">}</span></pre></div><div style="position: relative;" class=""><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">48</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre></div><div style="position: relative;" class=""><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">49</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-comment">/*</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">50</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-comment">DFS</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">51</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-comment">*/</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">52</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-keyword">class</span> <span class="cm-def">Solution</span> {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">53</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-keyword">public</span> <span class="cm-type">int</span> <span class="cm-variable">maxDepth</span>(<span class="cm-variable">TreeNode</span> <span class="cm-variable">root</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">54</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">if</span> (<span class="cm-variable">root</span> <span class="cm-operator">==</span> <span class="cm-atom">null</span>) <span class="cm-keyword">return</span> <span class="cm-number">0</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">55</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">Stack</span><span class="cm-operator">&lt;</span><span class="cm-variable">TreeNode</span><span class="cm-operator">&gt;</span> <span class="cm-variable">stack</span> <span class="cm-operator">=</span> <span class="cm-keyword">new</span> <span class="cm-variable">Stack</span><span class="cm-operator">&lt;&gt;</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">56</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">Stack</span><span class="cm-operator">&lt;</span><span class="cm-type">Integer</span><span class="cm-operator">&gt;</span> <span class="cm-variable">heights</span> <span class="cm-operator">=</span> <span class="cm-keyword">new</span> <span class="cm-variable">Stack</span><span class="cm-operator">&lt;&gt;</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">57</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">stack</span>.<span class="cm-variable">push</span>(<span class="cm-variable">root</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">58</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">heights</span>.<span class="cm-variable">push</span>(<span class="cm-number">1</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">59</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-type">int</span> <span class="cm-variable">max</span> <span class="cm-operator">=</span> <span class="cm-number">0</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">60</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">while</span> (<span class="cm-operator">!</span><span class="cm-variable">stack</span>.<span class="cm-variable">isEmpty</span>()) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">61</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">TreeNode</span> <span class="cm-variable">current</span> <span class="cm-operator">=</span> <span class="cm-variable">stack</span>.<span class="cm-variable">pop</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">62</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-type">int</span> <span class="cm-variable">currHeight</span> <span class="cm-operator">=</span> <span class="cm-variable">heights</span>.<span class="cm-variable">pop</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">63</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">max</span> <span class="cm-operator">=</span> <span class="cm-variable">Math</span>.<span class="cm-variable">max</span>(<span class="cm-variable">max</span>, <span class="cm-variable">currHeight</span>);</span></pre></div><div style="position: relative;" class=""><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">64</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">if</span> (<span class="cm-variable">current</span>.<span class="cm-variable">right</span> <span class="cm-operator">!=</span> <span class="cm-atom">null</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">65</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">stack</span>.<span class="cm-variable">push</span>(<span class="cm-variable">current</span>.<span class="cm-variable">right</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">66</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">heights</span>.<span class="cm-variable">push</span>(<span class="cm-variable">currHeight</span><span class="cm-operator">+</span><span class="cm-number">1</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">67</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">68</div><div class="CodeMirror-gutter-elt" style="left: 40px; width: 16px;"><div class="CodeMirror-foldgutter-open CodeMirror-guttermarker-subtle"></div></div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">if</span> (<span class="cm-variable">current</span>.<span class="cm-variable">left</span> <span class="cm-operator">!=</span> <span class="cm-atom">null</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">69</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">stack</span>.<span class="cm-variable">push</span>(<span class="cm-variable">current</span>.<span class="cm-variable">left</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">70</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-variable">heights</span>.<span class="cm-variable">push</span>(<span class="cm-variable">currHeight</span><span class="cm-operator">+</span><span class="cm-number">1</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">71</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">72</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">73</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp;<span class="cm-keyword">return</span> <span class="cm-variable">max</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">74</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="left: -55.9896px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 32px;">75</div></div><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;">}</span></pre></div></div></div></div></div></div><div style="position: absolute; height: 20px; width: 1px; border-bottom: 0px solid transparent; top: 1187px;"></div><div class="CodeMirror-gutters" style="height: 1207px; left: 0.010376px;"><div class="CodeMirror-gutter CodeMirror-linenumbers" style="width: 40px;"></div><div class="CodeMirror-gutter CodeMirror-foldgutter"></div></div></div></div></div></div></div></div><div class="result__1UhQ"><div class="panel__2Uom closable__3940" style="opacity: 1;"><div class="header__1Shn active__LPd6 collapse___CSI"><div class="header-content__2Ekc"><div class="reset-code-prompt__2QEE">Your previous code was restored from your local storage.<a id="code-area-reset-to-default-btn" class="reset-code-btn__3ADT">Reset to default</a></div></div><div class="icon-wrapper__2q8n"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z"></path></svg></div></div></div><div class="panel__2Uom closable__3940" style="opacity: 1;"><div class="header__1Shn active__LPd6 collapse___CSI wrapper__2LvV"><div class="header-content__2Ekc"><div class=" css-11zaw7c-TabView e5i1odf0"><div type="default" class="css-jccvoy-TabViewHeader e5i1odf1"><div class="css-1lexzqe-TabHeaderContainer e5i1odf2"><div data-key="custom-testcase" type="default" class="css-1kuaqiy-TabHeader e5i1odf4"><div type="default" class="css-1l22uh0-TabHeaderRow e5i1odf3"><span>Testcase</span></div></div><div data-key="runcode-result" type="default" class="css-qndcpp-TabHeader e5i1odf4"><div type="default" class="css-1l22uh0-TabHeaderRow e5i1odf3"><span>Run Code Result</span></div></div></div></div><div data-key="custom-testcase-content" class=" css-h57g4r-TabContent e5i1odf5"><div class="container__MmrB"><div class="viewer__2TRr"><span>Tree Visualizer</span><label class="css-yp69yr-xs"><input type="checkbox" class="css-o6r3zy-Input e5i1odf0"><div class="css-1t40yk7-Children e5i1odf1"></div></label></div><div class="editor-container__QkHu"><div id="testcase-editor" class=" ace_editor ace-github testcase-editor__3Tbb" style="width: 100%; height: 100%;"><textarea class="ace_text-input" wrap="off" autocorrect="off" autocapitalize="off" spellcheck="false" style="opacity: 0;"></textarea><div class="ace_gutter" aria-hidden="true" style="display: none;"><div class="ace_layer ace_gutter-layer ace_folding-enabled"></div><div class="ace_gutter-active-line"></div></div><div class="ace_scroller"><div class="ace_content"><div class="ace_layer ace_print-margin-layer"><div class="ace_print-margin" style="left: 4px; visibility: hidden;"></div></div><div class="ace_layer ace_marker-layer"></div><div class="ace_layer ace_text-layer" style="padding: 0px 4px;"></div><div class="ace_layer ace_marker-layer"></div><div class="ace_layer ace_cursor-layer ace_hidden-cursors"><div class="ace_cursor"></div></div></div></div><div class="ace_scrollbar ace_scrollbar-v" style="display: none; width: 15px;"><div class="ace_scrollbar-inner" style="width: 15px;"></div></div><div class="ace_scrollbar ace_scrollbar-h" style="display: none; height: 15px;"><div class="ace_scrollbar-inner" style="height: 15px;"></div></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: hidden;"><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: visible;"></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: visible;">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</div></div></div></div></div></div><div data-key="runcode-result-content" class=" css-s9svfs-TabContent e5i1odf5"><div class="container__3Hq1" style=""><div class="finished-container__cjMh"><div class="runtime-wrapper__3iB_"><div class="runtime-info__k1AW"><div class="finished__Zi5m">Finished</div><div class="runtime__lWEn">Runtime: 1 ms</div></div><div class="info-icon__3dGr"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M11 18h2v-2h-2v2zm1-16C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm0-14c-2.21 0-4 1.79-4 4h2c0-1.1.9-2 2-2s2 .9 2 2c0 2-3 1.75-3 5h2c0-2.25 3-2.5 3-5 0-2.21-1.79-4-4-4z"></path></svg></div></div><div class="css-n2wnd7-RowContainer e5i1odf0"><div width="90" class="css-j7wj5p-Field e5i1odf1">Your input</div><div class="css-1gzlqzt-ValueContainer e5i1odf3"><div class="css-1xxe3s-Value e5i1odf2">[3,9,20,null,null,15,7]<br></div></div></div><div class="css-n2wnd7-RowContainer e5i1odf0"><div class="css-j7wj5p-Field e5i1odf1">Output</div><div class="css-1gzlqzt-ValueContainer e5i1odf3"><div class="css-1xxe3s-Value e5i1odf2">3<br></div></div><label class="e5i1odf6 css-10vz3an-sm-StyledSwitch"><input type="checkbox" class="css-o6r3zy-Input e5i1odf0"><div class="css-1iqccza-Children e5i1odf1">Diff</div></label></div><div class="css-n2wnd7-RowContainer e5i1odf0"><div class="css-j7wj5p-Field e5i1odf1">Expected</div><div class="css-1gzlqzt-ValueContainer e5i1odf3"><div class="css-1xxe3s-Value e5i1odf2">3<br></div></div></div></div></div></div></div></div><div class="icon-wrapper__2q8n close-icon__3nBt"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M12 8l-6 6 1.41 1.41L12 10.83l4.59 4.58L18 14z"></path></svg></div></div></div></div><div class="container__2WTi" data-size="lg" style="position: relative;"><div class="func__1DsC"><button type="button" class="custom-testcase__2ah7">Console <svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M7 14l5-5 5 5z"></path></svg></button><a class="ant-dropdown-link ant-dropdown-trigger"><div class="content__R0nn">How to create a testcase <svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M7 10l5 5 5-5z"></path></svg></div></a></div><div class="action__38Xc"><button class="runcode__1EDI css-y98m8o-sm" type="primary"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><defs><path id="play-arrow_svg__a" d="M8 5v14l11-7z"></path><mask id="play-arrow_svg__b"><use fill-rule="evenodd" xlink:href="#play-arrow_svg__a"></use></mask></defs><g fill-rule="evenodd"><use xlink:href="#play-arrow_svg__a"></use><g fill-rule="nonzero" mask="url(#play-arrow_svg__b)"><path d="M0 0h24v24H0z"></path></g></g></svg><span class="css-1km43m6-BtnContent e5i1odf0">Run Code</span></button><button type="primary" class="submit__2ISl css-gahzfj-sm"><span class="css-1km43m6-BtnContent e5i1odf0">Submit</span></button></div><div class="erd_scroll_detection_container erd_scroll_detection_container_animation_active" style="visibility: hidden; display: inline; width: 0px; height: 0px; z-index: -1; overflow: hidden; margin: 0px; padding: 0px;"><div dir="ltr" class="erd_scroll_detection_container" style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; width: 100%; height: 100%; left: 0px; top: 0px;"><div class="erd_scroll_detection_container" style="position: absolute; flex: 0 0 auto; overflow: hidden; z-index: -1; visibility: hidden; left: -11px; top: -11px; right: -10px; bottom: -10px;"><div style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;"><div style="position: absolute; left: 0px; top: 0px; width: 1491px; height: 83px;"></div></div><div style="position: absolute; flex: 0 0 auto; overflow: scroll; z-index: -1; visibility: hidden; width: 100%; height: 100%;"><div style="position: absolute; width: 200%; height: 200%;"></div></div></div></div></div></div></div></div></div></div><div class="note-btn__uLJR"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M4 8l6-6h8c1.1 0 2 .9 2 2v16c0 1.1-.89 2-1.99 2H6c-1.1 0-2-.9-2-2V8zm14.01 12V4H11v5H6v11h12.01z"></path></svg></div><div class="note__1Qo7" status="exited"><div class="notewrap__eHkN"><div id="simplepostmd-editor-1-wrapper"><textarea id="simplepostmd-editor-1" style="display: none;"></textarea><div class="editor-toolbar"><a title="Bold (Ctrl-B)" tabindex="-1" class="fa fa-bold"></a><a title="Italic (Ctrl-I)" tabindex="-1" class="fa fa-italic"></a><a title="Heading (Ctrl-H)" tabindex="-1" class="fa fa-header"></a><i class="separator">|</i><a title="Code (Ctrl-Alt-C)" tabindex="-1" class="fa fa-code"></a><a title="Generic List (Ctrl-L)" tabindex="-1" class="fa fa-list-ul"></a><a title="Numbered List (Ctrl-Alt-L)" tabindex="-1" class="fa fa-list-ol"></a><i class="separator">|</i><a title="Create Link (Ctrl-K)" tabindex="-1" class="fa fa-link"></a><a title="Insert Image (Ctrl-Alt-I)" tabindex="-1" class="fa fa-picture-o"></a><i class="separator">|</i><a title="Toggle Preview (Ctrl-P)" tabindex="-1" class="fa fa-eye no-disable"></a></div><div class="CodeMirror cm-s-paper CodeMirror-wrap CodeMirror-empty"><div style="overflow: hidden; position: relative; width: 3px; height: 0px; top: 14.9827px; left: 14.9827px;"><textarea autocorrect="off" autocapitalize="off" spellcheck="false" style="position: absolute; bottom: -1em; padding: 0px; width: 1000px; height: 1em; outline: none;" tabindex="0"></textarea></div><div class="CodeMirror-vscrollbar" cm-not-content="true"><div style="min-width: 1px; height: 0px;"></div></div><div class="CodeMirror-hscrollbar" cm-not-content="true"><div style="height: 100%; min-height: 1px; width: 0px;"></div></div><div class="CodeMirror-scrollbar-filler" cm-not-content="true"></div><div class="CodeMirror-gutter-filler" cm-not-content="true"></div><div class="CodeMirror-scroll" tabindex="-1"><div class="CodeMirror-sizer" style="margin-left: 0px; margin-bottom: -10px; border-right-width: 20px; min-height: 28px; padding-right: 0px; padding-bottom: 0px;"><div style="position: relative; top: 0px;"><div class="CodeMirror-lines" role="presentation"><div role="presentation" style="position: relative; outline: none;"><pre class="CodeMirror-placeholder" style="height: 0px; overflow: visible;">Type here...(Markdown is enabled)</pre><div class="CodeMirror-measure"></div><div class="CodeMirror-measure"></div><div style="position: relative; z-index: 1;"></div><div class="CodeMirror-cursors"><div class="CodeMirror-cursor" style="left: 3.99316px; top: 0px; height: 20px;">&nbsp;</div></div><div class="CodeMirror-code" role="presentation"><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre></div></div></div></div></div><div style="position: absolute; height: 20px; width: 1px; border-bottom: 0px solid transparent; top: 28px;"></div><div class="CodeMirror-gutters" style="display: none; height: 48px;"></div></div></div><div class="editor-preview-side"></div></div><div class="close__3tsT"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z"></path></svg></div><div class="savedmsg__FYRn" data-status="false">Saved</div></div></div></div></div></div>

<script>
  // Clean it after removing loading placeholder from this file.
  window.prerenderReady = false;
</script>

    <script type="text/javascript" src="./104-Maximum-Depth-of-Binary-Tree_files/runtime.aebc1ca4f.js.download"></script>
    <script type="text/javascript" src="./104-Maximum-Depth-of-Binary-Tree_files/global.e6867971d.js.download"></script>
    <script type="text/javascript" src="./104-Maximum-Depth-of-Binary-Tree_files/index.15e5c5dae.js.download"></script>
    <script type="text/javascript" src="./104-Maximum-Depth-of-Binary-Tree_files/index.eaf9bb617.js.download"></script>
    <script type="text/javascript" src="./104-Maximum-Depth-of-Binary-Tree_files/vendor-libs.59ae472fc.js.download"></script>
    <script type="text/javascript" src="./104-Maximum-Depth-of-Binary-Tree_files/common-libs.5ed8e0e43.js.download"></script>
    <script type="text/javascript" src="./104-Maximum-Depth-of-Binary-Tree_files/new-libs.91128f9db.js.download"></script>

    

    

<script type="text/javascript" src="./104-Maximum-Depth-of-Binary-Tree_files/desktop.e150f3953.js.download"></script><div></div><div></div>



    
      <script type="text/javascript">
    var URL = 'https://leetcode.com/discuss/compensation/';
    var CONTENT = '🎁Got an offer? 💰';

    function getHashCode(str) {
        var hash = 0, i, chr;
        if (str.length === 0) return hash;
        for (i = 0; i < str.length; i++) {
            chr = str.charCodeAt(i);
            hash = ((hash << 5) - hash) + chr;
            hash |= 0;
        }
        return hash;
    }

    var LOCAL_STORAGE_KEY = 'feedback-tab:' + getHashCode(URL + CONTENT);
    var CLOSE_BUTTON_CLICKED = false;

    var CLOSE_BUTTON_HTML = '\
        <?xml version="1.0" encoding="UTF-8"?>\
        <svg id="close-icon-svg" width="24px" height="24px" viewBox="0 0 24 24" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">\
            <title>icon/close</title>\
            <defs></defs>\
            <g id="close-icon" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">\
                <polygon id="path-1" points="19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12"></polygon>\
            </g>\
        </svg>\
    ';

    function onClickClose(e) {
        e.preventDefault();
        document.querySelector('.feedback-anchor').classList.add('feedback-anchor-closing');
        window.localStorage.setItem(LOCAL_STORAGE_KEY, Date.now());
        CLOSE_BUTTON_CLICKED = true;
    }

    function onTransitionEnd(event) {
        if (event.target && CLOSE_BUTTON_CLICKED && event.propertyName === 'opacity') {
            event.target.remove();
        }
    }

    function createFeedbackTab() {
        var closeButton = document.createElement('span');
        closeButton.classList.add('feedback-tab-close-button');
        closeButton.innerHTML = CLOSE_BUTTON_HTML;
        closeButton.addEventListener('click', onClickClose);

        var feedbackTabContent = document.createElement('span');
        feedbackTabContent.innerHTML = CONTENT;

        var feedbackTab = document.createElement('div');
        feedbackTab.classList.add('feedback-tab');

        feedbackTab.appendChild(feedbackTabContent);
        feedbackTab.appendChild(closeButton);

        var feedbackAnchor = document.createElement('a');
        feedbackAnchor.classList.add('feedback-anchor');
        feedbackAnchor.setAttribute('href', URL);
        feedbackAnchor.setAttribute('target', '_blank');
        feedbackAnchor.appendChild(feedbackTab);
        feedbackAnchor.addEventListener('transitionend', onTransitionEnd);
        return feedbackAnchor;
    }

    function insertFeedbackTab() {
        var feedbackTab = createFeedbackTab();
        var navbarRightContainer = document.getElementById('navbar-right-container');
        if (navbarRightContainer) {
            navbarRightContainer.insertBefore(feedbackTab, navbarRightContainer.firstChild);
        }
    }

    window.onload = function() {
        if (!window.localStorage.getItem(LOCAL_STORAGE_KEY)) {
            setTimeout(insertFeedbackTab, 500);
        }
    }
</script>

<style>
    .feedback-tab {
        position: absolute;
        display: flex;
        align-items: center;
        top: 0px;
        right: 270px;
        background-color: #455a64;
        color: white;
        opacity: 0.6;
        border-radius: 0 0 3px 3px;
        padding: 5px 10px;
        cursor: pointer;
        z-index: 2;
        transition: all 0.3s ease-in-out;
    }
    .feedback-tab:hover {
        opacity: 1;
    }
    .feedback-tab-close-button {
        margin-left: 5px;
        height: 1em;
        width: 1em;
        display: inline-flex;
        align-items: center;
        justify-content: center;
    }
    .feedback-anchor:focus {
        text-decoration: none;
    }
    .feedback-anchor-closing {
        opacity: 0;
        transition: opacity 0.3s ease-in-out;
    }
    #close-icon-svg {
        opacity: 0.5;
        transition: all 0.3s ease-in-out;
    }
    #close-icon-svg:hover {
        opacity: 1;
    }
    #close-icon {
        fill: white;
    }
</style>
    
  

<div><div class="ant-message"><span></span></div></div><div class="global-clipboard-container"><div data-clipboard-text=""></div></div><div style="position: absolute; top: 0px; left: 0px; width: 100%;"><div><div class="ant-dropdown bright-nav-dropdown__l6zI nav-dropdown__3ybW ant-dropdown-placement-bottomLeft  ant-dropdown-hidden" style="left: 498.552px; top: 45.375px;"><ul class="ant-dropdown-menu ant-dropdown-menu-light ant-dropdown-menu-root ant-dropdown-menu-vertical" role="menu" tabindex="0"><li class="ant-dropdown-menu-item" role="menuitem"><a href="https://leetcode.com/store/">Redeem</a></li><li class="ant-dropdown-menu-item" role="menuitem"><a href="https://leetcode.com/subscribe/">Premium</a></li><li class="ant-dropdown-menu-item" role="menuitem"><a href="https://leetcode.com/book/">Book</a></li></ul></div></div></div><div class="question-picker-detail__Rehh"><div class="question-picker-mask__396x hide__3nyv"><div id="question-picker-exit-e2e" class="css-1gc50yq-ExitPickerE2e e5i1odf0"></div></div><div class="question-picker-detail-menu__1-eB hide___lrv" id="question-picker-container"><div class="question-picker-toolbar-wrapper__d-2J"><div class="picker-toolbar__rvrv" data-tour-index="3"><div class="list-filter__2u_1"><span><span class="list-filter-selected__3kA9" title="All Problems">All Problems</span><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 list-filter-icon__Icmo"><path fill-rule="evenodd" d="M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z"></path></svg></span></div><div class="handlers__ilNW"><span class="wrapper__3PJ4 sm__smpp dark__2glv picker-toolbar-search__1aUG"><span class="wrapper__3yGD sm__YB7w searchinput__3xUp"><input class="input__2W4f dark__37E4" placeholder="search problems"></span><span class="search__1Rtr"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M15.5 14h-.79l-.28-.27A6.471 6.471 0 0 0 16 9.5 6.5 6.5 0 1 0 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"></path></svg></span></span><div class="space__2UuM"></div><button class="btn__1eiM btn-sm__Woog dark__3bsK false" data-no-border="false" id="question-picker-filter-toggle-btn"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M10.707 9.293A1 1 0 0 1 11 10v7H9v-6.586L4.293 5.707C3.663 5.077 4.109 4 5 4h14c.89 0 1.337 1.077.707 1.707L15 10.414V21h-2V10a1 1 0 0 1 .293-.707L16.586 6H7.414l3.293 3.293z"></path></svg></div></button><div class="space__2UuM"></div><div class="picker-toolbar-select__2ww1 select-container__2w2b"><div class="select__2rIJ select-sm__zeQ4 ant-select-dark ant-select-sm ant-select-selected ant-select ant-select-enabled"><div class="ant-select-selection
            ant-select-selection--single" role="combobox" aria-autocomplete="list" aria-haspopup="true" aria-controls="6f0db225-c061-4f55-a5cc-97ce0fdb8a82" aria-expanded="false" tabindex="0"><div class="ant-select-selection__rendered"><div unselectable="on" class="ant-select-selection__placeholder" style="display: none; user-select: none;">Select...</div><div class="ant-select-selection-selected-value" title="" style="display: block; opacity: 1;">3</div></div><span class="ant-select-arrow" unselectable="on" style="user-select: none;"><i aria-label="icon: down" class="anticon anticon-down ant-select-arrow-icon"><svg viewBox="64 64 896 896" class="" data-icon="down" width="1em" height="1em" fill="currentColor" aria-hidden="true"><path d="M884 256h-75c-5.1 0-9.9 2.5-12.9 6.6L512 654.2 227.9 262.6c-3-4.1-7.8-6.6-12.9-6.6h-75c-6.5 0-10.3 7.4-6.5 12.7l352.6 486.1c12.8 17.6 39 17.6 51.7 0l352.6-486.1c3.9-5.3.1-12.7-6.4-12.7z"></path></svg></i></span></div></div></div><div class="space__2UuM"></div><button class="btn__1eiM btn-sm__Woog dark__3bsK " data-no-border="false"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12z"></path></svg></div></button><div class="space__2UuM"></div><button class="btn__1eiM btn-sm__Woog dark__3bsK " data-no-border="false"><div class="btn-content-container__214G"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg></div></button></div></div></div><div class="question-picker-questions-wrapper__2JGX"><div class="lc-theme-dark scroll-wrapper__2yA1" style="position: relative;"><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; width: 660px; height: 947px;"></div></div><div style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; z-index: -1; visibility: hidden;"><div style="position: absolute; left: 0px; top: 0px; width: 200%; height: 200%;"></div></div></div><div class="scroll-inner-wrapper__2apK" style="height: 937px; width: 650px;"><div class="scrollbar-container ps ps--active-y"><div class="scroll-content__1y8T"><div class="question-list__3ytE"><div class="question__1Nd3" data-title-slug="symmetric-tree" data-question-id="101" data-paid-only="false" title="symmetric-tree"><div class="question-row-left__DzOu"><span class="question-status__2HIo"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 question-row-icon__1x3B"><path fill-rule="evenodd" d="M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4z"></path></svg></span><span>#101 Symmetric Tree</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="binary-tree-level-order-traversal" data-question-id="102" data-paid-only="false" title="binary-tree-level-order-traversal"><div class="question-row-left__DzOu"><span class="question-status__2HIo"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 question-row-icon__1x3B"><path fill-rule="evenodd" d="M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4z"></path></svg></span><span>#102 Binary Tree Level Order Traversal</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="binary-tree-zigzag-level-order-traversal" data-question-id="103" data-paid-only="false" title="binary-tree-zigzag-level-order-traversal"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#103 Binary Tree Zigzag Level Order Traversal</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3 active__iWA5" data-title-slug="maximum-depth-of-binary-tree" data-question-id="104" data-paid-only="false" title="maximum-depth-of-binary-tree"><div class="question-row-left__DzOu"><span class="question-status__2HIo"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 question-row-icon__1x3B"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg></span><span>#104 Maximum Depth of Binary Tree</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="construct-binary-tree-from-preorder-and-inorder-traversal" data-question-id="105" data-paid-only="false" title="construct-binary-tree-from-preorder-and-inorder-traversal"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#105 Construct Binary Tree from Preorder and Inorder Traversal</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="construct-binary-tree-from-inorder-and-postorder-traversal" data-question-id="106" data-paid-only="false" title="construct-binary-tree-from-inorder-and-postorder-traversal"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#106 Construct Binary Tree from Inorder and Postorder Traversal</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="binary-tree-level-order-traversal-ii" data-question-id="107" data-paid-only="false" title="binary-tree-level-order-traversal-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#107 Binary Tree Level Order Traversal II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="convert-sorted-array-to-binary-search-tree" data-question-id="108" data-paid-only="false" title="convert-sorted-array-to-binary-search-tree"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#108 Convert Sorted Array to Binary Search Tree</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="convert-sorted-list-to-binary-search-tree" data-question-id="109" data-paid-only="false" title="convert-sorted-list-to-binary-search-tree"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#109 Convert Sorted List to Binary Search Tree</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="balanced-binary-tree" data-question-id="110" data-paid-only="false" title="balanced-binary-tree"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#110 Balanced Binary Tree</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="minimum-depth-of-binary-tree" data-question-id="111" data-paid-only="false" title="minimum-depth-of-binary-tree"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#111 Minimum Depth of Binary Tree</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="path-sum" data-question-id="112" data-paid-only="false" title="path-sum"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#112 Path Sum</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="path-sum-ii" data-question-id="113" data-paid-only="false" title="path-sum-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#113 Path Sum II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="flatten-binary-tree-to-linked-list" data-question-id="114" data-paid-only="false" title="flatten-binary-tree-to-linked-list"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#114 Flatten Binary Tree to Linked List</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="distinct-subsequences" data-question-id="115" data-paid-only="false" title="distinct-subsequences"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#115 Distinct Subsequences</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="populating-next-right-pointers-in-each-node" data-question-id="116" data-paid-only="false" title="populating-next-right-pointers-in-each-node"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#116 Populating Next Right Pointers in Each Node</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="populating-next-right-pointers-in-each-node-ii" data-question-id="117" data-paid-only="false" title="populating-next-right-pointers-in-each-node-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#117 Populating Next Right Pointers in Each Node II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="pascals-triangle" data-question-id="118" data-paid-only="false" title="pascals-triangle"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#118 Pascal's Triangle</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="pascals-triangle-ii" data-question-id="119" data-paid-only="false" title="pascals-triangle-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#119 Pascal's Triangle II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="triangle" data-question-id="120" data-paid-only="false" title="triangle"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#120 Triangle</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="best-time-to-buy-and-sell-stock" data-question-id="121" data-paid-only="false" title="best-time-to-buy-and-sell-stock"><div class="question-row-left__DzOu"><span class="question-status__2HIo"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 question-row-icon__1x3B"><path fill-rule="evenodd" d="M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4z"></path></svg></span><span>#121 Best Time to Buy and Sell Stock</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="best-time-to-buy-and-sell-stock-ii" data-question-id="122" data-paid-only="false" title="best-time-to-buy-and-sell-stock-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 question-row-icon__1x3B"><path fill-rule="evenodd" d="M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4z"></path></svg></span><span>#122 Best Time to Buy and Sell Stock II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="best-time-to-buy-and-sell-stock-iii" data-question-id="123" data-paid-only="false" title="best-time-to-buy-and-sell-stock-iii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#123 Best Time to Buy and Sell Stock III</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="binary-tree-maximum-path-sum" data-question-id="124" data-paid-only="false" title="binary-tree-maximum-path-sum"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#124 Binary Tree Maximum Path Sum</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="valid-palindrome" data-question-id="125" data-paid-only="false" title="valid-palindrome"><div class="question-row-left__DzOu"><span class="question-status__2HIo"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 question-row-icon__1x3B"><path fill-rule="evenodd" d="M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4z"></path></svg></span><span>#125 Valid Palindrome</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="word-ladder-ii" data-question-id="126" data-paid-only="false" title="word-ladder-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#126 Word Ladder II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="word-ladder" data-question-id="127" data-paid-only="false" title="word-ladder"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#127 Word Ladder</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="longest-consecutive-sequence" data-question-id="128" data-paid-only="false" title="longest-consecutive-sequence"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#128 Longest Consecutive Sequence</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="sum-root-to-leaf-numbers" data-question-id="129" data-paid-only="false" title="sum-root-to-leaf-numbers"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#129 Sum Root to Leaf Numbers</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="surrounded-regions" data-question-id="130" data-paid-only="false" title="surrounded-regions"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#130 Surrounded Regions</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="palindrome-partitioning" data-question-id="131" data-paid-only="false" title="palindrome-partitioning"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#131 Palindrome Partitioning</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="palindrome-partitioning-ii" data-question-id="132" data-paid-only="false" title="palindrome-partitioning-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#132 Palindrome Partitioning II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="clone-graph" data-question-id="133" data-paid-only="false" title="clone-graph"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#133 Clone Graph</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="gas-station" data-question-id="134" data-paid-only="false" title="gas-station"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#134 Gas Station</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="candy" data-question-id="135" data-paid-only="false" title="candy"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#135 Candy</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="single-number" data-question-id="136" data-paid-only="false" title="single-number"><div class="question-row-left__DzOu"><span class="question-status__2HIo"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 question-row-icon__1x3B"><path fill-rule="evenodd" d="M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4z"></path></svg></span><span>#136 Single Number</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="single-number-ii" data-question-id="137" data-paid-only="false" title="single-number-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#137 Single Number II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="copy-list-with-random-pointer" data-question-id="138" data-paid-only="false" title="copy-list-with-random-pointer"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#138 Copy List with Random Pointer</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="word-break" data-question-id="139" data-paid-only="false" title="word-break"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#139 Word Break</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="word-break-ii" data-question-id="140" data-paid-only="false" title="word-break-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#140 Word Break II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="linked-list-cycle" data-question-id="141" data-paid-only="false" title="linked-list-cycle"><div class="question-row-left__DzOu"><span class="question-status__2HIo"><svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__3Su4 question-row-icon__1x3B"><path fill-rule="evenodd" d="M9 16.2L4.8 12l-1.4 1.4L9 19 21 7l-1.4-1.4z"></path></svg></span><span>#141 Linked List Cycle</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Easy</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="linked-list-cycle-ii" data-question-id="142" data-paid-only="false" title="linked-list-cycle-ii"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#142 Linked List Cycle II</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="reorder-list" data-question-id="143" data-paid-only="false" title="reorder-list"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#143 Reorder List</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="binary-tree-preorder-traversal" data-question-id="144" data-paid-only="false" title="binary-tree-preorder-traversal"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#144 Binary Tree Preorder Traversal</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="binary-tree-postorder-traversal" data-question-id="145" data-paid-only="false" title="binary-tree-postorder-traversal"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#145 Binary Tree Postorder Traversal</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="lru-cache" data-question-id="146" data-paid-only="false" title="lru-cache"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#146 LRU Cache</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="insertion-sort-list" data-question-id="147" data-paid-only="false" title="insertion-sort-list"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#147 Insertion Sort List</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="sort-list" data-question-id="148" data-paid-only="false" title="sort-list"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#148 Sort List</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="max-points-on-a-line" data-question-id="149" data-paid-only="false" title="max-points-on-a-line"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#149 Max Points on a Line</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Hard</span><span class="paid-only-status__3tei"></span></div></div><div class="question__1Nd3" data-title-slug="evaluate-reverse-polish-notation" data-question-id="150" data-paid-only="false" title="evaluate-reverse-polish-notation"><div class="question-row-left__DzOu"><span class="question-status__2HIo"></span><span>#150 Evaluate Reverse Polish Notation</span></div><div class="question-row-right__21IS"><span data-question-picker-list-question-difficulty="true">Medium</span><span class="paid-only-status__3tei"></span></div></div></div></div><div class="ps__rail-x" style="left: 0px; bottom: 0px;"><div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div></div><div class="ps__rail-y" style="top: 0px; right: 0px; height: 937px;"><div class="ps__thumb-y" tabindex="0" style="top: 0px; height: 485px;"></div></div></div></div></div></div></div></div></body></html>