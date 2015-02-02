package graph;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph_View extends Frame implements ActionListener, WindowListener{

	public Graph_View(){
		//windowを閉じれる
		addWindowListener(this);
					
		//タイトル設定
		setTitle("グラフ");
		
		//日本語が文字化けしない
		ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme()); 
		
		//グラフ作成
		DefaultCategoryDataset data = new DefaultCategoryDataset();
			//アメリカのデータ
			data.addValue(300, "米国","2005");
			data.addValue(500, "米国","2006");
			data.addValue(120, "米国","2007");
			
			//中国のデータ
			data.addValue(200, "中国","2005");
			data.addValue(400, "中国","2006");
			data.addValue(320, "中国","2007");
		JFreeChart chart = ChartFactory.createLineChart("輸入量",
										"年",
										"トン(t)",
										data,
										PlotOrientation.VERTICAL,
										true,
										false,
										false);
		ChartPanel cpanel = new ChartPanel(chart);
		add(cpanel, BorderLayout.CENTER);
				
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
				
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		//����{�^���L��
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

}
