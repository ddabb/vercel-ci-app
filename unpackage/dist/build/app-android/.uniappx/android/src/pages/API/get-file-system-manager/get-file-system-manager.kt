@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNIFB90797;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.unicloud.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.env as uni_env;
import io.dcloud.uniapp.extapi.getFileSystemManager as uni_getFileSystemManager;
open class GenPagesAPIGetFileSystemManagerGetFileSystemManager : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLoad(fun(_: OnLoadOptions) {
            stat_instance.onLoad(this);
        }
        , __ins);
        onPageShow(fun() {
            stat_instance.onShow(this);
        }
        , __ins);
        onPageHide(fun() {
            stat_instance.onHide(this);
        }
        , __ins);
        onUnload(fun() {
            stat_instance.onUnload(this);
        }
        , __ins);
        onLoad(fun(_: OnLoadOptions) {}, __ins);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode(Fragment, null, utsArrayOf(
            createElementVNode("text", null, "显示简易操作日志(可滚动查看),详细日志需真机运行查看"),
            createElementVNode("button", utsMapOf("size" to "mini", "onClick" to fun(){
                _ctx.log = "";
            }
            ), "清空日志", 8, utsArrayOf(
                "onClick"
            )),
            createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("max-height" to "300px"))), utsArrayOf(
                createElementVNode("text", utsMapOf("style" to normalizeStyle(utsMapOf("margin" to "2px", "padding" to "2px", "border" to "1px solid #000000"))), toDisplayString(_ctx.log), 5)
            ), 4),
            createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.statFileInfoTest, "id" to "btn-stat-file"), "递归获取目录files的Stats对象" + toDisplayString(_ctx.statFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.mkdirTest, "id" to "btn-mkdir"), "创建文件夹" + toDisplayString(_ctx.mkdirFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.writeFileTest, "id" to "btn-write-file"), "覆盖写入文件" + toDisplayString(_ctx.writeFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.readDirTest, "id" to "btn-read-dir"), "读取文件夹" + toDisplayString(_ctx.readDir), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.readFileTest, "id" to "btn-read-file"), "读取文件" + toDisplayString(_ctx.readFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.copyFileTest, "id" to "btn-copy-file"), "复制文件" + toDisplayString(_ctx.copyFromFile) + "到" + toDisplayString(_ctx.copyToFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.renameFileTest, "id" to "btn-rename-file"), "重命名文件" + toDisplayString(_ctx.renameFromFile) + "到" + toDisplayString(_ctx.renameToFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.accessFileTest, "id" to "btn-access-file"), "判断文件" + toDisplayString(_ctx.accessFile) + "是否存在", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.getFileInfoTest, "id" to "btn-get-file-info"), "获取文件信息" + toDisplayString(_ctx.getFileInfoFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.unlinkTest, "id" to "btn-unlink-file"), "删除文件" + toDisplayString(_ctx.unlinkFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.copyStaticToFilesTest, "id" to "btn-copyStatic-file"), "从static目录复制文件到a目录", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.unlinkAllFileTest, "id" to "btn-clear-file"), "删除文件夹" + toDisplayString(_ctx.rmDirFile) + "下的所有文件", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.rmdirTest, "id" to "btn-remove-dir"), "删除文件夹" + toDisplayString(_ctx.rmDirFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.statFileInfoSyncTest, "id" to "btn-stat-file-sync"), "同步递归获取目录files的Stats对象" + toDisplayString(_ctx.statFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.appendFileTest, "id" to "btn-append-file"), "在文件" + toDisplayString(_ctx.readFile) + "结尾追加内容", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.appendFileSyncTest, "id" to "btn-append-file-sync"), "同步在文件" + toDisplayString(_ctx.readFile) + "结尾追加内容", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.writeFileSyncTest, "id" to "btn-write-file-sync"), "同步覆盖写入文件" + toDisplayString(_ctx.writeFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.readFileSyncTest, "id" to "btn-read-file-sync"), "同步读取文件" + toDisplayString(_ctx.readFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.unlinkSyncTest, "id" to "btn-unlink-file-sync"), "同步删除文件" + toDisplayString(_ctx.unlinkFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.mkdirSyncTest, "id" to "btn-mkdir-sync"), "同步创建文件夹" + toDisplayString(_ctx.mkdirFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.rmdirSyncTest, "id" to "btn-remove-dir-sync"), "同步删除文件夹" + toDisplayString(_ctx.rmDirFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.readDirSyncTest, "id" to "btn-read-dir-sync"), "同步读取文件夹" + toDisplayString(_ctx.readDir), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.accessFileSyncTest, "id" to "btn-access-file-sync"), "同步判断文件" + toDisplayString(_ctx.accessFile) + "是否存在", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.renameFileSync, "id" to "btn-rename-file-sync"), "同步重命名文件" + toDisplayString(_ctx.renameFromFile) + "到" + toDisplayString(_ctx.renameToFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.copyFileSyncTest, "id" to "btn-copy-file-sync"), "同步复制文件" + toDisplayString(_ctx.copyFromFile) + "到" + toDisplayString(_ctx.copyToFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.saveFileTest, "id" to "btn-save-file"), "保存临时文件到本地", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.saveFileSyncTest, "id" to "btn-save-file-sync"), "同步保存临时文件到本地", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.removeSavedFileTest, "id" to "btn-remove-saved-file"), "删除已保存的本地文件", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.unzipFileTest, "id" to "btn-unzip-file-sync"), "解压文件", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.getSavedFileListTest, "id" to "btn-getsaved-filelist"), "获取该已保存的本地缓存文件列表", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.truncateFileTest, "id" to "btn-truncate-file"), "对文件" + toDisplayString(_ctx.writeFile) + "内容进行截断操作", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.truncateFileSyncTest, "id" to "btn-truncate-file-sync"), "同步对文件" + toDisplayString(_ctx.writeFile) + "内容进行截断操作", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.readCompressedFileTest, "id" to "btn-compressed-file"), "读取指定压缩类型的本地文件内容", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.readCompressedFileSyncTest, "id" to "btn-compressed-file-sync"), "同步读取指定压缩类型的本地文件内容", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.openFileTest, "id" to "btn-open-file"), "打开文件" + toDisplayString(_ctx.readFile) + "，返回描述符", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to fun(){
                    _ctx.openFileSyncTest("r", true);
                }
                , "id" to "btn-open-file-sync"), "同步打开文件" + toDisplayString(_ctx.readFile) + "，返回描述符", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.closeTest, "id" to "btn-close-file"), "通过文件描述符关闭文件" + toDisplayString(_ctx.readFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.closeSyncTest, "id" to "btn-close-file-sync"), "通过文件描述符同步关闭文件" + toDisplayString(_ctx.readFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.writeTest, "id" to "btn-write"), "通过文件描述符写入文件" + toDisplayString(_ctx.readFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.writeSyncTest, "id" to "btn-write-sync"), "同步通过文件描述符写入文件" + toDisplayString(_ctx.readFile), 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.fstatTest, "id" to "btn-fstat-file"), "通过文件描述符获取" + toDisplayString(_ctx.statFile) + "的状态信息", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.fstatSyncTest, "id" to "btn-fstat-file-sync"), "同步通过文件描述符获取" + toDisplayString(_ctx.statFile) + "的状态信息", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.ftruncateFileTest, "id" to "btn-ftruncate-file"), "通过文件描述符对文件" + toDisplayString(_ctx.writeFile) + "内容进行截断", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.ftruncateFileSyncTest, "id" to "btn-ftruncate-file-sync"), "同步通过文件描述符对文件" + toDisplayString(_ctx.writeFile) + "内容进行截断", 9, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.readZipEntry, "id" to "btn-readzip-entry"), "读取压缩包内的文件", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.testWriteReadFileBuffer, "id" to "btn-writereadfile-buffer"), "写入/读取 ArrayBuffer", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.testWriteReadFileSyncBuffer, "id" to "btn-writereadfilesync-buffer"), "同步写入/读取 ArrayBuffer", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.testWriteReadBuffer, "id" to "btn-writeread-buffer"), "通过文件描述符写入/读取 ArrayBuffer", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.testWriteReadSyncBuffer, "id" to "btn-writereadsync-buffer"), "通过文件描述符同步写入/读取 ArrayBuffer", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.testAppendFileBuffer, "id" to "btn-appendfile-buffer"), "在文件末尾追加 ArrayBuffer", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("button", utsMapOf("class" to "btnstyle", "type" to "primary", "onClick" to _ctx.testAppendFileBufferSync, "id" to "btn-appendfilesync-buffer"), "同步在文件末尾追加 ArrayBuffer", 8, utsArrayOf(
                    "onClick"
                )),
                createElementVNode("view", utsMapOf("style" to normalizeStyle(utsMapOf("height" to "4px"))), null, 4)
            ), 4)
        ), 64);
    }
    open var log: String by `$data`;
    open var logAble: Boolean by `$data`;
    open var fileListSuccess: UTSArray<String> by `$data`;
    open var fileListComplete: UTSArray<String> by `$data`;
    open var accessFileRet: String by `$data`;
    open var lastFailError: UniError by `$data`;
    open var lastCompleteError: UniError by `$data`;
    open var readDir: String by `$data`;
    open var readFileRet: String by `$data`;
    open var writeFileContent: String by `$data`;
    open var appendFileContent: String by `$data`;
    open var getFileInfoAlgorithm: String by `$data`;
    open var getFileInfoSize: Number by `$data`;
    open var getFileInfoDigest: String by `$data`;
    open var unlinkFile: String by `$data`;
    open var accessFile: String by `$data`;
    open var writeFile: String by `$data`;
    open var writeData: String by `$data`;
    open var brFile: String by `$data`;
    open var temFile: String by `$data`;
    open var copyFromFile: String by `$data`;
    open var copyToFile: String by `$data`;
    open var renameFromFile: String by `$data`;
    open var renameToFile: String by `$data`;
    open var getFileInfoFile: String by `$data`;
    open var statFile: String by `$data`;
    open var rmDirFile: String by `$data`;
    open var mkdirFile: String by `$data`;
    open var readFile: String by `$data`;
    open var recursiveVal: Boolean by `$data`;
    open var done: Boolean by `$data`;
    open var writeFileEncoding: String by `$data`;
    open var readFileEncoding: String by `$data`;
    open var statsRet: UTSArray<FileStats> by `$data`;
    open var unzipFile: String by `$data`;
    open var targetZip: String by `$data`;
    open var renameFileRet: String by `$data`;
    open var saveFileRet: String by `$data`;
    open var removeSavedFileRet: String by `$data`;
    open var fd: String by `$data`;
    open var closeFileRet: String by `$data`;
    open var bytesWritten: Number by `$data`;
    open var fstat: Stats? by `$data`;
    open var ftruncateRet: String by `$data`;
    open var readZipFile: String by `$data`;
    open var getSavedFileListRet: String by `$data`;
    open var arrayBufferRes: Number by `$data`;
    open var basePath: Any? by `$data`;
    open var copyToBasePath: Any? by `$data`;
    open var globalTempPath: Any? by `$data`;
    open var globalRootPath: Any? by `$data`;
    open var globalUserDataPath: Any? by `$data`;
    @Suppress("USELESS_CAST")
    override fun data(): Map<String, Any?> {
        return utsMapOf("log" to "", "logAble" to true, "fileListSuccess" to utsArrayOf<String>(), "fileListComplete" to utsArrayOf<String>(), "accessFileRet" to "", "lastFailError" to UniError("uni-file-manager", 1300000, "mock error"), "lastCompleteError" to UniError("uni-file-manager", 1300000, "mock error"), "readDir" to "a", "readFileRet" to "", "writeFileContent" to "中文 en.\r\n\t换行", "appendFileContent" to "append content", "getFileInfoAlgorithm" to "md5", "getFileInfoSize" to -1, "getFileInfoDigest" to "", "unlinkFile" to "a/1.txt", "accessFile" to "a/1.txt", "writeFile" to "a/1.txt", "writeData" to "insert data哈哈哈", "brFile" to "a/1.txt.br", "temFile" to "a/1.txt", "copyFromFile" to "a/1.txt", "copyToFile" to "a/2.txt", "renameFromFile" to "a/2.txt", "renameToFile" to "a/3.txt", "getFileInfoFile" to "a/1.txt", "statFile" to "", "rmDirFile" to "a", "mkdirFile" to "a", "readFile" to "a/1.txt", "recursiveVal" to true, "done" to false, "writeFileEncoding" to "utf-8", "readFileEncoding" to "utf-8", "statsRet" to utsArrayOf<FileStats>(), "unzipFile" to "zip/1.zip", "targetZip" to "unzip", "renameFileRet" to "", "saveFileRet" to "", "removeSavedFileRet" to "", "fd" to "", "closeFileRet" to "", "bytesWritten" to 0, "fstat" to null as Stats?, "ftruncateRet" to "", "readZipFile" to "to.zip", "getSavedFileListRet" to "", "arrayBufferRes" to 0, "basePath" to uni_env.USER_DATA_PATH, "copyToBasePath" to uni_env.USER_DATA_PATH, "globalTempPath" to uni_env.CACHE_PATH, "globalRootPath" to uni_env.SANDBOX_PATH, "globalUserDataPath" to uni_env.USER_DATA_PATH);
    }
    override fun `$initMethods`() {
        this.statFileInfoTest = fun(_: Any) {
            val fileManager = uni_getFileSystemManager();
            fileManager.stat(StatOptions(path = "" + this.basePath + this.statFile, recursive = this.recursiveVal, success = fun(res: StatSuccessResult){
                if (this.logAble) {
                    this.log += "statFileInfoTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("statFileInfoTest success", res);
                this.statsRet = res.stats;
                console.log("this.statsRet", this.statsRet);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "statFileInfoTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("statFileInfoTest fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("statFileInfoTest complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.getFileInfoTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.getFileInfo(GetFileInfoOptions(filePath = "" + this.basePath + this.getFileInfoFile, digestAlgorithm = this.getFileInfoAlgorithm, success = fun(res: GetFileInfoSuccessResult){
                if (this.logAble) {
                    this.log += "getFileInfoTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
                this.getFileInfoSize = res.size;
                this.getFileInfoDigest = res.digest;
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "getFileInfoTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.copyFileTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.copyFile(CopyFileOptions(srcPath = "" + this.basePath + this.copyFromFile, destPath = "" + this.copyToBasePath + this.copyToFile, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "copyFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "copyFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.renameFileTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.rename(RenameOptions(oldPath = "" + this.basePath + this.renameFromFile, newPath = "" + this.basePath + this.renameToFile, success = fun(res){
                if (this.logAble) {
                    this.log += "renameFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "renameFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                this.done = true;
                console.log("complete", res);
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.readDirTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.readdir(ReadDirOptions(dirPath = "" + this.basePath + this.readDir, success = fun(res: ReadDirSuccessResult){
                if (this.logAble) {
                    this.log += "readDirTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
                this.fileListSuccess = res.files;
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "readDirTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                } else {
                    this.fileListComplete = (res as ReadDirSuccessResult).files;
                }
            }
            ));
        }
        ;
        this.writeFileTest = fun(_: Any) {
            val fileManager = uni_getFileSystemManager();
            fileManager.writeFile(WriteFileOptions(filePath = "" + this.basePath + this.writeFile, data = this.writeFileContent, encoding = this.writeFileEncoding, success = fun(res){
                if (this.logAble) {
                    this.log += "writeFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "writeFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail");
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                this.done = true;
                console.log("complete");
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.readFileTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.readFile(ReadFileOptions(filePath = "" + this.basePath + this.readFile, encoding = this.readFileEncoding, success = fun(res: ReadFileSuccessResult){
                if (this.logAble) {
                    this.log += "readFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
                this.readFileRet = res.data.toString();
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "readFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.rmdirTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.rmdir(RmDirOptions(dirPath = "" + this.basePath + this.rmDirFile, recursive = this.recursiveVal, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "rmdirTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "rmdirTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.mkdirTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.mkdir(MkDirOptions(dirPath = "" + this.basePath + this.mkdirFile, recursive = this.recursiveVal, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "mkdirTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "mkdirTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
                this.done = true;
                console.log("complete", res);
            }
            ));
        }
        ;
        this.accessFileTest = fun() {
            this.accessFileRet = "";
            val fileManager = uni_getFileSystemManager();
            fileManager.access(AccessOptions(path = "" + this.basePath + this.accessFile, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "accessFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
                this.accessFileRet = res.errMsg;
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "accessFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
                console.log("complete", res);
                this.done = true;
            }
            ));
        }
        ;
        this.unlinkTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.unlink(UnLinkOptions(filePath = "" + this.basePath + this.unlinkFile, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "unlinkTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "unlinkTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
                console.log("complete", res);
                this.done = true;
            }
            ));
        }
        ;
        this.unlinkAllFileTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.readdir(ReadDirOptions(dirPath = "" + this.basePath + this.rmDirFile, success = fun(res: ReadDirSuccessResult){
                console.log("success to readdir", res);
                res.files.forEach(fun(element){
                    console.log(element);
                    var filePath: String;
                    if (this.rmDirFile.length <= 0) {
                        filePath = "" + this.basePath + element;
                    } else {
                        filePath = "" + this.basePath + this.rmDirFile + "/" + element;
                    }
                    fileManager.unlink(UnLinkOptions(filePath = filePath, success = fun(res: FileManagerSuccessResult){
                        if (this.logAble) {
                            this.log += "unlinkAllFileTest success:" + JSON.stringify(res) + "\n\n";
                        }
                        console.log("success unlink", res);
                    }
                    , fail = fun(res: IUniError){
                        if (this.logAble) {
                            this.log += "unlinkAllFileTest fail:" + JSON.stringify(res) + "\n\n";
                        }
                        console.log("fail unlink", res);
                        this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
                    }
                    , complete = fun(res: Any){
                        if (res is UniError) {
                            this.lastCompleteError = res;
                        }
                        console.log("complete unlink", res);
                        this.done = true;
                    }
                    ));
                }
                );
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "unlinkAllFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail to readdir", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete readdir", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                } else {
                    this.fileListComplete = (res as ReadDirSuccessResult).files;
                }
            }
            ));
        }
        ;
        this.copyStaticToFilesTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.copyFile(CopyFileOptions(srcPath = "/static/list-mock/mock.json", destPath = "" + this.copyToBasePath + "/a/mock.json", success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "copyFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "copyFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.appendFileTest = fun(_: Any) {
            val fileManager = uni_getFileSystemManager();
            fileManager.appendFile(AppendFileOptions(filePath = "" + this.basePath + this.writeFile, data = this.appendFileContent, encoding = this.writeFileEncoding, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "appendFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "appendFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail");
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                this.done = true;
                console.log("complete");
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.writeFileSyncTest = fun(_: Any) {
            try {
                val fileManager = uni_getFileSystemManager();
                fileManager.writeFileSync("" + this.basePath + this.writeFile, this.writeFileContent, this.writeFileEncoding);
                if (this.logAble) {
                    this.log += "writeFileSyncTest success:\n\n";
                }
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "writeFileSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.readFileSyncTest = fun() {
            try {
                val fileManager = uni_getFileSystemManager();
                var data = fileManager.readFileSync("" + this.basePath + this.readFile, this.readFileEncoding);
                if (this.logAble) {
                    this.log += "readFileSyncTest result:" + data + "\n\n";
                }
                this.done = true;
                this.readFileRet = data.toString();
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "readFileSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.unlinkSyncTest = fun() {
            try {
                val fileManager = uni_getFileSystemManager();
                fileManager.unlinkSync("" + this.basePath + this.unlinkFile);
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "unlinkSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.mkdirSyncTest = fun() {
            try {
                val fileManager = uni_getFileSystemManager();
                fileManager.mkdirSync("" + this.basePath + this.mkdirFile, this.recursiveVal);
                this.done = true;
            }
             catch (e: Throwable) {
                this.done = true;
                if (this.logAble) {
                    this.log += "mkdirSyncTest fail:" + e + "\n\n";
                }
            }
        }
        ;
        this.rmdirSyncTest = fun() {
            try {
                val fileManager = uni_getFileSystemManager();
                fileManager.rmdirSync("" + this.basePath + this.rmDirFile, this.recursiveVal);
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "rmdirSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.readDirSyncTest = fun() {
            try {
                val fileManager = uni_getFileSystemManager();
                var res = fileManager.readdirSync("" + this.basePath + this.readDir);
                if (this.logAble) {
                    this.log += "readDirTest success:" + JSON.stringify(res) + "\n\n";
                }
                if (res != null) {
                    this.fileListSuccess = res;
                }
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "rmdirSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.accessFileSyncTest = fun() {
            this.accessFileRet = "";
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.accessSync("" + this.basePath + this.accessFile);
                this.done = true;
                this.accessFileRet = "access:ok";
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "rmdirSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.renameFileSync = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.renameSync("" + this.basePath + this.renameFromFile, "" + this.basePath + this.renameToFile);
                this.done = true;
                this.renameFileRet = "rename:ok";
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "rmdirSyncTest fail:" + e + "\n\n";
                }
                console.log("renameSync:" + e);
                this.done = true;
            }
        }
        ;
        this.copyFileSyncTest = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.copyFileSync("" + this.basePath + this.copyFromFile, "" + this.copyToBasePath + this.copyToFile);
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "rmdirSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.appendFileSyncTest = fun(_: Any) {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.appendFileSync("" + this.basePath + this.writeFile, this.appendFileContent, this.writeFileEncoding);
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "rmdirSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.saveFileTest = fun(_: Any) {
            val fileManager = uni_getFileSystemManager();
            fileManager.saveFile(SaveFileOptions(tempFilePath = "" + this.basePath + this.temFile, success = fun(res: SaveFileSuccessResult){
                if (this.logAble) {
                    this.log += "saveFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
                this.saveFileRet = res.savedFilePath;
                this.done = true;
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "saveFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("saveFileTest fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
                this.done = true;
            }
            , complete = fun(_){
                this.done = true;
            }
            ));
        }
        ;
        this.saveFileSyncTest = fun(_: Any) {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.saveFileSync("" + this.basePath + this.temFile, "" + this.basePath + "/");
                this.done = true;
            }
             catch (e: Throwable) {
                console.log("saveFileSyncTest:" + e);
                this.done = true;
            }
        }
        ;
        this.unzipFileTest = fun(_: Any) {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.mkdirSync("" + this.basePath + this.targetZip, true);
            }
             catch (e: Throwable) {
                console.error(e);
            }
            fileManager.unzip(UnzipFileOptions(zipFilePath = "/static/filemanager/to.zip", targetPath = "" + this.basePath + this.targetZip, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "unzipFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "unzipFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(_){
                this.done = true;
            }
            ));
        }
        ;
        this.getSavedFileListTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.getSavedFileList(GetSavedFileListOptions(success = fun(res: GetSavedFileListResult){
                if (this.logAble) {
                    this.log += "getSavedFileListTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("getSavedFileListTest success", res);
                this.fileListSuccess = res.fileList;
                this.getSavedFileListRet = "getSavedFileList:ok";
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "getSavedFileListTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("getSavedFileListTest fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
                this.getSavedFileListRet = JSON.stringify(res);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                } else {
                    this.fileListComplete = (res as GetSavedFileListResult).fileList;
                }
            }
            ));
        }
        ;
        this.truncateFileTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.truncate(TruncateFileOptions(filePath = "" + this.basePath + this.writeFile, length = 7, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "truncateFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "truncateFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.truncateFileSyncTest = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.truncateSync("" + this.basePath + this.writeFile, 4);
                this.done = true;
            }
             catch (e: Throwable) {
                console.log(e);
                this.done = true;
            }
        }
        ;
        this.readCompressedFileTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.readCompressedFile(ReadCompressedFileOptions(filePath = "/static/filemanager/1.txt.br", compressionAlgorithm = "br", success = fun(res: ReadCompressedFileResult){
                if (this.logAble) {
                    this.log += "readCompressedFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "readCompressedFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(_){
                this.done = true;
            }
            ));
        }
        ;
        this.readCompressedFileSyncTest = fun() {
            console.log("readCompressedFileSyncTest");
            val fileManager = uni_getFileSystemManager();
            try {
                var data = fileManager.readCompressedFileSync("/static/filemanager/1.txt.br", "br");
                if (this.logAble) {
                    this.log += data;
                }
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "readCompressedFileSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.removeSavedFileTest = fun() {
            console.log("removeSavedFileTest enter");
            val fileManager = uni_getFileSystemManager();
            fileManager.removeSavedFile(RemoveSavedFileOptions(filePath = "" + this.basePath + this.writeFile, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "removeSavedFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                this.removeSavedFileRet = res.errMsg;
                console.log("removeSavedFileTest success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "removeSavedFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("removeSavedFileTest fail", res);
            }
            , complete = fun(_){
                this.done = true;
            }
            ));
        }
        ;
        this.statFileInfoSyncTest = fun(_: Any) {
            val fileManager = uni_getFileSystemManager();
            try {
                var res = fileManager.statSync("" + this.globalTempPath + this.statFile, this.recursiveVal);
                if (this.logAble) {
                    this.log += "statFileInfoSyncTest success:" + JSON.stringify(res) + "\n\n";
                }
                this.statsRet = res;
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "statFileInfoSyncTest fail:" + e + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.openFileTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.open(OpenFileOptions(filePath = "" + this.basePath + this.readFile, flag = "a", success = fun(res: OpenFileSuccessResult){
                if (this.logAble) {
                    this.log += "openFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
                this.fd = res.fd;
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "openFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(_){
                this.done = true;
            }
            ));
        }
        ;
        this.openFileSyncTest = fun(param: String, isTest: Boolean): String {
            val fileManager = uni_getFileSystemManager();
            try {
                var fd = fileManager.openSync(OpenFileSyncOptions(filePath = "" + this.basePath + this.readFile, flag = param));
                if (this.logAble && isTest) {
                    this.log += "openFileSyncTest success:" + fd + "\n\n";
                }
                if (isTest) {
                    this.done = true;
                }
                this.fd = fd;
                return fd;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "openFileSyncTest fail:" + JSON.stringify(e) + "\n\n";
                }
                console.log("fail", e);
                this.done = true;
            }
            return "";
        }
        ;
        this.closeSyncTest = fun() {
            console.log("closeSyncTest");
            val fileManager = uni_getFileSystemManager();
            try {
                console.log("closeSync");
                fileManager.closeSync(CloseSyncOptions(fd = this.openFileSyncTest("r", false)));
                if (this.logAble) {
                    this.log += "closeSyncTest success:\n\n";
                }
                this.done = true;
                this.closeFileRet = "close:ok";
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "closeSyncTest fail:" + JSON.stringify(e) + "\n\n";
                }
                console.log("fail", e);
                this.done = true;
            }
        }
        ;
        this.closeTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.close(CloseOptions(fd = this.openFileSyncTest("r", false), success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "closeTest success:" + JSON.stringify(res) + "\n\n";
                }
                this.closeFileRet = res.errMsg;
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "closeTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(_){
                this.done = true;
            }
            ));
        }
        ;
        this.writeTest = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.mkdirSync("" + this.basePath + this.mkdirFile, true);
            }
             catch (e: Throwable) {
                console.error(e);
            }
            fileManager.write(WriteOptions(fd = this.openFileSyncTest("w+", false), data = this.writeData, encoding = "utf-8", success = fun(res: WriteResult){
                if (this.logAble) {
                    this.log += "writeTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
                this.bytesWritten = res.bytesWritten;
                this.lastFailError = UniError("uni-fileSystemManager", 0, "writeTest success:" + JSON.stringify(res));
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "writeTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, "writeTest:" + res.errMsg);
            }
            , complete = fun(_){
                this.done = true;
            }
            ));
        }
        ;
        this.writeSyncTest = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.mkdirSync("" + this.basePath + this.mkdirFile, true);
            }
             catch (e: Throwable) {
                console.error(e);
            }
            fileManager.open(OpenFileOptions(filePath = "" + this.basePath + this.readFile, flag = "r+", success = fun(res: OpenFileSuccessResult){
                console.log("success", res);
                if (res.fd.length <= 0) {
                    this.done = true;
                    return;
                }
                try {
                    var ret = fileManager.writeSync(WriteSyncOptions(fd = res.fd, data = this.writeData, encoding = "utf-8"));
                    if (this.logAble) {
                        this.log += "writeSyncTest success:" + JSON.stringify(ret) + "\n\n";
                    }
                    console.log("success", ret);
                    this.done = true;
                    this.bytesWritten = ret.bytesWritten;
                }
                 catch (e: Throwable) {
                    if (this.logAble) {
                        this.log += "writeSyncTest fail:" + JSON.stringify(e) + "\n\n";
                    }
                    console.log("fail", e);
                    this.done = true;
                }
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "openFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
                this.done = true;
            }
            ));
        }
        ;
        this.fstatTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.fstat(FStatOptions(fd = this.openFileSyncTest("r", false), success = fun(res: FStatSuccessResult){
                if (this.logAble) {
                    this.log += "fstatTest success:" + JSON.stringify(res) + "\n\n";
                }
                console.log("success", res);
                this.fstat = res.stats;
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "fstatTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(_){
                this.done = true;
            }
            ));
        }
        ;
        this.fstatSyncTest = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                var stat = fileManager.fstatSync(FStatSyncOptions(fd = this.openFileSyncTest("r", false)));
                if (this.logAble) {
                    this.log += "fstatSyncTest success:" + JSON.stringify(stat) + "\n\n";
                }
                this.done = true;
                this.fstat = stat;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "fstatSyncTest fail:" + JSON.stringify(e) + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.ftruncateFileTest = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.ftruncate(FTruncateFileOptions(fd = this.openFileSyncTest("r+", false), length = 6, success = fun(res: FileManagerSuccessResult){
                if (this.logAble) {
                    this.log += "ftruncateFileTest success:" + JSON.stringify(res) + "\n\n";
                }
                this.ftruncateRet = res.errMsg;
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "ftruncateFileTest fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.ftruncateFileSyncTest = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.ftruncateSync(FTruncateFileSyncOptions(fd = this.openFileSyncTest("r+", false), length = 4));
                if (this.logAble) {
                    this.log += "ftruncateFileSyncTest success:\n\n";
                }
                this.done = true;
                this.ftruncateRet = "ftruncate:ok";
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "ftruncateFileSyncTest fail:" + JSON.stringify(e) + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.readZipEntry = fun() {
            val fileManager = uni_getFileSystemManager();
            fileManager.readZipEntry(ReadZipEntryOptions(filePath = "/static/filemanager/to.zip", encoding = "utf-8", success = fun(res: EntriesResult){
                if (this.logAble) {
                    this.log += "readZipEntry success:size=" + res.result.size + "\n\n";
                }
                console.log("success", res);
            }
            , fail = fun(res: IUniError){
                if (this.logAble) {
                    this.log += "readZipEntry fail:" + JSON.stringify(res) + "\n\n";
                }
                console.log("fail", res);
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
            }
            ));
        }
        ;
        this.testWriteReadFileBuffer = fun() {
            val fs = uni_getFileSystemManager();
            var buffer = ArrayBuffer(16);
            var float64 = Float64Array(buffer);
            float64[1] = 1.2222222;
            var that = this;
            fs.writeFile(WriteFileOptions(filePath = "" + uni_env.USER_DATA_PATH + "/hello.txt", data = buffer, success = fun(res) {
                if (this.logAble) {
                    this.log += "testWriteReadFileBuffer ：" + res.errMsg + "\n\n";
                }
                console.log(res);
                that.testReadFileBuffer();
            }
            , fail = fun(res) {
                if (this.logAble) {
                    this.log += "testWriteReadFileBuffer fail:" + JSON.stringify(res) + "\n\n";
                }
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
                console.error(res);
                this.done = true;
            }
            , complete = fun(_: Any){}));
        }
        ;
        this.testReadFileBuffer = fun() {
            val fs = uni_getFileSystemManager();
            fs.readFile(ReadFileOptions(filePath = "" + uni_env.USER_DATA_PATH + "/hello.txt", success = fun(res) {
                console.log(res);
                var float64 = Float64Array(res.data as ArrayBuffer);
                if (this.logAble) {
                    run {
                        var i: Number = 0;
                        while(i < float64.length){
                            if (this.logAble) {
                                this.log += "testReadFileBuffer success ：" + ("Byte " + i + ": " + float64[i]) + "\n\n";
                            }
                            i++;
                        }
                    }
                }
                this.arrayBufferRes = float64[1];
                console.log(this.arrayBufferRes);
            }
            , fail = fun(res) {
                if (this.logAble) {
                    this.log += "testReadFileBuffer fail:" + JSON.stringify(res) + "\n\n";
                }
                this.lastFailError = UniError(res.errSubject, res.errCode, res.errMsg);
                console.error(res);
            }
            , complete = fun(res: Any){
                console.log("complete", res);
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            ));
        }
        ;
        this.testWriteReadFileSyncBuffer = fun() {
            try {
                val fs = uni_getFileSystemManager();
                var buffer = ArrayBuffer(16);
                var float64 = Float64Array(buffer);
                float64[1] = 1.333;
                fs.writeFileSync("" + uni_env.USER_DATA_PATH + "/hello.txt", buffer, "utf-8");
                if (this.logAble) {
                    this.log += "testWriteReadFileSyncBuffer success\n\n";
                }
                this.testReadFileSyncBuffer();
                this.done = true;
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "testWriteReadFileSyncBuffer fail:" + JSON.stringify(e) + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.testReadFileSyncBuffer = fun() {
            try {
                val fs = uni_getFileSystemManager();
                var res = fs.readFileSync("" + uni_env.USER_DATA_PATH + "/hello.txt", null);
                console.log(res);
                var float64 = Float64Array(res as ArrayBuffer);
                run {
                    var i: Number = 0;
                    while(i < float64.length){
                        if (this.logAble) {
                            this.log += "testReadFileSyncBuffer success:" + ("Byte " + i + ": " + float64[i]) + "\n\n";
                        }
                        console.log("Byte " + i + ": " + float64[i]);
                        i++;
                    }
                }
                this.arrayBufferRes = float64[1];
                console.log(this.arrayBufferRes);
            }
             catch (e: Throwable) {
                if (this.logAble) {
                    this.log += "testReadFileSyncBuffer fail:" + JSON.stringify(e) + "\n\n";
                }
                this.done = true;
            }
        }
        ;
        this.testWriteReadBuffer = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.mkdirSync("" + this.basePath + this.mkdirFile, true);
            }
             catch (e: Throwable) {
                console.error(e);
            }
            var buffer = ArrayBuffer(24);
            var float64 = Float64Array(buffer);
            float64[1] = 1.24;
            float64[2] = 1.33;
            fileManager.write(WriteOptions(fd = this.openFileSyncTest("w+", false), length = 16, offset = 8, data = buffer, position = 10, success = fun(res: WriteResult){
                console.log("success", res);
                val ab = ArrayBuffer(24);
                fileManager.read(ReadOption(arrayBuffer = ab, fd = this.openFileSyncTest("a+", false), length = 8, position = 10, success = fun(res: ReadSuccessCallbackResult) {
                    console.log(res);
                    var value = Float64Array(res.arrayBuffer);
                    run {
                        var i: Number = 0;
                        while(i < value.length){
                            console.log("Byte " + i + ": " + value[i]);
                            if (this.logAble) {
                                this.log += "testWriteReadBuffer success:" + ("Byte " + i + ": " + value[i]) + "\n\n";
                            }
                            i++;
                        }
                    }
                    this.arrayBufferRes = value[0];
                    console.log(this.arrayBufferRes);
                }
                , fail = fun(res) {
                    console.log(res);
                    this.done = true;
                    if (res is UniError) {
                        this.lastCompleteError = res;
                    }
                }
                , complete = fun(res: Any){
                    console.log("complete", res);
                    this.done = true;
                    if (res is UniError) {
                        this.lastCompleteError = res;
                    }
                }
                ));
            }
            , fail = fun(res: IUniError){
                this.done = true;
                if (res is UniError) {
                    this.lastCompleteError = res;
                }
            }
            , complete = fun(_){}));
        }
        ;
        this.testWriteReadSyncBuffer = fun() {
            val fileManager = uni_getFileSystemManager();
            try {
                fileManager.mkdirSync("" + this.basePath + this.mkdirFile, true);
            }
             catch (e: Throwable) {}
            try {
                var buffer = ArrayBuffer(24);
                var float64 = Float64Array(buffer);
                float64[1] = 1.11;
                float64[2] = 1.33;
                var ret = fileManager.writeSync(WriteSyncOptions(fd = this.openFileSyncTest("w+", false), data = buffer, length = 16, offset = 8, position = 10, encoding = "utf-8"));
                console.log("success", ret);
                val ab = ArrayBuffer(24);
                var res = fileManager.readSync(ReadSyncOption(arrayBuffer = ab, fd = this.openFileSyncTest("a+", false), length = 8, offset = 8, position = 10));
                console.log(res);
                var value = Float64Array(res.arrayBuffer);
                run {
                    var i: Number = 0;
                    while(i < value.length){
                        if (this.logAble) {
                            this.log += "testWriteReadSyncBuffer success ：" + ("Byte " + i + ": " + value[i]) + "\n\n";
                        }
                        i++;
                    }
                }
                this.done = true;
                this.arrayBufferRes = float64[1];
                console.log(this.arrayBufferRes);
            }
             catch (e: Throwable) {
                this.done = true;
                if (e is UniError) {
                    this.lastCompleteError = e;
                }
                console.error(e);
            }
        }
        ;
        this.testAppendFileBufferSync = fun() {
            val fs = uni_getFileSystemManager();
            try {
                var buffer = ArrayBuffer(24);
                var float64 = Float64Array(buffer);
                float64[1] = 1.2222222;
                float64[2] = 1.33;
                var ret = fs.writeSync(WriteSyncOptions(fd = fs.openSync(OpenFileSyncOptions(filePath = "" + uni_env.USER_DATA_PATH + "/hello.txt", flag = "w+")), data = buffer, length = 16, offset = 8, position = 10));
                console.log(ret);
                buffer = ArrayBuffer(16);
                float64 = Float64Array(buffer);
                float64[0] = 20;
                fs.appendFileSync("" + uni_env.USER_DATA_PATH + "/hello.txt", buffer, null);
                val ab = ArrayBuffer(32);
                var readResult = fs.readSync(ReadSyncOption(fd = fs.openSync(OpenFileSyncOptions(filePath = "" + uni_env.USER_DATA_PATH + "/hello.txt", flag = "a+")), arrayBuffer = ab, length = 24, position = 10, offset = 8));
                console.log(readResult);
                float64 = Float64Array(readResult.arrayBuffer);
                run {
                    var i: Number = 0;
                    while(i < float64.length){
                        if (this.logAble) {
                            this.log += "testAppendFileBufferSync success ：" + ("Byte " + i + ": " + float64[i]) + "\n\n";
                        }
                        console.log("Byte " + i + ": " + float64[i]);
                        i++;
                    }
                }
                this.arrayBufferRes = float64[3];
                console.log(this.arrayBufferRes);
                this.done = true;
            }
             catch (e: Throwable) {
                this.done = true;
                if (this.logAble) {
                    this.log += "testAppendFileBufferSync fail:" + JSON.stringify(e) + "\n\n";
                }
                console.error(e);
            }
        }
        ;
        this.testAppendFileBuffer = fun() {
            val fs = uni_getFileSystemManager();
            try {
                var buffer = ArrayBuffer(24);
                var float64 = Float64Array(buffer);
                float64[1] = 1.2222222;
                float64[2] = 1.33;
                var ret = fs.writeSync(WriteSyncOptions(fd = fs.openSync(OpenFileSyncOptions(filePath = "" + uni_env.USER_DATA_PATH + "/hello.txt", flag = "w+")), data = buffer, length = 16, offset = 8, position = 10));
                console.log(ret);
                buffer = ArrayBuffer(16);
                float64 = Float64Array(buffer);
                float64[0] = 21;
                fs.appendFile(AppendFileOptions(filePath = "" + uni_env.USER_DATA_PATH + "/hello.txt", data = buffer, success = fun(res) {
                    console.log(res);
                    val ab = ArrayBuffer(32);
                    var readResult = fs.readSync(ReadSyncOption(fd = fs.openSync(OpenFileSyncOptions(filePath = "" + uni_env.USER_DATA_PATH + "/hello.txt", flag = "a+")), arrayBuffer = ab, length = 24, position = 10, offset = 8));
                    console.log(readResult);
                    float64 = Float64Array(readResult.arrayBuffer);
                    run {
                        var i: Number = 0;
                        while(i < float64.length){
                            console.log("Byte " + i + ": " + float64[i]);
                            if (this.logAble) {
                                this.log += "testAppendFileBuffer success ：" + ("Byte " + i + ": " + float64[i]) + "\n\n";
                            }
                            i++;
                        }
                    }
                    this.arrayBufferRes = float64[3];
                    console.log(this.arrayBufferRes);
                }
                , fail = fun(res) {
                    console.log(res);
                }
                , complete = fun(_){
                    this.done = true;
                }
                ));
            }
             catch (e: Throwable) {
                this.done = true;
                if (this.logAble) {
                    this.log += "testAppendFileBufferSync fail:" + JSON.stringify(e) + "\n\n";
                }
                console.error(e);
            }
        }
        ;
    }
    open lateinit var statFileInfoTest: (_: Any) -> Unit;
    open lateinit var getFileInfoTest: () -> Unit;
    open lateinit var copyFileTest: () -> Unit;
    open lateinit var renameFileTest: () -> Unit;
    open lateinit var readDirTest: () -> Unit;
    open lateinit var writeFileTest: (_: Any) -> Unit;
    open lateinit var readFileTest: () -> Unit;
    open lateinit var rmdirTest: () -> Unit;
    open lateinit var mkdirTest: () -> Unit;
    open lateinit var accessFileTest: () -> Unit;
    open lateinit var unlinkTest: () -> Unit;
    open lateinit var unlinkAllFileTest: () -> Unit;
    open lateinit var copyStaticToFilesTest: () -> Unit;
    open lateinit var appendFileTest: (_: Any) -> Unit;
    open lateinit var writeFileSyncTest: (_: Any) -> Unit;
    open lateinit var readFileSyncTest: () -> Unit;
    open lateinit var unlinkSyncTest: () -> Unit;
    open lateinit var mkdirSyncTest: () -> Unit;
    open lateinit var rmdirSyncTest: () -> Unit;
    open lateinit var readDirSyncTest: () -> Unit;
    open lateinit var accessFileSyncTest: () -> Unit;
    open lateinit var renameFileSync: () -> Unit;
    open lateinit var copyFileSyncTest: () -> Unit;
    open lateinit var appendFileSyncTest: (_: Any) -> Unit;
    open lateinit var saveFileTest: (_: Any) -> Unit;
    open lateinit var saveFileSyncTest: (_: Any) -> Unit;
    open lateinit var unzipFileTest: (_: Any) -> Unit;
    open lateinit var getSavedFileListTest: () -> Unit;
    open lateinit var truncateFileTest: () -> Unit;
    open lateinit var truncateFileSyncTest: () -> Unit;
    open lateinit var readCompressedFileTest: () -> Unit;
    open lateinit var readCompressedFileSyncTest: () -> Unit;
    open lateinit var removeSavedFileTest: () -> Unit;
    open lateinit var statFileInfoSyncTest: (_: Any) -> Unit;
    open lateinit var openFileTest: () -> Unit;
    open lateinit var openFileSyncTest: (param: String, isTest: Boolean) -> String;
    open lateinit var closeSyncTest: () -> Unit;
    open lateinit var closeTest: () -> Unit;
    open lateinit var writeTest: () -> Unit;
    open lateinit var writeSyncTest: () -> Unit;
    open lateinit var fstatTest: () -> Unit;
    open lateinit var fstatSyncTest: () -> Unit;
    open lateinit var ftruncateFileTest: () -> Unit;
    open lateinit var ftruncateFileSyncTest: () -> Unit;
    open lateinit var readZipEntry: () -> Unit;
    open lateinit var testWriteReadFileBuffer: () -> Unit;
    open lateinit var testReadFileBuffer: () -> Unit;
    open lateinit var testWriteReadFileSyncBuffer: () -> Unit;
    open lateinit var testReadFileSyncBuffer: () -> Unit;
    open lateinit var testWriteReadBuffer: () -> Unit;
    open lateinit var testWriteReadSyncBuffer: () -> Unit;
    open lateinit var testAppendFileBufferSync: () -> Unit;
    open lateinit var testAppendFileBuffer: () -> Unit;
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>> by lazy {
            normalizeCssStyles(utsArrayOf(
                styles0
            ), utsArrayOf(
                GenApp.styles
            ))
        };
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("btnstyle" to padStyleMapOf(utsMapOf("marginTop" to 4, "marginRight" to 4, "marginBottom" to 4, "marginLeft" to 4)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
