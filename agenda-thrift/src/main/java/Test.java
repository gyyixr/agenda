
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static void main(String[] args) {
        Logger INFO_LOG = LoggerFactory.getLogger("infoLog");

        Logger ERROR_LOG = LoggerFactory.getLogger("errorLog");

        INFO_LOG.info("业务日志");

        ERROR_LOG.error("异常日志");
    }
}