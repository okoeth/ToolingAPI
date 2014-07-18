/**
 * 
 */
package com.nttdata.apex_analyser;

import com.nttdata.ta.ApexClassAnalyser;

import junit.framework.TestCase;

/**
 * @author oliverkoeth
 *
 */
public class ApexClassAnalyserTest extends TestCase {

	/**
	 * Test method for {@link com.nttdata.ta.ApexClassAnalyser#compileFixErrorString(java.lang.String)}.
	 */
	public void testCompileFixErrorString() {
		ApexClassAnalyser apexClassAnalyser = new ApexClassAnalyser();
		assertEquals(
				"[{ name : \"a\" }, { name : \"b\" }]",
				apexClassAnalyser.compileFixErrorString(
						"[{ name : \"a\" }, { name : \"b\" }]"));
		assertEquals(
				"[{ name : \"a\" }]",
				apexClassAnalyser.compileFixErrorString(
						"[{ name : \"a\" }, { name : \"b"));
		assertEquals(
				"[{ name : \"a\" }]",
				apexClassAnalyser.compileFixErrorString(
						"[{ name : \"a\" },"));
		assertEquals(
				"[{ name : \"a\" }]",
				apexClassAnalyser.compileFixErrorString(
						"[{ name : \"a\" }"));
		assertEquals(
				"",
				apexClassAnalyser.compileFixErrorString(
						"[{ name : \"a\""));
		assertEquals(
				"",
				apexClassAnalyser.compileFixErrorString(
						""));
		assertEquals(
				null,
				apexClassAnalyser.compileFixErrorString(
						null));
	}
}
