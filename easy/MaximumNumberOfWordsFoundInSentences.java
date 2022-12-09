class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        int count = 0; 
        for (int i = 0; i < sentences.length; i++) {
            int k = sentences[i].split(" ").length;
            count = Math.max(k, count);
        }
        return count;
    }
}
