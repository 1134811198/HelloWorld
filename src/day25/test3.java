@Test
	public void testClient() throws UnknownHostException, IOException {
		
		//1.创建客户端对象(向服务端发送连接请求)
		Socket socket  = new Socket(InetAddress.getLocalHost(),9999);
		
		//2.读写数据
		//-----------------发送数据(写)--------------
		//①获取输出流
		OutputStream outputStream = socket.getOutputStream();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
		//②写入数据
		writer.write("我是地瓜，嘻嘻");
		writer.newLine();
		writer.flush();
		
		
		
		//③设置写入结束的标记
//		socket.shutdownOutput();
		
		//----------------接受数据（读）--------------
		

		//①获取输入流对象
		InputStream inputStream = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		//②读取
		String line = reader.readLine();
		System.out.println(line);
		
		//3.关闭流和释放资源
		
		reader.close();
		writer.close();
		socket.close();
		
		
		
		
		

	}

