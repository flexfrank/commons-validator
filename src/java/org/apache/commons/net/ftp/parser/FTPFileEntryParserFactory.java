/*
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.net.ftp.parser;
import org.apache.commons.net.ftp.FTPFileEntryParser;

/**
 * The interface describes a factory for creating FTPFileEntryParsers
 */
public interface FTPFileEntryParserFactory
{
    /**
     * Implementation should be a method that decodes the
     * supplied key and creates an object implementing the
     * interface FTPFileEntryParser.
     *
     * @param key    A string that somehow identifies an
     *               FTPFileEntryParser to be created.
     *
     * @return the FTPFileEntryParser created.
     * @exception ParserInitializationException
     *                   Thrown on any exception in instantiation
     * @see org.apache.commons.net.ftp.parser.ParserInitializationException
     */
    public FTPFileEntryParser createFileEntryParser(String key)
        throws ParserInitializationException;

}
