/**
 *  Amended @author : Paul Taylor
 *  Initial @author : Eric Farng
 *
 *  Version @version:$Id$
 *
 *  MusicTag Copyright (C)2003,2004
 *
 *  This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser
 *  General Public  License as published by the Free Software Foundation; either version 2.1 of the License,
 *  or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 *  the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License along with this library; if not,
 *  you can get a copy from http://www.opensource.org/licenses/lgpl-license.php or write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Description:
 * 
 */
package org.jaudiotagger.tag.id3.framebody;

import org.jaudiotagger.tag.InvalidTagException;


public class FrameBodyTENC extends AbstractFrameBodyTextInfo implements ID3v24FrameBody,ID3v23FrameBody
{
    /**
     * Creates a new FrameBodyTENC datatype.
     */
    public FrameBodyTENC()
    {
    }

    public FrameBodyTENC(FrameBodyTENC body)
    {
        super(body);
    }

    /**
     * Creates a new FrameBodyTENC datatype.
     *
     * @param textEncoding DOCUMENT ME!
     * @param text         DOCUMENT ME!
     */
    public FrameBodyTENC(byte textEncoding, String text)
    {
        super(textEncoding, text);
    }

    /**
     * Creates a new FrameBodyTENC datatype.
     *
     * @param file DOCUMENT ME!
     * @throws java.io.IOException DOCUMENT ME!
     * @throws InvalidTagException DOCUMENT ME!
     */
    public FrameBodyTENC(java.io.RandomAccessFile file, int frameSize)
        throws java.io.IOException, InvalidTagException
    {
        super(file, frameSize);
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getIdentifier()
    {
        return "TENC";
    }
}