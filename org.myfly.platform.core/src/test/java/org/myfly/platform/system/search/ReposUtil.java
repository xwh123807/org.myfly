package org.myfly.platform.system.search;

public class ReposUtil {
//	private static Log log = LogFactory.getLog(ReposUtil.class);
//	private static IndexWriter indexWriter;
//	private static IndexSearcher indexSearcher;
//	private static Analyzer analyzer = new StandardAnalyzer();
//	private static Object lock = new Object();
//	private static final String index_path = "/Users/xiangwanhong/lucene";
//	public final static String ARTICLE_CONTENT = "fileContent";
//
//	public final static String ARTICLE_NAME = "fileName";
//
//	public final static String ARTICLE_PATH = "filePath";
//
//	public final static String ARTICLE_DATE = "fielDate";
//
//	public final static String ARTICLE_FRAGMENT = "fragment"; // 测试使用，如果不需要，则设置
//																// ARTICLE_FRAGMENT_USE
//																// = false
//
//	public static boolean ARTICLE_FRAGMENT_USE = true;
//
//	public static IndexWriter getIndexWriter() {
//		if (indexWriter == null) {
//			FSDirectory directory = null;
//			synchronized (lock) {
//				File file = new File(index_path);
//				if (!file.exists()) {
//					file.mkdirs();
//				}
//				try {
//					directory = FSDirectory.open(Paths.get(index_path));
//					IndexWriterConfig conf = new IndexWriterConfig(analyzer);
//					indexWriter = new IndexWriter(directory, conf);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		return indexWriter;
//	}
//
//	public static IndexSearcher getIndexSearcher() {
//		if (indexSearcher == null) {
//			try {
//				IndexReader reader = DirectoryReader.open(FSDirectory.open(Paths.get(index_path)));
//				indexSearcher = new IndexSearcher(reader);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return indexSearcher;
//	}
//
//	static void indexDocs(final IndexWriter writer, Path path) throws IOException {
//		if (Files.isDirectory(path)) {
//			Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
//				@Override
//				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//					try {
//						indexDoc(writer, file, attrs.lastModifiedTime().toMillis());
//					} catch (IOException ignore) {
//						// don't index files that can't be read.
//					}
//					return FileVisitResult.CONTINUE;
//				}
//			});
//		} else {
//			indexDoc(writer, path, Files.getLastModifiedTime(path).toMillis());
//		}
//		writer.close();
//	}
//
//	/** Indexes a single document */
//	static void indexDoc(IndexWriter writer, Path file, long lastModified) throws IOException {
//		try (InputStream stream = Files.newInputStream(file)) {
//			// make a new, empty document
//			Document doc = new Document();
//
//			// Add the path of the file as a field named "path". Use a
//			// field that is indexed (i.e. searchable), but don't tokenize
//			// the field into separate words and don't index term frequency
//			// or positional information:
//			Field pathField = new StringField(ARTICLE_PATH, file.toString(), Field.Store.YES);
//			doc.add(pathField);
//			
//			Field nameField = new StringField(ARTICLE_NAME, file.getFileName().toString(), Field.Store.YES);
//			doc.add(nameField);
//			
//
//			// Add the last modified date of the file a field named "modified".
//			// Use a LongField that is indexed (i.e. efficiently filterable with
//			// NumericRangeFilter). This indexes to milli-second resolution,
//			// which
//			// is often too fine. You could instead create a number based on
//			// year/month/day/hour/minutes/seconds, down the resolution you
//			// require.
//			// For example the long value 2011021714 would mean
//			// February 17, 2011, 2-3 PM.
//			doc.add(new LongField(ARTICLE_DATE, lastModified, Field.Store.NO));
//
//			// Add the contents of the file to a field named "contents". Specify
//			// a Reader,
//			// so that the text of the file is tokenized and indexed, but not
//			// stored.
//			// Note that FileReader expects the file to be in UTF-8 encoding.
//			// If that's not the case searching for special characters will
//			// fail.
//			doc.add(new TextField(ARTICLE_CONTENT,
//					new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))));
//
//			if (writer.getConfig().getOpenMode() == OpenMode.CREATE) {
//				// New index, so we just add the document (no old document can
//				// be there):
//				System.out.println("adding " + file);
//				writer.addDocument(doc);
//			} else {
//				// Existing index (an old copy of this document may have been
//				// indexed) so
//				// we use updateDocument instead to replace the old one matching
//				// the exact
//				// path, if present:
//				System.out.println("updating " + file);
//				writer.updateDocument(new Term("path", file.toString()), doc);
//			}
//		}
//	}
//	
//	public static void search(String queryString) throws Exception{
//		String field = ARTICLE_CONTENT;
//		QueryParser parser = new QueryParser(field, analyzer);
//		Query query = parser.parse(queryString);
//		TopDocs results = getIndexSearcher().search(query, 3);
//		ScoreDoc[] hits = results.scoreDocs;
//		int numTotalHits = results.totalHits;
//		System.out.println(numTotalHits + " total matching documents");
//		for (ScoreDoc scoreDoc : hits){
//			Document doc = getIndexSearcher().doc(scoreDoc.doc);
//			String path = doc.get(ARTICLE_PATH);
//			System.out.println("doc=" + scoreDoc.doc + " score=" + scoreDoc.score + " path=" + path);
//			if (path != null) {
//				String title = doc.get(ARTICLE_NAME);
//				if (title != null) {
//					System.out.println("   Title: " + doc.get(ARTICLE_NAME));
//				}
//			} else {
//				System.out.println("No path for this document");
//			}
//		}
//	}
//	
//	public static void main(String args[]) throws Exception{
//		indexDocs(getIndexWriter(), Paths.get("/Users/xiangwanhong/Downloads"));
//		search("name");
//	}
}
