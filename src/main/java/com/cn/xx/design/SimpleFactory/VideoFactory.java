package com.cn.xx.design.SimpleFactory;

/**
 * @Author: ldl
 * @Date: 2019/10/14 16:43
 * @Version 1.0
 * @Des: 创建工厂类，根据传入不同参数创建不同具体产品类的实例对象
 */
public class VideoFactory {

    /**
     * 根据Class字节码对象去得到对应的对象
     * @param c
     * @return
     */
    public SimpleFactory getVideo(Class c){
        SimpleFactory video = null;
        try {
            video = (SimpleFactory)Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
            e.printStackTrace();
        }
        return video;
    }

    public SimpleFactory getVideo(String type){
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }


    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();

        //创建JavaVideo，根据类的class字节码
        SimpleFactory video = videoFactory.getVideo(JavaVideo.class);
        video.produce();

        //创建PythonVideo，根据String字符串类型
        SimpleFactory python = videoFactory.getVideo("python");
        python.produce();

    }

}
