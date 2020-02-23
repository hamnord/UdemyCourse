package JavaExercises.Lesson2;

public class PaintJob {
  public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket){
    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0){
      System.out.println("Invalid Value");
      return -1;
    }

      double wallArea = width * height;
      double buckets = wallArea / areaPerBucket - extraBucket;

    System.out.println((int) Math.ceil(buckets));
      return (int) Math.ceil(buckets);
  }

  public static int getBucketCount (double width, double height, double areaPerBucket){
    if (width <= 0 || height <= 0 || areaPerBucket <= 0){
      System.out.println("Invalid Value");
      return -1;
    }

    double wallArea = width * height;
    double buckets = wallArea / areaPerBucket;

    System.out.println((int) Math.ceil(buckets));
    return (int) Math.ceil(buckets);
  }

  public static int getBucketCount (double area, double areaPerBucket){
    if (area <= 0 || areaPerBucket <= 0){
      System.out.println("Invalid Value");
      return -1;
    }

    double buckets = area / areaPerBucket;

    System.out.println((int) Math.ceil(buckets));
    return (int) Math.ceil(buckets);
  }
}
