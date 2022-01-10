package bailanAE;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.application.Platform;

public class Main extends Application {
	static StackPane stacker = new StackPane();
	static StackPane stacker2 = new StackPane();
	static Image bianpao = new Image("bailanAE/bianpao.png");
	static Image huan = new Image("bailanAE/huan.png");
	static Image xi = new Image("bailanAE/xi.png");
	static Image guo = new Image("bailanAE/guo.png");
	static Image da = new Image("bailanAE/da.png");
	static Image nian = new Image("bailanAE/nian.png");

	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 600, 400);

		HBox idk = new HBox();
		MediaPlayer mp = new MediaPlayer(
				new Media("file:///C:/Users/grieferpig/eclipse-workspace/bailanAE/src/bailanAE/wanezhiorigin.mp3"));
		mp.setCycleCount(1);
		MediaView mView = new MediaView(mp);
		mp.play();
		idk.getChildren().add(mView); // 有点玄学，把这行注释掉试试看
		idk.setVisible(false); // dummy
		idk.setScaleX(0);
		idk.setScaleY(0);
		root.setBottom(idk);
		root.setBackground(new Background(new BackgroundFill(Color.web("d7dad7"), null, null)));

		primaryStage.setScene(scene);
		primaryStage.setTitle("我用摆烂的java代码摆烂了你的AE作业");
		primaryStage.show();
		// ------------------------------------------------------1
		HBox first_scene = new HBox();
		HBox second_scene = new HBox();

		Image javafu = new Image("bailanAE/javafu.png");
		Image lantern = new Image("bailanAE/lantern.png");

		ImageView fu_1 = new ImageView();
		fu_1.setScaleX(0.3);
		fu_1.setScaleY(0.3);
		fu_1.setImage(javafu);

		ImageView fu_2 = new ImageView();
		fu_2.setScaleX(0.3);
		fu_2.setScaleY(0.3);
		fu_2.setImage(javafu);

		ImageView fu_3 = new ImageView();
		fu_3.setScaleX(0.3);
		fu_3.setScaleY(0.3);
		fu_3.setImage(javafu);

		fu_1.setTranslateY(-50);
		fu_2.setTranslateY(-50);
		fu_3.setTranslateY(-50);

		fu_1.setTranslateX(-150);
		fu_2.setTranslateX(-450);
		fu_3.setTranslateX(-750);

		fu_1.setVisible(false);
		fu_2.setVisible(false);
		fu_3.setVisible(false);

		ImageView bianpao_1 = new ImageView();
		bianpao_1.setScaleX(0.4);
		bianpao_1.setScaleY(0.4);
		bianpao_1.setImage(bianpao);
		Rectangle clip = new Rectangle(bianpao.getWidth(), bianpao.getHeight());
		bianpao_1.setClip(clip);
		bianpao_1.setTranslateX(-1500);
		bianpao_1.setTranslateY(-150);

		ImageView bianpao_2 = new ImageView();
		bianpao_2.setScaleX(0.4);
		bianpao_2.setScaleY(0.4);
		bianpao_2.setImage(bianpao);
		Rectangle clip2 = new Rectangle(bianpao.getWidth(), bianpao.getHeight());
		bianpao_2.setClip(clip2);
		bianpao_2.setTranslateX(-1650);
		bianpao_2.setTranslateY(-150);

		ImageView bianpao_3 = new ImageView();
		bianpao_3.setScaleX(0.4);
		bianpao_3.setScaleY(0.4);
		bianpao_3.setImage(bianpao);
		Rectangle clip3 = new Rectangle(bianpao.getWidth(), bianpao.getHeight());
		bianpao_3.setClip(clip3);
		bianpao_3.setTranslateX(-1850);
		bianpao_3.setTranslateY(-150);

		bianpao_1.setVisible(false);
		bianpao_2.setVisible(false);
		bianpao_3.setVisible(false);

		ImageView lantern_1 = new ImageView();
		lantern_1.setScaleX(0.3);
		lantern_1.setScaleY(0.3);
		lantern_1.setTranslateY(-500);
		lantern_1.setTranslateX(150);
		lantern_1.setImage(lantern);

		first_scene.getChildren().addAll(fu_1, fu_2, fu_3, bianpao_1, bianpao_2, bianpao_3);
		second_scene.getChildren().addAll(lantern_1);

		root.setCenter(first_scene);
		new Thread() {
			public void run() {
				try {
					Thread.sleep(1200);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_2.setVisible(true);
						}
					});

					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_2.setVisible(true);
						}
					});

					Thread.sleep(900);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_1.setVisible(true);
						}
					});

					Thread.sleep(900);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_3.setVisible(true);
						}
					});

					Thread.sleep(300);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_1.setVisible(false);
							fu_3.setVisible(false);
						}
					});

					Thread.sleep(300);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_2.setScaleX(0.5);
							fu_2.setScaleY(0.5);
						}
					});

					Thread.sleep(500);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_2.setVisible(false);
							fu_1.setVisible(true);
							fu_3.setVisible(true);
							fu_1.setScaleX(0.6);
							fu_1.setScaleY(0.6);
							fu_3.setScaleX(0.6);
							fu_3.setScaleY(0.6);

							fu_1.setTranslateX(-70);
							fu_3.setTranslateX(-830);
						}
					});

					Thread.sleep(500);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_2.setVisible(true);
							fu_1.setVisible(false);
							fu_3.setVisible(false);
						}
					});

					Thread.sleep(300);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_2.setRotate(180);
						}
					});

					Thread.sleep(400);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), fu_2);
							rotateTransition.setFromAngle(0);
							rotateTransition.setToAngle(360);
							// 无限循环
							rotateTransition.setCycleCount(40);
							// 每次旋转后是否改变旋转方向
							rotateTransition.setAutoReverse(false);
							rotateTransition.setRate(10);
							// RotateTransition旋转方式两轮旋转间有间隔
							rotateTransition.play();
						}
					});

					Thread.sleep(2000);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_2.setVisible(false);
							fu_1.setVisible(true);
							fu_3.setVisible(true);
							RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), fu_1);
							rotateTransition.setFromAngle(0);
							rotateTransition.setToAngle(360);
							// 无限循环
							rotateTransition.setCycleCount(40);
							// 每次旋转后是否改变旋转方向
							rotateTransition.setAutoReverse(false);
							rotateTransition.setRate(10);
							// RotateTransition旋转方式两轮旋转间有间隔
							rotateTransition.play();

							RotateTransition rT1 = new RotateTransition(Duration.seconds(2), fu_3);
							rT1.setFromAngle(0);
							rT1.setToAngle(360);
							// 无限循环
							rT1.setCycleCount(40);
							// 每次旋转后是否改变旋转方向
							rT1.setAutoReverse(false);
							rT1.setRate(10);
							// rT1旋转方式两轮旋转间有间隔
							rT1.play();
						}
					});

					Thread.sleep(3000);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							fu_2.setVisible(false);
							fu_1.setVisible(false);
							fu_3.setVisible(false);
							bianpao_1.setVisible(true);
						}
					});
					new Thread() {
						public void run() {
							int counter = 0;
							while (counter < 640) {
								clip.setTranslateY(counter);
								counter = counter - 40;
								try {
									sleep(25);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}
					}.start();

					Thread.sleep(300);
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							bianpao_3.setVisible(true);
						}
					});

					new Thread() {
						public void run() {
							int counter = 0;
							while (counter < 640) {
								clip3.setTranslateY(counter);
								counter = counter - 40;
								try {
									sleep(25);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}
					}.start();

					Thread.sleep(300);

					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							bianpao_2.setVisible(true);
						}
					});

					new Thread() {
						public void run() {
							int counter = 0;
							while (counter < 640) {
								clip2.setTranslateY(counter);
								counter = counter - 40;
								try {
									sleep(25);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									// e.printStackTrace();
								}
							}
						}
					}.start();

					Thread.sleep(500);

					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							root.setCenter(second_scene);
						}
					});
					sleep(50);
					new Thread() {
						public void run() {
							int counter = -800;
							while (counter < 300) {
								lantern_1.setTranslateX(counter);
								counter = counter + 21;
								try {
									sleep(35);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									// e.printStackTrace();
								}
							}

							counter = 150;
							int rotate = 0;
							while (counter > -800) {
								lantern_1.setTranslateX(counter);
								lantern_1.setRotate(rotate);
								counter = counter - 20;
								rotate = rotate + 80;
								try {
									sleep(20);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									// e.printStackTrace();
								}
							}
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									lantern_1.setVisible(false);
								}
							});
							try {
								sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									lantern_1.setVisible(true);
									lantern_1.setRotate(0);
								}
							});
							counter = 150;
							rotate = 0;
							while (counter > -800) {
								lantern_1.setTranslateX(counter);
								counter = counter - 16;
								try {
									sleep(35);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									// e.printStackTrace();
								}
							}
							counter = -800;
							while (counter < 300) {
								lantern_1.setTranslateX(counter);
								lantern_1.setRotate(rotate);
								counter = counter + 20;
								rotate = rotate + 80;
								try {
									sleep(20);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									// e.printStackTrace();
								}
							}
							try {
								sleep(300);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									lantern_1.setVisible(true);
									lantern_1.setRotate(0);
								}
							});
							counter = 150;
							while (counter > -300) {
								lantern_1.setTranslateX(counter);
								counter = counter - 17;
								try {
									sleep(40);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									// e.printStackTrace();
								}
							}
							try {
								sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									lantern_1.setScaleX(0.43);
									lantern_1.setScaleY(0.43);
								}
							});
							try {
								sleep(300);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									lantern_1.setScaleX(0.51);
									lantern_1.setScaleY(0.51);
								}
							});
							try {
								sleep(400);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							counter = 150;
							lantern_1.setScaleX(0.3);
							lantern_1.setScaleY(0.3);
							while (counter > -300) {
								lantern_1.setTranslateX(counter);
								counter = counter - 17;
								try {
									sleep(40);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									// e.printStackTrace();
								}
							}
							try {
								sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									lantern_1.setScaleX(0.43);
									lantern_1.setScaleY(0.43);
								}
							});
							try {
								sleep(300);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									lantern_1.setScaleX(0.51);
									lantern_1.setScaleY(0.51);
								}
							});
							try {
								sleep(300);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									lantern_1.setScaleX(0.3);
									lantern_1.setScaleY(0.3);
									lantern_1.setTranslateX(-700);
									lantern_1.setTranslateY(-700);
								}
							});

							counter = -600;
							while (counter < 150) {
								lantern_1.setTranslateX(counter);
								lantern_1.setTranslateY(counter - 100);
								counter = counter + 17;
								try {
									sleep(40);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									// e.printStackTrace();
								}
							}
						}
					}.start();

					sleep(12000);

					new Thread() {
						public void run() {
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									root.setCenter(stacker);
								}
							});

							try {
								new BianPao().fangBianPao(-190, -100);
								sleep(325);
								new BianPao().fangBianPao(-60, -120);
								sleep(125);
								new BianPao().fangBianPao(-10, -100);
								sleep(250);
								new BianPao().fangBianPao(-150, -130);
								sleep(250);
								new BianPao().fangBianPao(130, -120);
								sleep(250);
								new BianPao().fangBianPao(-140, -160);
								sleep(250);
								new BianPao().fangBianPao(-30, -130);
								sleep(250);
								new BianPao().fangBianPao(90, -180);
								sleep(250);
								new BianPao().fangBianPao(-30, -240);
								sleep(250);
								new BianPao().fangBianPao(90, -250);
								sleep(250);
								new BianPao().fangBianPao(150, -220);
								sleep(250);
								new BianPao().fangBianPao(-30, -100);
								sleep(250);
								new BianPao().fangBianPao(90, -105);
								sleep(125);
								new BianPao().fangBianPao(180, -240);
								sleep(125);
								new BianPao().fangBianPao(210, -90);
								sleep(251);
								new BianPao().fangBianPao(250, -150);
								sleep(254);
								new BianPao().fangBianPao(-180, -180);
								sleep(257);
								new BianPao().fangBianPao(-110, -180);
								sleep(242);
								new BianPao().fangBianPao(-60, -160);
								sleep(255);
								new BianPao().fangBianPao(-60, -160);
								sleep(495);
								new BianPao().fangBianPao(60, -180);
								sleep(255);
								new BianPao().fangBianPao(10, -90);
								sleep(122);
								new BianPao().fangBianPao(90, -95);
								sleep(120);
								new BianPao().fangBianPao(130, -85);
							} catch (Exception e) {
								e.printStackTrace();// 你礼貌吗
							}
						}
					}.start();
					sleep(6000);

					new Thread() {
						public void run() {
							Platform.runLater(new Runnable() {
								public void run() {
									root.setCenter(stacker2);
								}
							});
							ImageView fu_1 = new ImageView(javafu);
							ImageView fu_2 = new ImageView(javafu);
							ImageView fu_3 = new ImageView(javafu);
							ImageView fu_4 = new ImageView(javafu);
							ImageView giant_fu = new ImageView(javafu);
							fu_1.setScaleX(0.3);
							fu_1.setScaleY(0.3);
							fu_2.setScaleX(0.3);
							fu_2.setScaleY(0.3);
							fu_3.setScaleX(0.25);
							fu_3.setScaleY(0.25);
							fu_4.setScaleX(0.2);
							fu_4.setScaleY(0.2);
							giant_fu.setScaleX(0.5);
							giant_fu.setScaleY(0.5);
							giant_fu.setTranslateY(-50);
							fu_1.setTranslateX(-100);
							fu_1.setTranslateY(-70);
							fu_2.setTranslateX(350);
							fu_2.setTranslateY(-75);
							fu_3.setTranslateX(370);
							fu_3.setTranslateY(100);
							fu_4.setTranslateX(-300);
							fu_4.setTranslateY(-160);
							giant_fu.setVisible(false);
							Label _l1 = new Label("javafx");
							Label _l2 = new Label("致命单线程");
							_l1.setTextFill(Color.RED);
							_l2.setTextFill(Color.RED);
							_l1.setFont(new Font(30));
							_l2.setFont(new Font(24));
							_l1.setTranslateX(350);
							_l1.setTranslateY(-220);
							_l2.setTranslateX(380);
							_l2.setTranslateY(-190);

							ImageView huan_1 = new ImageView(huan);
							ImageView huan_2 = new ImageView(huan);
							ImageView xi_1 = new ImageView(xi);
							ImageView xi_2 = new ImageView(xi);
							ImageView guo_1 = new ImageView(guo);
							ImageView da_1 = new ImageView(da);
							ImageView nian_1 = new ImageView(nian);

							huan_1.setTranslateX(-140);
							huan_1.setTranslateY(-90);
							huan_1.setScaleX(0.5);
							huan_1.setScaleY(0.5);
							huan_1.setVisible(false);

							huan_2.setTranslateX(-40);
							huan_2.setTranslateY(-90);
							huan_2.setScaleX(0.5);
							huan_2.setScaleY(0.5);
							huan_2.setVisible(false);

							xi_1.setTranslateX(60);
							xi_1.setTranslateY(-90);
							xi_1.setScaleX(0.5);
							xi_1.setScaleY(0.5);
							xi_1.setVisible(false);

							xi_2.setTranslateX(160);
							xi_2.setTranslateY(-90);
							xi_2.setScaleX(0.5);
							xi_2.setScaleY(0.5);
							xi_2.setVisible(false);

							guo_1.setTranslateX(-100);
							guo_1.setTranslateY(20);
							guo_1.setScaleX(0.5);
							guo_1.setScaleY(0.5);
							guo_1.setVisible(false);

							da_1.setTranslateX(0);
							da_1.setTranslateY(20);
							da_1.setScaleX(0.5);
							da_1.setScaleY(0.5);
							da_1.setVisible(false);

							nian_1.setTranslateX(100);
							nian_1.setTranslateY(20);
							nian_1.setScaleX(0.5);
							nian_1.setScaleY(0.5);
							nian_1.setVisible(false);

							Platform.runLater(new Runnable() {
								public void run() {
									stacker2.getChildren().addAll(fu_1, fu_2, fu_3, fu_4, _l1, _l2, giant_fu, huan_1,
											huan_2, xi_1, xi_2, guo_1, da_1, nian_1);
									root.setCenter(stacker2);
								}
							});
							new Thread() {
								public void run() {
									int counter = -100;
									int rotate = 0;
									final AtomicInteger _c = new AtomicInteger(counter);
									final AtomicInteger _r = new AtomicInteger(rotate);
									while (counter < 400) {
										Platform.runLater(new Runnable() {
											public void run() {
												fu_1.setTranslateX(_c.get());
												fu_1.setRotate(_r.get());
											}
										});
										rotate = rotate + 80;
										counter = counter + 2;
										_c.lazySet(counter);
										_r.lazySet(rotate);
										try {
											sleep(35);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											// e.printStackTrace();
										}
									}
								}
							}.start();
							new Thread() {
								public void run() {
									int counter = 370;
									int rotate = 0;
									final AtomicInteger _c = new AtomicInteger(counter);
									final AtomicInteger _r = new AtomicInteger(rotate);
									while (counter > -350) {
										Platform.runLater(new Runnable() {
											public void run() {
												fu_3.setTranslateX(_c.get());
												fu_3.setRotate(_r.get());
											}
										});
										rotate = rotate + 80;
										counter = counter - 2;
										_c.lazySet(counter);
										_r.lazySet(rotate);
										try {
											sleep(33);
										} catch (InterruptedException e) {
										}
									}
								}
							}.start();
							new Thread() {
								public void run() {
									int counter = -300;
									final AtomicInteger _c = new AtomicInteger(counter);
									while (counter < 350) {
										Platform.runLater(new Runnable() {
											public void run() {
												fu_4.setTranslateX(_c.get());
											}
										});
										counter = counter + 2;
										_c.lazySet(counter);
										try {
											sleep((long) 31.528795);
										} catch (InterruptedException e) {
										}
									}
								}
							}.start();
							try {
								Thread.sleep(1200);
							} catch (InterruptedException e1) {
							}
							new Thread() {
								public void run() {
									int counter = 350;
									int rotate = 0;
									final AtomicInteger _c = new AtomicInteger(counter);
									final AtomicInteger _r = new AtomicInteger(rotate);
									while (counter > -350) {
										Platform.runLater(new Runnable() {
											public void run() {
												fu_2.setTranslateX(_c.get());
												fu_2.setRotate(_r.get());
											}
										});
										rotate = rotate + 10;
										counter = counter - 2;
										_c.lazySet(counter);
										_r.lazySet(rotate);
										try {
											sleep(38);
										} catch (InterruptedException e) {
										}
									}
								}
							}.start();
							try {
								Thread.sleep(3000);
							} catch (InterruptedException e1) {
							}
							new Thread() {
								public void run() {
									int counter = 350;
									AtomicInteger _c = new AtomicInteger(counter);
									while (counter > -350) {
										Platform.runLater(new Runnable() {
											public void run() {
												_l1.setTranslateX(_c.get());
												_l2.setTranslateX(_c.get());
											}
										});
										counter = counter - 2;
										_c.set(counter);
										try {
											sleep(52);
										} catch (InterruptedException e) {
										}
									}
									Platform.runLater(new Runnable() {
										public void run() {
											_l1.setVisible(false);
											_l2.setVisible(false);
										}
									});
								}
							}.start();
							try {
								Thread.sleep(7000);
							} catch (InterruptedException e1) {
							}
							Platform.runLater(new Runnable() {
								public void run() {
									giant_fu.setVisible(true);
								}
							});
							new Thread() {
								public void run() {
									double counter = .5;
									AtomicReference<Double> _c = new AtomicReference<Double>();
									while (counter < 1) {
										Platform.runLater(new Runnable() {
											public void run() {
												giant_fu.setScaleX(_c.get());
												giant_fu.setScaleY(_c.get());
											}
										});
										counter = counter + 0.001;
										_c.lazySet(counter);
										try {
											sleep(45);
										} catch (InterruptedException e) {
										}
									}
									ScaleTransition scaleTransition = new ScaleTransition();
									// Setting the duration for the transition
									scaleTransition.setDuration(Duration.millis(1000));
									// Setting the node for the transition
									scaleTransition.setNode(giant_fu);
									// Setting the dimensions for scaling
									scaleTransition.setByY(-.5);
									scaleTransition.setByX(-.5);
									scaleTransition.play();
									try {
										Thread.sleep(1300);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									Platform.runLater(new Runnable() {
										public void run() {
											giant_fu.setVisible(false);
										}
									});
								}
							}.start();
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
							}
							Platform.runLater(new Runnable() {
								public void run() {
									fu_1.setVisible(false);
									fu_2.setVisible(false);
									fu_3.setVisible(false);
									fu_4.setVisible(false);
								}
							});
							try {
								Thread.sleep(4000);
							} catch (InterruptedException e1) {
							}
							new Thread() {
								public void run() {
									Platform.runLater(new Runnable() {
										public void run() {
											huan_1.setVisible(true);
											huan_2.setVisible(true);
											xi_1.setVisible(true);
											xi_2.setVisible(true);
											guo_1.setVisible(true);
											da_1.setVisible(true);
											nian_1.setVisible(true);
										}
									});
									ArrayList<ImageView> zoomList = new ArrayList<ImageView>();
									zoomList.add(huan_1);
									zoomList.add(huan_2);
									zoomList.add(xi_1);
									zoomList.add(xi_2);
									zoomList.add(guo_1);
									zoomList.add(da_1);
									zoomList.add(nian_1);

									for (ImageView _i : zoomList) {
										ScaleTransition scaleTransition = new ScaleTransition();
										// Setting the duration for the transition
										scaleTransition.setDuration(Duration.millis(1200));
										// Setting the node for the transition
										scaleTransition.setNode(_i);
										// Setting the dimensions for scaling
										scaleTransition.setByY(.5);
										scaleTransition.setByX(.5);
										scaleTransition.play();
										try {
											Thread.sleep(1400);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										ScaleTransition sT1 = new ScaleTransition();
										// Setting the duration for the transition
										sT1.setDuration(Duration.millis(1200));
										// Setting the node for the transition
										sT1.setNode(_i);
										// Setting the dimensions for scaling
										sT1.setByY(-.5);
										sT1.setByX(-.5);
										sT1.play();
										try {
											Thread.sleep(1200);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								}
							}.start();
						}
					}.start();
				} catch (Exception e) {
				}
			}
		}.start();
	}

	class BianPao {
		public void fangBianPao(double x, double y) {
			new Thread() {
				public void run() {
					ImageView bianpao_1 = new ImageView();
					bianpao_1.setScaleX(0.4);
					bianpao_1.setScaleY(0.4);
					bianpao_1.setImage(bianpao);
					Rectangle clip = new Rectangle(bianpao.getWidth(), bianpao.getHeight());
					bianpao_1.setClip(clip);
					bianpao_1.setTranslateX(x);
					bianpao_1.setTranslateY(y);
					final AtomicReference<ImageView> _re = new AtomicReference<ImageView>(bianpao_1);
					final AtomicReference<Rectangle> _cl = new AtomicReference<Rectangle>(clip);
					Platform.runLater(new Runnable() {
						public void run() {
							stacker.getChildren().add(_re.get());
						}
					});
					int counter = 0;
					final AtomicInteger _c = new AtomicInteger(counter);
					while (counter < 640) {
						Platform.runLater(new Runnable() {
							public void run() {
								Rectangle _i = _cl.get();
								_i.setTranslateY(_c.get());
							}
						});
						counter = counter - 40;
						_c.set(counter);
						try {
							Thread.sleep(22);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					stacker.getChildren().remove(bianpao_1);
					bianpao_1 = null;
					clip = null;
					counter = 0;
					try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

	public static void main(String[] args) {
		launch(args);

	}

}
