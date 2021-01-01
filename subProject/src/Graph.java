import org.knowm.xchart.*;
import org.knowm.xchart.style.markers.SeriesMarkers;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    public static void main(String[] args) {

        // 하나 고정
        double[] xData = new double[] {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double[] yData = new double[] {1.0, 2.0, 4.0, 6.0, 9.0, 9.0, 7.0, 7.0, 5.0, 3.0, 2.0};

        // Create Chart
        XYChart chart = QuickChart.getChart("유동인구 그래프", "시간(5분)", "나가는 인구수", "유동인구 현황", xData, yData);
//        chart.getStyler().setYAxisMin(-10.0);
//        chart.getStyler().setYAxisMax(10.0);


        //Show it
        new SwingWrapper(chart).displayChart();

//        int numCharts = 4;
//
//        List charts = new ArrayList();
//
//        for (int i = 0; i < numCharts; i++) {
//            XYChart chart = new XYChartBuilder().xAxisTitle("X").yAxisTitle("Y").width(600).height(400).build();
//            chart.getStyler().setYAxisMin(-10.0);
//            chart.getStyler().setYAxisMax(10.0);
//            XYSeries series = chart.addSeries(""+ i, null, getRandomWalk(200));
//            series.setMarker(SeriesMarkers.NONE);
//            charts.add(chart);
//        }
//
//        new SwingWrapper(charts).displayChartMatrix();
//
//    }
//
//    private static double[] getRandomWalk(int numPoints) {
//        double[] y = new double[numPoints];
//        y[0] = 0;
//        for (int i = 1; i < y.length; i++) {
//            y[i] = y[i - 1] + Math.random() -.5;
//        }
//        return y;
//
    }
}
