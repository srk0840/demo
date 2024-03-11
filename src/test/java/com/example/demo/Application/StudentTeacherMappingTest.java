//package com.example.demo.Application;
//
//import ch.qos.logback.classic.Logger;
//import ch.qos.logback.classic.spi.ILoggingEvent;
//import ch.qos.logback.core.read.ListAppender;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.platform.commons.logging.LoggerFactory;
//import org.mockito.InjectMocks;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.mockito.junit.jupiter.MockitoSettings;
//import org.mockito.quality.Strictness;
//import org.springframework.boot.json.JsonParseException;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(MockitoExtension.class)
//@MockitoSettings(strictness = Strictness.LENIENT)
//class StudentTeacherMappingTest {
//
//    static final String validStudent="stubdata/mappar/student.json";
//
//    private ListAppender<ILoggingEvent> loggingEventListAppender = new ListAppender<>();
//
//    @InjectMocks
//    StudentTeacherMapping studentTeacherMapping;
//
//    @BeforeEach
//    void  setup(){
//        Logger logger= (Logger) LoggerFactory.getLogger(StudentTeacherMapping.class);
//        loggingEventListAppender = new ListAppender<>();
//        logger.addAppender(loggingEventListAppender);
//    }
//
//    @Test
//    void validStudentFromStudent(){
//        Student student =
//    }
//
//    public static <T> getTestingEvent(String datapath , Class<T> type) throws Exception{
//        return
//    }
//
//    private static <T> convertJsonToObject(String json, Class<T> responseType) throws Exception{
//        return O;
//    }
//
//    private <T> readValue(String content, Class<T> valueType) throws Exception{
//        assertNotNull("content",content);
//        return this.readValue(Content, this);
//    }
//}