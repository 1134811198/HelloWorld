@Test
	public void testClient() throws UnknownHostException, IOException {
		
		//1.�����ͻ��˶���(�����˷�����������)
		Socket socket  = new Socket(InetAddress.getLocalHost(),9999);
		
		//2.��д����
		//-----------------��������(д)--------------
		//�ٻ�ȡ�����
		OutputStream outputStream = socket.getOutputStream();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
		//��д������
		writer.write("���ǵعϣ�����");
		writer.newLine();
		writer.flush();
		
		
		
		//������д������ı��
//		socket.shutdownOutput();
		
		//----------------�������ݣ�����--------------
		

		//�ٻ�ȡ����������
		InputStream inputStream = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		//�ڶ�ȡ
		String line = reader.readLine();
		System.out.println(line);
		
		//3.�ر������ͷ���Դ
		
		reader.close();
		writer.close();
		socket.close();
		
		
		
		
		

	}

