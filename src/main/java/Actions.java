import jdk.internal.HotSpotIntrinsicCandidate;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.IntStream;

public class Actions {

    //test_1111

    public String s;
    StringBuffer stringBuffer;

    int aaaaa;

    public Actions(String s) {
        this.s = s;
    }

    private int a() {
        return 0;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "s='" + s + '\'' +
                ", stringBuffer=" + stringBuffer +
                ", aa=" + aa +
                '}';
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actions actions = (Actions) o;
        return aa == actions.aa &&
                Objects.equals(s, actions.s) &&
                Objects.equals(stringBuffer, actions.stringBuffer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, stringBuffer, aa);
    }

    public int length() {
        return s.length();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public int codePointAt(int index) {
        return s.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return s.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return s.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return s.offsetByCodePoints(index, codePointOffset);
    }

    public int capacity() {
        return stringBuffer.capacity();
    }

    public void ensureCapacity(int minimumCapacity) {
        stringBuffer.ensureCapacity(minimumCapacity);
    }

    public void trimToSize() {
        stringBuffer.trimToSize();
    }

    public void setLength(int newLength) {
        stringBuffer.setLength(newLength);
    }

    public void setCharAt(int index, char ch) {
        stringBuffer.setCharAt(index, ch);
    }

    public StringBuffer append(Object obj) {
        return stringBuffer.append(obj);
    }

    @HotSpotIntrinsicCandidate
    public StringBuffer append(String str) {
        return stringBuffer.append(str);
    }

    public StringBuffer append(StringBuffer sb) {
        return stringBuffer.append(sb);
    }

    public StringBuffer append(CharSequence s) {
        return stringBuffer.append(s);
    }

    public StringBuffer append(CharSequence s, int start, int end) {
        return stringBuffer.append(s, start, end);
    }

    public StringBuffer append(char[] str) {
        return stringBuffer.append(str);
    }

    public StringBuffer append(char[] str, int offset, int len) {
        return stringBuffer.append(str, offset, len);
    }

    public StringBuffer append(boolean b) {
        return stringBuffer.append(b);
    }

    @HotSpotIntrinsicCandidate
    public StringBuffer append(char c) {
        return stringBuffer.append(c);
    }

    @HotSpotIntrinsicCandidate
    public StringBuffer append(int i) {
        return stringBuffer.append(i);
    }

    public StringBuffer appendCodePoint(int codePoint) {
        return stringBuffer.appendCodePoint(codePoint);
    }

    public StringBuffer append(long lng) {
        return stringBuffer.append(lng);
    }

    public StringBuffer append(float f) {
        return stringBuffer.append(f);
    }

    public StringBuffer append(double d) {
        return stringBuffer.append(d);
    }

    public StringBuffer delete(int start, int end) {
        return stringBuffer.delete(start, end);
    }

    public StringBuffer deleteCharAt(int index) {
        return stringBuffer.deleteCharAt(index);
    }

    public StringBuffer replace(int start, int end, String str) {
        return stringBuffer.replace(start, end, str);
    }

    public StringBuffer insert(int index, char[] str, int offset, int len) {
        return stringBuffer.insert(index, str, offset, len);
    }

    public StringBuffer insert(int offset, Object obj) {
        return stringBuffer.insert(offset, obj);
    }

    public StringBuffer insert(int offset, String str) {
        return stringBuffer.insert(offset, str);
    }

    public StringBuffer insert(int offset, char[] str) {
        return stringBuffer.insert(offset, str);
    }

    public StringBuffer insert(int dstOffset, CharSequence s) {
        return stringBuffer.insert(dstOffset, s);
    }

    public StringBuffer insert(int dstOffset, CharSequence s, int start, int end) {
        return stringBuffer.insert(dstOffset, s, start, end);
    }

    public StringBuffer insert(int offset, boolean b) {
        return stringBuffer.insert(offset, b);
    }

    public StringBuffer insert(int offset, char c) {
        return stringBuffer.insert(offset, c);
    }

    public StringBuffer insert(int offset, int i) {
        return stringBuffer.insert(offset, i);
    }

    public StringBuffer insert(int offset, long l) {
        return stringBuffer.insert(offset, l);
    }

    public StringBuffer insert(int offset, float f) {
        return stringBuffer.insert(offset, f);
    }

    public StringBuffer insert(int offset, double d) {
        return stringBuffer.insert(offset, d);
    }

    public StringBuffer reverse() {
        return stringBuffer.reverse();
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        s.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        s.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return s.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return s.getBytes(charset);
    }

    public byte[] getBytes() {
        return s.getBytes();
    }

    public boolean contentEquals(StringBuffer sb) {
        return s.contentEquals(sb);
    }

    public boolean contentEquals(CharSequence cs) {
        return s.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return s.equalsIgnoreCase(anotherString);
    }

    public int compareTo(String anotherString) {
        return s.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String str) {
        return s.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return s.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return s.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(String prefix, int toffset) {
        return s.startsWith(prefix, toffset);
    }

    public boolean startsWith(String prefix) {
        return s.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return s.endsWith(suffix);
    }

    public int indexOf(int ch) {
        return s.indexOf(ch);
    }

    public int indexOf(int ch, int fromIndex) {
        return s.indexOf(ch, fromIndex);
    }

    public int lastIndexOf(int ch) {
        return s.lastIndexOf(ch);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return s.lastIndexOf(ch, fromIndex);
    }

    public int indexOf(String str) {
        return s.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return s.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return s.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return s.lastIndexOf(str, fromIndex);
    }

    public String substring(int beginIndex) {
        return s.substring(beginIndex);
    }

    public String substring(int beginIndex, int endIndex) {
        return s.substring(beginIndex, endIndex);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return s.subSequence(beginIndex, endIndex);
    }

    public String concat(String str) {
        return s.concat(str);
    }

    public String replace(char oldChar, char newChar) {
        return s.replace(oldChar, newChar);
    }

    public boolean matches(String regex) {
        return s.matches(regex);
    }

    public boolean contains(CharSequence s) {
        return this.s.contains(s);
    }

    public String replaceFirst(String regex, String replacement) {
        return s.replaceFirst(regex, replacement);
    }

    public String replaceAll(String regex, String replacement) {
        return s.replaceAll(regex, replacement);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return s.replace(target, replacement);
    }

    public String[] split(String regex, int limit) {
        return s.split(regex, limit);
    }

    public String[] split(String regex) {
        return s.split(regex);
    }

    public static String join(CharSequence delimiter, CharSequence... elements) {
        return String.join(delimiter, elements);
    }

    public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
        return String.join(delimiter, elements);
    }

    public String toLowerCase(Locale locale) {
        return s.toLowerCase(locale);
    }

    public String toLowerCase() {
        return s.toLowerCase();
    }

    public String toUpperCase(Locale locale) {
        return s.toUpperCase(locale);
    }

    public String toUpperCase() {
        return s.toUpperCase();
    }

    public String trim() {
        return s.trim();
    }

    public IntStream chars() {
        return s.chars();
    }

    public IntStream codePoints() {
        return s.codePoints();
    }

    public char[] toCharArray() {
        return s.toCharArray();
    }

    public static String format(String format, Object... args) {
        return String.format(format, args);
    }

    public static String format(Locale l, String format, Object... args) {
        return String.format(l, format, args);
    }

    public static String valueOf(Object obj) {
        return String.valueOf(obj);
    }

    public static String valueOf(char[] data) {
        return String.valueOf(data);
    }

    public static String valueOf(char[] data, int offset, int count) {
        return String.valueOf(data, offset, count);
    }

    public static String copyValueOf(char[] data, int offset, int count) {
        return String.copyValueOf(data, offset, count);
    }

    public static String copyValueOf(char[] data) {
        return String.copyValueOf(data);
    }

    public static String valueOf(boolean b) {
        return String.valueOf(b);
    }

    public static String valueOf(char c) {
        return String.valueOf(c);
    }

    public static String valueOf(int i) {
        return String.valueOf(i);
    }

    public static String valueOf(long l) {
        return String.valueOf(l);
    }

    public static String valueOf(float f) {
        return String.valueOf(f);
    }

    public static String valueOf(double d) {
        return String.valueOf(d);
    }

    public String intern() {
        return s.intern();
    }

    public Actions() {
        super();
    }

    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public void setStringBuffer(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }


    void test() {
        return;
    }

    void foo() {
        return;
    }

    //pewpew
}
